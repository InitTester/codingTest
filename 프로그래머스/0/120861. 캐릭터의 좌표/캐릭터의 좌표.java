import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};

        Map<String,int[]> list = new HashMap<>();
        list.put("left",new int[]{-1,0});
        list.put("right",new int[]{1,0});
        list.put("up",new int[]{0,1});
        list.put("down",new int[]{0,-1});

        for(String key : keyinput){
            for(Map.Entry<String,int[]> list_value : list.entrySet()){
                if(key.equals(list_value.getKey())){
                    answer[0] += list_value.getValue()[0];
                    answer[1] += list_value.getValue()[1];
                }
            }
        }
        
        if(board[0] <= answer[0]){
            answer[0] = board[0];
        }else if(board[0]/2 <= Math.abs(answer[0])){
            answer[0] = (answer[0]<0? -1 : 1) * (board[0]/2);
        }

        if(board[1] <= answer[1]){
            answer[1] = board[1];
        }else if(board[1]/2 <= Math.abs(answer[1])){
            answer[1] = (answer[1]<0? -1 : 1) * (board[1]/2);
        }
        
        return answer;
    }
}