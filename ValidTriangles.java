import java.util.*;
public class ValidTriangles {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T >= 1 && T <= 1000) {
            for (int i = 0; i < T; i++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                if (A < =180 && B < =180 && C < =180) {
                    int sum = 0;
                    sum = A + B + C;
                    if (sum == 180) {
                        System.out.println("YES");
                    } else
                        System.out.println("NO");
                }


            }
        }
    }
}
