import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String [][] matrix = new String[5][15];
      
      for(int i = 0; i < 5; i++) {
        String[] tmp = sc.nextLine().split("");
        for (int j = 0; j < tmp.length; j++) {
          matrix[i][j] = tmp[j] ;
        }
      }

      for(int j = 0; j < 15; j++) {
        for (int i = 0; i < 5; i++) {
          if(matrix[i][j] != null) {
            System.out.print(matrix[i][j]);
          }
        }
      }      
    }
  }  
