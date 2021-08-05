//20IT052
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Helpingchef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t<1000) {
            for (int i = 0; i < t; i++) {
                int num = sc.nextInt();
                if (num<20&& num>-20) {
                    if (num<10) {
                        System.out.println("Thanks for helping Chef!");
                    } else
                        System.out.println("-1");
                }
            }
        }
	}
}
