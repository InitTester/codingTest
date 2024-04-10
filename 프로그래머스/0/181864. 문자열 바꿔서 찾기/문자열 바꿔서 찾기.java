class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = "";
        for(int i=0; i<myString.length(); i++){
            result += myString.charAt(i)=='A' ? 'B': 'A';
        }
        
        answer = result.contains(pat) ? 1 :0;
        
        return answer;
    }
}