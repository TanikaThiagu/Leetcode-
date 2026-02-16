import java.util.*;

public class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                // if stack empty or mismatch
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}
