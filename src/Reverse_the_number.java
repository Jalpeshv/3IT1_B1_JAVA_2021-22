import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            while (a[i] > 0) {
                b[i] = b[i] * 10 + (a[i] % 10);
                a[i]/=10;

            }
            System.out.println(b[i]);
        }
    }
}
