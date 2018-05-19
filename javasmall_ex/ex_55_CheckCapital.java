package javasmall_ex;

/*
  From:LeetCode-520(CheckCapital )
  题目:给定一个单词，你需要判断单词的大写使用是否正确。
  我的思路:1.首先判断是否全部小写或者大写
           2.再判断第一个字母是否为大写。
 */
public class ex_55_CheckCapital {
    public static void main(String[] args) {
        String s1 = "ASD";
        String s2 = "leetcode";
        String s3 = "GooglE";

        System.out.println(detectCapitalUse(s3));


    }

    public static boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word)) {
            return true;
        }
        if (word.toLowerCase().equals(word)) {
            return true;
        }
        if ((String.valueOf(word.charAt(0)).toLowerCase() + word.substring(1, word.length())).equals(word.toLowerCase())) {
            if ((String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length())).equals(word))
                return true;
        }
            return false;
        }
    }

