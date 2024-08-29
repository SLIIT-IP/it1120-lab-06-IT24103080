import java.util.Scanner;
public class IT24103080Lab6Q1C
{
     public static void main(String args[])
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter 10 numbers: ");
         int[] num = new int[10];
         int count = 0;
         int i = 0;
         while(i<10)
         {
             System.out.print("Enter number "+(i+1)+":");
             num[i] = input.nextInt();
             count = count + num[i];
             i++;
         }
         System.out.println("The number you entered are: ");
         i = 0;
         while(i<10)
         {
             System.out.print(num[i]+" ");
             i++;
         }
         System.out.println();
         System.out.println("Sum of the numbers: "+count);
         double avg = count/10;
         System.out.println("Avarage of the numbers: "+avg);
      }
}