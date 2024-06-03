// class Solution {
//     public String solution(int age) {
//         String answer = "";
//         char[] list = Integer.valueOf(age).toString().toCharArray();
        
//         for(char i : list){ answer += (char)(97+(Integer.valueOf(i)-48));}
        
//         return answer;
//     }
// }


import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}