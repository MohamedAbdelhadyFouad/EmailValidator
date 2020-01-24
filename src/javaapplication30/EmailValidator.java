    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package javaapplication30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Abdel
 */
public class EmailValidator {

    public void EmailVal(String x) {
        int count = 0;
        int Limit = x.length();
        int end = 0;
        Pattern hint = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE);
        Matcher match = hint.matcher(x);
        if (match.find()) {
            System.out.println("IS CORRECT");

        } else {
            System.out.println("IS NOT CORRECT");
        }

    }

}
