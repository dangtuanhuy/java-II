
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maithicamnhung
 */
public class Matcher_Methods {

    public static void main(String[] args) {
        String joke = "dog " + "dogs";
        String regEx = "dog";

        Pattern doggone = Pattern.compile(regEx);
        Matcher m = doggone.matcher(joke);

        StringBuffer newJoke = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(newJoke, "goat");
        }
        m.appendTail(newJoke);
        System.out.println(newJoke.toString());
    }
}
