import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        System.out.println((1 <= a.length() && a.length() <= 1000000) ? a : "제한사항과 일치하지 않습니다.");
    }
}