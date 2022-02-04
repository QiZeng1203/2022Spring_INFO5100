package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String ransomNote = "abbbc";
       String magazine = "abbc";
        System.out.println(isRansomNote(ransomNote,magazine));
    }

    private static Boolean isRansomNote(String ransomNote, String magazine) {
        int[] count = new int[52];// consider uppercase letter
        char[] ch1 = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();


        for(int i = 0; i < magazine.length(); i++) {
            count [ch2[i]-'A'] ++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            count [ch1[i]-'A'] --;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] < 0) {
                System.out.println("ransomNote can NOT be constructed from magazine");
                return false;
            }
        }
        System.out.println("ransomNote can be constructed from magazine");
        return true;
    }
}