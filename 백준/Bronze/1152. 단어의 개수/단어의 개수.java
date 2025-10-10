import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ");
    int count = 0;
    for(String s : str) {
      if (!s.isBlank()) {
        count++;
      }
    }
    
    System.out.println(count);
  }     
}



