package javaProblems;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
    public static void main(String[] args) {

        String rules = "0|([1-9][0-9]?)|1[0-9]{2}|2[0-4][0-9]|25[0-5]" ;
        String patternString = rules + "\\." + rules +  "\\." +rules+  "\\." + rules ;

      Pattern pattern = Pattern.compile(patternString);

      String input  = JOptionPane.showInputDialog(null, "Enter IP Address");

      while(input != null&&!input.isBlank()) {

          Matcher matcher = pattern.matcher(input);

          boolean result = matcher.matches();

          JOptionPane.showMessageDialog(null, result ? "valid" : "invalid");

          input = JOptionPane.showInputDialog(null, "Enter IP Address (or cancel to exit )");


      }
      JOptionPane.showMessageDialog(null, "GOOD BYE !!!");

    }
}
