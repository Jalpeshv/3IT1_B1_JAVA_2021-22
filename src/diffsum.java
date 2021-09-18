import java.util.Scanner;

//DIFFSUM
/*Write a program to take two numbers as input and print their difference
if the first number is greater than the second number otherwise print their sum.
 */
public class diffsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println(n1-n2);
        else
            System.out.println(n1+n2);

    }
}
