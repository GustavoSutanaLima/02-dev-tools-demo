* A anotação **@Lazy** no Spring é usada para adiar a criação de um bean até que ele seja **realmente necessário**. Isso pode ajudar a melhorar o tempo de inicialização da aplicação, especialmente se você tiver beans que são caros para criar ou raramente usados.

    ```java
    import org.springframework.context.annotation.Lazy;
    import org.springframework.stereotype.Component;

    @Component
    @Lazy
    public class ExpensiveBean {

        //construtor
        public ExpensiveBean() {
            System.out.println("ExpensiveBean criado!");
        }
    }
    ```
* Também é possível configura a inicialização preguiçosa (lazy initialization) de maneira global usando o arquivo .properties:

    ```properties
    spring.main.lazy-initialization=true
    ```