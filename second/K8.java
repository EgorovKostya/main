import java.io.*;
import java.util.*;

public class K8{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i = 1; i <= n; i++){
         for(int k = 1; k <= i; k++){
            System.out.print(i + " ");
         }
         for(int j = i + 1; j <= n;j++){
            System.out.print(j + " ");
         }
         System.out.println("");
      }
   }
}