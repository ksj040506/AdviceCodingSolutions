import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc. nextInt();
      int tmp = 0;
      int[] arr = new int[n];

      for(int i = 0; i < n; i++) {
        arr[i] = i+1;
      }

      for(int i = 0; i < m; i++ ) {
        int num1 = sc.nextInt() -1;
        int num2 = sc.nextInt() -1;
        tmp = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = tmp;
      }

      for(int i : arr) {
        System.out.print(i + " ");
      }
  }     
}