package javasmall_ex;
import java.util.*;
/*
 * 13.题目：求一个3*3矩阵对角线元素之和
 */
public class ex_13 {
    public static void main(String[] args) {
        int [][] arr = new int [][] {{1,2,3},{3,2,1},{4,5,6}};
        System.out.println(Arrays.deepToString(arr));
        Sum(arr);

    }
    public static void Sum(int [][] arr){
        int left_sum = 0;
        int right_sum = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if(i==j)
                    left_sum +=arr[i][j];
                if(j== arr.length-i-1)
                    right_sum+=arr[i][j];
            }
        }
        System.out.println("对角线之和为"+left_sum+right_sum);
    }
}
