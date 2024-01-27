import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        int[] list = new int[]{a,b,c,d};
        int[] count = new int[list.length];
        int max = 0;
        int p =0, q=0, alltwo = 0;

        for(int i=0; i<list.length; i++){

            int cntcheck = 0;

            for(int j=0; j<list.length; j++){
                if(list[i] == list[j]){
                    cntcheck++;
                }
            }
            count[i] = cntcheck;
            if(max < cntcheck){
                max = cntcheck;
            }
        }

        if(max==4){
            p = a;
        } else if(max==3){
            if(a==b && a==c) { p=a; q=d;}
            else if(a==c && a==d) { p=a; q=b;}
            else if(b==c && c==d) { p=b; q=a;}
            else if(a==b && a==d) { p=b; q=c;}
        } else if (max == 2) {
            if(a==b && c==d) {p=a;q=c; alltwo=1;}
            else if(a==c && b==d){p=a; q=b; alltwo=1;}
            else if(a==d && b==c){p=a; q=b; alltwo=1;}
            else if(b==c && a==d){p=b; q=a; alltwo=1;}
            else if(a==b && c!=d) { p=c; q=d; alltwo=0;}
            else if(a==c && b!=d) { p=b; q=d; alltwo=0;}
            else if(a==d && b!=c) { p=b; q=c; alltwo=0;}
            else if(b==c && a!=d) { p=a; q=d; alltwo=0;}
            else if(b==d && a!=c) { p=a; q=c; alltwo=0;}
            else if(c==d && a!=b) { p=a; q=b; alltwo=0;}
        }else if(max == 1) {
            p = Arrays.stream(list).min().getAsInt();
        }

        answer = max ==4 ? 1111*p : ( max==3 ? (10*p+q)*(10*p+q) : ( max==2 ? ( alltwo==1 ? (int)(p+q)*Math.abs(p-q) : p*q) : p));

        return answer;
    }
}