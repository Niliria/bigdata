package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:18
 *       将遍历过程中处理的结果返回到一个新 Vector 集合中，使用 yield 关键字
 */
object ForYield {
  def main(args: Array[String]): Unit = {
    val res = for (i <- 1 to 10) yield i
    println(res)

    val res2 = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        i + 10
      }
    }
    println(res2)
  }
}
