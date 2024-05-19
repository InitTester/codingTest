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

// class Solution {
//     public int[] solution(int n, int[] slicer, int[] num_list) {
//         int start = n == 1 ? 0 : slicer[0];
//         int end = n == 2 ? num_list.length - 1 : slicer[1];
//         int step = n == 4 ? slicer[2] : 1;
//         int[] answer = new int[(end - start + step) / step];
//         for (int i = start, j = 0; i <= end; i += step) {
//             answer[j++] = num_list[i];
//         }
//         return answer;
//     }
// }

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {

        int[] answer = null;
        int a = slicer[0], b = slicer[1], c = slicer[2];

        switch (n) {
        case 1:
            answer = Arrays.copyOf(num_list, b + 1);
            break;
        case 2:
            answer = Arrays.copyOfRange(num_list, a, num_list.length);
            break;
        case 3:
            answer = Arrays.copyOfRange(num_list, a, b + 1);
            break;
        case 4:
            answer = IntStream.range(0, (b - a) / c + 1).map(i -> num_list[a + i * c]).toArray();
            break;
        }

        return answer;
    }
}