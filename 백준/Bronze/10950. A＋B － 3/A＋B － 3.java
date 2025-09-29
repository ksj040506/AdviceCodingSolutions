import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int num = sc.nextInt(); 
      ArrayList<int[]> arr = new ArrayList<>(num);
      
      int a, b;
      int i = 0;
      while (i < num) {
        i++;
        a = sc.nextInt();
        b = sc.nextInt();
        int[] tmp = {a, b};
        arr.add(tmp);
      }
      for (int[] arr2 : arr){
        System.out.println(arr2[0] + arr2[1]);
      }
      }
  }