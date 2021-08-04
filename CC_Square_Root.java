import java.util.*;
import java.lang.*;
public class CC_Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a[]= new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            System.out.println((int)Math.sqrt(a[i]));
        }
    }
}
