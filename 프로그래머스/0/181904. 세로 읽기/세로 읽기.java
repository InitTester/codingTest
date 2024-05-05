class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        int end = m;
        for(int i=0; i< my_string.length(); i+=m){
              answer.append(my_string.substring(i,i+end).charAt(c-1));
        }
        return answer.toString();
    }
}