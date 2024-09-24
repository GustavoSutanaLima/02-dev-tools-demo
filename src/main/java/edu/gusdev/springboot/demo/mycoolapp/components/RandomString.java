package edu.gusdev.springboot.demo.mycoolapp.components;

import java.util.Random;

import org.springframework.stereotype.Component;

/*
 * A anotação @Component no Spring Boot é usada para marcar uma classe como uma classe gerenciada pelo
 * Spring. Isso significa que o Spring criará uma instância (singleton) dessa classe e 
 * a gerenciará como um bean no contexto da aplicação. (Inversão de Controle)
 */
@Component
public class RandomString {

    public String generateRandomString(Integer length) {

        //Builds a String with no characters that can be used to append others strings to it;
        StringBuilder generatedString = new StringBuilder(length);
        
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();

        
        //StringBuilder sb = new StringBuilder(length.intValue());

        for (int i = 0; i < length.intValue(); i++) {
            generatedString.append(characters.charAt(random.nextInt(characters.length())));
                                   //Se o characters forsse um array chacaters.charAt(1);
                                   //seria o equivalente à characters[1];
        }

        return generatedString.toString();
        
    }
}
