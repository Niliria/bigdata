package com.onysn.chapter01.base

/**
 * @author yummy
 * @date 2020/6/30 23:29
 *       声明值和变量
 *       1、scala默认为匿名变量分配val，val修饰的没有线程安全问题，编译之后等同于加上final，所以执行效率高
 *       2、val定义的变量虽然不能改变其引用的内存地址，但是可以改变其引用的对象的内部的其他属性值。
 *       3、为了减少可变性引起的bug，应该尽可能地使用不可变变量。变量类型可以省略，解析器会根据值进行推断。
 *       val和var声明变量时都必须初始化。
 */
object StatementVar {
  def main(args: Array[String]): Unit = {
    //scala声明值两种方式 一个用val 一种是用var
    //val/var 变量名:变量类型=值
    //val声明的变量不可变，它不是一个常量，是不可变量，或者是只读变量
    val num1 = 10
    var num2 = 20
    print(num1)
    print(num2)
  }
}
