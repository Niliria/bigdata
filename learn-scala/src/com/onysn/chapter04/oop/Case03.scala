package com.onysn.chapter04.oop

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/22 16:21
 *       练习：盒子案例
 */
object Case03 {
  def main(args: Array[String]): Unit = {
    val box = new Box
    println("请输入盒子的宽度")
    val d1 = StdIn.readDouble()
    println("请输入盒子的高度")
    val d2 = StdIn.readDouble()
    println("请输入盒子的长度")
    val d3 = StdIn.readDouble()
    box.wide = d1
    box.length = d3
    box.high = d2
    val volumn = box.getVolumn().formatted("%.2f")
    print(volumn)
  }
}

class Box {
  //长
  var length: Double = _
  //宽
  var wide: Double = _
  //高
  var high: Double = _

  def getVolumn(): Double = {
    this.length * this.wide * this.wide
  }
}