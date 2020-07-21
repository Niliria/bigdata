package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:09
 *       引入变量，没有关键字所以范围后一定要加 ; 来隔断逻辑
 */
object ForVar {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 10; j = i + 1) {
      println(j)
    }

    println("======等价写法======")
    for (i <- 1 until 10) {
      var j = i + 1
      println(j)
    }
  }
}
