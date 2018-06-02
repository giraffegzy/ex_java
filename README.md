# ex_java
# java基础练习题

###
1.检查是否为素数（素数：该数除了1和它本身以外不再有其他的因数的数被称为素数。）


2.打印出1-100的数,每十个数为一组。<br>
<br>
<br>
3.接收一个层数值n，打印一个有n层的直角三角形，并返回底边最后一个值<br>
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

28.(LeetCode-771)
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.
    The letters in J are guaranteed distinct, and all characters in J and S are letters.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    <br>Example 1:
    Input: J = "aA", S = "aAAbbbb"
    Output: 3
    
29.(LeetCode-657)
From :LeetCode-657
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.<br>
Example 1:   <br> 
Input: "UD"<br>
Output: true

30.（LeetCode-461）<br>
求两个数的汉明距离

31.（LeetCode-467）<br>
 题目:给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。<br>
 我的思路： <br>1.将正整数转成二进制 (两种方法①Integer自带toBinaryString方法。②自己实现转换）<br>
        2.二进制取反<br>
        3.二进制转成十进制（Integer的parseInt方法）


32.（LeetCode-804）<br>
 题目:将单词翻译成莫斯密码（具体规则见LeetCode-804)。<br>
 我的思路:<br>1.首先将字母和莫斯密码对于起来存放在一个Map里面方便取出来。<br>
          2.将需要转换的字母转换成摩斯密码<br>
          3.将字母的摩斯密码放入一个set用于找出多少种不同的翻译方法。<br>
         （想的比较简单，就这么写了下来，用了多个for循环）
         
33.(LeetCdoe-9)<br>
题目:给出一个整数，并判断它是否是回文。
我的思路:<br>1.将整数拆分成字符数组<br>
             2.创建两个for循环和两个字符串用于存放整数<br>
             3.比较得出结果<br>
             
34.(LeetCdoe-728)<br>
题目:给定一个区间，找出区间内包括头尾的所有的自除数（自除数不能包含0）
我的思路:<br>1.先用for循环来确定一共多少数.<br>
             2.再讲数字拆分并且判断是否为自除数<br>
             3.将符合结果的数据收集到List容器中<br>
             
35.(LeetCdoe-500)<br>
题目:给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。<br>
1.可以重复使用键盘上的同一字符<br>
2.可以假设输入的字符串将只包含字母<br>
我的思路:<br>1.首先判断首字母在那一行字母当中，就可以选取那一行作为条件进行判断。<br>
             2.用单词去匹配那一行字母，如果符合要求就添加到List容器中。<br>
             3.最后用字符串数组返回作为结果。<br>

36.(LeetCdoe-344)<br>
题目:逆序输出给出的字符串<br>
我的思路:<br>1.拆分字符串<br>
             2.for循环逆序<br>
             3.返回结果。<br>
             
             
37.（LeetCode-292）-Nim Games<br>
 题目:和朋友一起玩Nim游戏，桌上有一堆石头，你和朋友轮流拿走其中的1-3块，你先手。<br>
       请你根据桌上的石头数量判断你是否会赢下比赛。<br>
       例如：桌上有四块石头，无论你拿走1、2、3块石头，你的对手都会赢下比赛。<br>
我的思路:<br>1.首先画了画规律，然后发现只要是四的倍数，先手必输。<br>
          2.所以只要数量对四取余不为零，先手就必赢。<br>
          
          
39.LeetCode-557(reverse words in a string iii)<br>
   题目:给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。<br>
    我的思路:<br>1.拆分字符串<br>
            2.将每个单词作为单独元素反转字母顺序<br>
            3.拼起来。<br>
            
40.LeetCode-821<br>
   题目:给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
   我的思路
   
   
   
41.LeetCode-561(array-partition)<br>
     题目:给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,<br>
      例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。<br>
     我的思路:<br>1.将数组排序,<br>
              2.因为数组的元素是2n，所以排序之后的数组的偶数位全是我们需要的数据。<br>
              3.直接将偶数位相加即可。<br>
              
42.LeetCode-693(CheckBinaryNum)<br>
    题目:给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。<br>
    我的思路:<br>1.将正整数拆分<br>
             2.循环判断，如果第一个数和第二个数相等就直接false<br>
             3.返回结果<br>
             
43.LeetCode-171(ExcelNameNumber)<br>
    题目:<br>给定一个Excel表格中的列名称，返回其相应的列序号。<br>
    我的思路:1.二十六进制转化十进制。<br>
    
    
44.LeetCode-371(SumTwoInteger)<br>
     题目:不使用运算符 + 和-，计算两整数a 、b之和。<br>
     我的思路:<br>1.先与运算找到进位.<br>
                   2.用异或找到不同位.<br>
                   3.左移一位.<br>
                   4直到b==0.<br><br>

45.LeetCode-13(RomanInreger)<br>
  题目:给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。<br>
  思路:<br>1.将数字和罗马表对照<br>
       2.拆分字符串<br>
       3.循环得到答案（如果前一位比后一位大，那么做加运算，反之则减，）<br>
       
46.LeetCode-412(FizzBuzz)
  题目:写一个程序，输出从 1 到 n 数字的字符串表示。<br>
    1. 如果 n 是3的倍数，输出“Fizz”；<br>
    2. 如果 n 是5的倍数，输出“Buzz”；<br>
    3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。<br>
    我的思路:<br>1.直接进行for循环判断。<br>
    
47.LeetCode-811(SubdomainVisit)<br>
       题目:统计给出域名数组的访问次数，输出所有域名的访问次数。<br>
       我的思路:<br>1.将域名拆分，并且存入Map容器中。<br>
                2.循环截取出不同的域名。如果存在就直接加上访问次数，不存在则取值为0。<br>
                3.返回结果。<br>
                
48.LeetCode-806(NumberLines)<br>
   题目:见LeetCode0806<br>
   我的思路:<br>1.循环判断即可。<br>
   
49.LeetCode-575<br>
     题目:给定一个偶数长度的数组，里面的每个不同元素都代表一种糖果，平均分给弟弟妹妹，如何让妹妹获得最多种类的糖果<br>
     我的思路:<br>1.直接用set取出所有糖果的种类，若种类大于糖果数量一半，直接返回糖果数量的一般，若小于直接返回所有糖果种类。<br>
     
     
50.LeetCode-258（addDigits ）<br>
    题目:给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。<br>
    我的思路:<br>1.一开始想着不断循环相加，后来看到进阶提示有O(1)的方法，于是找了一下规律。<br>
             2.发现结果都是1-9的循环。都是num对9取余，然后直接提交了，发现18这个情况不对。<br>
             3.所以改进了一下得出规律是（num-1）%9+1     <br>

51.LeetCode-485(MaxConsecutiveOnes )<br>
  题目:给定一个二进制数组， 计算其中最大连续1的个数。<br>
  思路:<br>1.拆分数组，用可变字符串保存<br>
       2.循环找到最大长度<br>
       
52.LeetCode-283(MoveZero)<br>
     题目:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。<br>
     我的思路:<br>1.首先想法是先将非0元素全部前移，在数组末尾补充0<br>
              2.后来看了最优解法，就写了这个解答。<br>
              3.通过一个临时量，交换非零元素和零元素。<br>
              
              
53.LeetCode-496(NextGreaElement)<br>
   题目:给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。<br>
   思路:<br>1.循环判断<br>
        2.使用堆栈<br>
        
        
54.LeetCode-136(SingleNumber)<br>
 题目:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。<br>
 我的思路:<br>1.首先想到了Map的方式，然后循环判断就可以得到。<br>
          2.然后发现用异或效率提高的不是一点半点。<br>
          
55.LeetCode-520(CheckCapital)<br>
     题目:给定一个单词，你需要判断单词的大写使用是否正确。<br>
     我的思路:<br>1.首先判断是否全部小写或者大写<br>
              2.再判断第一个字母是否为大写。<br>
              
              
56.LeetCode-389(FindDiff)<br>
     题目:给定两个字符串 s 和 t，它们只包含小写字母。<br>
          字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。<br>
          请找出在 t 中被添加的字母。<br>
     思路:<br>1.分别计算出s和t的单个字符总和，两者相减即为被添加的字符<br>
          2.用异或运算求解。<br>
          
57.LeetCode-27(RemoveElement)<br>
     题目:给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。<br>
     思路:<br>1.先给出一个指针保留需要替换的元素。<br>
          2.再循环判断是不是被替换的元素。如果是，不进入循环，如果不是进入循环。<br>
          
58.LeetCode-169(MajorityElement)<br>
     题目:给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。<br>
          你可以假设数组是非空的，并且给定的数组总是存在众数。<br>
     思路:<br>1.(蠢的想法）用Map集合简历对应的关系，然后循环判断每一个的值。得出众数<br>
          2.看了一下LeetCode的优秀解法，是用一个计数器实现的，循环判断。<br>
          
59.LeetCode-521(LongSub)<br>
     题目:给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。<br>
     最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。<br>
     思路:<br>1.如果字符串长度不相等，那么长度大的那个一定是最长子序列<br>
          2.如果字符串长度相同并且字符串还相等那么不存在子序列因为一个一定是另一个的子序列。<br>
          否则随便任意一个字符串都是另一个字符串的最长子序列。<br>
          
60.LeetCode-268(MissingNumber)<br>
     题目:给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。<br>
     思路:<br>1.用n个数字的总和减去n-1就可以得到缺少的数字
     
     
61.LeetCode-122(BestBuyTomoney)<br>
  题目:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。<br>
       设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。<br>
       注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。<br>
  思路:<br>1.如果仅仅按照题目所说不考虑其他，就是找到最大减去最小的即可。<br>
       2。但是如果仔细思考注意里面说的，实际上是有可能在同一天即出售了股票又购买了股票。<br>
       
62.LeetCode-202（HappyNumber)<br>
      题目:一个“快乐数”定义为：<br>
      对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，<br>
      也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。<br>
      思路:<br>1.搜索了一下快乐数的规则，如果平方和结果为四就会陷入循环那么一定不是快乐树，<br>
             所以可以直接循环判断求解。       <br>
             
63.LeetCode-242(validAnagram)<br>
  题目:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。<br>
  思路:<br>1.给定一个整数数组并且大小为26。<br>
       2.将两个字符串分别拆成字符减去字符'a'得出字符的大小。<br>
       3.循环加减整数数组，并做判断，如果数组元素为零，即可得到是字母异位词。<br>
       
64.LeetCode-551(StudentRecord)<br>
    题目:给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：<br>
           'A' : Absent，缺勤<br>
           'L' : Late，迟到<br>
           'P' : Present，到场<br>
           如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。<br>
           你需要根据这个学生的出勤纪录判断他是否会被奖赏。<br>
    思路:<br>1.如果第一次出现A和最后一次出现A的索引相同就说明只有一个A<br>
            2.如果不包含三个L就说明没有连续三次迟到。<br>
            3.两个条件同时成立应该被奖赏。<br>