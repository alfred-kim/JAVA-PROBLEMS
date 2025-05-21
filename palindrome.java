package javaProblems;

import javax.swing.*;

public class palindrome {
    public static void main(String[] args) {
        try {
            String s = JOptionPane.showInputDialog(null, "Enter the word : ");
            String string = s.toLowerCase().trim();
            boolean isPalindrome = true;
            if(string==null||s.isBlank()){
                JOptionPane.showMessageDialog(null, "Please enter a word");
                return ;
            }

            if(string.length()>50||!string.matches("[a-z]+")){
                JOptionPane.showMessageDialog(null, "enter valid characters");
                return ;
            }


            for (int i = 0; i < (string.length()/2); i++) {

                if (string.charAt(i) != string.charAt(string.length()-i-1)) {
                    isPalindrome = false;
                }

            }

            if(isPalindrome==true){
                JOptionPane.showMessageDialog(null, "The word is a palindrome");
            }

            else{
                JOptionPane.showMessageDialog(null, "The word is not a palindrome");
            }


        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
