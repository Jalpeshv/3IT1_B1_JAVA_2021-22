import java.util.Scanner;

//TLG
public class lead_game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int p1 = 0;
        int p2 = 0;
        int max=0;
        int winner = 1;
        for(int i=0;i<n;i++){
            p1 = p1+sc.nextInt();
            p2 = p2+ sc.nextInt();

            if(Math.abs(p1-p2)>max) {
                max = Math.abs(p1 - p2);
                if(p1>p2)
                    winner = 1;
                else
                    winner = 2;
            }
        }
        System.out.println(winner+" "+max);
    }
}
