package 蓝桥杯.历届试题;
/*
问题描述
    X 国的一个网络使用若干条线路连接若干个节点。节点间的通信是双向的。某重要数据包，
    为了安全起见，必须恰好被转发两次到达目的地。该包可能在任意一个节点产生，
    我们需要知道该网络中一共有多少种不同的转发路径。
    源地址和目标地址可以相同，但中间节点必须不同。
    如下图所示的网络。
    (详见img下的“蓝桥杯-图1”)
    1 -> 2 -> 3 -> 1 是允许的
    1 -> 2 -> 1 -> 2 或者 1 -> 2 -> 3 -> 2 都是非法的。
输入格式
    输入数据的第一行为两个整数N M，分别表示节点个数和连接线路的条数(1<=N<=10000; 0<=M<=100000)。
    接下去有M行，每行为两个整数 u 和 v，表示节点u 和 v 联通(1<=u,v<=N , u!=v)。
    输入数据保证任意两点最多只有一条边连接，并且没有自己连自己的边，即不存在重边和自环。
输出格式
    输出一个整数，表示满足要求的路径条数。
样例输入1
    3 3
    1 2
    2 3
    1 3
样例输出1
    6
样例输入2
    4 4
    1 2
    2 3
    3 1
    1 4
样例输出2
    10
*/

public class Demo13 {
}
