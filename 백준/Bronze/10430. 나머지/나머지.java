import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int[] result = {(a+b)%c, ((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c))%c};
        
        for(int s : result) {
            System.out.println(s);
        }
    }

    }
