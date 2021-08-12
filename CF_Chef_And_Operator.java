import java.util.Scanner;
public class CF_Chef_And_Operator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            A = sc.nextInt();
            B = sc.nextInt();

            if (A < B) {
                System.out.println('<');
            } else if (A > B) {
                System.out.println('>');
            } else {
                System.out.println('=');
            }
        }
    }
}
