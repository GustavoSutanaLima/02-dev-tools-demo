package edu.gusdev.springboot.demo.mycoolapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton") //Se eu usar a anotação Scope, consigo alterar a forma como spring boot endente
                    //este bean. Passando prototype como atributo da anotação, cada injeção desse
                    //bean tem seu endereço próprio. já no singleton, todas apontam para o mesmo endereço;
public class GymCoach implements Coach {

    //Definindo um método init (inicialização)
    @PostConstruct 
    /*  Esta é anotação usada para o método de initialização
        @PostConstruct no Spring é usada para marcar um método que deve ser executado após 
        a injeção de dependências ser concluída, mas antes que o bean seja colocado em serviço.

        Analogia: Preparando um Carro para Dirigir - Imagine que você tem um carro (o bean) que 
        precisa ser preparado antes de ser dirigido. Primeiro, você precisa garantir que o 
        carro tenha combustível, óleo e que todos os sistemas estejam funcionando (injeção de dependências).
        Depois de tudo isso estar pronto, você pode ligar o carro e começar a dirigir 
        (o método @PostConstruct).
    */
    public void init(){
        System.out.println("Inicializando a classe:" + getClass().getSimpleName());
    }


    //Definindo um método destroy (finalização)

    /*
     * A anotação @PreDestroy no Spring é usada para marcar um método que deve ser executado antes 
     * que um bean seja destruído. Isso é útil para liberar recursos ou realizar qualquer 
     * limpeza necessária antes que o bean seja removido do contexto do Spring. 
     * Analogia: Desligando um Computador - Imagine que você está desligando um computador (o bean). 
     * Antes de desligá-lo completamente, você precisa fechar todos os programas abertos, 
     * salvar seu trabalho e garantir que tudo esteja em ordem. 
     * O método anotado com @PreDestroy faz algo semelhante para um bean no Spring.
     */
    @PreDestroy
    public void cleanup(){
        System.out.println("Finalizando a classe:" + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        System.out.println(BaseballCoach.class + "implementando...");
        return "Practice push-ups for the next 15 minutes";
    }



}
