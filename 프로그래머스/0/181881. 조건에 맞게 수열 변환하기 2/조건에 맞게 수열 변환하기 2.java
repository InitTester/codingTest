// class Solution {
//     public int solution(int[] arr) {
//         int answer=0;
//         int[] tmp = new int[arr.length];

//         for(int i=0; i < arr.length; i++) {

//             int idx =0, cnt =0;

//             for (int k : arr) {tmp[idx++] = k;}

//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[j] >= 50 && arr[j] % 2 == 0) {
//                     arr[j] = arr[j] / 2;
//                 } else if (arr[j] <= 50 && arr[j] % 2 == 1) {
//                     arr[j] = arr[j] * 2 + 1;
//                 }
//             }

//             idx=0;
            
//             for (int s : tmp) {
//                 if (s == arr[idx++]) {
//                     cnt++;
//                 }
//             }

//             if (cnt == arr.length) {
//                 answer = i;
//                 break;
//             }
//         }
//       return answer;
//     }
// }

// import java.util.Arrays;

// class Solution {
//     public int solution(int[] arr) {
//         return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
//     }

//     private int cntAction(int n) {

//         int cnt = 0;
//         boolean flag = true;

//         while (flag) {

//             if (n % 2 == 0 && 50 <= n) {
//                 n /= 2;
//                 cnt++;
//             } else if (n % 2 == 1 && n < 50) {
//                 n *= 2;
//                 n += 1;
//                 cnt++;
//             } else {
//                 flag = false;
//             }
//         }
//         return cnt;
//     }
// }

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while (true) {
            int[] copied = Arrays.copyOf(arr, arr.length);
            for (int i = 0 ; i < copied.length ; i++) {
                if (copied[i] >= 50 && copied[i] % 2 == 0) {
                    copied[i] /= 2;
                } else if (copied[i] < 50 && copied[i] % 2 == 1) {
                    copied[i] = copied[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, copied)) {
                return count;
            }
            arr = copied;
            count++;
        }
    }
}