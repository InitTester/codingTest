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



import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals).flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1))).toArray();
    }
}