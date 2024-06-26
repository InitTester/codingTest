class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String value = String.valueOf(num);
        
        for(int i=0; i <value.length(); i++){
            if(value.substring(i,i+1).equals(String.valueOf(k))){
                answer = i+1;
                break;
            }
        }
        
        return answer==0 ? -1 : answer;
    }
}