class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value=1;

        // top -> right -> bottm -> left
        int top = 0, bottom = n-1, left = 0, right = n-1;

        while(value <=n*n){
            // top
            for(int j=top ; j<=right; j++){
                //System.out.println("(위) top = "+ top + ", j = " + j + ", value = " + value);
                answer[top][j] = value++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                //System.out.println("(오른쪽) right = "+ right + ", i = " + i + ", value = " + value);
                answer[i][right] = value++;
            }
            right--;

            for(int j=right; j>=left; j--){
                //System.out.println("(아래) bottom = "+ bottom + ", j = " + j + ", value = " + value);
                answer[bottom][j] = value++;
            }
            bottom--;

            for(int i=bottom; i>=top; i--){
                //System.out.println("(왼쪽) left = "+ left + ", i = " + i + ", value = " + value);
                answer[i][left] = value++;
            }
            left++;
        }
        //System.out.println("Arrays.deepToString(answer) = " + Arrays.deepToString(answer));
        return answer;
    }
}