import java.util.Scanner;
public class Second_largest {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int[] a = new int[n];
       for(int i=0;i<n;i++)
       {
           int x=sc.nextInt();
           int y=sc.nextInt();
           int z=sc.nextInt();
           if(x>y){
               if(x>z){
                   if(y>z)
                       a[i]=y;
                   else
                       a[i]=z;
               }
               else
               {
                   a[i]=x;
               }
           }
           else{
               if(x>z){
                   a[i]=x;
               }
               else{
                   if(y>z){
                       a[i]=z;
                   }
                   else{
                       a[i]=y;
                   }
               }
           }
       }
       for(int i=0;i<n;i++){
           System.out.println(a[i]);
       }
    }
}
