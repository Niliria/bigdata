package com.onysn.chapter01.operation

/**
 * @author yummy
 * @date 2020/7/1 17:07
 *       scala中的运算符与Java中的运算规则一样
 *       使用 / % += -=
 */
object ArithmeticOperator {
  def main(args: Array[String]): Unit = {
    // /的使用
    var num1: Int = 10 / 3
    println(num1) //结果为3
    var num2: Double = 10 / 3
    println(num2) //3.0
    var num3: Double = 10.0 / 3
    println(num3) //3.333333333

    // %的使用 运算规则为a%b = a - (a/b) * b
    println(10 % 3) // 1
    println(-10 % 3) // -1
    println(-10 % -3) // -1

    // ++ , --  在Scala中没有++ --，而是使用-= ，+=
    var num4 = 10
    num4 -= 1
    num4 += 2
    println(num4)

  }

}
