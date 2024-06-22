class Solution {
    public long solution(String numbers) {
        String[] list = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        int idx = 0;
        for(String s : list){                
           numbers = numbers.replaceAll(s,String.valueOf(idx));
            idx++;
        }
        
        return Long.valueOf(numbers);
    }
}