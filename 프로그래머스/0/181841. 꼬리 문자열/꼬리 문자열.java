// class Solution {
//     public String solution(String[] str_list, String ex) {
//         String answer = "";
//         for(int i=0; i< str_list.length; i++){
//             if(str_list[i].indexOf(ex) < 0){
//                 answer += str_list[i];
//             }
//         }
//         return answer;
//     }
// }

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] strList, String ex) {
        return Arrays.stream(strList).filter(s -> !s.contains(ex)).collect(Collectors.joining());
    }
}