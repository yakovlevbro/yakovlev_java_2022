// Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '[' ||
                    currentChar == '(' ||
                    currentChar == '{') {
                stack.push(currentChar);
            } else {
                if (!stack.isEmpty()) {
                    char prevChar = stack.peek();
                    if ((currentChar == ']' && prevChar == '[') ||
                            (currentChar == ')' && prevChar == '(') ||
                            (currentChar == '}' && prevChar == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();


    }
}
