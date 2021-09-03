import java.util.Scanner;

public class CC_Second_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int a[]=new int[3];
        int b[]=new int[3];
        int c[]=new int[3];
        int max[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            if((a[i]>b[i]&&c[i]<b[i])||(a[i]<b[i]&&c[i]>b[i]))
            {
                max[i]=b[i];
            }
            else if((b[i]>a[i]&&c[i]<a[i])||(b[i]<a[i]&&c[i]>a[i]))
            {
                max[i]=a[i];
            }
            else
            {
                max[i]=c[i];
            }
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(max[i]);
        }
    }
}
