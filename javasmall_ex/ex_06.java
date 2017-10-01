package javasmall_ex;

/*题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
* */
public class ex_06 {
    public static void main(String[] args) {
    int n =10;
    decompose_num(10);
    }

    public static void decompose_num(int n) {
        System.out.print(n + "=");
        for (int i = 2; i < n + 1; i++) {
            while (n % i == 0 && n != i) {
                n /= i;
                System.out.print(i + "*");
            }
            if (n == i) {
                System.out.println(i);
                break;
            }
        }
    }
}
