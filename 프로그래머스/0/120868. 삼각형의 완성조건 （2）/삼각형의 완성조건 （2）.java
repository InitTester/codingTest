class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	
	    for(int i=0; i < sides.length; i++) {
	    	if(sides[i] < min) {
	    		min = sides[i];
	    	}
	    	if(sides[i] > max) {
	    		max = sides[i];
	    	}
	    }
        
        int start = max-min;
        
        for(int i = start + 1; i < max + min; i++){
            answer++;
        }

        return answer;
    }
}