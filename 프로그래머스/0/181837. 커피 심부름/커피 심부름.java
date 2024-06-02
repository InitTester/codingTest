class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        String[] americano = {"iceamericano", "americanoice","hotamericano", "americanohot","americano","anything"};
        String[] latte = {"icecafelatte", "cafelatteice","hotcafelatte", "cafelattehot","cafelatte"};
        
        for(int i=0; i < order.length; i++){
            for(String stramericano : americano){ if(stramericano.equals(order[i])){answer += 4500;}}
            for(String strlatte : latte){ if(strlatte.equals(order[i])){answer += 5000;}}
        }
    
        return answer;
    }
}