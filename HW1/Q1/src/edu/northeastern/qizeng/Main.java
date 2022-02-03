package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "abccba";
        System.out.println(isPalindrome(str));

    }

    private static Boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int start  = 0 ;
        int end = arr.length - 1;

        while(start <= end){
            if(arr[start] != arr[end]) {
                System.out.println("It is NOT a Palindrome");
                return false;
            }
            start ++;
            end --;
        }
        System.out.println("It is a Palindrome");
        return true;
        /*int start = 0;
        int num = str.length();
        char[] oriArray = str.toCharArray(); // convert the string to array

        char[] newArray = new char[num];
        for (int i = num - 1; i >= 0; i--) {
            newArray[i] = oriArray[num - i - 1]; //newList is the reversed list
        }

        for (int i = 0; i < num; i++) {
            if(newArray[i] != oriArray[i]) {
                System.out.println("It is NOT a Palindrome");
                return false;
            }
        }
        System.out.println("It is a Palindrome");
        return true;*/

    }
}
