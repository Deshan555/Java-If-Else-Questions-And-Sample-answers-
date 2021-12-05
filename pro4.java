//Write a java programto find maximum between two numbers.

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class pro4 {

    public static void main(String[] args)
    {
        Scanner pro = new Scanner(System.in);

        System.out.print("Enter First Number : ");

        int num1 = pro.nextInt();

        Scanner pro2 = new Scanner(System.in);

        System.out.print("Enter Second Number : ");

        int num2 = pro2.nextInt();

        if (num1 == num2)
        {
            System.out.print("Both Numbers are equal");
        }
        else if(num1 > num2)
        {
            System.out.print(num1+ " grater than " +num2);
        }
        else
        {
            System.out.print(num2+" grater than " +num1);
        }
    }
    
}