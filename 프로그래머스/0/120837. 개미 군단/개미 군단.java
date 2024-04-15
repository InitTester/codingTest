class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] list = {5,3,1};
        int tmp = hp;
        
        for(int attack : list) {
            if(tmp >0){
                answer += tmp/attack;
                tmp -= attack * (tmp/attack) ;
            }
        }
        return answer;
    }
}