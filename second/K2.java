import java.io.*;
import java.util.*;

public class K2{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = 0;
      for(int i = 1; i*i <= n; i++){
         if(n % i == 0){
            k+=1;
         }
      }
      if((k >= 2) || (n == 1)){
         System.out.print("НЕ ПРОСТОЕ");
      }else{
         System.out.print("ПРОСТОЕ");
      }
   }
}