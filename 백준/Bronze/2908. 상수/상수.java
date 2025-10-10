import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String num1 = sc.next();
      String num2 = sc.next();
      
      int a = Integer.parseInt("" + num1.charAt(2) + num1.charAt(1) + num1.charAt(0));
      int b = Integer.parseInt("" + num2.charAt(2) + num2.charAt(1) + num2.charAt(0));

      System.out.println(Math.max(a,b));
  }     
}



