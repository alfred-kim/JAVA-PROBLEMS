package javaProblems;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class duplicates {
    public static void main(String[] args) {

        String  regex = "\\b(\\w+)(\\s\\1\\b)+" ;

        Pattern pattern = Pattern.compile(regex , Pattern.CASE_INSENSITIVE);

        String inp = JOptionPane.showInputDialog(null , "How many sentences do you want") ;
        int inpCount = Integer.parseInt(inp) ;

        StringBuilder builder = new StringBuilder() ;


        for (int i = 0; i < inpCount; i++) {

            String sentence = JOptionPane.showInputDialog(null , "Enter sentence" + (i+1) + ":") ;
            Matcher matcher = pattern.matcher(sentence) ;


            while (matcher.find()) {
               sentence = sentence.replaceAll("(?i)\\b(\\w+)(\\s+\\1\\b)+", "$1") ;



            }
            builder.append(sentence) ;


        }
        JOptionPane.showMessageDialog(null , builder.toString()) ;


    }
}
