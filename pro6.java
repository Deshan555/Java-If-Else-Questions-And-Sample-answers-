//Write a java program to check whether a character is uppercase or lowercase alphabet

import java.util.Scanner;

public class pro6
{
    public static void main(final String[] args)
    {
        final Scanner alphabet = new Scanner(System.in);

        System.out.print("Enter Character You Want To Scan : ");

        final char inputchar = alphabet.next().charAt(0);

        // Verification inputs

        if((inputchar>='A'&& inputchar<='Z')||(inputchar>='a'&& inputchar<='z'))
        {
            System.out.print(inputchar+" Valid Character \n");

        }
        else
        {
            System.out.print(inputchar+" You Enterd Invalid Character \n");

            System.exit (0); // terminate system //

        }


        // main process //

        if(inputchar>='A'&& inputchar<='Z')
        {
            System.out.print(inputchar+" is Uppercase Character");
        }
        else if (inputchar>='a'&& inputchar<='z')
        {
            System.out.print(inputchar+" is Lowercase Character");
        }
    }
}
    
