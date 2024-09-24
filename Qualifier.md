# Qualifier

* Para injetar dependências quando você tem várias implementações de uma interface no Spring Boot, você pode usar a anotação **@Qualifier** para especificar qual implementação deve ser injetada.

    * InterfaceDummy:

    ```java
    public interface DummyI {
        void execute();
    }

    ```
    * Classe DummyTestOne que implementa a DummyI:
    ```java
    import org.springframework.stereotype.Component;

    @Component
    @Qualifier("DummyOne")
    public class Classe DummyOne implements DummyI {
        @Override
        public void execute() {
            System.out.println("Dummy UM excutando");
        }
    }
    ```
    * Classe DummyTestOne que implementa a DummyI:
    ```java
    import org.springframework.stereotype.Component;

    @Component
    @Qualifier("DummyTwo")
    public class Classe DummyTwo implements DummyI {
        @Override
        public void execute() {
            System.out.println("Dummy DOIS excutando");
        }
    }
    ```
* Implementando o Qualifier dentro de uma Classe de Serviço

    ```java
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.stereotype.Service;

    @Service
    public class MyService {

        private DummyI meuDummy;

        @Autowired
        public MyService(@Qualifier("DummyTwo") DummyI meuDummyImplementado) {
            this.meuDummy = meuDummyImplementado;
        }

        public void performAction() {
            interfaceA.execute();
        }
    }
    ```
* A anotação dentro do Constructor Injection garante que um objeto do tipo DummyTwo seja injetado ao invés de um do tipo DummyOne.

### Obs: Usando @Qualifier de outra forma
* Também é possível usar a anotação **@Qualifier** diretamente na classe na qual se deseja injetar uma dependência, sem ter que anotar a classe origem com @Qualifier. Para isso, bastar usar @Qualifier no construtor ou setter passando o nome da classe de que deseja injetar com a primeira letra em minúsculo:

    ```java
    import org.springframework.stereotype.Component;

    @Component
    public interface Coach {

        String getDailyWorkout();
    }

    ```


```java
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

    private Coach coach;

    //Injeção de dependência, neste caso a classe BaseballCoach será injetada;
    @Autowired
    public CoachController(@Qualifier("baseballCoach") Coach aCoach){
        this.coach = aCoach;
    }
    
    @GetMapping("/gymcoach")
    public String getTraining() {
        return coach.getDailyWorkout();
    }

}
```