package javasmall_ex;
import java.util.*;
/*
 * 15：题目：(1)统计一个字符串中的，大写字母，小写字母，数字的个数，不包括标点符号和空格。
 *           (2)统计一个字符串在另一个字符串中的出现的次数。
 */
public class ex_15 {
    public static void main(String[] args) {
        System.out.println("输入一个包含数字字母的字符串");
        String str = new Scanner(System.in).next();
        getCounts(str);
        System.out.println("关键字出现的次数为"+getCountsKey(str,"test"));
    }
    public static void getCounts(String str){
        int upCounts = 0;
        int loCounts = 0;
        int numCounts = 0;
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A'&& ch<='Z'){
                upCounts++;
            }else if (ch>='a'&&ch<='z'){
                loCounts++;
            }else if (ch>='0'&&ch<='9'){
                numCounts++;            }
        }
        System.out.println("大写字母有:"+upCounts+" "+"小写字母有:"+loCounts+" "+"数字有:"+numCounts);
    }
    public static int getCountsKey(String str ,String key){
        int counts = 0;
        int index = 0;
        while ((index = str.indexOf(key))!=-1){
            str =str.substring(index+key.length());
            counts++;
        }
        return counts;
    }
}
