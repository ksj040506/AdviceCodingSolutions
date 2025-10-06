import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      double max = 0;
      double sum = 0;

      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        max = Math.max(max, arr[i]);
      }
      for(int i : arr) {
        sum += ((i/max)*100);
      }
      System.out.println((sum/n));
  }     
}
