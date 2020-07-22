package com.onysn.chapter03.detail

/**
 * @author yummy
 * @date 2020/7/22 11:17
 *       函数的注意事项和细节讨论
 *       1) 函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
 *       2) 形参列表和返回值列表的数据类型可以是值类型和引用类型
 */
object FunDetails01 {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    val tiger1 = test01(10, tiger)
    println(tiger.name)
    println(tiger1.name)
    println(tiger.hashCode() + ".." + tiger1.hashCode())
  }

  def test01(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "jack"
    tiger
  }
}

class Tiger {
  //只有一个名字的属性
  var name = ""
}