// import java.math.*;

// class Solution {
//     public String solution(String a, String b) {
//         String answer = "";
        
//         BigInteger big_a = new BigInteger(a);
//         BigInteger big_b = new BigInteger(b);
        
//         answer = big_a.add(big_b) + "";
        
//         return answer;
//     }
// }

import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        answer += A.add(B);

        return answer;
    }
}