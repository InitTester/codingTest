import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int twox = 0;
        int twoy = 0;
        int tmp = 0;

        for(int i = 0; i < queries.length; i++){
            twox = queries[i][0];
            twoy = queries[i][1];
            
            tmp = answer[twox];
            answer[twox] = answer[twoy];
            answer[twoy] = tmp;
        }
        
        return answer;
    }
}