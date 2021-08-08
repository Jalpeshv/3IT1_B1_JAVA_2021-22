import java.util.Scanner;
public class SumOfAllDigits
{
 public static void main(String[] s)
 {
     Scanner sc = new Scanner(System.in);
     int NumberOfDigits = sc.nextInt();
     int sum[] = new int[NumberOfDigits];
     for (int i = 0; i < NumberOfDigits; i++)
     {
         String s1 = sc.next();
         for(int j=0;j<s1.length();j++)
         {
             sum[i]=sum[i]+(s1.charAt(j)-'0');
         }
     }
     for (int i = 0; i < NumberOfDigits; i++)
     {
         //sum[i]=sum[i]-3*48;
         System.out.println(sum[i]);
     }
 }
}
