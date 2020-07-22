package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:44
 *       练习
 */
object Case02 {
  def main(args: Array[String]): Unit = {
    //计算 1—100 的和
    var sum = 0
    for (i <- 1 to 100) {
      sum += i
    }
    println(sum)

    //统计 1——200 之间能被 5 整除但不能被 3 整除的个数
    var count = 0
    for (i <- 1 to 200 if i % 5 == 0 && i % 3 != 0) {
      count += 1
    }
    println(count)
  }
}
