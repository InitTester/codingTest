import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr){ list.add(i);}       
        for(int idx : delete_list) { if(list.contains(idx)){ list.remove(Integer.valueOf(idx));}}
        
        return list.stream().mapToInt(i->i).toArray();
    }
}