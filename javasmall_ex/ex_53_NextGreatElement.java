package javasmall_ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
   From:LeetCode-496(NextGreaElement)
   题目:给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
   思路:1.循环判断
        2.使用堆栈
 */
public class ex_53_NextGreatElement {
    public static void main(String[] args) {
        int[] num1 = { 4,1,2};
        int [] num2 = {1,3,4,2};

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=-1;
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i], i);//值-位置；
        }

        for(int i=0;i<nums1.length;i++){
            int value=nums1[i];
            int index=map.get(value);//得到在num2中的位置；
            for(int j=index+1;j<nums2.length;j++){
                int next=nums2[j];
                if(next>value){
                    result[i]=next;
                    break;
                }
            }

        }
        return result;
    }
}
