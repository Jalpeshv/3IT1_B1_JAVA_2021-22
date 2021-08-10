import java.util.Scanner;

public class The_lead_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int lead=0,diff1=0,diff2=0,winner=0;
        for(int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            diff1 = a - b;
            diff2 = b - a;
            if(diff1>lead) {
                winner = 1;
                lead = a-b;
            }
            if(diff2>lead) {
                winner = 2;
                lead = b-a;
            }
        }
        System.out.println(winner+" "+lead);
    }
}
