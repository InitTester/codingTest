// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {

//         List<Integer> list = new ArrayList<Integer>();
        
//         for(int i : arr){ list.add(i);}       
//         for(int idx : delete_list) { if(list.contains(idx)){ list.remove(Integer.valueOf(idx));}}
        
//         return list.stream().mapToInt(i->i).toArray();
//     }
// }

// import java.util.stream.IntStream;

// class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {
//         return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
//     }
// }


// import java.util.Arrays;
// import java.util.HashSet;

// class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {
//         HashSet<Integer> delete = new HashSet<>();
//         for (int del : delete_list)
//             delete.add(del);
//         return Arrays.stream(arr).filter(i -> !delete.contains(i)).toArray();
//     }
// }



import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a : arr) 
            if (!isExist(delete_list, a))
                arrayList.add(a);

        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }

    public boolean isExist(int[] arr, int data) {
        for (int a : arr)
            if (a == data)
                return true;
        return false;
    }
}