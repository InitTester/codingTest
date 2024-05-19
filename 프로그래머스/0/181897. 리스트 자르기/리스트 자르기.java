import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {

        int length = n== 2 ? num_list.length : slicer[1]+1;
        int start = n== 1 ? 0 : slicer[0];
        int slice = n == 4 ? slicer[2] : 1;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i =start; i < length; i = i + slice){
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}