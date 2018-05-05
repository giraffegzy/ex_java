package javasmall_ex;

/*
* From:LeetCode-557(reverse words in a string iii)
*题目:给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
* 我的思路:1.拆分字符串
*          2.将每个单词作为单独元素反转顺序
*          3.拼起来。
* */
public class ex_39_ReverseWord_iii {
    public static void main(String[] args) {
       String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));

    }
    public static String reverseWords(String s) {
        String [] strArr =s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<strArr.length;i++){
            char [] cArr = strArr[i].toCharArray();
            for(int j=cArr.length-1;j>=0;j--){
                sb.append(cArr[j]);
            }
            if(i==strArr.length-1){
                continue;
            }else {
                sb.append(" ");
            }
        }

        return String.valueOf(sb);
    }
}
