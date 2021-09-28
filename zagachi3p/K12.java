import java.io.*;
import java.util.*;

public class K12{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int k = sc.nextInt();
      for(int i = m; i <= k; i++){
         if(i % 3 == 0){
            System.out.println(i);
         }
      }
   }
}