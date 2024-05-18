// class Solution {
//     public int[] solution(String my_string) {
//         int[] answer = new int [52];

//         for(char c : my_string.toCharArray()){
//             if (96 < (int) c) {
//                 answer[(int)c-71] += 1;
//             } else {
//                 answer[(int) c - 65] += 1;
//             }
//         }
//         return answer;
//     }
// }


// class Solution {
//     public int[] solution(String my_string) {
//         int[] answer = new int[52];
//         for(int i = 0; i < my_string.length(); i++){
//             char c = my_string.charAt(i);
//             if(c >= 'a')
//                 answer[c - 'a' + 26]++;
//             else
//                 answer[c - 'A']++;
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(char ch: my_string.toCharArray()) {
            answer[ch - 'A' - (Character.isLowerCase(ch)?6:0)]++;
        }
        return answer;
    }
}