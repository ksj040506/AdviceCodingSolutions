import java.util.*;
public class Main {
// 그리드 알고리즘을 사용해 가장 큰걸(값이) 먼저 넣어서 
// 채우고 그후 그것보다 바로 작은 다음 값을 넣는 방식으로 해 최소의 동전개수 구하기 
static final int QUARTER = 25;
static final int DIME = 10;
static final int NICKEL = 5;
static final int PENNY = 1;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
   
    for(int i = 0; i < t; i++) {
      int c = sc.nextInt();
      int q = c/QUARTER;
      c %= QUARTER;
      int d = c/DIME;
      c %= DIME;
      int n = c/NICKEL;
      c %= NICKEL;
      int p = c/PENNY;

      System.out.println(q + " " + d + " " + n + " " + p);
    }
    }
  }  




