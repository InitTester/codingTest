class Solution {
    public int solution(int[] arr) {
        int answer=0;
        int[] tmp = new int[arr.length];

        for(int i=0; i < arr.length; i++) {

            int idx =0, cnt =0;

            for (int k : arr) {tmp[idx++] = k;}

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= 50 && arr[j] % 2 == 0) {
                    arr[j] = arr[j] / 2;
                } else if (arr[j] <= 50 && arr[j] % 2 == 1) {
                    arr[j] = arr[j] * 2 + 1;
                }
            }

            idx=0;
            
            for (int s : tmp) {
                if (s == arr[idx++]) {
                    cnt++;
                }
            }

            if (cnt == arr.length) {
                answer = i;
                break;
            }
        }
      return answer;
    }
}