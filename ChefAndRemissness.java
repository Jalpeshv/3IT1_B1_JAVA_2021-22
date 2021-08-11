import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefAndRemissness {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T >= 1 && T <= 100) {
            for (int i = 0; i < T; i++) {
                long A = sc.nextLong();
                long B = sc.nextLong();
                if (A <= 1000000 && B <= 1000000) {
                    long max = A + B;
                    if(A>B) {
                        System.out.println(A + " " + max);
                    }
                    else {
                        System.out.println(B + " " + max);
                    }

                }
            }

        }
    }
}
