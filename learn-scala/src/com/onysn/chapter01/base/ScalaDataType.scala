package com.onysn.chapter01.base

/**
 * @author yummy
 * @date 2020/6/30 23:43
 *       scala中的数据类型
 *       1)Scala与Java有着相同的数据类型,在Scala中数据类型都是对象，
 *       2) Scala 数据类型分为两大类
 *       AnyVal(值类型) 和 AnyRef(引用类型)
 *       注意：不管是 AnyVal 还是 AnyRef 都是对象。
 */
object ScalaDataType {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    //因为Int是一个类所以可以调用很多方法
    print(num1.toDouble + "\t" + num1.toString + "\t" + num1.toLong)

    //在Scala中任然要遵守，低精度的值向高精度的值自动转换 隐式转换
    //byte-short-int-long-float-double
    //byte和short和char之间不会相互转换，但是可以相互计算，会先转换成int类型
    //整数类型默认是Int类型
    var num2 = 13
    //浮点数类型默认是Double
    var num3 = 1.2
    //整数加上L为Long类型
    var num4 = 6L
    //浮点数加上F为Float
    var num5 = 1.33F

    //当有多种数据混合运算时，系统会自动将数据转换成容量大的数据类型然后再去运算
    var num6 = num1 + num2 + num3 + num4 + num5
    print("num6" + num6)


  }
}
