package javasmall_ex;
import java.util.*;
/*
* 题目：给出一个字符串找到最少长度最小的单词，并返回最小单词的长度
* */
public class ex_16 {
    public static void main(String[] args) {
        String str = "aaa aaaaaa aaaa aaaaaa aaaa aaa aaaaa";
        int num = findShort(str);
        System.out.println(num);
    }

    public static int findShort(String s) {
        int min = Integer.MAX_VALUE;
        for(String strarr :s.split(" ")){
            if (strarr.length()<min){
                min = strarr.length();
            }
        }
        return min;
    }
}
