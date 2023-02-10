public class CountConVowSpeChar {

    public static void Count(String Str)
    {
        int Vcount=0,Concount=0,Specount=0;
        StringBuilder SB = new StringBuilder ();
        SB.append(Str.toLowerCase());

        for(int i = 0 ; i < SB.length() ; i++)
        {

            if(SB.charAt(i) == 'a' || SB.charAt(i) == 'e' || SB.charAt(i) == 'i' || SB.charAt(i) == 'o' || SB.charAt(i) == 'u')
            {

                Vcount++;

            }

            else if(SB.charAt(i) > 96 && SB.charAt(i) < 123)
            {

                Concount++;

            }

            else
                Specount++;


        }

        System.out.println(" Count of Consonent : " +Concount);
        System.out.println(" Count of Vowel : " +Vcount);
        System.out.println(" Count of Special Character : " +Specount);

    }

    public static void main(String [] args)
    {

        String Str="Radha GiriDhari";
        Count(Str);

    }
}
