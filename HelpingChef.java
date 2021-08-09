import java.util.Scanner;

/*Write a program, which takes an integer N and if the number is less than 10
        then display "Thanks for helping Chef!" otherwise print "-1".*/
public class HelpingChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int num = sc.nextInt();

            if(num<10)
            {
                System.out.println("Thanks for helping chef!");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
