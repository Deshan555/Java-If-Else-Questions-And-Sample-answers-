/*

Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit

 */

import java.util.Scanner;

public class pro5
{
    public static void main(String[] args)
    {
        Scanner profive = new Scanner(System.in);
        
        System.out.print("Enter Your units Number : ");

        double number = profive.nextDouble();

        if (number <= 50)
        {
            double prof = number * 0.50;

            System.out.print("Your Monthly Payment is "+prof+" for "+number+" Units ");
        }
        else if(number<=150)
        {
            double extra = number - 50;

            double prof = (extra * 0.75) + (50 * 0.50);

            System.out.print("Your Monthly Payment is "+prof+" for "+number+" Units ");
        }
        else if(number<=250)
        {
            double extra = number -150;

            double prof = (extra * 1.20)+(100 * 0.75)+(50 *0.50);

            System.out.print("Your Monthly Payment is "+prof+" for "+number+" Units ");
        }
        else
        {
            double extra = number - 250;

            double prof = (extra * 1.50)+(100 * 1.20)+(100 * 0.75)+(50 * 0.50);

            System.out.print("Your Monthly Payment is "+prof+" for "+number+" Units ");
        }

    }
}