import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(isPrime(i))
                    set.add(i);
            }
        }
        
        int[] answer = new int[set.size()];
        int idx= 0;

        Set<Integer> sortedSet = new TreeSet<>(set);
        
        for(int i : sortedSet) answer[idx++] = i;
        
        return answer;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}