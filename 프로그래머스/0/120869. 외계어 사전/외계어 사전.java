class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i< dic.length; i++){

            int cnt = 0;
        	for(String s : spell){                
                if(dic[i].contains(s)) cnt++;
                if(cnt == spell.length) answer = 1;                
            }
        }
        return answer;
    }
}