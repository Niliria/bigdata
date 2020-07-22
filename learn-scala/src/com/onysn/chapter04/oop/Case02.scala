package com.onysn.chapter04.oop

/**
 * @author yummy
 * @date 2020/7/22 16:13
 *       练习:小狗案例
 */
object Case02 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog03
    dog.name = "tomcat"
    dog.age = 4
    dog.weigh = 12.5
    println(dog.say())
  }
}

class Dog03 {
  var name: String = ""
  var age: Int = _
  var weigh: Double = _

  def say(): String = {
    return "小狗的信息如下：\n name=" + this.name + "\t age=" + this.age + "\t weigh=" + this.weigh
  }
}
