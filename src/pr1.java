import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum;
        int[] a=new int[n];
        for(int i=0;i<n;i++) {

            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {

            sum = 0;
            while (a[i] > 0) {
                sum = sum + a[i] % 10;
                a[i] = a[i] / 10;
            }
            System.out.println(sum);
        }
        

    }
}
