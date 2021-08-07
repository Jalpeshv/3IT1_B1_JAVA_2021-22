import java.util.*;
public class HelpingChef {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t<1000) {
            for (int i = 0; i < t; i++) {
                int num = sc.nextInt();
                if (num<20&& num>-20) {
                    if (num<10) {
                        System.out.println("\nThanks for helping Chef!");
                    } else
                        System.out.println("-1");
                }
            }
        }
    }
}
