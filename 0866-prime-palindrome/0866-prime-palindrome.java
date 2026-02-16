class Solution {
    public int primePalindrome(int n) {
        // handle small cases
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        // generate odd-length palindromes
        for (int i = 1; i < 100000; i++) {
            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s).reverse();
            sb.deleteCharAt(0); // avoid even-length palindrome

            int pal = Integer.parseInt(s + sb.toString());

            if (pal >= n && isPrime(pal)) {
                return pal;
            }
        }
        return -1; // guaranteed not reached
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num % 2 == 0) return num == 2;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
