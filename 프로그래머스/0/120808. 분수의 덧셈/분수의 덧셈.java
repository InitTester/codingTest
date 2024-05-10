class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer, denom=0;
        numer = denom1 * denom2;
        denom = numer1*denom2 + numer2 * denom1;
        
        int max = 1;
        
        for(int i=1; i <= numer && i<= denom; i++){   
            if(numer%i==0 && denom%i==0){
                max = i;
            }
        }
        
        answer[0] = denom/max; 
        answer[1] = numer/max; 
        
        return answer;
    }
}