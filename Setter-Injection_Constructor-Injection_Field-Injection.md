### Constructor Injection
* Definição: A injeção de dependência é feita através do construtor da classe.
* Uso: Ideal para dependências obrigatórias, garantindo que o bean esteja totalmente inicializado ao ser criado.
* Vantagens:
    * Imutabilidade: Permite que os campos sejam final, promovendo a imutabilidade.
    * Segurança em Multithreading: Mais seguro em ambientes multithreaded.
    * Circular Dependency: Ajuda a evitar dependências circulares.
    ```java        
    @Component
    public class MyService {
        private final MyRepository myRepository;

        @Autowired
        public MyService(MyRepository myRepository) {
            this.myRepository = myRepository;
        }
    }
    ```

### Setter Injection
* Definição: A injeção de dependência é feita através de métodos setter.
* Uso: Ideal para dependências opcionais ou quando a dependência pode ser alterada após a criação do bean.
* Vantagens:
    * Flexibilidade: Permite alterar as dependências após a criação do bean.
    * Leitura: Pode ser mais fácil de ler e entender em alguns casos.
    ```java
    @Component
    public class MyService {
        private MyRepository myRepository;

        @Autowired
        public void setMyRepository(MyRepository myRepository) {
            this.myRepository = myRepository;
        }
    }
    ```

### Injeção de Dependência via Campo (Field Injection)
* Também é possível usar anotação @Autowired diretamente em uma variável de instância. Isso é conhecido como <i>**Field Injection**</i>.
    ```java
    @Component
    public class MyService {
        @Autowired
        private MyRepository myRepository;
    }
    ```
#### Considerações sobre os tipos de injeção:
* <b>Field Injection</b> é simples e direta, mas não permite que os campos sejam final, o que pode comprometer a imutabilidade.
<b>Constructor Injection</b> é preferível para dependências obrigatórias e promove a imutabilidade.
Já o <b>Setter Injection</b> é útil para dependências opcionais e permite maior flexibilidade.