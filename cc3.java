
    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    public class cc3
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
