package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str1 = "aabbc";
        String str2 = "caabc";
        System.out.println(isAnagrams(str1, str2));
    }

    private static Boolean isAnagrams(String str1, String str2) {
        int[] count1 = new int[52];// consider uppercase letter
        int[] count2 = new int[52];
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int num1 = str1.length();
        int num2 = str2.length();

        for(int i = 0; i < num1; i++) {
            count1 [ch1[i]-'A'] ++;
        }
        for(int i = 0; i < num2; i++) {
            count2 [ch2[i]-'A'] ++;
        }

        for(int i = 0; i < count1.length; i++) {
            if(count1[i] != count2[i]) {
                System.out.println("Two strings are not anagrams");
                return false;
            }
        }
        System.out.println("Two strings are anagrams");
        return true;
    }
}
