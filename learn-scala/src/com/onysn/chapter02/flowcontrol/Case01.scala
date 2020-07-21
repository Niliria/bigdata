package com.onysn.chapter02.flowcontrol

/**
 * @author yummy
 * @date 2020/7/21 20:26
 *       练习题
 */
object Case01 {
  def main(args: Array[String]): Unit = {
    //案例1：求两个数的最大值
    val num1 = 4
    val num2 = 8
    var res = if (num1 < num2) num1 else num2
    println(res)
    //案例2：求三个数的最大值
    val num3 = 12
    var res2 = if (res > num3) res else num3
    println(res2)
  }
}
