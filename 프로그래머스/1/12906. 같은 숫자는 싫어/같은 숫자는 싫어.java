import java.util.*;
import java.util.HashMap;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        HashMap <Integer, Boolean> uniqe = new HashMap();
        ArrayList<Integer> result = new ArrayList();
        int pre = -1; 
        for(int num : arr) {
            if(pre != num){
                uniqe.put(num, true);
                result.add(num);
            }
            pre = num;
        }
        answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}