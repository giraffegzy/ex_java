package javasmall_ex;

/*
* From:LeetCode-292-Nim Games
* 题目:和朋友一起玩Nim游戏，桌上有一堆石头，你和朋友轮流拿走其中的1-3块，你先手。
*       请你根据桌上的石头数量判断你是否会赢下比赛。
*       例如：桌上有四块石头，无论你拿走1、2、3块石头，你的对手都会赢下比赛。
* 我的思路:1.首先画了画规律，然后发现只要是四的倍数，先手必输。
*          2.所以只要数量对四取余不为零，先手就必赢。
* */
public class ex_37 {
    public static void main(String[] args) {
        System.out.println(canWinNim(5));
    }
    public static boolean canWinNim(int n) {

        return n%4==0?false:true;
    }

}
