import java.util.Scanner;

public class ChefAndOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=0;i<number;i++)
        {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            //int num3 = sc.nextInt();

            if(num1 > num2)
            {
                System.out.println(">");
            }
            if(num1 < num2)
            {
                System.out.println("<");
            }
            if(num1 == num2)
            {
                System.out.println("=");
            }
        }
    }
}
