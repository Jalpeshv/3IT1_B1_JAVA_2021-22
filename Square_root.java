import java.util.Scanner;
import java.lang.Math;
public class Square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double square_root = Math.sqrt(num);
        System.out.println(square_root);
    }
}
