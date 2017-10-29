package javasmall_ex;
import java.util.*;
/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class ex_10 {
    public static void main(String[] args) {
        System.out.println("输入一个不多于五位的数字：");
       Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        int [] a =new int[5];
        int count = 0;
        do {
            a[count] = n%10;
            n/=10;
            count++;
        }while (n!=0);
        System.out.println("这是"+count+"位数");
        System.out.println("倒序排列为:");
        for (int k = 0;k<count;k++){
            System.out.print(a[k]);
        }
    }
}
