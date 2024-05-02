class Solution {
    public String solution(String my_string, int s, int e) {
        char[] chars = my_string.toCharArray();
        
        for(int i=s; i<e; i++,e--){
            char tmp = chars[i];
            chars[i] = chars[e];
            chars[e] = tmp;
        }
        
        return new String(chars);
    }
}