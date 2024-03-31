class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            answer += rsp.substring(i,i+1).equals("2") ? 0 : (rsp.substring(i,i+1).equals("0") ? 5 : 2);
        }
        return answer;
    }
}