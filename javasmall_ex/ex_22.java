package javasmall_ex;

/*
*   题目:返回一个数组中的最大值和最小值组成的数组。
*
*
* */
import java.util.Arrays;

public class ex_22 {
    public static void main(String[] args) {

        int [] arr = {2518591,1,3};
        System.out.println(Arrays.toString(minMax(arr)));

    }
    public static int[] minMax(int[] arr) {
        int []new_arr = new int[2];
        Arrays.sort(arr);
        new_arr[0]=arr[0];
        new_arr[1]=arr[arr.length-1];
        return new_arr;
    }
}
