import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};

        Map<String,int[]> list = new HashMap<>();
        list.put("left",new int[]{-1,0});
        list.put("right",new int[]{1,0});
        list.put("up",new int[]{0,1});
        list.put("down",new int[]{0,-1});

        int maxX = board[0]/2;
        int maxY = board[1]/2;
        
        for(String key : keyinput){
            for(Map.Entry<String,int[]> list_value : list.entrySet()){
                if(key.equals(list_value.getKey())){
                    
                    answer[0] = answer[0] + list_value.getValue()[0];
                    answer[1] = answer[1] + list_value.getValue()[1];
                    
                  if(maxX < Math.abs(answer[0])){
                        answer[0] = (answer[0] < 0 ?  -1 : 1) * maxX;
                    }

                    if(maxY < Math.abs(answer[1])){
                        answer[1] = (answer[1] < 0 ?  -1 : 1) * maxY;
                    }
                }
            }
        }
        
        return answer;
    }
}