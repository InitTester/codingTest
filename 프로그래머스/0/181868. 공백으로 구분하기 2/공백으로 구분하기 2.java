// import java.util.*;

// class Solution {
//     public String[] solution(String my_string) {
//         String[] result = my_string.trim().split(" ");

//         ArrayList<String> list = new ArrayList<>();

//         for(String str : result){
//             if(!str.trim().isEmpty())
//                 list.add(str);
//         }
        
//         return list.toArray(new String[0]);
//     }
// }

// class Solution {
//     public String[] solution(String my_string) {
//         return my_string.trim().split("[ ]+");
//     }
// }


class Solution {
    public String[] solution(String myString) {
        return myString.trim().split("\\s+");
    }
}