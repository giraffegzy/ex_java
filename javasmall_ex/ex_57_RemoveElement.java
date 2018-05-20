package javasmall_ex;

import java.util.Arrays;

/*
  From:LeetCode-27(RemoveElement)
  题目:给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
  思路:1.先给出一个指针保留需要替换的元素。
       2.再循环判断是不是被替换的元素。如果是，不进入循环，如果不是进入循环。

 */
public class ex_57_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums,val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] =nums[j] ;
                i++;
            }
        }
        return i;
    }
}