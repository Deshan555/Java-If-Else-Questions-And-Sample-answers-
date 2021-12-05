//Write a java program to convert days into years, weeks and days.

import java.util.Scanner;

public class pro9 
{
    public static void main(String args[])
    {
        
        Scanner IN = new Scanner(System.in) ;

        System.out.print("Enter Number Of Days: ") ;

        int days = IN.nextInt() ;

        if (days < 7)
    {
        System.out.print(days+" :DAYS");
    }
    else if (days >7 && days < 30)
    {
        int exd=(days % 7);

        int weeks = (days - exd)/7;

        System.out.print(weeks+" :WEEKS | "+exd+" :DAYS");
    }
    else if (days > 30 && days < 365)
    {
        int exm = (days % 30);

        int months = (days-exm)/30;

        days = (exm % 7);

        int weeks = (exm - days)/7;

        System.out.print(months+" :MONTH | "+weeks+ " :WEEKS | "+days+ " :DAYS");
    }
    else
    {
        int exx = (days % 365);

        int years = (days-exx)/365;

        int exm = exx % 30;

        int months = (exx-exm)/30;

        int exd = exm % 7;

        int weeks =(exm-exd)/7;

        System.out.print(years+ " :YEARS | " +months+ " :MONTHS | "+weeks+ " :WEEKS | "+exd+" :DAYS");


    }
        
    
    }
    
    }
    
