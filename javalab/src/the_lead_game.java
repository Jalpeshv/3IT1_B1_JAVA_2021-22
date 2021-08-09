        import java.util.*;
        import java.lang.*;
        import java.io.*;
public class the_lead_game {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int lead1 = 0, lead2 = 0, winner = 0, diff1 = 0, diff2 = 0, lead = Integer.MIN_VALUE;
        int no_of_rounds = sc.nextInt();
        for (int i = 0; i < no_of_rounds; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            lead1 = p1 + lead1;
            lead2 = p2 + lead2;
            diff1 = lead1 - lead2;
            diff2 = lead2 - lead1;
            if (diff1 > lead) {
                winner = 1;
                lead = lead1 - lead2;
            }
            else if(diff2>lead){
                winner=2;
                lead=lead2-lead1;
            }
        }
        System.out.println(winner+" "+lead);
        return;


    }
}
