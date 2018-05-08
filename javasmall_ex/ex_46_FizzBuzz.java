package javasmall_ex;

import java.util.ArrayList;
import java.util.List;

/*
  From:LeetCode-412(FuzzBizz)
  题目:写一个程序，输出从 1 到 n 数字的字符串表示。
    1. 如果 n 是3的倍数，输出“Fizz”；
    2. 如果 n 是5的倍数，输出“Buzz”；
    3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
    我的思路:1.直接进行for循环判断。
 */
public class ex_46_FizzBuzz {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
        for (String c :strings){
            System.out.println(c);
        }

    }
    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for(int i =1;i<=n;i++){
            if(i%5==0&&i%3==0)list.add(new String("FizzBuzz"));
            else if(i%3==0)list.add(new String("Fizz"));
            else if(i%5==0)list.add(new String("Buzz"));
            else list.add(String.valueOf(i));
        }
        return list;
    }
}
