package javasmall_ex;
/*
* 题目：(codewars_7ku)
*       You are going to be given a word. Your job is to return the middle character of the word.
*       If the word's length is odd, return the middle character.
*       If the word's length is even, return the middle 2 characters.
*       Examples:
*       Kata.getMiddle("test") should return "es"
        Kata.getMiddle("testing") should return "t"
        Kata.getMiddle("middle") should return "dd"
        Kata.getMiddle("A") should return "A"
*
* */
public class ex_19 {
    public static void main(String[] args) {
     String str = getMiddle("A");
        System.out.println(str);
    }

    public static String getMiddle(String word ){
        int length = word.length();
        if (length%2==0){
            char [] stringArr = word.toCharArray();
            return stringArr[(length/2)-1]+""+stringArr[(length/2)];
        }else{
            char [] stringArr = word.toCharArray();
            return stringArr[(length/2)]+"";
        }
    }
}
