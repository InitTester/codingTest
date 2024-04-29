// import java.util.*;

// class Solution {
//     public String[] solution(String myString) {
//         List<String> list = new ArrayList<>();

//         for(String s : myString.split("x")) { if(!s.equals("")) list.add(s);}

//         Collections.sort(list);
        
//         return list.stream().toArray(String[]::new);
//     }
// }


import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
}