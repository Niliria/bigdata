package com.onysn.chapter03.detail

/**
 * @author yummy
 * @date 2020/7/22 12:12
 *       Scala 函数支持可变参数
 *       可变参数需要写在形参列表的最后。
 *       args 是集合, 通过 for 循环 可以访问到各个值。
 */
object FunDetails04 {
  def main(args: Array[String]): Unit = {
    println(sum(1,5,35,6,52,14))
  }

  def sum(n1: Int, args: Int*): Int = {
    println("args.length=" + args.length)
    var sum = n1
    for (i <- args) {
      sum += i
    }
    sum
  }
}
