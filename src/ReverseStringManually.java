import java.util.*;
public class ReverseStringManually
{
    public static StringBuilder ReverseString(String Str)
    {
        StringBuilder sb = new StringBuilder();
        int c=0;
//        StringBuilder word = new StringBuilder("");
        for (int i = Str.length()-1 ; i > -1 ; i--)
        {
            if(Str.charAt(i)==' ')
            {
                for(int j = i+1 ;  Str.charAt(j) != ' ' ; j++)
                {
                    if(c==0)
                        Str=Str.concat(" ");
                    sb.append(Str.charAt(j));
                    c++;
                }
                sb.append(" ");
//                word= word.delete(0,word.length());

            }
        }
        for (int i = 0 ; Str.charAt(i) != ' ' ; i++)
        {
            sb.append(Str.charAt(i));
        }

        return sb;
    }


    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to get its reverse with word's not reversed ---> ");
        String Str = input.nextLine();
        System.out.println();
        StringBuilder sb= new StringBuilder(ReverseString(Str));
        System.out.println("Before reversing the String was this : "+Str);
        System.out.println("After reversing the String becomes this : "+sb);

    }
}