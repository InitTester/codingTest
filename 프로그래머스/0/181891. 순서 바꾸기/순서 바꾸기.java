// class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[num_list.length];
//         int idx = 0;
//         for(int i=n; i < num_list.length; i++){
//             answer[idx++] = num_list[i];
//         }
//         for(int i= 0; i<n; i++){
//             answer[idx++] = num_list[i];
//         }
//         return answer;
//     }
// }


import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        int[] copy = Arrays.copyOf(numList, numList.length * 2);

        System.arraycopy(numList, 0, copy, numList.length, numList.length);
        return Arrays.copyOfRange(copy, n, n + numList.length);
    }
}