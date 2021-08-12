import java.util.Scanner;
public class CF_Chef_and_Remissness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int min[]=new int[t];
        int max[]=new int[t];
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b)
            {
                min[i]=a;
            }
            else
            {
                min[i]=b;
            }
            max[i]=a+b;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(min[i]+" "+max[i]);
        }
    }
}
