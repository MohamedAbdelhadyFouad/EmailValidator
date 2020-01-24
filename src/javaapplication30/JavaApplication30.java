
package javaapplication30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaApplication30 {

   
    public static void main(String[] args) {
       // check if its two digits 
       RollNumberValidatorImpl r = new RollNumberValidatorImpl();
        System.out.println(r.check("13"));
        
               // Email validator

      EmailValidator x = new EmailValidator();
     
     x.EmailVal("Mohamed@yahhoo.com");
      
    
    }
    
}
