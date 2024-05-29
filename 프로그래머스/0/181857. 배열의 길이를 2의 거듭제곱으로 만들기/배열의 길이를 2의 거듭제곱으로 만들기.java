// class Solution {
//     public int[] solution(int[] arr) {
        
//         int len = arr.length;
//         int listLen =0;

//         // 2의 거듭 제곱인지 아닌지
//         for(int i=0; i <11; i++){
//             if(len <= Math.pow(2,i)){
//                 listLen = (int)Math.pow(2,i);
//                 break;
//             }
//         }

//         int[] answer = new int[listLen];

//         // 2의 거듭 제곱이면 ?
//         if(len==listLen){
//             for(int i=0; i < arr.length;i ++){
//                 answer[i] = arr[i];
//             }
//         }else{
//             for(int i=0; i < listLen; i++){
//                 if(i<len){
//                     answer[i] = arr[i];
//                 }else{
//                     answer[i] = 0;
//                 }
//             }
//         }
        
//         return answer;
//     }
// }


import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}