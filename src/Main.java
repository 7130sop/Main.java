public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int arr[][]=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[7];
        arr[2]=new int[5];
        String str=new String("sagar");
        String patel=new String("sagar");
        String c=new String("sagar");
        String s="sagar";
        String ss="sagar";
        String name="Das";
        StringBuilder sbuilder=new StringBuilder("sagar");
        StringBuffer sbuffer=new StringBuffer("sagar");
        System.out.println(" The address of Name--> "+Integer.toHexString(name.hashCode()));
        System.out.println(" The address of ss--> "+Integer.toHexString(ss.hashCode()));
        System.out.println(" The address of str--> "+Integer.toHexString(str.hashCode()));
        System.out.println(" The address of s--> "+Integer.toHexString(s.hashCode()));
        System.out.println(" The address of sbuilder--> "+Integer.toHexString(sbuilder.hashCode()));
        System.out.println(" The address of sbuffer--> "+Integer.toHexString(sbuffer.hashCode()));
        System.out.println(" The address of Patel--> "+Integer.toHexString(patel.hashCode()));
        System.out.println(" The address of c--> "+Integer.toHexString(c.hashCode()));
        s=s.concat("hi");

        System.out.println(patel==str);
        System.out.println(s.toUpperCase());
        System.out.println(arr[0][1]);


//        for (int i[]:arr)
//        {
//            for (int j:i)
//            {
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }
//        System.out.println(str);
    }
}