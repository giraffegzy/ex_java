package javasmall_ex;
import java.util.*;
/**
 * 题目：将一个数组逆序输出。
 */
public class ex_14 {
    public static void main(String[] args) {
    int [] arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("排序前："+Arrays.toString(arr));
        System.out.println("排序后："+Arrays.toString(changeArr(arr)));
    }
    public static int [] changeArr(int[]arr){
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
