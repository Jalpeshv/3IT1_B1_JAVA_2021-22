import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[i]=x%y;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
