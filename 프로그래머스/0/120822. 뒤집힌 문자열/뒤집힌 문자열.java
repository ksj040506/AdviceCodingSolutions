import java.util.Stack;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ms = my_string.split("");
        Stack<String> st = new Stack<>();
        for(String a : ms) {
            st.add(a);
        }
        for(int i = 0; i < ms.length; i++){
            ms[i] = st.pop();
        }
        answer = String.join("",ms);
        return answer;
    }
}