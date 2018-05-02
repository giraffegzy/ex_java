package javasmall_ex;

import com.sun.xml.internal.ws.api.message.HeaderList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
* From:LeetCode-728
* 题目:给定一个起点和终点，找出此区间范围内所有的自除数（自除数:是指可以被它包含的每一位数除尽的数。自除数不包含0）
* 我的思路:1.先用for循环来确定一共多少数.
*          2.再讲数字拆分并且判断是否为自除数.
*          3.将符合结果的数据收集到List容器中.
*          */
public class ex_34 {
    public static void main(String[] args) {
        List<Integer> integers = selfDividingNumbers(1, 22);
        for(int i:integers){
            System.out.println(i);
        }
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List list = new ArrayList();
        for (int i = left; i <= right; i++) {
            String str = String.valueOf(i);
            if (str.contains("0")) {
                continue;
            }
            char[] carr = str.toCharArray();
            int count =0;
            for(char c:carr){
                int num = Integer.valueOf(String.valueOf(c));
                if(i%num==0){
                    count++;
                    if (count==carr.length){
                        list.add(i);
                    }
                }
            }
        }
        return list;
    }
}
