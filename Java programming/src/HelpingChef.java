import java.util.*;
public class HelpingChef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(num[i]<10)
            {
                System.out.println("Thanks for helping Chef!");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
