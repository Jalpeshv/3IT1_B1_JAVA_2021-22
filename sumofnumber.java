import java.util.*;

public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num[] = new int[t];
        for(int y=0 ; y<t ; y++)
        {
            num[y] = sc.nextInt();
        }
        for(int i=0 ; i<t ; i++)
        {
               int sum = 0;
               while(num[i]!=0)
               {
                   sum = sum + num[i] % 10;
                   num[i]=num[i]/10;
               }
               System.out.println(sum);
        }
    }
}
