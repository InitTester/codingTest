import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        for(int i=0; i < queries.length; i++) {

            int start = queries[i][0];
            int end = queries[i][1];

            for(int j = start; j <end; j++, end--){
                char tmp = chars[j];
                chars[j] = chars[end];
                chars[end] = tmp;

            }
        }
        
        return new String(chars);
    }
}