import java.util.*;

public class Anagram
        {

            public static void main(String args[])
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the 1st string to know wether its pangram or not --->  ");
                String Str = input.nextLine();
                System.out.println();
                System.out.print("Enter the 2nd string to know wether its pangram or not --->  ");
                String Str1 = input.nextLine();
                Str=Str.toLowerCase();
                Str1=Str1.toLowerCase();
                Str=Str.replace(" ","");
                Str1=Str1.replace(" ","");
                char CArr1[]=Str.toCharArray();
                char CArr2[]=Str1.toCharArray();
                Arrays.sort(CArr1);
                Arrays.sort(CArr2);

                if(Arrays.equals(CArr2,CArr1))
                    System.out.println("Both the Strings makes the Anagram ");
                else
                    System.out.println("Not an Anagram");

            }
        }