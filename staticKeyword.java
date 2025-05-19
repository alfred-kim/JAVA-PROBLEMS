package javaProblems;

import javax.swing.*;

public class staticKeyword {
   static String br = JOptionPane.showInputDialog("Enter the measurement of breadth : ");
   static String hei = JOptionPane.showInputDialog("Enter the measurement of height : ");
   static int breadth = Integer.parseInt(br);
   static int height = Integer.parseInt(hei);
   static int area ;


    public static void main(String[] args) {

       try {

           if(breadth<=0 || height<=0) {
               throw new IllegalArgumentException("breadth and height must be greater than 0");
           }

           area = (breadth*height) ;

           JOptionPane.showMessageDialog(null, "The area of the breadth is : "+area);






       } catch (IllegalArgumentException e) {
           JOptionPane.showMessageDialog(null, "breadth and height must be positive");
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null , "Unexpected error occured ");
       }




    }
}
