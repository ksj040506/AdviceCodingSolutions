import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double count = 0;
      double sum = 0;
      
      for(int i = 0; i < 20; i++) {
        String[] str = sc.nextLine().split(" ");
        if(str[2].equals("P")) {
          continue;
        }
       
        if(str[2].equals("A+")) {
          sum += Double.parseDouble(str[1]) * 4.5; 
          count += Double.parseDouble(str[1]);
        }
        else if(str[2].equals("A0")){
          sum += Double.parseDouble(str[1]) * 4.0;
          count += Double.parseDouble(str[1]); 
        }
        else if(str[2].equals("B+")){
          sum += Double.parseDouble(str[1]) * 3.5;
          count += Double.parseDouble(str[1]); 
        }
        else if(str[2].equals("B0")) {
          sum += Double.parseDouble(str[1]) * 3.0;
          count += Double.parseDouble(str[1]); 
        }
        else if(str[2].equals("C+")) {
          sum += Double.parseDouble(str[1]) * 2.5;
          count += Double.parseDouble(str[1]); 
        }
        else if(str[2].equals("C0")) {
          sum += Double.parseDouble(str[1]) * 2.0;
          count += Double.parseDouble(str[1]); 
        }
        else if(str[2].equals("D+")) {
          sum += Double.parseDouble(str[1]) * 1.5;
          count += Double.parseDouble(str[1]); 
        }
        else if(str[2].equals("D0")) {
          sum += Double.parseDouble(str[1]) * 1.0; 
          count += Double.parseDouble(str[1]);
        }
        else {
          sum += Double.parseDouble(str[1]) * 0.0;
          count += Double.parseDouble(str[1]); 
        }
      }
      
      System.out.printf("%.6f", sum/count);
      System.out.println();
    }
  }  




