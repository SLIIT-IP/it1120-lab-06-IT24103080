import java.util.Scanner;
public class IT24103080Lab6Q1
{
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         double num = input.nextDouble();
         double square = num*num;
         double squareroot = Math.sqrt(num);
         System.out.println("the square of "+num+" is : "+square); 
         System.out.println("the square root of "+num+" is : "+squareroot);
     }
}
         