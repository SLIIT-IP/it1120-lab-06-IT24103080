import java.util.Scanner;
public class IT24103080Lab6Q3
{
     public static void main(String args[])
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter positive integers (terminate input with -99): ");
         double square = 0;
         double sumofsquares = 0;
         int i = 0;
         while(true)
         {
             System.out.print("Enter a number :");
             int number = input.nextInt();   
                if(number == -99)
                {
                    break;
                }
                if(number>0)
                {
                    square = number*number;
                    sumofsquares = sumofsquares + square;
                    i++;
                }
                else
                {
                    System.out.println("Please enter a positive integer or -99 to terminate");
                }  
         }
         double rms = Math.sqrt(sumofsquares / i);
         System.out.println("The Root Mean Square (RMS) is: "+rms);
      }
}