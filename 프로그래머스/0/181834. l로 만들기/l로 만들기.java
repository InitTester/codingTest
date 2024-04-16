// class Solution {
//     public String solution(String myString) {
//         StringBuilder answer = new StringBuilder();
        
//         for(char c : myString.toCharArray()){
//             answer.append(c <'l' ? 'l' : c);            
//         }
        
//         return answer.toString();
//     }
// }

// class Solution{
//     public String solution(String myString){
//         return myString.replaceAll("[^l-z]","l");
//     }
// }



import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
                .collect(Collectors.joining());
    }
}


