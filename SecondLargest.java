import java.util.*;
public class SecondLargest {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);

        }

    }




}
