package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 21:56
 *       for推导式/表达式
 */
object ForDemo {
  def main(args: Array[String]): Unit = {
    //前后闭合 输出1，2，3
    for (i <- 1 to 3) {
      println(i)
    }

    //输出十句yummy
    for (x <- 1 to 10) {
      println("yummy" + x)
    }

    //for这种推导式也可以直接对数组以及集合遍历
    var list = List("张三",1,12,133)
    for (l <- list){
      println(l)
    }
  }
}
