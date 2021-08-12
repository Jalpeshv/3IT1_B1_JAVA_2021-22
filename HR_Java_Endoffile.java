import java.util.Scanner;
public class HR_Java_Endoffile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.println(++i + " " + sc.nextLine());
        }
    }
}
