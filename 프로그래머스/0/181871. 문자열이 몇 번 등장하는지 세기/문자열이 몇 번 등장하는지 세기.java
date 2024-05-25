class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString;
        
        while(str.indexOf(pat)>=0){
            str = str.substring(str.indexOf(pat)+1);
            answer++;
        }
            
        return answer;
    }
}