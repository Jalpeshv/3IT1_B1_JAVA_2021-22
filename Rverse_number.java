import java.util.Scanner;

public class Rverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                for(int i=0;i<num;i++)
                {

                    int number = sc.nextInt();
                    int rev=0,rem=0;
                    for(int j=number;number>0;j--){
                   rem = number%10;
                    rev = rev*10+rem;
                   number = number/10;
                    }
                    System.out.println(rev);
                }

    }
}
