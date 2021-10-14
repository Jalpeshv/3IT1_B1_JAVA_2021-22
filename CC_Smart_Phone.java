import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CC_Smart_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int custom = sc.nextInt();
        ArrayList<Integer> budget = new ArrayList<>();
        ArrayList<Integer> revenue = new ArrayList<>();
        for(int i=0;i<custom;i++){
            int temp = sc.nextInt();
            budget.add(temp);
        }
        Collections.sort(budget);
        for(int i=0;i<custom;i++){
            revenue.add(budget.get(i)*(custom-i));
        }
        Collections.sort(revenue);
        System.out.println(revenue.get(revenue.size()-1));
    }
}
