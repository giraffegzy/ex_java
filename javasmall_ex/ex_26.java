package javasmall_ex;


import java.util.Scanner;

public class ex_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String start = in.next();
        String team = in.next();
        if(covert(start)==covert(team))
            System.out.println("GO");
        else
            System.out.println("STAY");
    }

    public static int covert(String str){
        char [] car = str.toCharArray();
        int sum = 1;
        for(int i =0;i<car.length;i++){
            sum = sum*(car[i]-64);
        }
        return sum%47;
    }
}
