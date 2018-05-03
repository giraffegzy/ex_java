package javasmall_ex;

import java.util.Arrays;

/*
* From:LeetCode-344
* 题目:反转字符串
* 我的思路:1.拆分字符串
*          2.用for循环实现。
*          3.得到结果
*
* */
public class ex_36 {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String s) {
        char[] carr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i =carr.length-1;i>=0;i--){
            sb.append(carr[i]);
        }
        return String.valueOf(sb);
    }
}
