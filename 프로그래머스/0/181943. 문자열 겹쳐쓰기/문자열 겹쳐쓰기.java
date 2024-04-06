// class Solution {
//     public String solution(String my_string, String overwrite_string, int s) {
//         String answer = "";        
//         return answer = my_string.substring(0,s) + overwrite_string + my_string.substring(overwrite_string.length()+s);
//     }
// }


class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}