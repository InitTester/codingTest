// class Solution {
//     public String solution(String myString) {
//         String answer = "";
//         for(char i : myString.toCharArray()) { answer += 65<= i && i<= 90 ? (char)(i+32) +"" : i+"";}
//         return answer;
//     }
// }

class Solution {
    public String solution(String myString) {

        return myString.toLowerCase();
    }
}