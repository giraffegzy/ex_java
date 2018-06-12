package javasmall_ex;

import java.util.Arrays;

/*
    From;LeetCode-191(number-of-1-bits)
    题目:编写一个函数，输入是一个无符号整数，
         返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
    思路:1.调用Integer类转换二进制数，直接去除所有不为零的字符。
         2.循环统计即可。

         3用左移和异或来做。
 */
public class ex_70_CountOneNumber {
    public static void main(String[] args) {
        System.out.println(hammingWeight(1561));
    }

    public  static int hammingWeight(int n) {
        char[] string = Integer.toBinaryString(n).toCharArray();
        int index = 0;
        for(char c :string){
            if(c=='1'){
                index++;
            }
        }
        return index;
    }
/*
    public  static int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        String[] split = string.split("0");
        String sa = "";
        for(String s :split) {
            sa += s;
        }
        return sa.length();
    }
    */
}
