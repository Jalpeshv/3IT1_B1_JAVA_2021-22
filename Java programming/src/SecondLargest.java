import java.util.*;
public class SecondLargest
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num[][] = new int[n][3];
      int secLarge[] = new int[n];
      int temp;
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<3;j++)
          {
              num[i][j]=sc.nextInt();
          }
      }
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<3;j++)
          {
              for(int k=j+1;k<3;k++)
              {
                  if(num[i][j]<num[i][k])
                  {
                      temp=num[i][j];
                      num[i][j]=num[i][k];
                      num[i][k]=temp;
                  }
              }
          }
      }
      for(int i=0;i<n;i++)
      {
          secLarge[i]=num[i][1];
          System.out.println(secLarge[i]);
      }
    }
}
