import java.util.*;
public class cc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t<0)
        {
            int sum=0;
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            while(n!=0)
            {
                sum+=n%10;
                n/=10;
            }
            System.out.println(sum);
        }
    }
}
