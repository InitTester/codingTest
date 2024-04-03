class Solution {
    public int solution(int a, int b) {
        boolean oddA = a%2==1;
        boolean oddB = b%2==1;
        int answer = 0;
        answer =oddA && oddB ? a*a + b*b : (int)(oddA || oddB ?  2*(a+b) : Math.abs(a-b));
        return answer;
    }
}