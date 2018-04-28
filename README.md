# ex_java
# java基础练习题

###
1.检查是否为素数（素数：该数除了1和它本身以外不再有其他的因数的数被称为素数。）


2.打印出1-100的数,每十个数为一组。<br>
如图：
![image](httpnumbers://github.com/giraffegzy/ex_java/blob/manumberster/javanumbersmall_ex/p/ex_01.jpg)
<br>
<br>
3.接收一个层数值n，打印一个有n层的直角三角形，并返回底边最后一个值<br>
如图：
![image](httpnumbers://github.com/giraffegzy/ex_java/blob/manumberster/javanumbersmall_ex/p/ex_03.jpg)
<br>
<br>

4.有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问n个月的兔子对数为多少？<br>
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....(斐波那契数列) 
<br>
<br>

5.打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数， 其各位数字立方和等于该数本身。<br>
例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
<br>
<br>
6.题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
<br>
<br>
7.题目：求numbers=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
  例如2+22+222+2222+22222(此时共有5个数相加).
<br>
<br>
8.题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
<br>
<br>

9.题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
<br>
<br>
10.题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
<br>
<br>
11.题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
<br>
<br>
12.题目：对10个数进行排序
<br>
<br>
13.题目：求一个3*3矩阵对角线元素之和
<br>
<br>
14.题目：将一个数组逆序输出。
<br>
<br>
15.题目：(1)统计一个字符串中的，大写字母，小写字母，数字的个数，不包括标点符号和空格。<br>
         (2) 统计一个字符串在另一个字符串中的出现的个数。<br>
         (3)将int[] arr = {1,2,3,4,5,6,7} 转化成[1,2,3,4,5,6,7]。<br>
         (4)从键盘循环录入录入一个字符串,输入"end"表示结束,将字符串中大写字母变成小写字母，小写字母变成大写字母，
         其它字符用"*"代替,并统计字母的个数
         <br>
        例如：
       <br>input：Hello123Wrold 
<br>        output：hELLO***wROLD
<br>
<br> 17.题目：给出一个字符串找到最少长度最小的单词，并返回最小单词的长度<br>
来源：codewars<br>
题目：给出一个字符串" 1 5 3 6 "要求返回一个字符串" 5 1" 最大的数字在首位加空格加最小的数字。<br>
    HighAndLow("1 2 3 4 5") // return "5 1"<br>
    HighAndLow("1 2 -3 4 5") // return "5 -3"<br>
    HighAndLow("1 9 3 4 -5") // return "9 -5"<br>
    
18.题目：简单实现斗地主的发牌，洗牌，和看牌功能。牌根据大小排序<br>

19.题目：返回一个字符串里面，位于中间的字符，如果是偶数，则返回中间两个字符，如果是奇数则返回最中间的。<br>
    Kata.getMiddle("test") should return "es"<br>
    Kata.getMiddle("testing") should return "t"<br>
    
20.题目：返回一个字符在字符串中的个数。忽略大小写<br>


21.题目:给出一个奇数数组，返回数组中的唯一值<br>
     stray([1,1,1,0,1])---->return 0<br>
     
22.题目:返回一个数组中的最大值和最小值组成的数组。<br>

23.题目: 遍历C:\WINDOWS目录下的文件，并找出最大和最小文件。（不遍历子文件夹）<br>

24.题目(洛谷)试计算在区间 1 到 n 的所有整数中，数字 x（0 ≤ x ≤ 9）共出现了多少次？<br>
例如，在 1到 11 中，即在 1、2、3、4、5、6、7、8、9、10、11 中，数字 1 出现了 4 次。<br>

25.题目(洛谷——P1428)<br>
输入第一行n为鱼的数量<br>
输入第二行为每条鱼的可爱程度。<br>
任意两只鱼的可爱程度可能一样。由于所有的鱼头都朝向左边，所以每只鱼只能看见在它左边的鱼的可爱程度
输出为比较结果
样例输入：<br>
6 <br>
4 3 0 5 1 2<br> 

样例输出:0 0 0 3 1 2

26.题目(洛谷——P1200) 小组名和彗星名都以下列方式转换成一个数字：最终的数字就是名字中所有字母的积，
其中“A”是1，“Z”是26。例如，“USACO”小组就是21*19*1*3*15=17955。如果小组的数字 mod 47等于彗星的数字mod 47
你就得告诉这个小组需要准备好被带走！（记住“a mod b”是a除以b的余数；34 mod 10等于4）
如果能搭配，就输出“GO”，否则输出“STAY”。小组名和彗星名均是没有空格或标点的一串大写字母（不超过6个字母）。

28.(leetcode-771)
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.
    The letters in J are guaranteed distinct, and all characters in J and S are letters.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    <br>Example 1:
    Input: J = "aA", S = "aAAbbbb"
    Output: 3
