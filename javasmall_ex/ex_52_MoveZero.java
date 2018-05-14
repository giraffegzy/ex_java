package javasmall_ex;

import java.util.Arrays;

/*
  From:LeetCode-283(MoveZero)
  题目:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
  我的思路:1.首先想法是先将非0元素全部前移，在数组末尾补充0
           2.后来看了最优解法，就写了这个解答。
           3.通过一个临时量，交换非零元素和零元素。
 */
public class ex_52_MoveZero {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
        }
    }
}