import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int idx = 0;
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i : rank) { if(attendance[idx++]){list.add(i);}}
        
        list.sort(null);
        
        int rank1 = indexOf(rank,list.get(0));
        int rank2 = indexOf(rank,list.get(1));
        int rank3 = indexOf(rank,list.get(2));
        
        answer = 10000 * rank1 + 100 * rank2 + rank3;
        
        return answer;
    }
    
    public static int indexOf(int[] array, int value){
        for(int i=0; i < array.length; i++){
            if(array[i]==value)
                return i;
        }
        return -1;
    }
}
