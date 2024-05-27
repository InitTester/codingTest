// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr) {
//         List<Integer> stk = new ArrayList();
        
//         for(int i =0; i< arr.length; i++){
//             int size = stk.size()-1;
            
//             if(stk.isEmpty()){
//                 stk.add(arr[i]);
//             } else if(!stk.isEmpty() && stk.get(size)==arr[i]){
//                 stk.remove(size);
//             } else {
//                 stk.add(arr[i]);
//             }            
//         }
        
//         if(stk.isEmpty()){
//             return new int[]{-1};
//         }else{
//             return stk.stream().mapToInt(i -> i).toArray();
//         }
//     }
// }
import java.util.*;

class Solution {
   public int[] solution(int[] arr){
       Stack<Integer> stk = new Stack();
       
       for(int i : arr){
           if(!stk.isEmpty() && i==stk.peek()){
               stk.pop();
           }else{
               stk.push(i);
           }
       }
       return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(i->i).toArray();
       
   } 
}