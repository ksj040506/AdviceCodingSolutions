import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      int tmp = 0;

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      if (a == b && b == c) {
        System.out.println(10000 + (a*1000));
      }
      else if (a == b || a == c) {
        System.out.println(1000 + (a*100));
      }
      else if (b == c) {
        System.out.println(1000 + (b*100));
      
      }
      else {
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max*100);
      } 
  }
}

