package javasmall_ex;

import java.util.HashSet;
import java.util.Set;

/*
   From:LeetCode-202
   题目:一个“快乐数”定义为：
   对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
   也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
   思路:1.搜索了一下快乐数的规则，如果平方和结果为四就会陷入循环那么一定不是快乐树，
          所以可以直接循环判断求解。


 */
public class ex_62_HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(168));
    }
    public static int getsum(int x) {
        int sum=0;
        while(x != 0){
            sum+=(x%10)*(x%10);
            x=x/10;
        }
        return sum;
    }
    public  static boolean isHappy(int n) {
        if(n<=0)
            return false;
        while(n != 1){
            n = getsum(n);
            if(n == 4)
                return false;
        }
        return true;
    }
}
