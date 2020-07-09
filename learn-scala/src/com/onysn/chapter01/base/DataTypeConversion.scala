package com.onysn.chapter01.base

/**
 * @author yummy
 * @date 2020/7/1 15:56
 *       scala中的强制类型转换
 *       自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。
 *       使用时要加上强制转函数，但可能造成精度降低或溢出,
 */
object DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 当进行数据的 从 大——>小，就需要使用到强制转换
    // 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val num1: Int = (10 + 3.45).toInt
    val num2: Int = 20 * 2.88.toInt

    println(num1) //13
    println(num2) //40
    println(num1 + num2) //53
  }
}
