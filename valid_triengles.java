import java.util.*;
import java.lang.*;
import java.io.*;

public class valid_triengles {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            System.out.println((A+B+C==180 )? "YES" : "NO");
        }

        sc.close();
    }
}
