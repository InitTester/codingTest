class Solution {
    public int solution(int[][] dots) {
        int xmax = Integer.MIN_VALUE,xmin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE,ymin = Integer.MAX_VALUE;

        for(int[] value : dots){
            if(value[0] > xmax){
                xmax = value[0];
            }

            if(value[0]< xmin){
                xmin = value[0];
            }

            if(value[1] > ymax){
                ymax = value[1];
            }

            if(value[1]< ymin){
                ymin = value[1];
            }
        }

        int x = xmax-xmin;
        int y = ymax-ymin;

        return x*y;
    }
}