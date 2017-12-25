package 蓝桥杯.基础练习;

/*
    问题描述
　　      153是一个非常特殊的数，它等于它的每位数字的立方和，
       即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
    输出格式
　　      按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
*/

public class Demo07 {
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++) {

            int Ge = i % 10;
            int Shi = (i / 10) % 10;
            int Bai = (i / 100) % 10;

            if(i == Ge*Ge*Ge + Shi*Shi*Shi + Bai*Bai*Bai)
                System.out.println(i);
        }
    }
}
