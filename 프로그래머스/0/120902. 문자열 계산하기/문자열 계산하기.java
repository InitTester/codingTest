class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] list = my_string.split(" ");
        String v = "+";

        for(int i=0; i < list.length; i ++){
            if(list[i].equals("+") || list[i].equals("-")){
                v = list[i].equals("+") ? "+" : "-";
                continue;
            }

            if(v.equals("+")) {answer += Integer.valueOf(list[i]);}
            else {answer -= Integer.valueOf(list[i]);}
        }
        
        return answer;
    }
}