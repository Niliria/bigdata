package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/22 9:07
 */
object Case04 {
  def main(args: Array[String]): Unit = {
    //打印出99乘法表
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        printf("%d*%d=%d\t", j, i, i * j)
      }
      println()
    }
  }
}
