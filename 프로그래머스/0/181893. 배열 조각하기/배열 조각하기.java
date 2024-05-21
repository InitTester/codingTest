// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[] query) {
//         int[] answer = {};        
//         int[] tmp = arr;
        
//         for(int i=0; i < query.length; i++){
//             if(i%2==0){
//                 tmp = Arrays.copyOfRange(tmp,0,query[i]+1);        
//             }else{                
//                 tmp = Arrays.copyOfRange(tmp,query[i],tmp.length);        
//             }
//         }
        
//         answer = tmp;
        
//         return answer;
//     }
// }

// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[] query) {
//         int start = 0;
//         int end = arr.length - 1;
//         for (int i = 0; i < query.length; i++) {
//             if (i % 2 == 0) {
//                 end = start + query[i] - 1;
//             } else {
//                 start += query[i];
//             }
//         }

//         return Arrays.copyOfRange(arr, start, end + 2);
//     }
// }

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        return IntStream.range(0, query.length)
                .boxed()
                .reduce(arr, (current, next) -> next % 2 == 0 ?
                                Arrays.copyOfRange(current, 0, query[next] + 1) :
                                Arrays.copyOfRange(current, query[next], current.length),
                        (a, b) -> a);
    }
}