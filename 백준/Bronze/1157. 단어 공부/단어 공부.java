import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] str = sc.nextLine().toUpperCase().split("");
      HashMap<String, Integer> map = new HashMap<>();

      for(String s : str) {
        if(map.containsKey(s)) {
          map.put(s, map.get(s)+1);
        }
        else {
          map.put(s, 1);
        }
      }
      String max = null;
      int maxValue = 0;
      for(String s: map.keySet()) {
        int value = map.get(s);
        if(value > maxValue) {
          maxValue = value;
          max = s;
        }
        else if (value == maxValue) {
          max = "?";
        }
      }
      
      System.out.println(max);  
  }  
}



