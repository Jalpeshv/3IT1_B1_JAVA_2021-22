import java.util.*;
public class CC_Sum_of_digits {
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
            int sum=0;
            while(a[i]!=0) {
                sum += a[i] % 10;
                a[i] /= 10;
            }
            System.out.println(sum);
        }
    }
}
