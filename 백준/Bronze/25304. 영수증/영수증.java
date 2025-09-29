import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<int[]> arr = new ArrayList<>();
      int sum = sc.nextInt();
      int num = sc.nextInt();

      int a, b;
      int sum2 = 0;
      
      for(int i = 0; i < num; i++) {
        a = sc.nextInt();
        b = sc.nextInt();
        int[] tmp = {a, b};
        arr.add(tmp);
      }
      for(int[] arr2 : arr) {
        sum2 += (arr2[0]*arr2[1]);
      }
      if(sum == sum2) System.out.println("Yes");
      else System.out.println("No");
  }
}