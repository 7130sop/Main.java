public class UniqChar {
    public static boolean Uniq(String Str)
    {

        for (int i = 0 ; i < Str.length()-1 ; i++)
        {

            for (int j = i + 1 ; j < Str.length() ; j++)
            {

                if( Str.charAt(i) == Str.charAt(j))
                    return false;

            }

        }

        return true;

    }

    public static void main(String [] args)
    {

        String Str = "Krsna";

        System.out.println(Uniq(Str));

    }

}
