package javasmall_ex;

import java.util.Arrays;

/*
* From:LeetCode-821
* 题目:给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
* 我的思路
*
*
* */
public class ex_40_ShortestIstanceHaracter {
    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        System.out.println(Arrays.toString(shortestToChar(S,C)));
            }
    public static int[] shortestToChar(String S, char C) {
        int [] arr = new int[S.length()];
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == C) {
                arr[i] = 0;
                for (int j = i - 1; j >= 0 && arr[j] > i - j ; --j) {
                    arr[j] = i - j;
                }
            } else {
                arr[i] = i == 0 ? S.length() : arr[i - 1] + 1;
            }
        }
        return arr;
    }   
        }




