import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      boolean [][] map = new boolean[100][100];
      
      int n = sc.nextInt();
      int count = 0;

      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int j = 0; j < 10; j++) {
          for (int k = 0; k < 10; k++) {
            map[x+j][y+k] = true;
          }
        }
      }

      for(int x = 0; x < 100; x++) {
        for(int y = 0; y < 100; y++) {
          if(map[x][y]) count++;
        }
      }

      System.out.println(count);
    }
  }  




