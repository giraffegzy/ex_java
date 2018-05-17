package javasmall_ex;

import java.util.HashMap;
import java.util.Map;

/*
 From:LeetCode-136(SingleNumber)
 题目:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 我的思路:1.首先想到了Map的方式，然后循环判断就可以得到。
          2.然后发现用异或效率提高的不是一点半点。
 */
public class ex_54_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2,1,4};
        System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int [] nums){
            int num = 0;
            for(int o :nums){
                num^=o;
            }
        return num;
    }
}
    /* stupid stupid stupid stupid
    public static int singleNumber(int[] nums) {
        if (nums.length==0)
            return 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int j :nums){
            map.put(j,0);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            for(int i=0;i<nums.length;i++){
                if(entry.getKey()==nums[i]){
                    map.put(entry.getKey(),entry.getValue()+1);
                }
            }
        }
        int a = 0;
        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            if ( 1 == entry.getValue()){
                a=entry.getKey();
            }
        }
        return a;
    }
*/
