import java.util.Scanner;
public class charat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String=");
        String s = sc.next();
        System.out.println("|--Entered String is--|");
        for (int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
