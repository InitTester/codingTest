class Solution {
    public String solution(String cipher, int code) {
        int p = code;
        StringBuilder sb = new StringBuilder();

        while (p <= cipher.length()) {
            sb.append(cipher.charAt(p - 1));
            p += code;
        }

        return sb.toString();
    }
}