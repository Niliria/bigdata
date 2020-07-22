package com.onysn.chapter03.funbase

/**
 * @author yummy
 * @date 2020/7/22 12:24
 *       当函数返回值被声明为 lazy 时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。
 *       这种函数我们称之为惰性函数，在 Java 的某些框架代码中称之为懒加载(延迟加载)。
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    lazy val res = getSum(1, 2)
    println("-----------")
    println(res)  //在使用res前，才执行


  }

  def getSum(n1: Int, n2: Int): Int = {
    println("sum执行了~~~")
    n1 + n2
  }
}
