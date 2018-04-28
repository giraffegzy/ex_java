package javasmall_ex;
/*
* From:leetcode-771(easy)
* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.
* You want to know how many of the stones you have are also jewels.
    The letters in J are guaranteed distinct, and all characters in J and S are letters.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    Example 1:
    Input: J = "aA", S = "aAAbbbb"
    Output: 3
* */
public class ex_28 {
    public static void main(String[] args) {
        String j = "z";
        String s ="ZZ";
        int count = 0;
        char [] carr = s.toCharArray();
        for(char c:carr){
            if(j.indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
