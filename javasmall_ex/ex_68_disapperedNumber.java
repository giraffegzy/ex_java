package javasmall_ex;

import java.util.ArrayList;
import java.util.List;

/*
  From:LeetCode-448(disapperedNumber)
  题目:给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，
       数组中的元素一些出现了两次，另一些只出现一次。
       找到所有在 [1, n] 范围之间没有出现在数组中的数字。
       您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
  思路:1.通过引入一个额外数组来判断是否是缺失的数字

 */
public class ex_68_disapperedNumber {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list = new ArrayList<>();
        boolean[] judge = new boolean[nums.length+1];
        for(int i =0;i<nums.length;i++){
        if(nums[i]<=nums.length+1){
            judge[nums[i]]=true;
        }
        }
        for(int i =1;i<nums.length+1;i++){
            if(judge[i]==false)
                list.add(i);
        }
        return list;
    }
}
