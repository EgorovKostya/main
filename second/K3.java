import java.io.*;
import java.util.*;

public class K3{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = 0;
      int m = 0;
      int a = n - 1;
      int b = n + 1;
      int j = 0;
      while(n != 0){
         if(n > a){
            a = n;
            k++;
         }
         if (b > n){
            b = n;
            m++;
         }
         j++;
         n = sc.nextInt();
      }
      if(k == j){
         System.out.println("СТРОГО ВОЗРАСТАЕТ");
      }else if(m == j){
         System.out.println("СТРОГО УБЫВАЕТ");
      }else{
         System.out.print("NONE");
      }
   }
}