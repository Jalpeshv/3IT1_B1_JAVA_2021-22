import java.util.Scanner;

public class CC_Block_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int sum = 0, remainder = 0,temp=a[i];
            while (temp != 0) {
                remainder = temp % 10;
                sum = sum * 10 + remainder;
                temp /= 10;
            }
            if(sum==a[i])
            {
                System.out.println("wins");
            }
            else
            {
                System.out.println("loses");
            }
        }
    }
}
