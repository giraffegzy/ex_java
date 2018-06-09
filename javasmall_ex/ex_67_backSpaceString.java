package javasmall_ex;

import java.util.Stack;

/*
  From:LeetCode-844_BackSpaceString
  题目:给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
       判断二者是否相等，并返回结果。 # 代表退格字符。
  思路:1用堆栈实现，如果字符为#则跳过，否则压栈。

 */
public class ex_67_backSpaceString {
    public static void main(String[] args) {
       String S = "ab#c", T = "ad#c";
        System.out.println(backspaceCompare(S,T));
    }
    public static boolean backspaceCompare(String S, String T) {
        return CheckString(S).equals(CheckString(T));
    }
    public static Stack<Character> CheckString (String str){
        Stack stack = new Stack();
        for(char c :str.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }else if(!stack.empty())
                stack.pop();
        }
        return stack;
    }
}
