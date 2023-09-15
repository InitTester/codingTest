class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i =0; i< str1.length(); i++)
        {
            answer += str1.substring(i,i+1);
            
            if(i<str2.length())
                answer += str2.substring(i,i+1);

            if(i == str1.length()-1) {
                if (str1.length() < str2.length()) {
                    for (int j = i; j < str2.length(); j++)
                        answer += str2.substring(j, j + 1);
                }
            }
        }
        return answer;
    }
}