package javaProblems;

import javax.swing.*;

public class lexicographical_comparisons {
    public static void main(String[] args) {
        String inp1 = JOptionPane.showInputDialog("Enter a word 1");
        String inp2 = JOptionPane.showInputDialog("Enter a word 2");

        String input1 = inp1.toLowerCase().trim();
        String input2 = inp2.toLowerCase().trim();

        int len1 = input1.length();
        int len2 = input2.length();

        System.out.println(len1+len2);

//        Lexicographical comparison

        int comparison = input1.compareTo(input2);

        if(comparison>0){
            JOptionPane.showMessageDialog(null ,"word 2 comes before word 1");
        }
        else if(comparison<0){
            JOptionPane.showMessageDialog(null ,"word 1 comes before word 2");
        }
        else {
            JOptionPane.showMessageDialog(null ,"both words are equal");
        }



    }
}
