import java.util.Stack;

class ValidParentheses {
    Stack<Character> parentheses = new Stack<>();

    public boolean isValid(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                parentheses.push(')');
            } else if(ch == '{') {
                parentheses.push('}');
            } else if(ch == '[') {
                parentheses.push(']');
            } else if(!parentheses.empty() && parentheses.peek() == ch) {
                parentheses.pop();
            } else {
                return false;
            }
        }

        return parentheses.empty();
    }
}