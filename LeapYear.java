import java.io.*;
import java.util.*;
public class LeapYear
{
   public static void main(String[] args)
   {      
      Scanner a = new Scanner(System.in);

      System.out.print("Enter a year : ");
     int year = a.nextInt();

    
      if (year % 4 == 0)
      {
         if (year % 100 == 0)
         {
            if (year % 400 == 0)
            {
               System.out.println("A leap year");
            }
            else
            {
               System.out.println("Not a leap year");
            }
         }
         else
         {
            System.out.println("A leap year");
         }
      }
      else
      {
         System.out.println("Not a leap year");
      }
   }
}