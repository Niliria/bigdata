package com.onysn.chapter04.oop

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

/**
 * @author yummy
 * @date 2020/7/22 16:52
 *      景区门票案例
 */
object Case04 {
  def main(args: Array[String]): Unit = {
    var flag = true

    breakable {
      while (flag) {
        print("请输入姓名:")
        val name = StdIn.readLine()
        if (name == "n") {
          flag = false
          println("退出程序")
          break()
        }
        print("请输入年龄:")
        val age = StdIn.readInt()
        val p = new Person02
        p.name = name
        p.age = age
        if (age > 18) {
          println(name + "的年龄为" + age + ",门票价格为20元\n")
          flag = true
        } else {
          println(name + "的年龄为" + age + ",门票价格为0元\n")
        }
      }
    }
  }
}

class Person02 {
  var name: String = _
  var age: Int = _
}