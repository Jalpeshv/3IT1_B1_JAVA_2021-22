import java.util.*;
import java.lang.*;
    public class CC_ATM
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y%5==0 && x>y) {
                System.out.println(x - y);
            }
            else if(y>x) {
                System.out.println(x);
            }
            else {
                System.out.println(x);
            }
        }
    }
