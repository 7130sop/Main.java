import java.util.Scanner;
public class CheckPalindrone {
    public static boolean Str;


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String whether it is Palindrone or not");
        String UserInput = scan.nextLine();
        String str=UserInput.toLowerCase();
        int i=0,Li=str.length()-1,ans=1;
        if(str.length()==1||str.length()==0)
            System.out.println(UserInput+" is palindrone");
        else
        {
            while (i <= str.length() / 2) {
                if (str.charAt(i) == str.charAt(Li)) {
                    i++;
                    Li--;
                } else {
                    ans = 0;
                    break;
                }
            }
            if (ans == 1)
                System.out.println(UserInput+" is palindrone");
            else
                System.out.println(UserInput+" is not a palindrone");
        }
    }
}

