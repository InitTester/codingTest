class Solution {
    public int solution(int a, int d, boolean[] included) {
        if(!((1<=a && a<=100) && (1<=d && d<=100) && (1<= included.length && included.length <= 100)))
            return 0;

        int count =0;
        for(boolean booleanValue : included) if(booleanValue){count++;}

        if(count==0)
            return 0;

        int answer = 0;
        int sum = 0;

        sum += a;

        for (int i = 0; i < included.length; i++) {
            if(included[i])
                answer += sum;

            sum += d;
        }
        
        return answer;
    }
}