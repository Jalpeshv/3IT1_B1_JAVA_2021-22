import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reversenum {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes her
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int rev = 0, rem = 0;
            for (; num > 0; ) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            System.out.println(rev);
        }
    }
}
