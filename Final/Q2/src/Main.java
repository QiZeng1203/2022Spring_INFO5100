import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "aabcccccaaa";
        System.out.println(compressString(str));
    }
    public static String compressString(String str){
        Stack<Character> stack = new Stack<>();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                count ++;
            }
            else if (str.charAt(i) != str.charAt(i-1)) {
                sb.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length()-1)).append(count);
        if(sb.length() < str.length()) {
            return sb.toString();
        }

        return str;

    }
}
