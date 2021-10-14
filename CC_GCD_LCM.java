import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CC_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        int b[]=new int[t];
        int g[]=new int[t];
        int l[]=new int[t];
        int div,lcm=0;
        ArrayList<Integer> gcd=new ArrayList<Integer>();
        ArrayList<Integer> temp1=new ArrayList<Integer>();
        ArrayList<Integer> temp2=new ArrayList<Integer>();
        ArrayList<Integer> temp3=new ArrayList<Integer>();
        ArrayList<Integer> temp4=new ArrayList<Integer>();
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++) {
            int k=1;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    temp1.add(j);
                }
            }
            for(int j=1;j<=b[i];j++)
            {
                if(b[i]%j==0)
                {
                    temp2.add(j);
                }
            }
            while(k<=b[i]){
                if((a[i]*k)%b[i]==0)
                {
                    lcm=a[i]*k;
                    break;
                }
                k++;
            }
        }
        for(int i=0;i<temp1.size();i++)
        {
            for(int j=0;j<temp2.size();j++)
            {
                if(temp1.get(i)==temp2.get(j))
                {
                    gcd.add(temp1.get(i));
                    break;
                }
            }
        }
        Collections.sort(gcd);
        System.out.println(gcd.get(gcd.size()-1)+ " " +lcm);
    }
}
