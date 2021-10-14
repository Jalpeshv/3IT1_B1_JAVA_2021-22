import java.util.*;

public class CC_Smallest_Pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> sum=new ArrayList<Integer>(t);
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> input=new ArrayList<Integer>(n);
            for(int j=0;j<n;j++)
            {
                int temp=sc.nextInt();
                input.add(temp);
            }
            Collections.sort(input);
            sum.add(input.get(0)+input.get(1));
        }
        for(int i=0;i<t;i++)
        {
            System.out.print(sum.get(i)+ " ");
        }
    }
}
