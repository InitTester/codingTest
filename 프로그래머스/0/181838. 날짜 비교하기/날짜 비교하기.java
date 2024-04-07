// import java.util.*;

// class Solution {
//     public int solution(int[] date1, int[] date2) {
        
//         Date d1 = new Date(date1[0],date1[1],date1[2]);
//         Date d2 = new Date(date2[0],date2[1],date2[2]);
        
//         return d1.compareTo(d2) < 0 ? 1 : 0;
//     }
// }


// import java.time.LocalDate;

// class Solution {

//     public int solution(int[] date1, int[] date2) {

//         LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
//         LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

//         if (dateA.isBefore(dateB)) {
//             return 1;
//         } else {
//             return 0;
//         }
//     }
// }

import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        return LocalDate.of(date1[0], date1[1], date1[2])
                .isBefore(LocalDate.of(date2[0], date2[1], date2[2])) ? 1 : 0;
    }
}