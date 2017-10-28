package javasmall_ex;

/**
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class ex_09 {
    public static void main(String[] args) {
        int count = 0;
        for (int i =1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i==j)
                    continue;
                for (int k =1;k<=4;k++){
                    if(i!=k&&j!=k){
                       int  num = i*100+j*10+k;
                        System.out.print(num+" ");
                        if((++count)%5==0)
                            System.out.println(" ");
                    }
                }
            }
        }
        System.out.println("这样的数有"+count+"个");
    }
}
