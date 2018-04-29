package javasmall_ex;
/*
* From :leetcode-461(easy)
*      题目：求出两个整数的汉明距离
*
*
* */
public class ex_30 {
    public static void main(String[] args) {

        System.out.println(4&3);
    }
    public static int hammingDistance(int x, int y) {
        int sum = x^y;
        int count;
        for(count = 0; sum > 0; count++){
            sum &= (sum - 1);
        }
        return count;
    }

}
