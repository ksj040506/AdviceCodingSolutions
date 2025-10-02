import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int min, max;
      int n =  sc.nextInt();
      int[] arr = new int [n];
      
      for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      }
      min = arr[0];
      max = arr[0];
      for (int k = 1; k < arr.length; k++) {
        if(max < arr[k]) max = arr[k];
        if(min > arr[k]) min = arr[k];
      }
      System.out.println(min + " " + max);
      
  }     
}