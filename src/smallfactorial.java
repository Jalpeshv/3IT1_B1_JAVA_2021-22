import java.util.Scanner;

public class smallfactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

            int count=1;
            while(a[i]>1){
                count =count*(a[i]--);
            }
            System.out.println(count);
        }

    }
}
