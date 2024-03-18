class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int index = 0;
        for(String value : strArr) {if(index%2==0){answer[index++] = value.toLowerCase(); }else {answer[index++] = value.toUpperCase();}}
        return answer;
    }
}