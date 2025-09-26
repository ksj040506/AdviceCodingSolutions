import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      int tmp = 0;

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      int [] arr = {a, b, c};
      
      for(int k = 0; k < arr.length -1; k++) {
        for(int i = 0; i < arr.length - 1-k; i++) {

          if(arr[i] > arr[i+1]) {
          tmp = arr[i+1];
          arr[i+1] = arr[i];
          arr[i] = tmp;
          }
          }
        }
      
      if (arr[0] == arr[1] && arr[1] == arr[2]) {
        System.out.println(10000 + (arr[0]*1000));
      }
      else if (arr[0] == arr[1] || arr[1] == arr[2]) {
        System.out.println(1000 + (arr[1]*100));
      }
      else {
        System.out.println(arr[2]*100);
      } 
  }
}

