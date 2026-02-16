public class Solution {
    public int myAtoi(String s) {

        int i = 0, n = s.length();
        long result = 0;   // use long to detect overflow
        int sign = 1;

        // 1. skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. read digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // 4. check overflow
            if (sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * result);
    }
}
