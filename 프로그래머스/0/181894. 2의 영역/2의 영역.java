import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int start = -1;
        int end = -1;
        
        for(int i=0 ; i< arr.length; i++){
            if(arr[i]==2){
                if(start==-1){
                    start = i;
                }
                end = i;
            }    
        }
        
        int[] answer = new int[start<0? 1: end-start+1];
        
        if(start<0){
            answer[0] = -1;
        }else{
            for(int i=start, j=0; i <= end; i++){
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}