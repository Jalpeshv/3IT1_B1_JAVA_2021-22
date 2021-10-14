import java.util.ArrayList;
import java.util.Scanner;

public class CC_Airline_Restrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int condition=0;
        ArrayList<Integer> input = new ArrayList<>();
        for(int i=0;i<t;i++){
            for(int j=0;j<5;j++){
                int temp = sc.nextInt();
                input.add(temp);
            }
            if((input.get(0)+input.get(1))>input.get(2)){
                System.out.println("NO");
            }
            else{
                condition++;
            }
            if(input.get(3)>input.get(4)){
                System.out.println("NO");
            }
            else{
                condition++;
            }
            if(condition==2){
                System.out.println("YES");
            }
        }
    }
}
