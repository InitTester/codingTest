class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length > 10) ? 0 : 1;
            for(int i : num_list) {
                if(num_list.length > 10) { answer += i; } 
                else{ answer *= i; }
        }
        return answer ;
    }
}
    