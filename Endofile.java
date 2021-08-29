import java.util.*;//hasNext() method
public class Endofile {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
              int i=1;
      while(sc.hasNext())
      {
          System.out.println(i+" "+sc.nextLine());
          i++;
      }
    }
}
//hasNext() is boolean method which checks if we a string/token to print or not for true value