class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        String answer = "";

        char cnum1 = my_string.charAt(num1);
        char cnum2 = my_string.charAt(num2);
        
        char[] list = my_string.toCharArray();
        
        list[num2] = cnum1;
        list[num1] = cnum2;
        
        return String.valueOf(list);
    }
}

