import java.util.Scanner;

//AMR415A
public class Mahasena {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] a;
        int even_count=0;
        int odd_count=0;

            int n=sc.nextInt();
            a=new int[n];
            for(int j=0;j<n;j++) {
                a[j] = sc.nextInt();
                if (a[j] % 2 == 0)
                    even_count++;
                else
                    odd_count++;
            }
            if(even_count>odd_count)
                System.out.println("READY FOR BATTLE");
            else
                System.out.println("NOT READY");
        }

}
