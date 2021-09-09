import java.util.*;
public class SunOrDifference {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println(n1-n2);
        else
            System.out.println(n2+n1);
    }
}
