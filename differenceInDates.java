import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
   
   /*
     This program calculates the difference between two dates from user in years, months and days.
     
     Author: Mariah Hall
     Date:   August 16th, 2018
   */

public class DifferenceInDates {
   public static void main(String[] args) {
   	
      Scanner scnr = new Scanner(System.in);
      String firstInput;    // user's first input date
      String secondInput;   // user's second input date
      LocalDate firstDate;  // converted from String firstInput to count the difference
      LocalDate secondDate; // converted from String secondInput to count the difference

      // get user Input
      System.out.println("Please enter the first date (YYYY-MM-DD): ");
      firstInput = scnr.nextLine();
   
      System.out.println("Please enter the second date (YYYY-MM-DD): ");
      secondInput = scnr.nextLine();
      
      // creates LocalDates from user input
      firstDate = LocalDate.parse(firstInput);
      secondDate = LocalDate.parse(secondInput);  
      
      // computes if firstDate occurs before secondDate
      if (firstDate.isBefore(secondDate)) {
         Period p = Period.between(firstDate, secondDate);
         System.out.println(p.getYears() + "Year(s), " + p.getMonths() + " month(s), " + p.getDays() + " day(s)");
      }
      // computes if secondDate occurs before firstDate
      else if (firstDate.isAfter(secondDate)) {
         Period p = Period.between(secondDate, firstDate);
         System.out.println(p.getYears() + "Year(s), " + p.getMonths() + " month(s), " + p.getDays() + " day(s)");
      }
      // prints if the two dates are the same   
      else {
    	 System.out.println("Dates are the same!");
      }       
   scnr.close();
   }
}   
