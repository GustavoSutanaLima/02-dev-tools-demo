# Spring Boot Starter
* Um **Spring Boot Starter** é um <u>conjunto de dependências pré-configuradas</u> que facilitam a configuração de uma aplicação Spring Boot. Esses starters são projetados para simplificar o processo de adicionar funcionalidades específicas ao seu projeto, sem a necessidade de configurar manualmente cada dependência individualmente. Aqui estão alguns pontos importantes sobre os Spring Boot Starters:

* Facilidade de Uso:
    * Os starters permitem que você adicione rapidamente funcionalidades ao seu projeto. Por exemplo, ao adicionar o ```spring-boot-starter-web```, você inclui todas as dependências necessárias para desenvolver uma aplicação web com Spring MVC.
* Configuração Automática:
    * Eles vêm com configurações padrão que ajudam a evitar a necessidade de configurações manuais extensas. Isso acelera o desenvolvimento e reduz a possibilidade de erros de configuração2.
* Diversidade de Starters:
    * Existem muitos starters disponíveis para diferentes propósitos, como spring-boot-starter-data-jpa para integração com JPA e bancos de dados, spring-boot-starter-security para adicionar segurança à aplicação, e muitos outros3.
* Abordagem Opinativa:
    * O Spring Boot adota uma abordagem opinativa, sugerindo configurações padrão que funcionam bem na maioria dos casos. Isso permite que os desenvolvedores se concentrem mais na lógica de negócios e menos na configuração2.

* Esses starters são uma das razões pelas quais o Spring Boot é tão popular, pois eles simplificam significativamente o processo de desenvolvimento de aplicações Java.

## spring-boot-starter-web
* O ```spring-boot-starter-web``` é um **starter** que inclui todas as dependências necessárias para desenvolver uma aplicação web com Spring Boot. Aqui estão as principais dependências incluídas:

    * ```spring-boot-starter```: Inclui as dependências básicas do Spring Boot, como Spring Core, Spring Beans, Spring Context e Spring AOP.
    * ```spring-boot-starter-tomcat```:
    Inclui o servidor Tomcat embutido, que permite executar a aplicação como um aplicativo web autônomo.
    * ```spring-boot-starter-validation```:
    Inclui bibliotecas para validação de dados, como Hibernate Validator.
    jackson-databind:
    Inclui bibliotecas para serialização e desserialização de objetos JSON.
    * ```spring-web```:
    Inclui as funcionalidades básicas do Spring Web, como suporte a RESTful web services.
    * ```spring-webmvc```:
    Inclui o Spring MVC, que é necessário para construir aplicações web baseadas em MVC (Model-View-Controller).

* Essas dependências são configuradas **automaticamente**, permitindo que você comece a desenvolver sua aplicação web rapidamente e sem complicações.