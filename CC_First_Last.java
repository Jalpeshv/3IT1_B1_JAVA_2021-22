import java.util.Scanner;

public class CC_First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        for(int i = 0 ; i<t ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i<t ; i++)
        {
            int sum,first,last;
            last=a[i]%10;
            while(a[i]>9) {
                a[i] /= 10;
            }
            first=a[i];
            sum=first+last;
            System.out.println(sum);
        }
    }
}

