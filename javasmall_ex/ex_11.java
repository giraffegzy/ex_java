package javasmall_ex;
import java.util.*;
/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class ex_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个五位数");
        int n = in.nextInt();
        chose_num(n);
    }
    public static void chose_num(int n ){
        int s = n;
        int [] a = new int[5];
        if (n<10000||n>99999) {
            System.out.println("输入的不是五位数");
        }else {
            for (int i = 0; i < 5; i++) {
                a[i] = n % 10;
                n /= 10;
            }
            if (a[0] == a[4] && a[1] == a[3]) {
                System.out.println(s + "是回文");
            } else
                System.out.println(s + "不是回文");
        }
    }
}
