/*
*   From:LeetCode-766
*   题目：如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
          给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
*
*
*
*/

public class ex_73_ToeplitzMatrix {
    public static void main(String[] args) {

    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
            for(int i =0;i<matrix.length-1;i++){
                for (int j=0 ;j<matrix[i].length-1;j++){
                    if (matrix[i][j]!=matrix[i+1][j+1])return false;
                }
            }
        return true;
    }
}
