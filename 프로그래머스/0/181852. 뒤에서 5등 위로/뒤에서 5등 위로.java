import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        List<Integer> list = new ArrayList<Integer>();

        for(int i : num_list){list.add(i);}
        Collections.sort(list);
        
        int k = 0;
        for(int i=5; i<list.size(); i++){ answer[k++] = list.get(i);}

        
        return answer;
    }
}