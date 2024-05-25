class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++){ 
            
            int tmp = num_list[i];
            
            while(true){    
                if(tmp==1){
                    break;
                }else{
                    tmp = tmp%2==0 ? tmp/2 : (tmp-1)/2;
                }
                answer++;
            }
        }
        
        return answer;
    }
}