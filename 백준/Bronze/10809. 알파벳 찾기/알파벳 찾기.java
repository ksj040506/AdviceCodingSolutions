import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      HashMap<Integer,String> map = new HashMap<>();
      String str = sc.nextLine();
      String[] alpabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      
      for(String i : alpabet) {
        System.out.print(str.indexOf(i) + " ");
      }
  }     
}