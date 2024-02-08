//Ashley Gutierrez Carreto
//September 7, 2023
//Lab 3 HalfMarathon
//Giving information to know how many miles to run this week and 
//the following week until a half of a marathon is reached 
import java.util.Scanner;
public class HalfMarathon
{
   public static void main (String [] args)
   {
      int amount, milesLastWeek;
        
      System.out.println ("How many miles did you ran each day last week? "); 
           
      Scanner keyboard = new Scanner (System.in);   
      milesLastWeek = keyboard.nextInt();
      
      
      System.out.println ("You ran " + milesLastWeek + " miles last week.");
      //milesLastWeek++;
      amount = milesLastWeek + 1;
     
      System.out.println ("You will run " + amount + " miles this week.");

   }
}