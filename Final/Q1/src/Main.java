import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "(]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == '(') {
                stack.push(')');
            }
            else if (s.charAt(i) == '[') {
                stack.push(']');
            }
            else if(s.charAt(i) == '{') {
                stack.push('}');
            }
            else if(s.isEmpty() || s.charAt(i) != stack.peek()) {
                return false;
            }
        }
        return true;
    }
}
