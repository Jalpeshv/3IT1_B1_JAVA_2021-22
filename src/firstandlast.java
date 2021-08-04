import java.util.Scanner;

public class firstandlast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            int last = a[i] % 10;
            int first = 0;
            while (a[i]!=0) {
                first = a[i] % 10;
                a[i]/=10;
            }
            System.out.println(first + last);

        }

    }
}
