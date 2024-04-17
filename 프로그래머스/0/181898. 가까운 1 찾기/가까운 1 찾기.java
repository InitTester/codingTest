// class Solution {
//     public int solution(int[] arr, int idx) {
//         int answer = -1;
        
//         for(int i=idx; i<arr.length; i++){
//             if(1 <= arr[i]) {answer = i; break;}
//         }
        
//         return answer;
//     }
// }


import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }
}