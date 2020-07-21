package com.onysn.chapter02.flowcontrol

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 20:49
 *       练习题
 */
object Case02 {
  def main(args: Array[String]): Unit = {
    //练习1 编写程序，声明 2 个 Int 型变量并赋值。判断两数之和，如果大于等于 50，打印“hello worl”
    val num1 = 10
    val num2 = 23
    if ((num1 + num2) > 50) {
      println("hello,word")
    } else println("不成立！")


    //练习2 编写程序，声明 2 个 Double 型变量并赋值。判断第一个数大于 10.0，且第 2 个数小于 20.0，打印两数之和。
    val dou1 = 12.0
    val dou2 = 27.2
    if (dou1 > 10.0 && dou2 < 20.0) {
      println(dou1 + dou2)
    } else {
      println("不成立！")
    }

    //练习3 定义两个变量 Int，判断二者的和，是否既能被 3 又能被 5 整除，打印提示信息
    val n1 = 24
    val n2 = 36
    var sum = n1 + n2
    if (sum % 3 == 0 && sum % 5 == 0) {
      println("既能被 3 又能被 5 整除")
    } else {
      println("不既能被 3 又能被 5 整除")
    }

    //练习4 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被4整除，但不能被100整除；(2)能被400整除
    println("请输入需要查询的年份")
    val year = StdIn.readInt()
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      println("是闰年！")
    } else {
      println("系统忙！！")
    }
  }
}
