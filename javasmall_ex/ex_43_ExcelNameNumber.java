package javasmall_ex;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

/*
 * From:LeetCode-171(ExcelNameNumber)
 * 题目:给定一个Excel表格中的列名称，返回其相应的列序号。
 * 我的思路:1.二十六进制转化十进制。
 */
public class ex_43_ExcelNameNumber {
    public static void main(String[] args) {
        String str = "BA";
        System.out.println(titleToNumber(str));
        System.out.println('Z'-'A');

    }


    public static int titleToNumber(String s) {
        char [] arr =s.toCharArray();
        int sum =0;
        for(int i=0;i<s.length();i++){
            sum=sum*26+(arr[i]-'A'+1);
        }
        return sum;
    }
}
