// JAVA Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide

import java.util.Scanner;

public class pro7 
{
    public static void main(String args[])
    {

        Scanner num1 = new Scanner(System.in);

        System.out.print("Enter First Number :");

        float n1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);

        System.out.print("Enter Second Number :");

        float n2 = num2.nextInt();

        System.out.print("Addition : +\n");

        System.out.print("Subtract : -\n");

        System.out.print("Multiply : *\n");

        System.out.print("Devide   : /\n");

        Scanner ope = new Scanner(System.in);

        System.out.print("Choose a Operator From Above list :");

        char intchar = ope.next().charAt(0);

        if (intchar=='+')
        {
            float ans = n1 + n2;

            System.out.print("Your Answer "+n1+" + "+n2+" = "+ans);
        }

        else if (intchar=='-')
        {
            float ans = n1 - n2;

            System.out.print("Your Answer "+n1+" - "+n2+" = "+ans);
        }

        else if (intchar=='*')
        {
            float ans = n1 * n2;

            System.out.print("Your Answer "+n1+" x "+n2+" = "+ans);
        }

        else if (intchar=='/')
        {
            float ans = n1 / n2;

            System.out.print("Your Answer "+n1+" / "+n2+" = "+ans);
        }

        


    }
    
}