package javasmall_ex;
//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
// 其各位数字立方和等于该数本身。
// 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。

public class ex_05 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (sarch_num(i))
            System.out.println(i + "是水仙数");
        }
    }

    public static boolean sarch_num(int n) {
        int a, b, c;
        a = n/ 100;
        b = n% 100 / 10;
        c = n % 10;
        if (n == a * a * a + b * b * b + c * c * c)
            return true;
        else
            return false;
    }
}
