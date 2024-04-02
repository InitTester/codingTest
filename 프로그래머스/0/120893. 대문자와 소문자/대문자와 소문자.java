class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] list = my_string.toCharArray();
        for(int i=0; i<list.length; i++){
            answer += 65<= list[i] && list[i] <= 90 ? (list[i]+"").toLowerCase() :(list[i]+"").toUpperCase();
            
        }
        return answer;
    }
}