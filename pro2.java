//Write a Java program to check whether a number is even or odd

import java.util.Scanner;

public class pro2
{
    public static void main(String[] args)
    {
        Scanner innum = new Scanner(System.in);

        System.out.print("Enter your number :");

        int number = innum.nextInt();

        int reminder = number % 2;
        
        if (reminder == 0)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }
    }
    
}