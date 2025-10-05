import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      HashSet<Integer> set = new HashSet<>();
      int[] arr = new int[28];

      for(int i = 0; i < 30; i++) {
        set.add(i+1);
      }
      
      for(int i = 0; i < 28; i++) {
        arr[i] = sc.nextInt();
        set.remove(arr[i]);
      }
      
      for(int i : set) {
        System.out.println(i);
      }    
  }     
}
