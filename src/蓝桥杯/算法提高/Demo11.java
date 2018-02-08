package 蓝桥杯.算法提高;
/*
问题描述
    Torry从小喜爱数学。一天，老师告诉他，像2、3、5、7……这样的数叫做质数。Torry突然想到一个问题，
    前10、100、1000、10000……个质数的乘积是多少呢？他把这个问题告诉老师。老师愣住了，一时回答不出来。
    于是Torry求助于会编程的你，请你算出前n个质数的乘积。不过，考虑到你才接触编程不久，
    Torry只要你算出这个数模上50000的值。
输入格式
    仅包含一个正整数n，其中n<=100000。
输出格式
    输出一行，即前n个质数的乘积模50000的值。
样例输入
    1
样例输出
    2
*/

/*
输入 8000  应该输出 18
*/

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        int number = 2;
        for(int i = 0; i < n; i++) {
            number = f(number);
            sum = (sum * number) % 50000;
            number++;
        }
        System.out.println(sum);
    }

    private static int f(int n) {  //求素数
        int temp;
        for(int i = n; ; i++) {
            temp = 0;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    temp = -1;
                    break;
                }
            }
            if(temp == 0)
                return i;
        }
    }
}
