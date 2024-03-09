import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        answer = IntStream.of(num_list).anyMatch(x-> x==n) ? 1 : 0;
        return answer;
    }
}