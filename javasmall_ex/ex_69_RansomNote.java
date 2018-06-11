package javasmall_ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
  Form:LeetCode-383(RansomNote)
  题目:给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
  如果可以构成，返回 true ；否则返回 false。
  思路:1.利用Map创造一个字典，存贮杂志中出现的每个字符次数。循环赎金信，取出map中的次数，一旦次数为零，即返回false

       2.利用数组创建字典，循环取出次数，如果小于零即为false


 */
public class ex_69_RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aaasdadwq","wqdqdasdqwdqasdqdaadqa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int index [] = new int[26];
        for(char c :magazine.toCharArray()){
            index[c-'a']++;
        }
        for(char c :ransomNote.toCharArray()){
            if(--index[c-'a']<0)
                return false;
        }
            return true;
    }
    /*

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c :magazine.toCharArray()){
            map.put(c,0);
        }
        for(char c :magazine.toCharArray()){
            if (map.get(c)!=null)
                map.put(c,map.get(c)+1);
        }
        for(char c :ransomNote.toCharArray()){
            if(map.get(c)==0)
                return false;
            map.put(c,map.get(c)-1);
        }
        return true;
    }
     */
}
