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

// import java.util.*;
// import java.util.stream.Collectors;

// class Solution {
//     public int solution(String[] strArr) {
//         return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values().stream().max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList()).size();
//     }
// }



import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap <Integer, Integer> map = new HashMap <> ();

        for(int i = 0; i < strArr.length; i ++){
            int key = strArr[i].length();

            if(!map.containsKey(key)){
                map.put(key, 1);
            }
            else{
                map.put(key, map.get(key) + 1);
            }
        }

        //System.out.println(map);
        int max = 0;
        for(Map.Entry <Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        //System.out.println(max);

        return max;
    }
}