import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int [] arr = new int [count];
    
    for (int i = 0; i < count; i++){
      arr[i] = sc.nextInt();
    }

    int num = sc.nextInt();
    int flag = 0;
    for(int k : arr) {
      if(num == k) ++flag;
    }
    System.out.println(flag);
  }     
}