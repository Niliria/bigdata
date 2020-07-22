package com.onysn.chapter04.oop

/**
 * @author yummy
 * @date 2020/7/22 15:40
 *       1) 如果我们不希望改变对象的引用(即：内存地址), 应该声明为 val 性质的，否则声明为 var, scala
 *       设计者推荐使用 val ,因为一般来说，在程序中，我们只是改变对象属性的值，而不是改变对象的引用
 *       2) scala 在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，但当类
 *       型和后面 new 对象类型有继承关系即多态时，就必须写了
 */
object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp = new Emp //emp类型就是Emp

    val emp1: Person = new Emp //如果我们希望将子类对象，交给父类的引用，这时就需要写上类型
  }
}

class Person {}

class Emp extends Person {}
