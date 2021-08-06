import java.sql.SQLOutput;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_inputs = sc.nextInt();
        String num[] = new String[num_of_inputs];
        int sum =0;
        for(int i=0;i<num_of_inputs;i++){
            num[i]=sc.next();
        }
        for(int i=0;i<num_of_inputs;i++){
            sum = 0;
            for(int j =0;j<num[i].length();j++) {
                sum = sum + (num[i].charAt(j)-'0');
            }
            System.out.println(sum);
        }
    }
}
