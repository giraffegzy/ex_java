package javasmall_ex;


import java.util.Arrays;
import java.util.Scanner;

public class ex_27 {
    public static void main(String[] args) {
        String str_in = new Scanner(System.in).next().toLowerCase();
        String str_line = new Scanner(System.in).nextLine().toLowerCase();
        int sum = 0;
        int index=0;
        String [] strarr = str_line.split(" ");
        for(int i=0;i<strarr.length;i++){
            if(str_in.equals(strarr[i]))
                sum++;
        }
        for(int j=0;j<strarr.length;j++){
            if(str_in.equals(strarr[j])){
                index=j;
            }
        }

        if(sum!=0)
            System.out.println(sum+" "+(index+1));
        else
            System.out.println(-1);
    }
}
