import java.util.*;
public class Main {
//60466175 ->로 값은 sum = sum*36 + value
// value = sum/36 -> 35이하까지
// value = sum%36 -> 나머지값 같이 계산 -> 합쳐주기 근데 꺼꾸로 출력되어야하니 스택사용
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int b = sc.nextInt();
      
      Stack<Character> st = new Stack<>();
      
      while (n > 0) {
        int value = n%b;
        
        if(value < 10) {
          st.add((char)('0'+value));
        } else {
          st.add((char)(value +'A'-10));
        }
        
        n = n/b;  
      }
      
      while(!st.isEmpty()) {
        System.out.print(st.pop());
      }
    }
  }  




