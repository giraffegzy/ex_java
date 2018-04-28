package javasmall_ex;
/*
* From :leetcode-657(easy)
* Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.
Example 1:
Input: "UD"
Output: true
*
*
* */

public class ex_29 {
    public static void main(String[] args) {
        String move = "LL";
        int x = 0, y = 0;

        for (char c : move.toCharArray()) {
            if (c == 'U')
                y++;
            else if (c == 'D')
                y--;
            else if (c == 'R')
                x++;
            else if (c == 'L')
                x--;
        }
        System.out.println(x == 0 & y == 0);


    }
}
