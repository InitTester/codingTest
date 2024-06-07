class Solution {
    public int solution(int n) {
        
        int piece = 6;
        int k = 1;
        int cnt = 1;
        
        while(true){
            if(n*k==piece) break;
            
            if(n*k > piece){
                cnt++;
                piece = 6*cnt;
            }else{
                k++;
            }
        }
        
        return cnt;
    }
}