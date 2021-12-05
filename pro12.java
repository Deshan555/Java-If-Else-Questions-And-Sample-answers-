//Write a Java program to input any alphabet and check whether it is vowel or consonant

// ASCII method

import java.util.Scanner;

public class pro12
{
    public static void main(String[] args)
    {
        Scanner alph = new Scanner(System.in);

        System.out.print("Enter Character in Alphabet : ");

        char alphabet = alph.next().charAt(0);
        
        // Verification inputs

        if((alphabet>='A'&& alphabet<='Z')||(alphabet>='a'&& alphabet<='z'))
        {
            System.out.print(alphabet+" Valid Character \n");

        }
        else
        {
            System.out.print(alphabet+" You Enterd Invalid Character \n");

            System.exit (0); // terminate system //

        }



        //main process//

        if(alphabet==97||alphabet==101||alphabet==105||alphabet==111||alphabet==117
        ||alphabet==65||alphabet==69||alphabet==73||alphabet==79||alphabet==85)
        {
            System.out.print(alphabet+" is Vowel");
        }

        else
        {
            System.out.print(alphabet+" is Consonant");
        }


    }
    
}