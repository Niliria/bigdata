package com.onysn.chapter02.cycle

import util.control.Breaks._

/**
 * @author yummy
 * @date 2020/7/22 9:25
 *       练习题
 */
object Case05 {
  def main(args: Array[String]): Unit = {
    //100 以内的数求和，求出当和 第一次大于 20 的当前数
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println(i)
          break()
        }
      }
    }
    println(sum)

    println("======================")
    //使用Boolean类型终端
    var flag = true
    var sum1 = 0
    for (i <- 1 to 100 if flag==true) {
      sum1 += i
      if (sum1 > 20) {
        println(i)
        flag = false
      }
      println(sum1)
    }
  }
}
