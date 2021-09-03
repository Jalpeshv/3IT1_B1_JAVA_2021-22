import java.util.Scanner;

public class CC_Number_of_Notes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        t+=n/100;
        n%=100;
        t+=n/50;
        n%=50;
        t+=n/10;
        n%=10;
        t+=n/5;
        n%=5;
        t+=n/2;
        n%=2;
        t+=n/1;
        n%=1;
        t+=n;
        System.out.println(t);
    }
}
