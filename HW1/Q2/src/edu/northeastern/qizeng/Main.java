package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "abcdea";
        System.out.println(isUnique(str));

    }
    private static Boolean isUnique(String str) {
        char[] ch = str.toCharArray();
        int num = str.length();
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("It is NOT a unique string");
                    return false;
                }
            }
        }
        System.out.println("It is a unique string");
        return true;
    }

}
