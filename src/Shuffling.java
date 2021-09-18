import java.lang.*;
import java.util.*;
public class Shuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();

        int sum=0;
        int temp;
        for(int i=0;i<q;i++){
            int n=sc.nextInt();
            sum=0;
            int[] a=new int[n];
            int[] b=new int[n];
            for(int j=0;j<n;j++) {
                a[j] = sc.nextInt();

            }

            for(int k=0;k<n-1;k++){
                if(k%2==0) {
                   if (a[k] % 2 == 1 && a[k + 1] % 2 == 0) {
                        temp=a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
                }
                else{
                    if (a[k] % 2 == 0 && a[k + 1] % 2 == 1) {
                        temp=a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
                }

            }
            for(int z=0;z<a.length;z++) {
                //System.out.print(a[z]+" ");
                b[z]=(a[z]+z+1)%2;
                //System.out.print(b[z]+" ");
                sum = sum + b[z];
            }
            System.out.println(sum);
        }
    }
}
