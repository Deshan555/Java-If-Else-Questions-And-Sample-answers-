//Write a java program to find maximum between three numbers

import java.util.Scanner;

public class pro10
{
    public static void main(String[] args)
    {
        Scanner n1 = new Scanner(System.in);

        System.out.print("Enter Number One : ");

        int num1 = n1.nextInt();

        Scanner n2 = new Scanner(System.in);

        System.out.print("Enter Number One : ");

        int num2 = n1.nextInt();

        Scanner n3 = new Scanner(System.in);

        System.out.print("Enter Number One : ");

        int num3 = n1.nextInt();

        if(num1 < num2)
        {
            if(num2 <num3)
            {
                System.out.print(num3+" Higher Than "+num2+" and "+num1);
            }
            else
            {
                System.out.print(num2+" Higher Than "+num3+" and "+num1);
            }
        }
        else
        {
            if(num1 <num3)
            {
                System.out.print(num3+" Higher Than "+num1+" and "+num2);
            }
            else
            {
                System.out.print(num1+" Higher Than "+num3+" and "+num2);
            }
        }
    }
    
}