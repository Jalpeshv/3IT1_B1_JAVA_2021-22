import java.util.Scanner;

public class CF_Packaging_Cupcakes {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();//number of testcase
        for(int i=0;i<t;i++)
        {
            int num=sc.nextInt();//number of cupcakes
            int l=((num/2)+1);
            System.out.println(l);
        }
    }
}
