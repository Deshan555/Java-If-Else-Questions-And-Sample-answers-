//Write a Java program to input any alphabet and check whether it is vowel or consonant

//Normal method

import java.util.Scanner;

public class pro11 
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

        if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'
        ||alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
        {
            System.out.print(alphabet+" is Vowel");
        }

        else
        {
            System.out.print(alphabet+" is Consonant");
        }


    }
}