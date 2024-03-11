class Solution {
    public String[] solution(String my_string) {
        int len = my_string.split(" ").length;
        String[] answer = new String[len];
        
        for(int i=0; i <len; i++){
            answer[i] = my_string.split(" ")[i];
        }
        
        return answer;
    }
}