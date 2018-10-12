/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session12_internationalization_localization.simple;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author maithicamnhung
 */
public class DemoInternationalization {

    public static void printNumberValue(Locale currentLocale){
        System.out.println("-----Number Format----");
        Integer value = new Integer(123456); 
        Double amt = new Double(345987.246);
        NumberFormat numberFormatObj = 
                NumberFormat.getNumberInstance(currentLocale);
        String valueDisplay = numberFormatObj.format(value);
        String amtDisplay = numberFormatObj.format(amt);
        System.out.println(currentLocale.toString() + ":" + valueDisplay);
        System.out.println(currentLocale.toString() + ":" + amtDisplay);
    }
    public static void printCurrentValue(Locale currentLocale){
        System.out.println("-----Current Format----");
        Integer value = new Integer(123456); 
        Double amt = new Double(345987.246);
        NumberFormat numberFormatObj = 
                NumberFormat.getCurrencyInstance(currentLocale);
        String valueDisplay = numberFormatObj.format(value);
        String amtDisplay = numberFormatObj.format(amt);
        System.out.println(currentLocale.toString() + ":" + valueDisplay);
        System.out.println(currentLocale.toString() + ":" + amtDisplay);
    }
    public static void printPercentageValue(Locale currentLocale){
        System.out.println("-----Percentage Format----");
        Integer value = new Integer(123456); 
        Double amt = new Double(345987.246);
        NumberFormat numberFormatObj = 
                NumberFormat.getPercentInstance(currentLocale);
        String valueDisplay = numberFormatObj.format(value);
        String amtDisplay = numberFormatObj.format(amt);
        System.out.println(currentLocale.toString() + ":" + valueDisplay);
        System.out.println(currentLocale.toString() + ":" + amtDisplay);
    }
    
    public static void printDateFormatValue(Locale currentLocale){
        System.out.println("-----Date Format----");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(
                DateFormat.FULL, currentLocale);
        System.out.println(currentLocale.toString() + ":" + dateFormat.format(date));
    }
    
    public static void printMessageValue(Locale currentLocale
            , String messageFile){
         System.out.println("-----Message Format----");
        String pattern = "At {2,time,short} on {2,date,long}, "
                + "we detected {1,number,integer} virus on the disk {0}"; 
        MessageFormat msgFormat = new MessageFormat(pattern, currentLocale);
        ResourceBundle messages = ResourceBundle.getBundle(messageFile);
        Object[] messageArguments = {messages.getString("disk"), 
            new Integer(7), new Date()}; 
        String output = msgFormat.format(messageArguments);
        System.out.println(currentLocale.toString() + ":" 
                + output );
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String language = "vi";
        String country = "VN";
        String fileName = "MessageBundle";
        String resource = "session12_internationalization_localization/simple/" + fileName;
        Locale locale = new Locale(language, country);
        ResourceBundle bundle = ResourceBundle.getBundle(resource, locale);
        //ResourceBundle bundle = ResourceBundle.getBundle(resource, Locale.US);
        System.out.println("Language:" + locale.getDisplayLanguage() 
                + "\tCountry:" + locale.getDisplayCountry());
        System.out.println("greetings: " + bundle.getString("greetings"));
        printNumberValue(locale);
        printCurrentValue(locale);
        printPercentageValue(locale);
        printDateFormatValue(locale);
        printMessageValue(locale, resource);
    }
}
