import java.util.*;
import java.lang.*;
import java.io.*;
public class SquareRoots {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t > 0){
            int n = sc.nextInt();
            int i = 1;
            int result = 1;
            while(result <= n){
                i++;
                result = i * i;
            }
            System.out.println(i - 1);
            t--;
        }
    }
}
