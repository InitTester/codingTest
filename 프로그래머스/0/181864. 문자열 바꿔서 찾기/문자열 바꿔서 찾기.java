// class Solution {
//     public int solution(String myString, String pat) {
//         int answer = 0;
//         String result = "";
//         for(int i=0; i<myString.length(); i++){
//             result += myString.charAt(i)=='A' ? 'B': 'A';
//         }
        
//         answer = result.contains(pat) ? 1 :0;
        
//         return answer;
//     }
// }


// class Solution {
//     public int solution(String myString, String pat) {
//         myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
//         return myString.contains(pat) ? 1 : 0;
//     }
// }



import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer();
        for (char ch : myString.toCharArray())
            if (ch == 'A') sb.append('B');
            else sb.append('A');
        return sb.toString().contains(pat) ? 1 : 0;
    }
}