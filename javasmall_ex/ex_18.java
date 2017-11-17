package javasmall_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
* 题目：简单实现斗地主的发牌，洗牌，和看牌功能。
*
* */
public class ex_18 {
    public static void main(String[] args) {
        HashMap<Integer,String> pookerMap = new HashMap<Integer,String>();
        ArrayList<Integer> pookerNum = new ArrayList<Integer>();

        String [] number = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String [] huase = {"♥","♠","♣","♦"};

        int index = 2;
        for (String numbers: number){
            for (String huases :huase){
                pookerMap.put(index,huases+numbers);
                pookerNum.add(index);
                index++;
            }
        }
        pookerMap.put(0,"大王");
        pookerNum.add(0);
        pookerMap.put(1,"小王");
        pookerNum.add(1);
        //System.out.println(pookerMap);

        // 洗牌
        Collections.shuffle(pookerNum);

        // 发牌
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> lastThree = new ArrayList<Integer>();

        for (int i =0;i<pookerNum.size();i++){
            if (i<3){
                lastThree.add(pookerNum.get(i));
            }else if(i%3==0) {
                player1.add(pookerNum.get(i));
            }else if (i%3==1){
                player2.add(pookerNum.get(i));
            }else if (i%3==2){
                player3.add(pookerNum.get(i));
            }
        }
        //将牌排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);

        //看牌
        checkPook("玩家1",player1,pookerMap);
        checkPook("玩家2",player2,pookerMap);
        checkPook("玩家3",player3,pookerMap);
        checkPook("底牌",lastThree,pookerMap);
    }
    public static void checkPook(String name,ArrayList<Integer> player ,HashMap<Integer,String> pookerMap){
        System.out.println(name+" ");
        for (Integer key:player){
            String value = pookerMap.get(key);
            System.out.print(value+" ");
        }
        System.out.println(" ");
    }

}
