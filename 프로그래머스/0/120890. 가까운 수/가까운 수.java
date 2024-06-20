class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i: array) { 
            if(Math.abs(n-i) < min || (Math.abs(n-i) == min && i < answer)){                 
                min = Math.abs(n-i);
                answer = i;
            }
        }
        
        return answer;
    }
}