import java.util.*;
import java.lang.*;
import java.io.*;
public class helping_chef {
        public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine().trim());
            while(tc-- != 0 ){
                int n = Integer.parseInt(br.readLine().trim());
                if(n<10){
                    System.out.println("Thanks for helping Chef!");
                }else{
                    System.out.println(-1);
                }
            }
        }
    }

