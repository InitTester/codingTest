class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int last = num_list[num_list.length-1];
        int last_before = num_list[num_list.length-2];
        int lastValue = 0;
        
        lastValue = last_before < last ? last-last_before : last*2;
        
        int index = 0;
        for(int i : num_list){ answer[index++] = i;}
        
        answer[num_list.length] = lastValue;
        
        return answer;
    }
}