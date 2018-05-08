package javasmall_ex;

/*
 * From:LeetCode-371(SumTwoInteger)
 * 题目:不使用运算符 + 和-，计算两整数a 、b之和。
 * 我的思路:1.先与运算找到进位（思路并不清晰。）
 *          2.用异或找到不同位
 *          3.左移一位
 *          4直到b==0
 */
public class ex_44_SumTwoInteger {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(getSum(a,b));

    }
    public static int getSum(int a, int b) {
        while (b!=0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
