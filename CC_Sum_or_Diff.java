import java.util.Scanner;

public class CC_Sum_or_Diff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a-b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
}
