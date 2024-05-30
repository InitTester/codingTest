import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = Integer.MIN_VALUE;
        
        HashMap<Integer, Integer> list = new HashMap();
        for(String s : strArr){ list.put(s.length(), list.get(s.length())==null ? 1 : list.get(s.length())+1);}
        
        for(int i : list.values()){if(i>answer) { answer = i;}}
        
        return answer;
    }
}