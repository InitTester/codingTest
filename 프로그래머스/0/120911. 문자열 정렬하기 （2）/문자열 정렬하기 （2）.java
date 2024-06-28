import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] list = new char[my_string.length()];
        int idx = 0;
        
        for(char c : my_string.toCharArray()){
            list[idx++] += (c >= 'a' && c <= 'z') ? c : (char)(c + 32);
        }
        
        Arrays.sort(list);
        
        return new String(list);
    }
}