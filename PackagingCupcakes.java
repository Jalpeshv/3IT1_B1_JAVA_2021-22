import java.util.*;
public class PackagingCupcakes {
    public static void main(String[] args)
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
