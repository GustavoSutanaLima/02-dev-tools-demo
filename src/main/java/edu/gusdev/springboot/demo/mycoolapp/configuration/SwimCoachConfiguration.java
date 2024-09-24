package edu.gusdev.springboot.demo.mycoolapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.gusdev.springboot.demo.mycoolapp.Coach;
import edu.gusdev.springboot.demo.mycoolapp.SwimCoach;

@Configuration
public class SwimCoachConfiguration {
    
    //Aqui dou um new Swimcoach através do método swimCoach() o que permite o spring enterder
    //esta classe como um bean dentro do framework
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
         
}
