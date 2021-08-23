import java.util.*;
import java.lang.*;
    public class CC_ATM
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%5==0 && x<y) {
                System.out.println(y - x - 0.50);
            }
            else if(y<x) {
                System.out.println(y);
            }
            else {
                System.out.println(y);
            }
        }
    }
