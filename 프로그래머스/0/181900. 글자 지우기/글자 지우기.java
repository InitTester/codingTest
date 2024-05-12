// class Solution {
//     public String solution(String my_string, int[] indices) {
//         String answer = "";
        
//         char[] list = my_string.toCharArray();

//         for(int i =0; i< indices.length; i++){
//             list[indices[i]] = ' ';
//         }
        
//         for(char s : list){
//             if(s!=' '){
//                 answer += s;
//             }
//         }
        
//         return answer;
//     }
// }



// class Solution {

//     public String solution(String my_string, int[] indices) {
//         String answer = "";
//         String[] tmp = my_string.split("");

//         for (int i = 0; i < indices.length; i++) {
//             tmp[indices[i]] = "";
//         }

//         for (String x : tmp) {
//             answer += x;
//         }
//         return answer;
//     }
// }



// import java.util.stream.*;

// class Solution {
//     public String solution(String myString, int[] indices) {
//         return IntStream.range(0, myString.length()).filter(i -> !IntStream.of(indices).boxed().collect(Collectors.toSet()).contains(i)).mapToObj(myString::charAt).map(Object::toString).collect(Collectors.joining());
//     }
// }



class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        for(int i : indices) {
            arr[i] = ' ';
        }
        StringBuilder sb=  new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != ' ') {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}