import java.util.Scanner;
public class IT24103080Lab6Q1B
{
     public static void main(String args[])
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter 10 numbers: ");
         int[] num = new int[10];
         int i = 0;
         while(i<10)
         {
             System.out.print("Enter number "+(i+1)+":");
             num[i] = input.nextInt();
             i++;
         }
         System.out.println("The number you entered are: ");
         i = 0;
         while(i<10)
         {
             System.out.print(num[i]+" ");
             i++;
         }
      }
}