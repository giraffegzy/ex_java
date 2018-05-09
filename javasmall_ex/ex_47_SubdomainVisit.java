package javasmall_ex;

import java.util.*;

/* From:LeetCode-811(SubdomainVisit)
    题目:统计给出域名数组的访问次数，输出所有域名的访问次数。
    我的思路:1.将域名拆分，并且存入Map容器中。
             2.循环截取出不同的域名。如果存在就直接加上访问次数，不存在则取值为0。
             3.返回结果。

 */
public class ex_47_SubdomainVisit {
    public static void main(String[] args) {
        String [] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> strings = subdomainVisits(str);
        for (String s :strings){
            System.out.println(s);
        }
    }
    public  static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> arrayList = new ArrayList<>();
        for (String web : cpdomains) {
            if (web.length() == 0)
                continue;
            int index = web.indexOf(' ');
            int count = Integer.valueOf(web.substring(0, index));
            web = web.substring(index+1);
            map.put(web, map.getOrDefault(web, 0)+count);
            while (web.indexOf('.') != -1) {
                web = web.substring(web.indexOf('.')+1);
                map.put(web, map.getOrDefault(web, 0)+count);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getValue() + " " + entry.getKey();
            arrayList.add(s);
        }
        return arrayList;
    }
}
