class Solution {
    public int solution(String binomial) {
        int answer = 0;        
        
        String[] list = binomial.split(" ");

        if (list[1].equals("+")) {
            answer = Integer.parseInt(list[0]) + Integer.parseInt(list[2]);
        } else if (list[1].equals("-")) {
            answer = Integer.parseInt(list[0]) - Integer.parseInt(list[2]);
        } else if (list[1].equals("/")){
            answer = Integer.parseInt(list[0]) / Integer.parseInt(list[2]);
        } else if(list[1].equals("*")){
            answer = Integer.parseInt(list[0]) * Integer.parseInt(list[2]);
        }
        return answer;
    }
}