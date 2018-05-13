package javasmall_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  From:LeetCode-575
  题目:给定一个偶数长度的数组，里面的每个不同元素都代表一种糖果，平均分给弟弟妹妹，如何让妹妹获得最多种类的糖果
  我的思路:直接用set取出所有糖果的种类，若种类大于糖果数量一半，直接返回糖果数量的一半，若小于直接返回所有糖果种类。
 */
public class ex_49_DistributeCandies {
    public static void main(String[] args) {
        int[] candies = {1,1,1,1,2,2,2,3,3,3};
        System.out.println(distributeCandies(candies));

    }


    public static int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
}