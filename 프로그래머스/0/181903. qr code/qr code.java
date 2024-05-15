import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
//         String answer = "";

//         for(int i=0 ; i <code.toCharArray().length; i++){

//             if(i%q ==r)
//                 answer += code.charAt(i);
//         }
//         return answer;
//         StringBuilder answer = new StringBuilder();
        
//         for(int i=0 ; i <code.toCharArray().length; i++){
//             if(i%q ==r)
//                 answer.append(code.charAt(i));
//         }
        
//         return answer.toString();
       StringBuilder sb = new StringBuilder();

        for (int i = r; i < code.length(); i += q)
            sb.append(code.charAt(i));

        return sb.toString();
    }
}