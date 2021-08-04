import java.util.Scanner;
public class CC_Small_Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        for (int i=0;i<t;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            int sum=1,n=1;
            while(n<=a[i])
            {
                sum*=n;
                n++;
            }
            System.out.println(sum);
        }
    }
}