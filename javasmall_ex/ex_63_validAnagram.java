package javasmall_ex;

/*
  From:LeetCode-242_validAnagram
  题目:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
  思路:1.给定一个整数数组并且大小为26。
       2.将两个字符串分别拆成字符减去字符'a'得出字符的大小。
       3.循环加减整数数组，并做判断，如果数组元素为零，即可得到是字母异位词。

 */
import java.util.HashMap;
import java.util.Map;

public class ex_63_validAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ssssa","vvccc"));


    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length())
            return false;
        else {
            int [] arr = new int [26];
            char [] chars1 = s.toCharArray();
            char [] chars2 = t.toCharArray();
            for(int i=0;i<s.length();i++){
                arr [chars1[i]-'a']++;
                arr[chars2[i]-'a']--;
            }
            for(int i :arr){
                if(i!=0)
                    return false;
            }
        }
        return true;
    }
}
