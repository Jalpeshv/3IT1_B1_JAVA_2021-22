import java.util.*;
public class cc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1[] = new int[n];
        int p2[] = new int[n];
        int l[] = new int[n];
        for(int i=0;i<n;i++)
        {
            p1[i] = sc.nextInt();
            p2[i] = sc.nextInt();
            int w;
            if(p1[i]>p2[i])
            {
                w=1;
                l[i]=p1[i]-p2[i];
            }
        }
    }
}
