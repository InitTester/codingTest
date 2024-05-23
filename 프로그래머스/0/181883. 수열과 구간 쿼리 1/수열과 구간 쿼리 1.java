// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
        
//         int[] answer = arr;
        
//         for(int i=0; i < queries.length; i++){
//             int s = queries[i][0];
//             int e = queries[i][1];
            
//             if(s <= e){
//                 for(int j=s; j<=e; j++ ){
//                     answer[j]++;
//                 }
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int s = query[0], e = query[1];
            for (int i = s; i <= e; i++)
                arr[i]++;
        }
        return arr;
    }
}