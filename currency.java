package javaProblems;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class currency {
    public static void main(String[] args) {

       NumberFormat formatter ;

       String message = JOptionPane.showInputDialog(null, "Enter the currency : (USD , UK , JAPAN , KENYA , INDIA)");
       String currency = JOptionPane.showInputDialog(null, "Enter the value :");
       int amount = Integer.parseInt(currency);


       try {
           if(message.equalsIgnoreCase("USD")){
               formatter = NumberFormat.getCurrencyInstance(Locale.US);
               JOptionPane.showMessageDialog(null , formatter.format(amount));
           }
           else if(message.equalsIgnoreCase("UK")){
               formatter = NumberFormat.getCurrencyInstance(Locale.UK);
               JOptionPane.showMessageDialog(null , formatter.format(amount)) ;
           }
           else if(message.equalsIgnoreCase("JAPAN")){
               formatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
               JOptionPane.showMessageDialog(null , formatter.format(amount)) ;
           }
           else if(message.equalsIgnoreCase("INDIA")){
               Locale indiaLocale = new Locale("en" , "IN") ;
               formatter = NumberFormat.getCurrencyInstance(indiaLocale);
               JOptionPane.showMessageDialog(null , formatter.format(amount)) ;
           }
           else{
               Locale kenyaLocale = new Locale("en" , "KE") ;
               formatter = NumberFormat.getCurrencyInstance(kenyaLocale);
               JOptionPane.showMessageDialog(null , formatter.format(amount)) ;
           }

       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Invalid input");
       }


    }
}
