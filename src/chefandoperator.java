import java.util.Scanner;

public class chefandoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                a[i]=">";
            }
            else if(x<y){
                a[i]="<";
            }
            else{
                a[i]="=";
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
