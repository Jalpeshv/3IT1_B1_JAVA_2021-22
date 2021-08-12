import java.util.*;
public class H_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char ch[] = A.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        if (A.equalsIgnoreCase(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}