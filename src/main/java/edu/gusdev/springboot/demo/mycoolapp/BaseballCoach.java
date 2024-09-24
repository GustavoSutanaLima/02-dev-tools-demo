package edu.gusdev.springboot.demo.mycoolapp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ Lazy 
/*
Quando você anota um bean com @Lazy, o Spring não o cria imediatamente 
ao iniciar a aplicação. Em vez disso, ele só será criado quando for solicitado pela primeira vez.
    ||RECAPTULANDO: Um bean é uma classe gerenciada pelo Spring. Quando você anota uma classe 
    ||com @Component, @Service, @Repository, ou @Controller, ou a define 
    ||como um bean em uma classe de configuração com @Bean, 
    ||o Spring cria e gerencia instâncias dessa classe no contexto da aplicação.
*/
public class BaseballCoach implements Coach {
  
    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 20 minutes";
    }

}
