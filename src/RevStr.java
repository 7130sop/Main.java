public class RevStr
{
    public static StringBuilder Rev(String Str)
    {
        StringBuilder SB = new StringBuilder();

        for (int i = Str.length()-1 ; i > -1 ; i--)
        {
            SB.append(Str.charAt(i));
        }

        return SB;
    }

    public static void main(String []args)
    {
        String Str = "Radha Krsna" ;

        System.out.println(Rev(Str));
    }

}
