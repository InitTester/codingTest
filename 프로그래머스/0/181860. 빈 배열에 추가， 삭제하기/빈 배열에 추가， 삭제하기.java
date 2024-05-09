// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, boolean[] flag) {
//         List<Integer> list = new ArrayList ();
        
//         for(int i=0; i < flag.length; i++){
//             if(flag[i]){
//                 for(int j=0; j < arr[i]*2; j++){
//                     list.add(arr[i]);
//                 }
//             }else{
//                 System.out.println("arr[i] : = " + arr[i]);
//                 for(int j=0; j < arr[i]; j++){
//                     list.remove(list.size()-1);
//                 }
//             }
//         }
        
//         return  list.stream().mapToInt(i->i).toArray();
//     }
// }


import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String answer = "";

        for(int idx=0; idx<arr.length; idx++) {
            if(flag[idx]) {
                answer += String.valueOf(arr[idx]).repeat(arr[idx]*2);
            }
            else {
                answer = answer.substring(0, answer.length() - arr[idx]);
            }
        }

        return Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();
    }
}