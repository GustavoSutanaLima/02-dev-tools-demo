* Para especificar o escopo de um bean no Spring Boot, você pode usar a anotação @Scope junto com a anotação que define o bean, como @Component, @Service, @Repository, ou @Bean. Aqui estão os principais escopos disponíveis e como usá-los:

* Escopos Comuns
    * **Singleton** (Padrão): Um único bean é criado e compartilhado em toda a aplicação. A injeção de uma ou mais dependência aponta para o mesmo objeto. Por ser o padrão do Spring Boot, não é necessário especificar este tipo de escopo:
        ```java
        @Component
        @Scope("singleton")
        public class MySingletonBean {
            // ...
        }
        ```
    
    * **Propotype** Um novo bean é criado cada vez que é solicitado:
        ```java
        @Component
        @Scope("prototype")
        public class MyPrototypeBean {
            // ...
        }
        ```
