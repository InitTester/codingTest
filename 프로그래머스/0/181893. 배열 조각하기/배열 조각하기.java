import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        int[] tmp = arr;
        
        for(int i=0; i < query.length; i++){
            if(i%2==0){
                tmp = Arrays.copyOfRange(tmp,0,query[i]+1);        
            }else{                
                tmp = Arrays.copyOfRange(tmp,query[i],tmp.length);        
            }
        }
        
        answer = tmp;
        
        return answer;
    }
}