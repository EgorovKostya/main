import java.io.*;
import java.util.*;

public class K3{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int chet = 0;
      int nechet = 0;
      // 12345

      nechet = n % 10 + (n / 100) % 10 + n / 10000;
      chet = (n /10) % 10 + (n / 1000) % 10;
      System.out.println(chet - nechet);
   }
}