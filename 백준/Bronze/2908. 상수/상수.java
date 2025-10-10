import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String num1 = sc.next();
      String num2 = sc.next();
      
      int a = Integer.parseInt(new StringBuilder(num1).reverse().toString());
      int b = Integer.parseInt(new StringBuilder(num2).reverse().toString());

      System.out.println(Math.max(a,b));
  }     
}



