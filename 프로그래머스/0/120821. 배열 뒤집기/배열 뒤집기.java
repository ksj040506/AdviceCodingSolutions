import java.util.Stack;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Stack<Integer> turn = new Stack<Integer>();
        for(int num : num_list) {
            turn.push(num);  
        }
         for (int i = 0 ; i < num_list.length; i++){
             num_list[i] = turn.pop();
         }
        answer =num_list;
        return answer;
    }
}