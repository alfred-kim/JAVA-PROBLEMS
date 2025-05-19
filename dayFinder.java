package javaProblems;

import javax.swing.*;
import java.util.Calendar;

public class dayFinder {

    public static String findDay(int month, int day,int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        String days[] = {
                "SUNDAY" , "MONDAY", "TUESDAY" ,"WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY"
        } ;

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek-1];


    }
    public static void main(String[] args) {

        try {
            String monthInput = JOptionPane.showInputDialog("Enter the month (1-12)");
            int month = Integer.parseInt(monthInput);

            String dayInput = JOptionPane.showInputDialog("Enter the day (1-31)");
            int day = Integer.parseInt(dayInput);

            String yearInput = JOptionPane.showInputDialog("Enter the year : ");
            int year = Integer.parseInt(yearInput);


            String dayofWeek = findDay(month, day, year);

            JOptionPane.showMessageDialog(null, "The day is " + dayofWeek);


        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }




    }
}
