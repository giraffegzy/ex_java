package javasmall_ex;

/*  (codewars_7ku)
* 题目：The goal of this kata is to write a function that takes two inputs: a string and a character.
*       The function will count the number of times that character appears in the string.
*       The count is case insensitive.
*       countChar("fizzbuzz","z") => 4
        countChar("Fancy fifth fly aloof","f") => 5
*
* */
public class ex_20 {
    public static void main(String[] args) {
     int num = charCount("fizzbuzz",'z');
        System.out.println(num);
    }
    public static int charCount(String str ,char c){
        char [] charr = str.toCharArray();
        int counts = 0;
        for (char ch :charr){
            String src = String.valueOf(ch);
            String desc = String.valueOf(c);
            if (src.equalsIgnoreCase(desc)){
                counts++;
            }
        }
        return counts;
    }
}
