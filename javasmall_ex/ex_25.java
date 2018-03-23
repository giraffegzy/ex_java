package javasmall_ex;

import java.util.Scanner;


public class ex_25{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] c_arr = new int[count];
        int [] arr= new int[count];
        int i ;
        for ( i=0;i<count;i++){
            arr[i]=in.nextInt();   //输入鱼的可爱程度
            }
        for(int j=arr.length-1;j>0;j--){   //倒推比较每条鱼的可爱程度
            for(i = 0;i<j;i++){
                if(arr[i]<arr[j])
                    c_arr[j]++;
            }
        }
        for( i=0;i<c_arr.length;i++){
            System.out.print(c_arr[i]+" ");
        }
         }
    }


