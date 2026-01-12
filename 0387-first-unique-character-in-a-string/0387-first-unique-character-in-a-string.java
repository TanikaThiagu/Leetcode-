class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];               // count for each letter

        // 1) count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // 2) find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }

        // no unique character
        return -1;
    }
}