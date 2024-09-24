package edu.gusdev.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.gusdev.springboot.demo.mycoolapp.Coach;

@RestController
@RequestMapping("/coaches")
public class CoachController {

    @GetMapping()
    public String welcomeToChoaches() {
        return "Welcome to Coaches";
    }

    //Criando variável coach que será injetada (instancia pelo Spring Boot)
    private Coach coach;
    private Coach anotherCoach;
   
   /*
   Definindo um Construtor de Injeção de dependências:
   */
    /*
     * Eu quero inserir um dependência no projeto via injeção de dependências, mas não quero usar o @Autowired diretamente na variável (também
     * conhecido como field injection) pois não é recomendado pelo Spring Development Team; Sendo assim, dentro da Classe que eu quero injetar 
     * uma dependência spring vou criar um construtor para essa classe e anotar com @Autowired:
     */
   @Autowired
   public CoachController(@Qualifier("gymCoach") Coach aCoach, @Qualifier("gymCoach") Coach AanotherCoach){
      this.coach = aCoach;
      this.anotherCoach = AanotherCoach;
      /*
       * A anotação @Qualifier especifica qual das classes eu quero fazer a injeção de dependências com.
       * Diversas classes implementam a interface Coach, quando se tem apenas uma classe implementando uma
       * inteface o Spring Boot consegue, por si só, inferir a classe na qual eu quero fazer a inversão de
       * controle e a injeção de dependências. Porém, quando mais de uma classe implementa uma mesma interface
       * isso não é mais possível sem a ajuda do @Qualifier, que é passado dentro do construtor (no caso de 
       * Constructor injection) ou dentro do setter (no setter injection). Seu atributo (também conhecido 
       * como Bean Id) é o nome da classe com a primeira letra em minúsculo: se quisermos injetar 
       * TennisCoach teríamos:
       * 
       *    public CoachController(@Qualifier("TennisCoach") Coach aCoach) {
       *       this.coach = aCoach;
       *    }
       * 
       * Além disso, também é possível usar @Qualifier diretamente na classe e especificar um nome para
       * injeção dessa classe;
       * 
       */
   }
   
   @GetMapping("/gymcoach")
   public String getTraining() {
      return coach.getDailyWorkout();
   }

   /*
    * Em um escopo singleton o spring inicializa apenas um único bean para cada injeção de dependências, sendo assim, os objetos serão iguais
    * ou melhor, terão o memso endereço de memória; Já, em um escopo protopype, ambos os beans quando inicilizados através da injeção de 
    * dependências terão seus próprios endereços, ou seja, não serão mais iguais.
    */

   @GetMapping("/check")
   public String comparingBens(){
      return "Comparing beans (coach & anotherCoach): " + (coach == anotherCoach) + ".";
   }

}
