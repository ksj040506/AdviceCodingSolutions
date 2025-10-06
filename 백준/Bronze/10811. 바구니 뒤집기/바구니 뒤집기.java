import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i++) arr[i] = i+1;

      for(int i = 0; i < m; i++) {
        int num1 = sc.nextInt()-1;
        int num2 = sc.nextInt()-1;
        
        while(num1 < num2) {
          int tmp = arr[num1];
          arr[num1] = arr[num2];
          arr[num2] = tmp;
          num1++;
          num2--;
        }
      
      }
      for(int i : arr) System.out.print(i + " "); 
    

     
  }     
}
