package javasmall_ex;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/*
题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
例如2+22+222+2222+22222(此时共有5个数相加).
*/
public class ex_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入a的值: and 输入几个n相加");
        int a = in.nextInt();
        int n = in.nextInt();
        in.close();
//        System.out.println(express(a,n));
        System.out.println(express(a,n)+add(a,n));
    }
    public static String express(int a, int n){
        StringBuffer sbu = new StringBuffer();
        StringBuffer sbus = new StringBuffer();
        for(int i=1;i<n+1;i++){
            sbu = sbu.append(a);
            sbus =sbus.append(sbu);
            if (i<n)
                sbus= sbus.append("+");
            if (i==n)
                sbus =sbus.append("=");
        }
        return sbus.toString();
    }
    public static long add(int a,int n ){
        long sum = 0;
        long s_sum = 0;
        for (int i =0;i<n;i++){
            sum  = sum*10+a;
            s_sum+=sum;
        }
        return s_sum;
    }
}
