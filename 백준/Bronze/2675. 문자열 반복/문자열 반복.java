import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = Integer.parseInt(sc.nextLine());
      
      for(int i = 0; i < t; i++) {
        int r = Integer.parseInt(sc.next());
        String s = sc.next();
        
        for(int j = 0; j < s.length(); j++) {
          System.out.print(("" + s.charAt(j)).repeat(r));
        }
        System.out.println();
      }
  }     
}