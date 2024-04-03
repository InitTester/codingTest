class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[(int)n/k];
        int value = k;
        int idx = 0;
        while(value <= n){
            answer[idx++] = value;
            value += k;
        }
        return answer;
    }
}