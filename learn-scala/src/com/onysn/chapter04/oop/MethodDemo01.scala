package com.onysn.chapter04.oop

/**
 * @author yummy
 * @date 2020/7/22 15:54
 *       给Dog类中添加cal方法计算两数之和
 */
object MethodDemo01 {
  def main(args: Array[String]): Unit = {

    val dog = new Dog
    println(dog.cal(2, 5))
  }
}

class Dog {
  var sal: Double = _
  var food: String = _

  def cal(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
