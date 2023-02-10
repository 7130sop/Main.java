public class RemoveDuplicate
{
    public static StringBuilder RemDup(String Str)
    {
        StringBuilder SB = new StringBuilder();
        SB.append(Str.charAt(0));
        int count=0;
        for (int i = 1 ; i < Str.length() ; i++)
        {
            count=0;
            for (int j = 0 ; j < SB.length() ; j++)
            {
                if(Str.charAt(i) != SB.charAt(j))
                {
                    count++;
                    if(count == SB.length())
                    {
                        SB.append(Str.charAt(i));
                        count=0;
                        break;
                    }
                }
            }
        }
        return SB;
    }

    public static void main(String []args)
    {
        String Str = "raaaaddddhhh@";

        Str=Str.toLowerCase();

        System.out.println(RemDup(Str));
    }


}
