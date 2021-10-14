import java.util.Scanner;

public class CC_Grade_the_Steel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int [] a = new int[t];
        double [] b = new double[t];
        int [] c = new int[t];
        int [] grade = new int[t];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextDouble();
            c[i] = sc.nextInt();
            boolean c1=a[i]>50 ? true : false;
            boolean c2=b[i]<0.7 ? true : false;
            boolean c3=c[i]>5600 ? true : false;
            if(c1 && c2 && c3){
                grade[i]=10;
            }
            else if(c1 && c2){
                grade[i]=9;
            }
            else if(c2 && c3){
                grade[i]=8;
            }
            else if(c1 && c3){
                grade[i]=7;
            }
            else if(c1 || c2 || c3){
                grade[i]=6;
            }
            else {
                grade[i] = 5;
            }
        }
        for(int i=0;i<t;i++){
            System.out.println(grade[i]);
        }
    }
}
