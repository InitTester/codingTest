// import java.util.*;

// class Solution {
//     public int solution(int[] arr1, int[] arr2) {
//         int answer = 0;
//         int sumarr1 = (int)Arrays.stream(arr1).asLongStream().sum();
//         int sumarr2 = (int)Arrays.stream(arr2).asLongStream().sum();
        
//         if(arr1.length!=arr2.length){
//             answer = arr1.length < arr2.length ? -1 : 1;
//         }else{
//             answer = sumarr1 == sumarr2  ? 0 : (sumarr1<sumarr2 ? -1 : 1);
//         }
//         return answer;
//     }
// }


import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }
}