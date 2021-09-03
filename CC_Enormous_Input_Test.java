import java.util.Scanner;

public class CC_Enormous_Input_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int t[]=new int[n];
        for(int i=0;i<n;i++)
        {
            t[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(t[i]%k==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
