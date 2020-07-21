package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:05
 *       循环守卫/循环保护式保护式为 true 则进入循环体内部，为 false则跳过，类似于 continue
 */
object ForGuard {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10 if i % 2 != 0) {
      println(i)
    }
    println("-------等价---------")
    for (i <- 1 to 10) {
      if (i % 2 != 0) {
        println(i)
      }
    }
  }
}
