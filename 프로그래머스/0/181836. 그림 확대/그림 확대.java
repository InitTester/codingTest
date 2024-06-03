class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int answerIdx =0;
        
        for(int i=0; i<picture.length; i++){
            
            char[] list = picture[i].toCharArray();
            String tmp = "";
            
            for(int j=0; j< list.length; j++){
                int idx = 0;
                while(idx <k){
                    tmp += list[j];
                    idx++;
                }
            }
            for(int cnt=0; cnt <k; cnt++){                
                answer[answerIdx++] = tmp;
            }
        }
        return answer;
    }
}