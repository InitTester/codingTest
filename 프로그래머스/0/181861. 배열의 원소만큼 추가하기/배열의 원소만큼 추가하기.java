// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr) {
//         List<Integer> list = new ArrayList<Integer>();
//         for(int i=0; i< arr.length; i++){
//             for(int j=0; j< arr[i];j++){
//                 list.add(arr[i]);
//             }
//         }
//         return list.stream().mapToInt(i->i).toArray();
//     }
// }

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];    
        }

        answer = new int[sum];

        int idx = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}