package com.onysn.chapter03.funbase

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/22 14:47
 *       练习
 */
object Case01 {
  def main(args: Array[String]): Unit = {
    //编写一个函数，从终端输入一个整数打印出对应的乘法表
    println("请输入0-9的整数")
    val num = StdIn.readInt()
    print99(num)
  }

  def print99(n1: Int) = {
    for (i <- 1 to n1) {
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j, i, j * i)
      }
      println()
    }
  }
}
