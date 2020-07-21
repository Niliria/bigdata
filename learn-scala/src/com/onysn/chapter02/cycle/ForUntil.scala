package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:01
 *       until 范围数据循环，前闭合后开放的数据 n-1
 */
object ForUntil {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 3) {
      println(i)
    }

    //输出10遍yummy
    for (i <- 1 until 11) {
      println("yummy" + i)
    }
  }
}
