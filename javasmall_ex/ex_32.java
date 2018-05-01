package javasmall_ex;

import java.util.*;

/*
* From:LeetCode-804
* 题目:将单词翻译成莫斯密码（具体规则见LeetCode-804）
* 我的思路:1.首先将字母和莫斯密码对于起来存放在一个Map里面方便取出来。
*          2.将需要转换的字母转换成摩斯密码
*          3.将字母的摩斯密码放入一个set用于找出多少种不同的翻译方法。
*          （想的比较简单，就这么写了下来，用了超多个for循环）
*
* */
public class ex_32 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(uniqueMorseRepresentations(words));

    }

    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0)
            return 0;
        else {
            String[] msCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            char[] carr = alphabet.toCharArray();
            Map cTable = new HashMap();
            for (int i = 0; i <= 25; i++) {
                cTable.put(carr[i], msCode[i]);
            }
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                char[] charArr = words[i].toCharArray();
                for (int j = 0; j < charArr.length; j++) {
                    sb.append(cTable.get(charArr[j]));
                }
                sb.append("|");
            }

            Set set = new HashSet();
            String[] output = String.valueOf(sb).split("\\|");
            for (int i = 0; i < output.length; i++) {
                set.add(output[i]);
            }
            return set.size();
        }
    }
}

