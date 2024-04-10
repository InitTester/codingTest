// class Solution {
//     public int[] solution(String myString) {
        
//         String[] result = myString.split("x",-1);
//         int[] answer = new int[result.length];
//         int i=0;
        
//         for(String value : result )
//             answer[i++] = value.length();
//         return answer;
//     }
// }


// import java.util.Arrays;

// class Solution {
//     public int[] solution(String myString) {

//         return Arrays.stream(myString.split("x", myString.length()))
//             .mapToInt(x -> x.length())
//             .toArray();
//     }
// }



import java.util.ArrayList;

class Solution {

    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] tmp = myString.split("x");
        for (int i = 0; i < tmp.length; i++) {
            list.add(tmp[i].length());
        }
        if(myString.endsWith("x")) {
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}