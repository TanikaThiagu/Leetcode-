public class Solution {
    public String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // initialize rows
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {

            rows[index].append(c);

            // change direction at top or bottom
            if (index == 0) goingDown = true;
            else if (index == numRows - 1) goingDown = false;

            index += goingDown ? 1 : -1;
        }

        // combine rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
