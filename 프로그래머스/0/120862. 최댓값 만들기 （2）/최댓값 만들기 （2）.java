// import java.util.*;

// class Solution {
//     public int solution(int[] numbers) {
//         int answer = 0;
//         int max = numbers[0] * numbers[1];

//         for(int i =0; i < numbers.length; i++) {
//             for(int j=0; j < numbers.length; j++){
//                 int now = numbers[i]*numbers[j];

//                 if(i!=j) {
//                     if (max <= now) {
//                         max = now;
//                         answer = max;
//                     }
//                 }
//             }
//         }
        
//         return answer;
//     }
// }



import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}