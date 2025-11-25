import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String num = sc.next();
      int n = sc.nextInt();
      long sum = 0;
      int k = 0;

      for(int i = num.length() -1; i >= 0; i--) {
        
        char ch = num.charAt(i);
        int value;

        if(ch >= '0' && ch <= '9') {
          value = ch - '0';
        } else {
          value = ch - 'A' + 10;
        }

        sum += (value)*Math.pow(n,k);
        k++;
      }
      
      System.out.println(sum);
    }
  }  




