package com.onysn.chapter01.operation

/**
 * @author yummy
 * @date 2020/7/1 17:55
 *       关系运算符的使用和Java中一样
 *       如果两个浮点数进行比较应该确保类型一致
 */
object RelationalOperator {
  def main(args: Array[String]): Unit = {
    var num1 = 10
    var num2 = 11
    println(num1 == num2)
    println(num1 > num2)
    println(num1 < num2)
    println(num1 >= num2)
    println(num1 <= num2)
    println(num1 != num2)
  }
}
