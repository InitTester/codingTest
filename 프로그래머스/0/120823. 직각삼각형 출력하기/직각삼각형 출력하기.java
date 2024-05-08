// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         // for(int i=0; i < n; i++){
//         //     for(int j=0; j<i+1; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }
        
//         for(int i=1; i<=n; i++){
//             System.out.println("*".repeat(i));
//         }
//     }
// }





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append("*".repeat(i)).append("\n");
        }
        System.out.print(sb.toString());
    }
}