class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        for(int i : num_list){sum +=i; multiply *= i;}

        return sum*sum > multiply ? 1  : 0;
    }
}