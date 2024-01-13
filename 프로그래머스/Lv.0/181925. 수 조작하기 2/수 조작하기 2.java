class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int first = 0;
        int second = 0;
        
        for (int i = 0; i < numLog.length-1; i++) {
            first = numLog[i];
            second = numLog[i+1];
            
            answer += second-first == 1 ? "w" : (second - first == -1 ? "s" : (second - first == 10 ? "d" : (second - first == -10 ? "a" : answer)));
        }
        return answer;
    }
}