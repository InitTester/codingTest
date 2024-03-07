class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char i : my_string.toCharArray()) { if(45<= i && i <= 57) answer += Integer.parseInt(i+"");}
        return answer;
    }
}