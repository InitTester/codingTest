class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] charString = control.toCharArray();

        for(char value : charString) {

            answer = value == 'w' ? n++ :
                    (value == 's' ? n-- : (value == 'd' ? n += 10 : (value == 'a' ? n -= 10 : n)));
        }

        answer = n;
        return answer;
    }
}