class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        // s,e,k
        // s<= i <= e
        // k < (가장작은 숫자)
        
        int s = 0,e=0,k=0;
        for(int i =0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            
            for(int j = s; j<=e; j++){
                if(arr[j]>k && arr[j] <min){
                    min = arr[j];
                }
            }
            answer[i] = min==Integer.MAX_VALUE ? -1 : min;
                
            
        }
        
        return answer;
    }
}