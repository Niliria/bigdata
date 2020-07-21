package com.onysn.chapter02.flowcontrol

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 20:20
 *       分支控制if-else
 *       单分支的使用
 *       基本语法
 *       if(条件表达式) {执行代码块}
 */
object IfDemo {
  def main(args: Array[String]): Unit = {
    println("请输入年龄：")
    val age = StdIn.readInt()
    if (age > 18) println("您成年了")
  }
}
