import java.util.*;
public class Main {
// 그리드 알고리즘을 사용해 가장 큰걸(값이) 먼저 넣어서 
// 채우고 그후 그것보다 바로 작은 다음 값을 넣는 방식으로 해 최소의 동전개수 구하기 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int quarter = 25;
    int dime = 10;
    int nickel = 5;
    int penny = 1;
    
    for(int i = 0; i < t; i++) {
      int c = sc.nextInt();
      int q = 0;
      int d = 0;
      int n = 0;
      int p = 0;

      while(c > 0) {
        if(c >= quarter) {
          c -= quarter;
          q++;
        }else if (c >= dime) {
          c -= dime;
          d++;
        }else if (c >= nickel) {
          c -= nickel;
          n++;
        }else {
          c -= penny;
          p++;
        }
      }

      System.out.println(q + " " + d + " " + n + " " + p);
    }
    }
  }  




