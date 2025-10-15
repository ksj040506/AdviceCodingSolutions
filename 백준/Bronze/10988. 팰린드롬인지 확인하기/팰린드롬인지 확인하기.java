import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder(sc.nextLine());
      
      if(sb.toString().equals(new StringBuilder(sb).reverse().toString())) System.out.println(1);
      else System.out.println(0);
  }  
}



