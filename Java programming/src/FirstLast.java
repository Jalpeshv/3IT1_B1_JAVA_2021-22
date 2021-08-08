import java.util.*;
public class FirstLast {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int first[] = new int[a];
     int last[] = new int[a];
     String s;
     for(int i=0;i<a;i++)
     {
         s = sc.next();
         first[i] = s.charAt(0)-48;
         last[i] = s.charAt(s.length()-1)-48;
     }
     for(int i=0;i<a;i++)
     {
         int sum=first[i]+last[i];
         System.out.println("First number="+first[i]+",Last number="+last[i]+",Sum="+sum);
     }
    }
}
