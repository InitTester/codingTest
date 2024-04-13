// class Solution {
//     public int solution(int[] num_list) {
//         int odd =0, even=0;
        
//         for(int i=0; i<num_list.length; i++){
//             if(i%2==1){
//                 odd += num_list[i];
//             }else {
//                 even += num_list[i];
//             }
//         }
//         return odd < even ? even : odd;
//     }
// }



import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        return Integer.max(IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum(), IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum());
    }
}