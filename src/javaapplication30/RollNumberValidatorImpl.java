/*
 How to check whether a number is two digit number in java swing using regular expression validator
 */
package javaapplication30;

import javax.swing.InputVerifier;
import javax.swing.JComponent;

public class RollNumberValidatorImpl extends InputVerifier {

    public boolean check(String input) {
        boolean x = false;
        String rollNumber = input;
        if (rollNumber != null && rollNumber.length() > 0) {
            x = rollNumber.matches("\\d{2}") ? true : false;
        }
        return x;
    }

    @Override
    public boolean verify(JComponent input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
