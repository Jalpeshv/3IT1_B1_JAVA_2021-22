import java.util.*;

public class sum

{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            String num[]=new String[number];
            for(int i=0;i<number;i++)
            {
                num[i]=sc.next();
            }
            for(int i=0;i<number;i++)
            {
                int sum=0;
                for(int j=0;j<num[i].length();j++)
                {
                    sum=sum+(num[i].charAt(j)-'0');
                }
                System.out.println(sum);
            }




        }
}



