class Solution {
    public int solution(int[] array) {
        int answer = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        
        if(array.length ==1) return array[0];
        
        for(int i : array){ if(max <i)max = i;}
        
        int[] list = new int[max+1];
        
        for(int i=0; i < array.length; i++){
            list[array[i]]++;
        }
        
        max = Integer.MIN_VALUE;
        int cnt = 0;
        
        for(int i=0; i < list.length; i++){
//             if(max==list[i] && list[i]>1){
//                 cnt++;
//             }
            
            if(max < list[i]){
               answer= i; 
               max =  list[i]; 
                cnt=0;
            } else if (max == list[i]) {
                cnt++;
            }

        }
        
        if(cnt>0) return -1;
        
        return answer;
    }
}