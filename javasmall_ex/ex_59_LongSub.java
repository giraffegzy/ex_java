package javasmall_ex;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Map;

/*
  From:LeetCode-521(LongSub)
  题目:给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。
  最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。
  思路:1.如果字符串长度不相等，那么长度大的那个一定是最长子序列
       2.如果字符串长度相同并且字符串还相等那么不存在子序列因为一个一定是另一个的子序列。
       否则随便任意一个字符串都是另一个字符串的最长子序列。



 */
public class ex_59_LongSub {
    public static void main(String[] args) {
        String a ="abc";
        String c = "bnd";
        System.out.println(findLUSlength(a,c));
    }
    public static int findLUSlength(String a, String b) {
        if(a.length()==b.length()){
            if(a.equals(b))
                return -1;
            else return a.length();
        }
        else {
          return a.length() > b.length() ? a.length() : b.length();
        }
    }
}
