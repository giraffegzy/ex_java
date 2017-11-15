package javanumbersmall_ex;
//检查是否为素数。
//素数：该数除了1和它本身以外不再有其他的因数的数被称为素数。
public class ex_01 {
    public static void main(String[] args) {
        int num = 1234;
        boolean flag = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num+"是素数");
        }else {
            System.out.println(num+"不是素数");
        }
    }
}
