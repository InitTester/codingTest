import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};

        List<Integer> list = new ArrayList<>();
        int i = 0;

        while(i<arr.length){

            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else{
                if(list.get(list.size()-1)<arr[i]){
                    list.add(arr[i]);
                    i++;
                }else{
                    list.remove(list.size()-1);
                }
            }
        }

        stk = list.stream().mapToInt(k->k).toArray();
        
        return stk;
    }
}