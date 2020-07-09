package com.onysn.chapter01.base

/**
 * @author yummy
 * @date 2020/7/1 16:49
 *       值类型和sting类型的转换，只能转换数字字符串
 */
object DataTypeToString {
  def main(args: Array[String]): Unit = {
    //基本类型的值转换成string加上”“就可以了
    val num1 = 1.2F
    val num2 = num1 + ""
    //String类型的数字字符串转成基本数据类型
    //通过基本数据类型的toXXX方法就可以
    val num4: Double = num2.toDouble

    //在Scala中不是将小数点的数据进行截取的，而是会抛出异常
    //val num3: Int = num2.toInt  //报错的
    //val num5: Long = num2.toLong // 报错的
  }
}
