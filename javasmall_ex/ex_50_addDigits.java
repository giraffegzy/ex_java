package javasmall_ex;

/*
 From:LeetCode-258
 题目:给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 我的思路:1.一开始想着不断循环相加，后来看到进阶提示有O(1)的方法，于是找了一下规律。
          2.发现结果都是1-9的循环。都是num对9取余，然后直接提交了，发现18这个情况不对。
          3.所以改进了一下得出规律是（num-1）%9+1
 */
public class ex_50_addDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(1));

    }
    public static int addDigits(int num) {
        return  (num - 1) % 9 + 1;
    }
}
