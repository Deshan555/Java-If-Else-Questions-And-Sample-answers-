//Write a java program to check whether a number is negative, positive or zero.
import java.util.Scanner;

public class pro3
{
    public static void main(String[] args)
{
    Scanner proin = new Scanner(System.in);

    System.out.print("Enter your Number : ");

    int number = proin.nextInt();

    if(number == 0)
    {
        System.out.print("You Entered Zero");
    }
    else if (number > 0)
    {
        System.out.print("You Entered positive number");
    }
    else
    {
        System.out.print("You Entered Negative Number");
    }

}

}