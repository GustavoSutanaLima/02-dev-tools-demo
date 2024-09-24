package edu.gusdev.springboot.demo.mycoolapp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ Lazy 
/*
Quando você anota um bean com @Lazy, o Spring não o cria imediatamente 
ao iniciar a aplicação. Em vez disso, ele só será criado quando for solicitado pela primeira vez.
*/
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Tenis for 30 mintues.";
    }

}
