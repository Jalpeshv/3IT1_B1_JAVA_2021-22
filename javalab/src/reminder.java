import java.util.Scanner;
public class reminder {
    public static void main(String args[])
        {
            double r;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the dividend ");
            double a=s.nextDouble();
            System.out.println("Enter the divider:");
            double b=s.nextDouble();
            for(r=a;r>b;r-=b);
            {
                System.out.println("Remainder is:" + r);

            }
        }
}
