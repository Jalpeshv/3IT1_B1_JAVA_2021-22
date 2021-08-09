
import java.util.*;
public class reverse_no {
    public static void main(String[] args)
    {
        int a, b, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number:");
        a = s.nextInt();
        while(a > 0)
        {
            b = a % 10;
            sum = sum * 10 + b;
            a = a / 10;
        }
        System.out.println("Reverse:"+sum);
    }
}
