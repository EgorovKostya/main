import java.io.*;
import java.util.*;

public class K7{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i = n; i <= n + n - 1; i++){
         for(int j = i; j >= i - n + 1;j--){
            System.out.print(j + " ");
         }
         System.out.println("");
      }
   }
}