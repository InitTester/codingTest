class Solution {
    public int solution(String my_string) {
        int answer = 0;
		int value = 0;
        
		for(int i=0; i < my_string.length(); i ++) {
			if(0<= my_string.charAt(i)-'0' && my_string.charAt(i)-'0' <= 9) {
				value = (value*10) + my_string.charAt(i) - '0';
			}else {
				if(value>0) {
					answer += value;
				}
				value=0;
			}
		}
        
		if(Character.isDigit(my_string.charAt(my_string.length()-1))) {
			answer += value;
		}
        
        return answer;
    }
}