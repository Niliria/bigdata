package com.onysn.chapter02.cycle

import util.control.Breaks._

/**
 * @author yummy
 * @date 2020/7/22 8:59
 *       while循环的中断
 *       Scala内置控制结构去掉了break与continue关键字
 */
object WhileBreak {
  def main(args: Array[String]): Unit = {
    //使用breakable()函数,breakable 是一个高阶函数：可以接收函数的函数就是高阶函数
    var n = 1
    breakable {
      while (n <= 20) {
        n += 1
        println("n=" + n)
        if (n == 18) break()
      }
    }
    println("=====================================")
    //实现continue的效果，可以使用if-else或者循环守卫
    for (i <- 1 to 10 if i != 2 && i != 3) {
      println(i)
    }
    println("=====================================")
    //基于Boolean类型控制变量
    var flag = true
    var num1 = 1
    while (flag) {
      num1 += 1
      println("n=" + num1)
      if (num1 == 18) flag = false
    }

  }
}
