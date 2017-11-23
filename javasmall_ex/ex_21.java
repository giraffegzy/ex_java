package javasmall_ex;

import java.util.Arrays;


/*
* 题目: You are given an odd-length array of integers, in which all of them are the same, except for one single number.
        Implement the method stray which accepts such array, and returns that single different number.
        The input array will always be valid! (odd-length >= 3)
*
* *
*/
public class ex_21 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1};
        System.out.println(stray(arr));
    }
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0]!=numbers[1]){
            return numbers[0];
        }else return numbers[numbers.length-1];
    }
}
