package com.onysn.chapter04.constructor

/**
 * @author yummy
 * @date 2020/7/22 19:36
 *
 */
object ComDemo02 {
  def main(args: Array[String]): Unit = {
    val person = new Person05(16)
    person.showInfo()
  }
}

//定义一个person类
//共有4个构造器
class Person05() {
  var name: String = _
  var age: Int = _

  //辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
  //而且需要放在辅助构造器的第一行[这点和java一样,java中一个构造器要调用同类的其它构造器，也需要放在第一行]
  def this(name: String) {
    this() //直接调用主构造器
    this.name = name
  }

  //辅助构造器
  def this(name: String, age: Int) {
    this()
    this.name = name
    this.age = age
  }

  //辅助构造器
  def this(age: Int) {
    this("匿名")
    this.age = age
  }

  def showInfo(): Unit = {
    println("name=" + this.name)
    println("age=" + this.age)
  }

  override def toString: String = {
    "name= \t" + this.name + "\t age=" + this.age
  }
}