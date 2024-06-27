class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i <quiz.length; i ++){
            String[] value = quiz[i].split(" ");
            int value0 = Integer.valueOf(value[0].replaceAll(" ",""));
            int value2 = Integer.valueOf(value[2].replaceAll(" ",""));
            int value4 = Integer.valueOf(value[4].replaceAll(" ",""));

            if(value[1].equals("+")){
                answer[i] = value0 + value2 == value4 ? "O" : "X";
            }else {
                answer[i] = value0 - value2 == value4 ? "O" : "X";
            }
        }
    
        return answer;
    }
}