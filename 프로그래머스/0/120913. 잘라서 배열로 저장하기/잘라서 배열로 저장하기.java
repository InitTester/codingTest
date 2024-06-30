class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n + 1;

        String[] answer = new String[len];
        int idx = 0;

        for(int i=0; i<len; i++){
            answer[i] = my_str.substring(idx, idx+n <=my_str.length() ?  idx+n : my_str.length());
            idx= idx+n;
        }
        return answer;
    }
}