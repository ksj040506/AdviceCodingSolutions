import java.util.*;
public class Main {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int m = 0;
     int n = 0;
     int max = -1;
     int[][] a = new int[9][9];
     
     for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9 ; j++) {
        a[i][j] = sc.nextInt();
        if (a[i][j] > max) {
          max = a[i][j];
          m = i+1;
          n = j+1;
        }
      }
     }

      System.out.println(max);
      System.out.println(m + " " + n);
     
    }
  }  
