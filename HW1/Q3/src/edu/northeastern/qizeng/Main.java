package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "AaBbCc";
        System.out.println(isDuplicate(str));
    }
    private static boolean isDuplicate(String str) {
        int[] count = new int[52];
        char[] ch = str.toCharArray();
        int num = str.length();
        for(int i = 0; i < num; i++) {
            count [ch[i]-'A'] ++;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] > 1 ) {
                System.out.println("The string contains duplicates");
                return true;
            }
        }
        System.out.println("The string dose not contain duplicates");
        return false;
    }
}
