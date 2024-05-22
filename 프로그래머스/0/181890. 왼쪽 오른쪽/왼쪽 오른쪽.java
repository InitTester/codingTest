// import java.util.*;

// class Solution {
//     public String[] solution(String[] str_list) {
//         String[] answer = {};
//         for(int i=0; i < str_list.length; i++){
//             if(str_list[i].equals("l")){
//                 answer = Arrays.copyOfRange(str_list,0,i);
//                 break;
//             }else if(str_list[i].equals("r")){
//                 answer = Arrays.copyOfRange(str_list,i+1,str_list.length);
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] str_list) {
        return IntStream.range(0, str_list.length)
                .boxed()
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .map(i -> {
                    if (str_list[i].equals("l")) {
                        return Arrays.copyOfRange(str_list, 0, i);
                    }
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                })
                .orElseGet(() -> new String[]{});
    }
}