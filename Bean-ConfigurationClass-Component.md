# Spring Framework:

## @Component, @Bean e @Configuration.

### @Component
A anotação **@Component** é uma anotação genérica usada para marcar uma classe Java como um bean gerenciado pelo Spring. Quando o Spring escaneia seu projeto, ele detecta automaticamente as classes anotadas com @Component e as registra no contexto da aplicação;

### @Bean
A anotação **@Bean** é usada em métodos dentro de uma classe anotada com @Configuration para definir beans. Esses métodos retornam uma instância do bean que será gerenciado pelo Spring. É uma maneira de declarar beans de forma programática. É comumente usado em classes que você não tem controle, por exemplo, de um outra API que você está usando no seu projeto;

### @Configuration
A anotação **@Configuration** é usada para indicar que uma classe é uma **fonte de definições de beans**. Classes anotadas com @Configuration podem conter métodos anotados com @Bean, que definem e configuram beans para o contexto da aplicação

```java
@Configuration
public class ClasseDeConfiguraçãoSpring {

    @Bean
    public ThirdPartyClass otherSerivce() {
        return new ThirdPartyClass();
    }
}
```

Acoma, a classe ```ClasseDeConfiguraçãoSpring``` é anotada com **@Configuration**, e o método ```otherSerivce``` é anotado com **@Bean**, indicando que ele retorna um bean gerenciado pelo Spring.