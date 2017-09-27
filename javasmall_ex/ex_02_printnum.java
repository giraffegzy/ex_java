package javasmall_ex;
//打印出1-100的数,每十个数为一组。
public class ex_02_printnum {
    public static void main(String[] args) {
        int [][] num = new int[10][10];
        int count = 0;
        for (int i=0;i<10;i++){
            for (int k=0;k<10;k++){
                num[i][k]= ++count;
                System.out.printf("%3d",num[i][k]);//格式化输出，一个数字一个空格。
            }
            System.out.println( );
        }
    }
}
