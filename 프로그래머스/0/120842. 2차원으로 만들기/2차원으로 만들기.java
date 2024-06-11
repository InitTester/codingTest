class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0,idx2 =0;
        
        for(int i=0; i <num_list.length; i++){
            if(idx2<n){                
                answer[idx][idx2++] = num_list[i];
            }else{
                idx++;
                idx2=0; 
                answer[idx][idx2] = num_list[i];
                idx2= 1;
            }
        }
        
        return answer;
    }
}