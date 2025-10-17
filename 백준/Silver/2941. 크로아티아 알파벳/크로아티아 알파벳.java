import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "*");

      System.out.println(str.length());
      
  }  
}