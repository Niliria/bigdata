package com.onysn.chapter04.constructor

/**
 * @author yummy
 * @date 2020/7/22 17:39
 *       构造器的快速入门
 */
object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val person = new Person(19)
    println(person)
  }
}

//创建Person对象的同时初始化对象的age属性值和name属性值

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  println("-------------")

  def this(name: String) {
    //辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
    this("niliria", 19)
    //重新赋值
    this.name = name
  }

  def this(age: Int) {
    this("yummy", 20)
    this.age = age
  }

  //重写了 toString，便于输出对象的信息
  override def toString: String = {
    "name=" + this.name + "\t age=" + this.age
  }
}