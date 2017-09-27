package javasmall_ex;
import java.util.Scanner;
//实现斐波那契数列
public class ex_04 {
    public static void main(String[] args) {
        System.out.println("输入需要知道几个月的兔子数量");
        Scanner scanner = new Scanner(System.in);
        int mouth = scanner.nextInt();

        System.out.println(mouth +"月兔子数量为："+rabbit_num(mouth));
    }
    private static int rabbit_num(int n){
        if(n==1 || n==2)
            return 1;
        else
            return rabbit_num(n - 1) + rabbit_num(n - 2);

    }
}
