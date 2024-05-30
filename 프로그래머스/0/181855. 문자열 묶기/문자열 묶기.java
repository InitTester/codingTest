// import java.util.*;

// class Solution {
//     public int solution(String[] strArr) {
//         int answer = Integer.MIN_VALUE;
        
//         HashMap<Integer, Integer> list = new HashMap();
//         for(String s : strArr){ list.put(s.length(), list.get(s.length())==null ? 1 : list.get(s.length())+1);}
        
//         for(int i : list.values()){if(i>answer) { answer = i;}}
        
//         return answer;
//     }
// }

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values().stream().max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList()).size();
    }
}