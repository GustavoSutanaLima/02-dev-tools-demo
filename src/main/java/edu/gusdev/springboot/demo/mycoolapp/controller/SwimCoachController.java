package edu.gusdev.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.gusdev.springboot.demo.mycoolapp.Coach;

@RestController
@RequestMapping("/swimcoach")
public class SwimCoachController {
    
    Coach swimCoach;

    //Construtor Injection: injeção pelo construtor de classe;
    //Porém, a aplicação não irá funcionar, porque swimCoach não é um spring bean (não está anotado com
    //@Component)
    @Autowired
    public SwimCoachController(@Qualifier("swimCoach") Coach springSwimCoach) {
        this.swimCoach = springSwimCoach;
    }

    @GetMapping
    public String swimCoachWelcome(){
        return "Welcome to the Swim coach Arena";
    }

    @GetMapping("/training")
    public String swimTranig(){
        return swimCoach.getDailyWorkout();
    }
}
