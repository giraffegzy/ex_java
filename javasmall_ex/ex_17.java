package javasmall_ex;
import java.util.Arrays;

/*
*  来源：codewars
*  题目：给出一个字符串" 1 5 3 6 "要求返回一个字符串" 5 1" 最大的数字在首位加空格加最小的数字。
*   HighAndLow("1 2 3 4 5") // return "5 1"
    HighAndLow("1 2 -3 4 5") // return "5 -3"
    HighAndLow("1 9 3 4 -5") // return "9 -5"
*/
public class ex_17 {
    public static void main(String[] args) {
        HighAndLow("1 2 -3 4 5");
        System.out.println(HighAndLow("1 2 -3 4 5"));
    }

    public static String HighAndLow(String numbers) {
        String [] str = numbers.split(" ");
        int [] arr = new int[str.length];
        for (int i =0;i<str.length;i++){
            int num = Integer.valueOf(str[i]);
            arr[i] = num;
        }
        Arrays.sort(arr);
        return new String(arr[arr.length-1]+" "+arr[0]);
    }
}
