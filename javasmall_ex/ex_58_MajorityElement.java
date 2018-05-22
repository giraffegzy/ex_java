package javasmall_ex;

import java.util.HashMap;
import java.util.Map;

/*
  From:LeetCode-169(MajorityElement )
  题目:给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
       你可以假设数组是非空的，并且给定的数组总是存在众数。
  思路:1.(蠢的想法）用Map集合简历对应的关系，然后循环判断每一个的值。得出众数
       2.看了一下LeetCode的优秀解法，是用一个计数器实现的，循环判断。


 */

public class ex_58_MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; ++i){
            if(count == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i])
                ++count;
            else
                --count;
        }
        return candidate;
    }
    /* stupid stupid stupid
    public static int majorityElement(int[] nums) {
            int key  =0;
            if(nums.length==0)
                return 0;
            Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],0);
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               for(int i =0;i<nums.length;i++){
                   if(entry.getKey()==nums[i]){
                        map.put(entry.getKey(),entry.getValue()+1);
                   }
               }
            }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=Math.ceil(1.0*nums.length/2)){
                key = entry.getKey();
            }
        }
        return key;
    }*/
}
