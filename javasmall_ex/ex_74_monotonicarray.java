

/*
*   From:LeetCode-896
*   题目:如果数组是单调递增或单调递减的，那么它是单调的。
        如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
        当给定的数组 A 是单调数组时返回 true，否则返回 false。
*
*
*/



public class ex_74_monotonicarray {
    public static void main(String[] args) {
        int [] A = {1,2,3,3,4};
        System.out.println(isMonotonic(A));
        System.out.println(true&&true?false:true);
    }
    public static boolean isMonotonic(int[] A) {
        boolean increase = false;
        boolean decrease = false;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                decrease = true;
            }
            if (A[i] > A[i - 1]) {
                increase = true;
            }
        }

        return increase && decrease ? false : true;
    }
}
