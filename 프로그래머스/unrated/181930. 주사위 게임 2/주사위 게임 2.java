class Solution {
    public int solution(int a, int b, int c) {
        if(!(1<= a && a<=6) || !(1<= b && b<=6) || !(1<= c && c<=6))
            return 0;
        
        
        if(a==b && b==c && a==c){
            return (a+b+c)*(int)((Math.pow(a,2))+(Math.pow(b,2))+(Math.pow(c,2)))*(int)((Math.pow(a,3))+(Math.pow(b,3))+(Math.pow(c,3)));
            }
        if (a == b || b == c || a == c){
            return  (a+b+c)*(int)((Math.pow(a,2))+(Math.pow(b,2))+(Math.pow(c,2)));
        }

        return  a+b+c;
    }
}