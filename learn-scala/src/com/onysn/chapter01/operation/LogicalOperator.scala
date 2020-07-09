package com.onysn.chapter01.operation

/**
 * @author yummy
 * @date 2020/7/2 8:57
 *       Scala中的逻辑运算符与Java中保持一致
 */
object LogicalOperator {
  def main(args: Array[String]): Unit = {
    var a = true
    var b = false
    println(a && b) //false
    println(a || b) //true
    println(!(a && b)) //true
  }
}
