class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);

        for(int i=0; i <str.length(); i++){
            if(str.charAt(i)-51==0 || str.charAt(i)-54==0 || str.charAt(i)-57==0){
                answer++;
            }
        }
        
        return answer;
    }
}