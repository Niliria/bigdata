package com.onysn.chapter03.funbase

/**
 * @author yummy
 * @date 2020/7/22 10:38
 *      函数入门
 */
object FunDemo {
  def main(args: Array[String]): Unit = {
    val n1 = 2
    val n2 = 5
    val res = sumN(n1, n2)
    println(res)
  }
  //定义一个函数
  def sumN(n1: Int, n2: Int): Int = {
     n1 + n2
  }
}
