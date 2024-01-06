class Solution {
    public String solution(String code) {
        String answer = "";
        int mode =0;
        char[] codeChar = code.toCharArray();

        if(!(1<=codeChar.length && codeChar.length<=100000))
            return "";

        for(int i=0; i <codeChar.length; i++){
            if(mode == 0){
                if(codeChar[i] != 49){
                    if(i%2==0){
                        answer += codeChar[i];
                    }
                }else
                {
                    mode = 1;
                }
            }
            else if(mode == 1) {
                if(codeChar[i] != 49) {
                    if( i%2==01){
                        answer += codeChar[i];
                    }
                }else
                {
                    mode = 0;
                }
            }
        }
        return answer.trim().equals("") ? "EMPTY" : answer ;
    }
}