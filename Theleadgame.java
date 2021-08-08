import java.util.*;
public class Theleadgame
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();//no of rounds
        int cs1=0,cs2=0,lead=0,diff=0,diff2=0,winner=0;
        for(int i=0;i<r;i++)
        {
            int a=sc.nextInt();//score of player1
            int b= sc.nextInt();//score ofplayer2

            cs1=cs1+a;
            cs2=cs2+b;
            diff=cs1-cs2;
            diff2=cs2-cs1;
            if(diff>lead) {
                winner = 1;
                lead = cs1 - cs2;
            }
            if(diff2>lead)
            {
                winner=2;
                lead=cs2-cs1;
            }


        } System.out.println(winner+" "+ lead);
    }
}


