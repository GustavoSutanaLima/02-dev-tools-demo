package edu.gusdev.springboot.demo.mycoolapp;

// Nesse caso, não iremos usar a anoção @Component, mas sim, iremos criar uma classe de configuração spring
// anotada com @Configuration e lá dentro, iremos definir esta classe como um @Bean;
public class SwimCoach implements Coach{
    //Construtor da classe SwimCoach
    public SwimCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a kilometers as a warmup";
    }

}
