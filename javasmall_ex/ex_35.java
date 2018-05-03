package javasmall_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
* From:LeetCode-500
* 题目:给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
* 1.可以重复使用键盘上的同一字符
* 2.可以假设输入的字符串将只包含字母
* 我的思路:1.首先判断首字母在那一行字母当中，就可以选取那一行作为条件进行判断。
*          2.用单词去匹配那一行字母，如果符合要求就添加到List容器中。
*          3.最后用字符串数组返回作为结果。
*
*
* */
public class ex_35 {
    public static void main(String[] args) {
        String[] in = {"Hello", "Alaska", "Dad", "Peace"};
        String[] out = findWords(in);
        System.out.println(Arrays.toString(out));
    }

    public static String[] findWords(String[] words) {
        String con1 = "QWERTYUIOP";
        String con2 = "ASDFGHJKL";
        String con3 = "ZXCVBNM";
        List list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            char[] carr = words[i].toCharArray();
            int count = 0;
            if (con1.contains(String.valueOf(carr[0]).toUpperCase())) {
                for (char c : carr) {
                    if (con1.contains(String.valueOf(c).toUpperCase())) {
                        count++;
                        if (count == carr.length) {
                            list.add(words[i]);
                        }
                    }
                }
            }

            if (con2.contains(String.valueOf(carr[0]).toUpperCase())) {
                for (char c : carr) {
                    if (con2.contains(String.valueOf(c).toUpperCase())) {
                        count++;
                        if (count == carr.length) {
                            list.add(words[i]);
                        }
                    }
                }
            }

            if (con3.contains(String.valueOf(carr[0]).toUpperCase())) {
                for (char c : carr) {
                    if (con3.contains(String.valueOf(c).toUpperCase())) {
                        count++;
                        if (count == carr.length) {
                            list.add(words[i]);
                        }
                    }
                }
            }
        }
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = (String) list.get(i);
        }
        return str;
    }
}
