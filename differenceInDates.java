import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

   /*
     This program calculates the difference between two dates from user 
     in years, months and days.
     
     Author: Mariah Hall
     Date:   August 16th, 2018
   */

public class differenceInDates {
   public static void main(String[] args) {
   	
      Scanner scnr = new Scanner(System.in);
      LocalDate firstDate;
      LocalDate secondDate;
      int yearOne;
      int yearTwo;
      int monthOne;
      int monthTwo;
      int dayOne;
      int dayTwo;

      // FIXME: figure out how to read separate Ints for MM DD and YYYY
      System.out.println("Please enter the first date (MM/DD/YYYY): ");
      monthOne = scnr.nextInt();
      dayOne = scnr.nextInt();
      yearOne = scnr.nextInt();
   
      System.out.println("Please enter the second date (MM DD YYYY): ");
      monthTwo = scnr.nextInt();
      dayTwo = scnr.nextInt();
      yearTwo = scnr.nextInt();
      
      // creating LocalDates from user input
      firstDate = LocalDate.of(yearOne, monthOne, dayOne);
      System.out.println(firstDate);
   
      secondDate = LocalDate.of(yearTwo, monthTwo, dayTwo);
      System.out.println(secondDate);
      
      // FIXME: figure out how to validate date given
   
      if (!(firstDate.isEqual(secondDate))) {
    	 
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
      }
      // prints if the two dates are the same   
      else if (firstDate.isEqual(secondDate)) {
    	    System.out.println("Dates are the same!");
      }
      else {
         System.out.println("Error: dates are not valid! Try again.");
      } 
   scnr.close();      
   }
}   
