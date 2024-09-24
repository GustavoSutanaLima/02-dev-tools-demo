package edu.gusdev.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * A anotação @SpringBootAplication é composto de outras três anotações:
 * 	* @EnableAutoConfiguration
 * 	* @ComponentScan Função: Habilita a varredura de componentes no pacote onde a aplicação 
 * 	  está localizada, permitindo que o Spring encontre e registre beans
 * 	  anotados com @Component, @Service, @Repository, etc.
 *		* Porém, essa anotação só faz essa varredura dentro do pacote principal da aplicação spring boot que
 *		  no caso deste projeto é: edu.gusdev.springboot.demo.mycoolapp:
 *			* Logo, se você preicsa fazer a varredura de outras classes e pacotes fora do pacote principal
 *			  da aplicação, é preciso usar os seguintes atributos:
 *				* basePackages: Define pacotes específicos para varredura de componentes.
 *				* basePackageClasses: Define classes específicas cujos pacotes devem ser escaneados.
 * 	* @SpringBootConfiguration
 */

@SpringBootApplication	(
		scanBasePackages = 	{"edu.gusdev.springboot.demo.mycoolapp", "edu.gusdev.springboot.demo"} 
						)

/*
 * A interface Coach.java e a classe que implementa essa interface GymCoach.java, não estão
 * mais localizadas no pacote principal da aplicação, ou seja, edu.gusdev.springboot.demo.mycoolapp;
 * por isso é necessário especificar os pagas que o spring irá procurar os componentes necessários para
 * aplicação rodar;
 */
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//SpringApplication.run: Bootstraps the application
		/*
		 * O processo de bootstrap envolve a configuração inicial da aplicação, 
		 * incluindo a definição de propriedades essenciais e a preparação 
		 * do ambiente de execução. Isso permite que a aplicação seja configurada 
		 * de maneira flexível e segura, especialmente em ambientes distribuídos
		 */
	}

}
