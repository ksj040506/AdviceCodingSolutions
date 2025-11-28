import java.util.*;
public class Main {
// 초기 4개 점(사각형 1개) -> 9개(사각형4개) -> 25개(사각형16개-> 루트씌우고 1더해서 제곱) -> 81(64개) -> ...-> 1089(1024개->루트씌우고 1더하고 제곱)
// ((4^n)^1/2 + 1)^2= (2^n + 1)^2
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   System.out.println((int)(Math.pow(Math.pow(2, n) + 1, 2)));
    }
  }  




