package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:30
 *       练习题
 */
object Case01 {
  def main(args: Array[String]): Unit = {
    //打印 1~100 之间所有是 9 的倍数的整数的个数及总和.
    var count = 0
    var sum = 0
    for (i <- 1 to 100 if i % 9 == 0) {
      println(i)
      count += 1
      sum += i
    }
    println(count + "..." + sum)
  }
}
