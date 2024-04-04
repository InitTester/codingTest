// class Solution {
//     public int[] solution(int[] arr, int n) {
//         int[] answer = new int [arr.length];
        
//         for(int i=0; i<arr.length; i++){                
//             if(arr.length%2==0){                
//                 answer[i] = i%2==0 ? arr[i] : arr[i]+n; 
//             } else {
                
//                 answer[i] = i%2==0 ? arr[i]+n : arr[i]; 
//             }
//         }
//         return answer;
//     }
// }



// class Solution {
//     public int[] solution(int[] arr, int n) {
//         for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
//             arr[idx]+=n;
//         }

//         return arr;
//     }
// }

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0)).toArray();
    }
}