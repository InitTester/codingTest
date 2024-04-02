// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
//         char[] list = my_string.toCharArray();
//         for(int i=0; i<list.length; i++){
//             answer += 65<= list[i] && list[i] <= 90 ? (list[i]+"").toLowerCase() :(list[i]+"").toUpperCase();
            
//         }
//         return answer;
//     }
// // }

// import java.util.stream.Collectors;

// class Solution {
//     public String solution(String myString) {
//         return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
//     }
// }

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(char c : my_string.toCharArray()){
            answer.append(c >= 'a' && c <= 'z' ? (char)(c - 'a' + 'A') : (char)(c - 'A' + 'a'));
        }
        return answer.toString();
    }
}