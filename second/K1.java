import java.io.*;
import java.util.*;

public class K1{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      double sum = 0;
      for(int k = 1; k <= n; k++){
         sum+= (float) Math.pow(x, 3*k) / Math.pow(k, 2*k); 
      }
      System.out.print(sum);
   }
}