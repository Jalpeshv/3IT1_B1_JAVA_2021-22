        import java.util.*;
        import java.lang.*;
        import java.io.*;
public class chef_and_operator
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- >0){
                int A = sc.nextInt();
                int B = sc.nextInt();
                if(A > B){
                    System.out.println(">");
                }
                else if(A < B){
                    System.out.println("<");
                }
                else{
                    System.out.println("=");
                }
            }
        }catch(Exception e) {
            return;

        }
    }
}
