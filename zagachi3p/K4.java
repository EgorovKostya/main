import java.io.*;
import java.util.*;

public class K4{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      System.out.print(n - (n / 100) * 100 - n % 10 + (n % 10) * 100 + (n / 100));
   }
}