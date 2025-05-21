package javaProblems;

import javax.swing.*;

public class compare {
    public static String getSmallestAndLargest(String s , int k){

        String smallestsub = s.substring(0,k);
        String largestsub = s.substring(0,k);

        for(int i = 1 ; i<=s.length()-k ; i++){
            String compareSub = s.substring(i,i+k);

            if(compareSub.compareTo(smallestsub)<0){
                smallestsub = compareSub;
            }
            else if(compareSub.compareTo(largestsub)>0){
                largestsub = compareSub;
            }
        }
        return "smallest"+" " + smallestsub + " "+"largest" +" "+ largestsub;

    }

    public static void main(String[] args) {
        try {
            String s = JOptionPane.showInputDialog("Enter the string");
            String ktest = JOptionPane.showInputDialog("Enter the length of the substring");
            int k = Integer.parseInt(ktest);

            if (s==null||s.isBlank()){
                JOptionPane.showMessageDialog(null, "Please enter a string");
                return;
            }

            else if (k<0||k>s.length()){
                JOptionPane.showMessageDialog(null, "Please enter a number between 0 and "+s.length());
            }

            String result = getSmallestAndLargest(s, k);
            JOptionPane.showMessageDialog(null, result);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
