package javasmall_ex;

import java.util.*;

/*
  From:LeetCode-599(IndexSumTwo)
  题目:假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
       你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。
       如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。
       思路:1.先将一个数组存入Map集合,然后循环另一个数组
            2.如果能取出值，那说明两个数组有相同元素，在比较是否是最小索引。
 */
public class ex_66_IndexSumTwo {
    public static void main(String[] args) {
        String list1[] = {"Shogun" , "KFC","Burger King"};
        String list2[] = {"KFC", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        List result = new ArrayList();
        Integer max = Integer.MAX_VALUE;
        for(int i =0;i<list1.length;i++)map.put(list1[i],i);
        for(int i =0;i<list2.length;i++){
            Integer k =map.get(list2[i]);
            if( k!=null&&i+k<=max){
                if(i+k<max)
                    result.clear();
                max=i+k;
                result.add(list2[i]);
            }
        }
        return (String[]) result.toArray(new String [result.size()]);
    }
}

