class Solution {
    public String solution(String letter) {
        String answer = "";        
        String morse = ".-:a,-...:b,-.-.:c,-..:d,.:e,..-.:f,--.:g,....:h,..:i,.---:j,-.-:k,.-..:l,--:m,-.:n,---:o,.--.:p,--.-:q,.-.:r,...:s,-:t,..-:u,...-:v,.--:w,-..-:x,-.--:y,--..:z";
        
        String[] list = letter.split(" ");
        String[] morseList = morse.split(",");
        
        for(int i=0; i<list.length; i++){
            for(int j=0; j< morseList.length; j++){
                String morseValue =morseList[j].split(":")[0];
                if(list[i].equals(morseValue)){
                    answer += morseList[j].split(":")[1];
                }
            }
        }
        return answer;
    }
}