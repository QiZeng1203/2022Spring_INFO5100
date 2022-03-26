public class Main {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));

    }

    public static int longestSubstring(String s) {
        char [] ch = s.toCharArray();
        int num = 0;
        int [] count = new int[52];

        for(int i = 0; i < ch.length; i++) {
            count[ch[i] - 'A'] ++;
        }

        for(int j = 0; j < 52; j++) {
            if(count[j] > 0) {
                num ++;
            }
        }
        return num;
    }
}
