import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      HashSet<Integer> set = new HashSet<>();

      for(int i = 0; i < 30; i++) {
        set.add(i+1);
      }
      
      for(int i = 0; i < 28; i++) {
        set.remove(sc.nextInt());
      }
      
      List<Integer> list = new ArrayList<>(set);

      Collections.sort(list);
    

      for(int i : list) {
        System.out.println(i);
      }    
  }     
}