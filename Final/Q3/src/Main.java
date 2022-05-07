import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }

        int left = 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, i);
            result = Math.max(result, i-left+1);
        }
        return result;
    }
}
