package javasmall_ex;

/*
  From:LeetCode-122(BestBuyTomoney)
  题目:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
       设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
       注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
  思路:1.如果仅仅按照题目所说不考虑其他，就是找到最大减去最小的即可。
       2。但是如果仔细思考注意里面说的，实际上是有可能在同一天即出售了股票又购买了股票。



 */
public class ex_61_BestBuyToMoney {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,4,66,8,769,978,4545};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int result= 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i])
                result+= prices[i+1]-prices[i];
        }

        return result;
    }
}
