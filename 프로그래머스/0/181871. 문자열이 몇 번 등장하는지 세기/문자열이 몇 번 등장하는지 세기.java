// class Solution {
//     public int solution(String myString, String pat) {
//         int answer = 0;
//         String str = myString;
        
//         while(str.indexOf(pat)>=0){
//             str = str.substring(str.indexOf(pat)+1);
//             answer++;
//         }
            
//         return answer;
//     }
// }

import java.util.stream.Stream;

class Solution {
    public int solution(String myString, String pat) {
        return (int) Stream.iterate(0, i -> i + 1)
            .limit(myString.length() - pat.length() + 1)
            .filter(i -> myString.substring(i, i + pat.length()).equals(pat))
            .count();
    }
}
