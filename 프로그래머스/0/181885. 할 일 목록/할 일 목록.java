// class Solution {
//     public String[] solution(String[] todo_list, boolean[] finished) {
        
//         int len = 0;
//         for(boolean fal : finished) if(!fal)len++;

//         String[] answer = new String[len];
//         int idx= 0;

//         for(int i = 0; i<todo_list.length; i++){
//             if(!finished[i])
//                 answer[idx++] = todo_list[i];
//         }
//         return answer;        
//     }
// }


// class Solution {
//     public String[] solution(String[] todo_list, boolean[] finished) {
//         String str = "";
//         for(int i=0; i<finished.length; i++){
//             str = finished[i]==false ? str+todo_list[i]+"," : str;
//         }

//         return str.split(",");
//     }
// }




// import java.util.*;
// import java.util.stream.IntStream;

// class Solution {
//     public String[] solution(String[] todoList, boolean[] finished) {
//         return IntStream.range(0, todoList.length)
//             .mapToObj(i -> new AbstractMap.SimpleEntry<>(todoList[i], !finished[i]))
//             .filter(AbstractMap.SimpleEntry::getValue)
//             .map(AbstractMap.SimpleEntry::getKey)
//             .toArray(String[]::new);
//     }
// }




import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {

        ArrayList <String> al = new ArrayList <> ();

        for(int i = 0; i < finished.length; i ++){
            if(!finished[i]){
                al.add(todo_list[i]);
            }
        }

        String[] answer = new String [al.size()];
        for(int i = 0; i < al.size(); i ++){
            answer[i] = al.get(i);
        }

        return answer;
    }
}