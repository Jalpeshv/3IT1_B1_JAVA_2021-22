import java.util.*; //static block
public class Staticinitializerblock {

    static int b, h;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positivejava.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String args[]) {


        if (flag) {
            int area = b * h;
            System.out.println(area);

        }


    }
}//static block is always executed first in the public class and it is executed only once in whole code
