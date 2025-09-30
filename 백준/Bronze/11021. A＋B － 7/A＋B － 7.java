import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i = 1; i <= count; i++ ) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr.add(a+b);
      }
      int k = 1;
      for(int i : arr){
        System.out.println("Case #" + k + ": " + i);
        k++;
      }
  }
}


