package javasmall_ex;
import java.util.*;
/*
 * 15：题目：(1)统计一个字符串中的，大写字母，小写字母，数字的个数，不包括标点符号和空格。
 *           (2)统计一个字符串在另一个字符串中的出现的次数。
 *           (3)将int[] arr = {1,2,3,4,5,6,7} 转化成[1,2,3,4,5,6,7]
 *           (4)从键盘循环录入录入一个字符串,输入"end"表示结束,将字符串中大写字母变成小写字母，小写字母变成大写字母，
                 其它字符用"*"代替,并统计字母的个数
                 例如：
                 input：Hello123Wrold
                 output：hELLO***wROLD
 *
 */
public class ex_15 {
    public static void main(String[] args) {
//        System.out.println("输入一个包含数字字母的字符串");
//        String str = new Scanner(System.in).next();
//        getCounts_1(str);
//        System.out.println("关键字出现的次数为"+getCountsKey_2(str,"test"));
//        int []arr = {1,2,3,4,5,6,7};
//        changeStr_3(arr);
        changeStr_4();
    }

    public static void getCounts_1(String str) {
        int upCounts = 0;
        int loCounts = 0;
        int numCounts = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upCounts++;
            } else if (ch >= 'a' && ch <= 'z') {
                loCounts++;
            } else if (ch >= '0' && ch <= '9') {
                numCounts++;
            }
        }
        System.out.println("大写字母有:" + upCounts + " " + "小写字母有:" + loCounts + " " + "数字有:" + numCounts);
    }

    public static int getCountsKey_2(String str, String key) {
        int counts = 0;
        int index = 0;
        while ((index = str.indexOf(key)) != -1) {
            str = str.substring(index + key.length());
            counts++;
        }
        return counts;
    }

    public static void changeStr_3(int[] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(",");
            } else sb.append(arr[i]).append("]");
        }
        System.out.println(sb);
    }

    public static void changeStr_4() {
        System.out.println("请输入你的字符串，输入end结束输入。");
        Scanner sc = new Scanner(System.in);
        String str ="";
        StringBuffer sb = new StringBuffer();
          while (!str.equals("end")) {
              str = sc.next();
              if(str.equals("end")){
                  System.out.println("输出结束");
              }else {
                  for (int i =0;i<str.length();i++){
                      char ch =str.charAt(i);
                      if (ch>='A'&&ch<='Z'){
                          String slo = Character.toString(ch).toLowerCase();
                          sb.append(slo);
                      }else if(ch>='a'&&ch<='z'){
                          String sup = Character.toString(ch).toUpperCase();
                          sb.append(sup);
                      }else{
                          String scc  = Character.toString(ch).replace(ch,'*');
                          sb.append(scc);
                      }
                  }
              }
          }
        System.out.println(sb);
    }
}

