package javasmall_ex;

import java.util.Arrays;

import static java.lang.Integer.toBinaryString;

/*
*  From:LeetCode-476
*  题目:给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
*  思路：1.将正整数转成二进制 (两种方法①Integer自带toBinaryString方法。②自己实现转换）
*        2.二进制取反
*        3.二进制转成十进制（Integer的parseInt方法）
* */
public class ex_31 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        String binaryStringNum =Integer.toBinaryString(num);
        char [] carr = binaryStringNum.toCharArray();
        for(int i = 0;i<carr.length;i++){
            if(carr[i]=='0'){
                carr[i]='1';
            }
            else {
                carr[i]='0';
            }
        }
        String absStrNum = String.valueOf(carr);
        int absNum = Integer.parseInt(absStrNum,2);
        return absNum;
    }
}
