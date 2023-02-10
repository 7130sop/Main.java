import java.util.*;
public class ReverseString {


    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String for reversing ---> ");

        String Str = input.nextLine();

        String StrArr[] = Str.split(" ");

        for (int i = StrArr.length-1 ; i > -1 ; i--)
        {
            System.out.print(StrArr[i] + " ");
        }
    }
}
