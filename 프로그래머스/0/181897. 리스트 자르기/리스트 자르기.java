// import java.util.*;

// class Solution {
//     public int[] solution(int n, int[] slicer, int[] num_list) {

//         int length = n== 2 ? num_list.length : slicer[1]+1;
//         int start = n== 1 ? 0 : slicer[0];
//         int slice = n == 4 ? slicer[2] : 1;
        
//         List<Integer> list = new ArrayList<>();
        
//         for(int i =start; i < length; i = i + slice){
//             list.add(num_list[i]);
//         }
        
//         return list.stream().mapToInt(i->i).toArray();
//     }
// }

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}