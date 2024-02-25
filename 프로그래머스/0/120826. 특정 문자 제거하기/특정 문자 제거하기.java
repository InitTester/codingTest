class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for(char cha : my_string.toCharArray()){ if(!letter.equals(cha+"")) answer+= cha;}
        return answer;
    }
}