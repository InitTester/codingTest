import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();

        list.add(n);
        
        for(int i=0; ; i++){

            n = n%2==0 ? n/2 : 3*n+1;
            
            list.add(n);
            if(n==1 || n==0) break;
        }
        
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}