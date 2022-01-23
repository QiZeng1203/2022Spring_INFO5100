package edu.northeastern.qizeng;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "abcdef";
        System.out.println(reverseString(str));

    }

    private static String reverseString(String str)
    {
        int start = 0;
        int num = str.length();
        char[] ch = str.toCharArray();

        char[] newList = new char[num];
        for (int i = num - 1; i >= 0; i--)
        {
            newList[i]= ch[num-i-1];
            //System.out.println(newList[i]);
        }
        return Arrays.toString(newList);
        /*ArrayList<Character> list = new ArrayList<>();
        for (int i = num - 1; i >= 0; i--)
        {
            list.add(ch[i]);
        }
        return Arrays.toString(list.toArray()); */
    }
}
