import java.util.*;
public class FirstLastSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []num=new String[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            int f=num[i].charAt(0)-'0';
            int l=num[i].charAt(num[i].length()-1)-'0';
            int sum=f+l;
            System.out.println(sum);
        }


    }

}
