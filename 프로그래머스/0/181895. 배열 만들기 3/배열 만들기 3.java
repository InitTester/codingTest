// class Solution {
//     public int[] solution(int[] arr, int[][] intervals) {
//         int len = (intervals[0][1]-intervals[0][0]) + (intervals[1][1] - intervals[1][0] +2);

//         int[] answer = new int[len];
//         int idx =0;

//         for(int i=0; i< intervals.length; i++){
//             for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
//                 answer[idx++] = arr[j];
//             }
//         }
//         return answer;
//     }
// }


// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[][] intervals) {
        
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=0; i< intervals.length; i++){
//             for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
//                  list.add(arr[j]);
//             }
//         }
        
//         return list.stream().mapToInt(Integer::intValue).toArray();
//     }
// }



// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[][] intervals) {
//         return Arrays.stream(intervals).flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1))).toArray();
//     }
// }



import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int x1 = intervals[0][0];
        int y1 = intervals[0][1];
        int x2 = intervals[1][0];
        int y2 = intervals[1][1];
        int[] answer = new int[(y1-x1+1)+(y2-x2+1)];

        System.arraycopy(arr, x1, answer, 0, y1-x1+1);
        System.arraycopy(arr, x2, answer, y1-x1+1, y2-x2+1);

        return answer;
    }
}