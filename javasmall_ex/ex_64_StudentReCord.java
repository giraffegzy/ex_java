package javasmall_ex;

import java.util.Arrays;

/*
 From:LeetCode-551(StudentRecord)
 题目:给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
        'A' : Absent，缺勤
        'L' : Late，迟到
        'P' : Present，到场
        如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
        你需要根据这个学生的出勤纪录判断他是否会被奖赏。
 思路:如果第一次出现A和最后一次出现A的索引相同就说明只有一个A
      如果不包含三个L就说明没有连续三次迟到。
      两个条件同时成立应该被奖赏。
 */
public class ex_64_StudentReCord {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }
    public static  boolean checkRecord(String s) {
       if(s.indexOf("A")==s.lastIndexOf("A")&&!s.contains("LLL"))return true;
       return false;
    }
}
