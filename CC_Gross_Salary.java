import java.util.ArrayList;
import java.util.Scanner;

public class CC_Gross_Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Float> Basic_Salary=new ArrayList<Float>(t);
        for(int i=0;i<t;i++) {
            float temp = sc.nextInt();
            Basic_Salary.add(temp);
        }
        for(int i=0;i<t;i++) {
            if (Basic_Salary.get(i) < 1500) {
                System.out.println(String.format("%.2f", Basic_Salary.get(i) + Basic_Salary.get(i) * 0.1 + Basic_Salary.get(i) * 0.9));
            } else {
                System.out.println(String.format("%.2f", Basic_Salary.get(i) + 1500 + Basic_Salary.get(i) * 0.98));
            }
        }
    }
}
