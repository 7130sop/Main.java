public class MaxOccurringChar
{

    public static char MaxOcc(String Str)
    {
        int count=0;

        int max=0;

        char ans=' ';

        StringBuilder SB = new StringBuilder("");

        for (int i = 0 ; i < Str.length()-1 ; i++)
        {
            count = 0 ;

            for (int j = i+1 ; j < Str.length() ; j++)
            {

                if(Str.charAt(i) == Str.charAt(j) )
                {
                    count++;

                    if(count >= max)
                    {
                        max = count ;
                        ans = Str.charAt(i);

                    }
                }

            }
        }
        return ans;
    }

    public static void main(String [] args)
    {
        String Str = "hgvhgccjgfgfyjgyftrreew5876988765554w434323";
        System.out.println(MaxOcc(Str));
    }

}
