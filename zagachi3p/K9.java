import java.io.*;
import java.util.*;

public class K9{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int sum = 0;
      for(int i = 1; i <= 37; i += 2){
         sum += i;
      }
      System.out.print(sum);
   }
}