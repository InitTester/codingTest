import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
     int[] answer = {};

        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        int count=0;

        for(int i = l ; i<=r; i++) {

            if(i%5==0){
                arr.add(i);
                String num = String.valueOf(i);
                String[] nums = num.split("");
                
                for(String view : nums){
                    if(view.equals("5") || view.equals("0")){
                    }else {
                        count++;
                    }
                }

                if(count==0) arr2.add(i); 
            }
            count = 0;


        }

        answer = arr2.size()==0 ? new int[]{-1} : arr2.stream().mapToInt(i->i).toArray();
//         if(arr2.size()==0){
//             arr2.add(-1);
//             answer = arr2.stream().mapToInt(i->i).toArray();

//         }else{
//             answer = arr2.stream().mapToInt(i->i).toArray();
//         }
        return answer;
    }
}