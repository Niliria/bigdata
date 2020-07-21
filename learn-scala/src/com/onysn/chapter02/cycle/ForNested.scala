package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:13
 *       嵌套循环
 */
object ForNested {
  def main(args: Array[String]): Unit = {
    //没有关键字 一定要加上分号
    for (i <- 1 to 10; j <- 1 until 10) {
      println("i=" + i + ",j=" + j)
    }
    println("=====等价写法=====")
    for (i <- 1 to 10) {
      for (j <- 1 until 10) {
        println("i=" + i + ",j=" + j)
      }
    }
  }
}
