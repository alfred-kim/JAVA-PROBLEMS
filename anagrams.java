package javaProblems;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.util.Arrays;

public class anagrams {
    public static boolean anagrams(String a, String b) {

        String ss1 = a.toLowerCase().trim();
        String ss2 = b.toLowerCase().trim();

        if (ss1.length() != ss2.length()){
            return false;
        }

        char [] ar1 = ss1.toCharArray();
        char [] ar2 = ss2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);


        return Arrays.equals(ar1, ar2);









    }

    public static void main(String[] args) {
        try {
            String a = JOptionPane.showInputDialog(null, "Enter a word 1");
            String b = JOptionPane.showInputDialog(null, "Enter a word 2");

            if (a==null || b==null||a.isEmpty()||b.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter all the words");
                return;
            }
            else if(a.length()>50||b.length()>50){
                JOptionPane.showMessageDialog(null, "the words should be less than 50");
                return;
            }
            else if(!a.matches("[a-zA-Z]+")||!b.matches("[a-zA-Z]+")){
                JOptionPane.showMessageDialog(null, "enter english words");
                return;
            }

            boolean result = anagrams(a, b);

            JOptionPane.showMessageDialog(null, result? "anagram":"not anagram");






        }catch (Exception e){
            System.out.println(e);
        }
    }
}
