import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] tmp  = new int[emergency.length];
        int idx = 0;

        for(int i: emergency) {tmp[idx++]= i;}
        int[] answer = new int[emergency.length];

        Arrays.sort(tmp);

        for(int i=0; i<emergency.length;  i++){
            for(int j=0; j < tmp.length; j++){
                if(emergency[i] == tmp[j]){
                    answer[i] = tmp.length-j;
                }
            }
        }
        return answer;
    }
}