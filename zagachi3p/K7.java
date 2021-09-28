import java.io.*;
import java.util.*;

public class K7{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a == 1){
         System.out.print("ЯНВАРЬ");
      }else if(a == 2){
         System.out.print("ФЕВРАЛЬ");
      }else if(a == 3){
         System.out.print("МАРТ");
      }else if(a == 4){
         System.out.print("АПРЕЛЬ");   
      }else if(a == 5){
         System.out.print("МАЙ");
      }else{
         System.out.print("ИЮНЬ");
      }
   }
}