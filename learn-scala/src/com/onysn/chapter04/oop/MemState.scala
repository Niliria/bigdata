package com.onysn.chapter04.oop

/**
 * @author yummy
 * @date 2020/7/22 15:47
 */
object MemState {
  def main(args: Array[String]): Unit = {

    val p1 = new Person4
    p1.name = "张三"
    p1.age = 18
    val p2 = p1
    println(p2 == p1)
    p1.name = "tom"
    println("p2.name=" + p2.name)
  }
}

class Person4 {
  var name = ""
  var age: Int = _ //如果是_给到的默认值就必须指定类型
}
