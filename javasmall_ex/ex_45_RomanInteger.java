package javasmall_ex;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/*
 * From:LeetCode-13(RomanInreger)
 * 题目:给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * 思路:1.将数字和罗马表对照
 *      2.拆分字符串
 *      3.循环得到答案（如果前一位比后一位大，那么做加运算，反之则减，）
 */
public class ex_45_RomanInteger {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
    public  static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char [] roman = {'I','V', 'X', 'L','C','D','M'};
        int [] arr = {1,5,10,50,100,500,1000};
        for (int i=0;i<arr.length;i++){
            map.put(roman[i],arr[i]);
        }
        char [] charArr = s.toCharArray();
        int sum = 0;
        for(int i =0;i<charArr.length-1;++i){
            if(map.get(charArr[i])>=map.get(charArr[i+1])){
                sum+=map.get(charArr[i]);
            }else
                sum-=map.get(charArr[i]);
        }
        sum+=map.get(charArr[s.length()-1]);
        return sum;
    }
}
