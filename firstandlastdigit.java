import java.util.Scanner;
public class firstandlastdigit
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum;
        for (int i=0;i<n;i++)
        {
            int a= sc.nextInt();
            int l=a%10;
            while(a>9)
            {
                a=a/10;
            }
            sum=a+l;
            System.out.println(sum);

        }
    }
}
