package edu.gusdev.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.gusdev.springboot.demo.mycoolapp.components.RandomString;

@RestController
@RequestMapping("/gustavo-app")
public class FunRestController {

    /*
    * A anotação @Value do Spring, permite a injeção de valores do arquivo .porperties (application.properties)
    * 
    * Na anotação @Value a da propriedade (do .properties) precisa estar dentro das chaves da estrutura:
    * "${}"":
    * 
    * Também é possível usar a anotação @PropertySource para definir em qual arquivo .porperties os
    * valores serão buscados: @PropertySource("classpath:application.properties")
    */
    @Value("${gustavo.name}")
    private String valueOne;


    /*
     * Após criado um componente (classe anotada com @Component e, portanto, gerenciada pelo Spring) é preciso
     * usar o conceito de injeção de dependências para poder utilizar um objeto dessa classe que seja gerenciado
     * pelo spring. Para isso, usamos a anotação @Autowired e não precisamos manualmente instanciar um objeto:
     */

    @Autowired
    RandomString randString;
     

    @GetMapping
    public String startingMessege() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String workoutMessege() {
        return "Workout messege!";
    }

    @GetMapping("/fortune")
    public String fortuneMessege(){
        return randString.generateRandomString(25);
    }

    @GetMapping("/gustavo")
    public String valueMessege(){
        return valueOne;
    }
}
