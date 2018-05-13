package javasmall_ex;

import com.sun.javafx.collections.MappingChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

From:LeetCode-806(NumberLines)
题目:见LeetCode0806
我的思路:1.循环判断即可。
 *
 */
public class ex_48_NumberLines {
    public static void main(String[] args) {
        int [] widths = {7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9};

        String s = "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie";
        System.out.println(Arrays.toString(numberOfLines(widths,s)));

    }
    public  static int[] numberOfLines(int[] widths, String S) {
        int count = 1;
        int sum = 0;
        char [] sArr = S.toCharArray();
        for(int i=0;i<S.length();i++) {
            if (sArr.length <= 10) {
                    sum+=widths[sArr[i]-'a'];
            } else {
                if (sum +widths[sArr[i]-'a'] > 100) {
                    count++;
                    sum = 0;
                }
                sum += widths[sArr[i]-'a'];
            }
        }
        int[] arr = {count,sum};
        return arr;
    }
}
