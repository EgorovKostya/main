import java.io.*;
import java.util.*;


public class K4{
   public static void main(String[] args){
      Scanner sc;
      sc = new Scanner(System.in);
      int n = sc.nextInt();
      int max = n;
      int min = n;
      int sum_max = 0;
      int sum_min = 0;
      int i = 0;
      int j = 0;
      while(n != 0){
         if(n >= max){
            max = n;
            sum_max = max;
         }else{
            sum_max += n;
            i++;
         }
         if(n < min){
            min = n;
            sum_min = min;
            j = 0;
         }else{
            sum_min += n;
            j++;
         }
         n = sc.nextInt();
      }
      if(j < i){
         System.out.print(sum_max-sum_min-max);
      }else{
         System.out.print(0);
      }
   }
}