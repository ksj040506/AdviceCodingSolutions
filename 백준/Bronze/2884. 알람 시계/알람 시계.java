import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int h, m;
     h = sc.nextInt();
     m = sc.nextInt();

     if (m < 45 && h == 0) {
        System.out.println(23 + " " + (m+15));
     }
     else if (m < 45 ){ 
        System.out.println((h-1) + " " + (m+15));
     }
     else if (m == 45) {
        System.out.println(h + " " + 0);
     }
     else System.out.println(h + " " + (m - 45));
    }
}
