// import java.util.*;

// class Solution {
//     public String[] solution(String myStr) {
//         String[] answer = {};
//         List<String> list = new ArrayList();
//         StringBuilder tmp = new StringBuilder();
//         int cnt = 0;

//         for(int i=0; i < myStr.toCharArray().length; i++){

//             if(!(myStr.charAt(i)=='a' || myStr.charAt(i)=='b' || myStr.charAt(i)=='c')) {
//                 tmp.append(myStr.charAt(i));
//                 cnt++;
//             }else{
//                 if(tmp.length()>0) {
//                     list.add(tmp.toString());
//                     tmp = new StringBuilder();
//                 }
//             }

//             if(i == myStr.toCharArray().length-1){
//                 list.add(tmp.toString());
//             }
//         }

//         if(cnt==0){
//             answer = new String[]{"EMPTY"};
//         }else{
//             answer = list.toArray(new String[list.size()]);
//         }
               
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        boolean foundNonABC = false;

        for (int i = 0; i < myStr.length(); i++) {
            char currentChar = myStr.charAt(i);

            if (currentChar != 'a' && currentChar != 'b' && currentChar != 'c') {
                tmp.append(currentChar);
                foundNonABC = true;
            } else {
                if (tmp.length() > 0) {
                    list.add(tmp.toString());
                    tmp.setLength(0);  
                }
            }
        }

        if (tmp.length() > 0) {
            list.add(tmp.toString());
        }

        if (!foundNonABC) {
            return new String[]{"EMPTY"};
        }

        return list.toArray(new String[0]);
    }
}
