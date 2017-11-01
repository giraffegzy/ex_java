package javasmall_ex;
import java.util.*;
/**
 * 题目：对10个数进行排序
 */
public class ex_12 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素n");
        for(int i =0;i<arr.length;i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        System.out.println("排序后");
        Sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sorted(int [] arr){
        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]>arr[i]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
    }
}
