public class FindDuplicates {

    public static StringBuilder FindDup(String Str)
    {


        StringBuilder SB = new StringBuilder() ;

        int Arr[] = new int[256];



        for (int i = 0 ; i < Str.length() ; i++)
        {
            for (int j = i + 1 ; j < Str.length() ; j++)
            {
                if(Str.charAt(i) == Str.charAt(j))
                {
                    Arr[Str.charAt(i)]++;

                    if ( Arr[Str.charAt(i)]==1 )
                    {
                        SB.append(Str.charAt(j)) ;
                    }
                }
            }

        }

        return SB;

    }

    public static void main(String []args)
    {
        String Str = "ssdff@@@@@@@@@--------+++++++ffffffffffffffdd";
        System.out.println(FindDup(Str));
    }
}
