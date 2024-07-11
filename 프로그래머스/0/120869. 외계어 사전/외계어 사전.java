// class Solution {
//     public int solution(String[] spell, String[] dic) {
//         int answer = 2;
        
//         for(int i=0; i< dic.length; i++){

//             int cnt = 0;
//         	for(String s : spell){                
//                 if(dic[i].contains(s)) cnt++;
//                 if(cnt == spell.length) answer = 1;                
//             }
//         }
//         return answer;
//     }
// }

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic).map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining())).collect(Collectors.toList()).contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;
    }
}