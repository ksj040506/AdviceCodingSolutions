import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String[] str = sc.nextLine().split("");
      int sum = 0;
      
      for(String s : str) {
        sum += Integer.parseInt(s);
      }
      
      System.out.println(sum);
  }     
}
