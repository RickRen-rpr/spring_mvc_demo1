package com.itheima.test;

public class test01 {
    public static int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int j=0;
        while (s.charAt(i) == ' ') {
            i--;
        }
        while (i>=0 && s.charAt(i) != ' ') {
            i--;
            j++;
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("123 456 "));
    }
}
