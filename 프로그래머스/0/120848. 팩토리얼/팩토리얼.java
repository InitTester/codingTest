class Solution {
    public int solution(int n) {
        
        int answer = 1;
        
        while(true){
            if(n<=factorial(answer)){
                break;
            }
            answer++;
        }
        
        if(n!=factorial(answer)){
            answer--;
        }
        
        return answer;
    }
    
    public static int factorial(int k){
        if (k == 0 || k == 1) {
            return 1; 
        }

        return k * factorial(k - 1); 
    }
}