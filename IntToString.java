import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = Integer.toString(a);
        //System.out.println(s);
        if(a<100) {
            if (a == Integer.parseInt(s)) {
                System.out.println("Good job");
            }
        }
        else {
            System.out.println("Wrong Answer");
        }
    }
}
