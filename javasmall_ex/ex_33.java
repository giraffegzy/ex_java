package javasmall_ex;

import java.util.Scanner;

/*
* From:LeetCode-9
* 题目:给出一个整数，判断是否是回文。
* 我的思路:1.将整数拆分成字符数组
*          2.创建两个for循环和两个字符串用于存放整数
*          3.比较得出结果
*
*
*
* */
public class ex_33 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(102202201));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            String arr = String.valueOf(x);
            char[] carr =arr.toCharArray();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i=0;i<carr.length;i++){
                sb1.append(carr[i]);
            }
            for(int i=carr.length-1;i>=0;i--){
                sb2.append(carr[i]);
            }

            if(String.valueOf(sb1).equals(String.valueOf(sb2)))
                return true;
        }
        return false ;
    }
}
