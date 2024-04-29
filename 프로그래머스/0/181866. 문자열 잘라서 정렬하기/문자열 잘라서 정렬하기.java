// import java.util.*;

// class Solution {
//     public String[] solution(String myString) {
//         List<String> list = new ArrayList<>();

//         for(String s : myString.split("x")) { if(!s.equals("")) list.add(s);}

//         Collections.sort(list);
        
//         return list.stream().toArray(String[]::new);
//     }
// }


// import java.util.*;

// class Solution {
//     public String[] solution(String myString) {
//         return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
//     }
// }


import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] split = myString.split("x");
        ArrayList <String> al = new ArrayList <> ();

        for(int i = 0; i < split.length; i ++){
            if(!split[i].equals("")){
                al.add(split[i]);
            }

        }
        //System.out.println(al);

        answer = new String [al.size()];
        for(int i = 0; i < al.size(); i ++){
            answer[i] = al.get(i);
        }
        Arrays.sort(answer);


        return answer;
    }
}
