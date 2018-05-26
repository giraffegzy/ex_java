package javasmall_ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
  From:LeetCode-268(MissingNumber)
  题目:给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
  思路:1.用n个数字的总和减去n-1就可以得到缺少的数字


 */
public class ex_60_MissingNumber{
    public static void main(String[] args) {
        int [] arr ={0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++)
            sum += i - nums[i];
        return sum;
    }
/* stupid stupid stupid
    public  static int missingNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i =0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        for(int i =0;i<=nums[nums.length-1];i++){
            if (map.get(i)==null)
            return i;
        }
        return nums[nums.length-1]+1;
    }
    */
}
