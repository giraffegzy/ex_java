package javasmall_ex;

import java.util.Arrays;

/*
  From:LeetCode-485(MaxConsecutiveOnes )
  题目:给定一个二进制数组， 计算其中最大连续1的个数。
  思路:1.拆分数组，用可变字符串保存
       2.循环找到最大长度
 *
 *
 */
public class ex_51_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,0,1,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        StringBuilder sb = new StringBuilder();
        for(int num : nums){
            sb.append(String.valueOf(num));
        }
        String[] splits = String.valueOf(sb).split("0");
        for (int i =0;i<splits.length;i++){
            if(splits[i].length()>length)
                length = splits[i].length();
        }
        return length;
    }
}
