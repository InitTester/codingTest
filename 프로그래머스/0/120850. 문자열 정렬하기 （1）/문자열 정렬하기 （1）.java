import java.util.*;

class Solution {
    public int[] solution(String my_string) {
       
        List<Integer> list = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            if(48 <=c && c <= 57){
                list.add((int)c);
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        int idx=0;
        
        for(int i : list){
            answer[idx++] = Integer.parseInt((char)i+"");
        }
        
        return answer;
    }
}