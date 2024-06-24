import java.util.*;

class Solution {
    public String solution(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        StringBuilder result = new StringBuilder();
        for (char c : list) {
            result.append(c);
        }
        
        return result.toString();
    }
}