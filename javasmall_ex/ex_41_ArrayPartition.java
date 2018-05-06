package javasmall_ex;

import java.util.Arrays;

/*
 * From:LeetCode-561(array-partition)
 * 题目:给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
  * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
  * 我的思路:1.将数组排序,
  *          2.因为数组的元素是2n，所以排序之后的数组的偶数位全是我们需要的数据。
  *          3.直接将偶数位相加即可。
  *
 */
public class ex_41_ArrayPartition {
    public static void main(String[] args) {
        int[] arr =  {1,4,3,2};
        Arrays.sort(arr);
        int sum = 0;
        for (int i =0;i<arr.length;i++){
           if(i%2==0){
               sum +=arr[i];
           }
        }
        System.out.println(sum);
    }
}
