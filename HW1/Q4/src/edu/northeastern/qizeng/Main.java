package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str1 = "aabbc";
        String str2 = "caabb";
        System.out.println(isAnagrams(str1, str2));
    }

    private static Boolean isAnagrams(String str1, String str2) {
        int[] count = new int[52];// consider uppercase letter
        //int[] count2 = new int[52];
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(int i = 0; i < str1.length(); i++) {
            count [ch1[i]-'A'] ++;
        }
        for(int i = 0; i < str2.length(); i++) {
            count [ch2[i]-'A'] --;
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                System.out.println("Two strings are not anagrams");
                return false;
            }
        }
        System.out.println("Two strings are anagrams");
        return true;
    }
}
