import java.io.*;
import java.util.*;

public class K10{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      double sum = 0;
      for(int i = 1; i <= 100; i++){
         sum += (float)i/(i+1);
      }
      System.out.print(sum);
   }
}