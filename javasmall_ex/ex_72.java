

/*
* From:LeetCode-867
* 题目：翻转矩阵给定一个矩阵 A， 返回 A 的转置矩阵。
  矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
*
*
* */
public class ex_72 {
    public static void main(String[] args) {
        int [] [] in = new int[][]{{1,2,3},{4,5,6},{7,8,9}};


    }
    public int[][] transpose(int[][] A) {
        int col = A.length;
        int row = A[0].length;
        int[][] res = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
}
