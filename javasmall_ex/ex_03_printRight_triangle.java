package javasmall_ex;

//接收一个层数值n，打印一个有n层的直角三角形，并返回底边最后一个值
public class ex_03_printRight_triangle {
    public static void main(String[] args) {
        //创建对象
        ex_03_printRight_triangle foo = new ex_03_printRight_triangle();
        int end_num;
        end_num = foo.getTriangle(10);
        System.out.println(end_num+"：是最后一个数");
    }
    public int getTriangle(int n){
        int num = 0;
        for (int i = 1; i <=n;i++){ //控制层数
            for (int k = 1;k<=i;k++){  //控制个数
                num++;
                System.out.printf("%3d", num);
            }
            System.out.println( );
        }return num;
    }
}
