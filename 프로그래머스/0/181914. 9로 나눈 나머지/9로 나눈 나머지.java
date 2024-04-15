import java.util.stream.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int[] list = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i : list){answer += i;}
        
        return answer%9;
    }
}