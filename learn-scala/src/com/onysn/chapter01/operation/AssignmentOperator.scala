package com.onysn.chapter01.operation

/**
 * @author yummy
 * @date 2020/7/2 9:03
 *       赋值运算符与Java中保持一致
 *       +=  -=  =  *=  /+ %=  <<=  >>=  &=  |=
 */
object AssignmentOperator {
  def main(args: Array[String]): Unit = {
    var num = 2
    //2 = 0000 0010
    //把2转换成二进制 左移2位
    //0000 1000  8
    num <<= 2
    //0000 0001  1
    num >>= 3
    println(num) //1

    //Scala中支持代码块
    var res = {
      //在Scala中没有Java中的三元运算
      if (num > 1) "hello" else 20
    }
    println(res)

    //两个变量 将其互换位置但是不可以使用中间变量
    var a = 10
    var b = 20

    a = a + b
    b = a - b
    a = a - b
    println("a:" + a, "b:" + b)

    //方式二
    //a=20 ,b=10
    a = a ^ b
    b = a ^ b
    a = a ^ b
    println(a,b)

  }
}
