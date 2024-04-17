class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        for(int i=idx; i<arr.length; i++){
            if(1 <= arr[i]) {answer = i; break;}
        }
        
        return answer;
    }
}