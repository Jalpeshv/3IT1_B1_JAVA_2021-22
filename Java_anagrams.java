import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Java_anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] s1 = a.toLowerCase().toCharArray();
        char[] s2 = b.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

