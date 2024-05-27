// import java.util.*;

// class Solution {
//     public String[] solution(String myStr) {
//         List<String> list = new ArrayList<>();
//         StringBuilder tmp = new StringBuilder();
//         boolean foundNonABC = false;

//         for (int i = 0; i < myStr.length(); i++) {
//             char currentChar = myStr.charAt(i);

//             if (currentChar != 'a' && currentChar != 'b' && currentChar != 'c') {
//                 tmp.append(currentChar);
//                 foundNonABC = true;
//             } else {
//                 if (tmp.length() > 0) {
//                     list.add(tmp.toString());
//                     tmp.setLength(0);  
//                 }
//             }
//         }

//         if (tmp.length() > 0) {
//             list.add(tmp.toString());
//         }

//         if (!foundNonABC) {
//             return new String[]{"EMPTY"};
//         }

//         return list.toArray(new String[0]);
//     }
// }

// import java.util.Arrays;

// class Solution {
//     public String[] solution(String myStr) {
//         String[] arr = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String[]::new);
//         return arr.length == 0 ? new String[] { "EMPTY" } : arr;
//     }
// }

// import java.util.StringTokenizer;
// class Solution {
//     public String[] solution(String myStr) {
//         String[] answer = {};
//         StringTokenizer st = new StringTokenizer(myStr,"abc");
//         if(st.countTokens() != 0){
//             answer = new String[st.countTokens()];
//             for(int i=0; i<answer.length; i++){
//                 answer[i] = st.nextToken();
//             }
//         }else{
//             answer = new String[1];
//             answer[0] = "EMPTY";
//         }

//         return answer;
//     }
// }

// import java.util.*;

// class Solution {
//     public String[] solution(String myStr) {
//         // 구분자로 'a', 'b', 'c'를 설정하고 StringTokenizer 사용
//         StringTokenizer st = new StringTokenizer(myStr, "abc");
//         List<String> list = new ArrayList<>();
        
//         while (st.hasMoreTokens()) {
//             String token = st.nextToken();
//             if (!token.isEmpty()) {
//                 list.add(token);
//             }
//         }
        
//         // list가 비어있다면 "EMPTY" 추가
//         if (list.isEmpty()) {
//             return new String[]{"EMPTY"};
//         }
        
//         return list.toArray(new String[0]);
//     }
// }


import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.equals("") ? "EMPTY" : myStr;

        return myStr.split("[,]");
    }
}
