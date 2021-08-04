import java.util.*;

public class Sum_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String num[] = new String[N];
        for(int i=0; i<N; i++)
        {
            num[i] = sc.next();
        }
        System.out.println("Entered values are: ");
        for(int i=0; i<N; i++)
        {
            System.out.println(num[i]);
        }
        for(int i=0; i<N; i++)
        {
            sum=0;
            for(int j=0; j<num[i].length(); j++)
            {
                sum=sum + (num[i].charAt(j) - '0');
            }
            System.out.println("Sum= " + sum);
        }
    }
}
