package com.onysn.chapter01.keyboard

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 20:10
 *       键盘录入功能  从控制台接收用户的信息
 */
object KeyboardEntry {
  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    val name = StdIn.readLine()
    println("请输入年龄：")
    val age = StdIn.readInt()
    println("请输入薪水：")
    val sal = StdIn.readDouble()
    printf("用户的信息是 name=%s age=%d sal=%.2f", name, age, sal)
  }
}
