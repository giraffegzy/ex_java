package javasmall_ex;

/*
  From:LeetCode-389(FindDiff)
  题目:给定两个字符串 s 和 t，它们只包含小写字母。
       字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
       请找出在 t 中被添加的字母。
  思路:1.分别计算出s和t的单个字符总和，两者相减即为被添加的字符
       2.用异或运算求解。
 */
public class ex_56_FindDiff {
    public static void main(String[] args) {
        String s = "a";
        String t = "ea";
        System.out.println(findTheDifference(s,t));
        System.out.println();
    }

    public static char findTheDifference(String s, String t) {
        int char1 = 0;
        int char2 = 0;
        for(int i=0;i<s.length();i++){
            char1+=s.charAt(i);
        }
        for (int i =0;i<t.length();i++){
            char2+=t.charAt(i);
        }
        return (char)(char2-char1);
    }

}
