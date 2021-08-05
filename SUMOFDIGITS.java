import java.util.*;
public class prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no_of_input = sc.nextInt();

        int rem = 0;
        int num[] = new int[no_of_input];

        for (int i = 0; i < no_of_input; i++) {
            num[i] = sc.nextInt();

        }

        for (int i = 0; i < no_of_input; i++) {
            int n= sc.nextInt();
            int sum = 0;
            while (num[i] > 0)
            {
                rem = num[i] % 10;
                sum = sum + rem;
                num[i] = num[i] / 10;

            }
            System.out.println(sum);
        }
    }
}
