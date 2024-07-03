class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] list = polynomial.split("\\+");
        int sumX = 0, sum = 0;

        for(String s : list){
            if(s.indexOf("x") >= 0) {
                int value = s.replaceAll("x", "").trim().isEmpty() ? 1 : Integer.valueOf(s.replaceAll("x", "").trim());
                sumX += value;
            } else{
                sum += Integer.valueOf(s.trim());
            }
        }
        
        if(sumX==1)
            answer = "x";
        
        if(sumX> 1)
            answer = sumX + "x";

        if(sum >0) 
            answer = answer + (sumX > 0 ? " + " + sum : sum);
        
        
        return answer;
    }
}