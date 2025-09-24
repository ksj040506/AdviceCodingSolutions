import java.util.*;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int h, m, t;
    
     h = sc.nextInt();
     m = sc.nextInt();
     t = sc.nextInt();

     m += t;
     if(m >= 60) System.out.println((h+(m/60) >= 24 ? h+(m/60) - 24 :h+(m/60) ) + " " + (m%60));
     else System.out.println(h + " " + m);

  }

}
