import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        String[] tmp = (String.valueOf(b)).split("");
        
        for(String s : tmp) {
           st.add(Integer.valueOf(s));           
        }
        while (!st.empty()) {
            System.out.println(a*st.pop());
        }
        System.out.println(a*b);
 
    }

}

