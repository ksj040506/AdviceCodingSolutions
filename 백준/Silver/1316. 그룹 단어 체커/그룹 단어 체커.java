import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int count = 0;
      
      for(int i = 0; i < n; i++) {
        String str = sc.nextLine().replaceAll("(.)\\1+", "$1");
        HashMap<String, Integer> map = new HashMap<>();
        boolean check = true;
        
        for(String s : str.split("")) {
          if(map.containsKey(s)) {
            check = false;
            break;
          }
          else {
            map.put(s, 1);
          }
        }

        if(check) count++;
      } 
      
      System.out.println(count);
    }
  }  




