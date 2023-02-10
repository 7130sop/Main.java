import java.util.*;
public class Paragram {
    public static boolean Check (String Str)
    {
        Str=Str.toLowerCase();
        Str=Str.replace(" ","");
        char ChArr[]=Str.toCharArray();
        Arrays.sort(ChArr);
        int Arr[] = new int[26];
        for(char elmnt:ChArr)
        {
            Arr[elmnt-97]++;
        }

        boolean b=true;
        for(int elmnt:Arr)
        {
            if(elmnt==0)
                b=false;
        }
        return b;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String if you want to know whether it's pangram or not in form of true false -->  ");
        String Str = input.nextLine();
        System.out.println();

        boolean b = Check(Str);

        System.out.println("Result is "+b);

    }
}
