public class RevWord_in_Str{

    public static StringBuilder reVerse(String Str)
    {
        int endCount = 0 ;
        StringBuilder SB = new StringBuilder(Str);
        SB.append(" ");
        int SB_Length=SB.length();
        StringBuilder Ans = new StringBuilder();
        for(int i = 0 ; i < SB_Length ; i++)
        {
            endCount++;
            if(SB.charAt(i) == ' ')
            {
                int RangeOf_J = i - endCount + 1;

                for (int j = i-1 ; j >= RangeOf_J ; j--)
                {
                    if(j != SB_Length-1 )
                        Ans.append(SB.charAt(j));
                }
                if(i != SB_Length)
                    Ans.append(' ');
                endCount=0;

            }
        }
        return Ans;
    }

    public static void main(String[] args)
    {
        String s="Jaya Radha Giridhari";
        System.out.println(reVerse(s));
    }
}
