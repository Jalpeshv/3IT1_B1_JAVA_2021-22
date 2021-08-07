import java.util.*;
public class SmallFactorial {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// for no of testcases

        for(int i=0; i<n;i++)
        {int fact = 1;
            int num = sc.nextInt();
            while (num != 0)
            {
                fact = fact * num;
                num--;
            }
            System.out.println(fact);
        }
    }
}
