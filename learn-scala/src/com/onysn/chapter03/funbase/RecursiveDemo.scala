package com.onysn.chapter03.funbase

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/22 10:45
 */
object RecursiveDemo {
  def main(args: Array[String]): Unit = {
    /*斐波那契数
    请使用递归的方式，求出斐波那契数 1,1,2,3,5,8,13...
    给你一个整数 n，求出它的斐波那契数是多少
     */
    println("请输入一个正整数")
    val num = StdIn.readInt()
    val res = fbn(num)
    println(res)

    /*猴子吃桃子问题
    有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再
    多吃一个。当到第十天时，想再吃时（还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子
    */
    println("桃子的个数" + peach(1)) //1534
  }

  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }


  def peach(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (peach(day + 1) + 1) * 2
    }
  }


}
