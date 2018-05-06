package javasmall_ex;

/*
 * From:LeetCode-693
 * 题目:给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 * 我的思路:1.将正整数拆分
 *          2.循环判断，如果第一个数和第二个数相等就直接false
 *          3.返回结果
 */
public class ex_42_CheckBinaryNum {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;
        int n3 = 11;
        System.out.println(hasAlternatingBits(n1));
    }

    public static boolean hasAlternatingBits(int n) {
        String result = Integer.toBinaryString(n);
        char[] charArr = result.toCharArray();
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == charArr[i + 1]) {
                return false;
            }

        }
        return true;
    }
}
