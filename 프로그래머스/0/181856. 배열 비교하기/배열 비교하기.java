import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sumarr1 = (int)Arrays.stream(arr1).asLongStream().sum();
        int sumarr2 = (int)Arrays.stream(arr2).asLongStream().sum();
        
        if(arr1.length!=arr2.length){
            answer = arr1.length < arr2.length ? -1 : 1;
        }else{
            answer = sumarr1 == sumarr2  ? 0 : (sumarr1<sumarr2 ? -1 : 1);
        }
        // answer = arr1.length != arr2.length && arr1.length < arr2.length ? arr1.length-arr2.length : ( arr1.length == arr2.length && sumarr1 == sumarr2 ? 0 : 1);
        return answer;
    }
}