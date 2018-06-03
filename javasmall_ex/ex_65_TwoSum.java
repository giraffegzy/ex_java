package javasmall_ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 From:LeetCode-1(TwoSum)
 题目:给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
      你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 思路:1.用一个Map存入值，并且用目标数减去数组元素，如果有则返回，没有则添加Map


 */
public class ex_65_TwoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(twoSum(arr,5)));
    }

    public  static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        if(nums==null||nums.length<2)
            return result;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else{
                result[0]= map.get(target-nums[i]);
                result[1]= i;
                break;
            }
        }
        return result;
    }

}
