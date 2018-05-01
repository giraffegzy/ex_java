package javasmall_ex;
/*
* From :leetcode-461(easy)
*      题目：求出两个整数的汉明距离
*
*
* */
public class ex_30 {
    public static void main(String[] args) {

        int i = hammingDistance(4,1);
        System.out.println(i);
    }
    public static int hammingDistance(int x, int y) {
        int num = x^y;
        int count;
        for(count = 0; num > 0; count++){
            num &= (num - 1);
        }
        return count;
    }

}
