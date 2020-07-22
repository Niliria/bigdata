package com.onysn.chapter04.oop

/**
 * @author yummy
 * @date 2020/7/22 15:58
 *       练习
 */
object Case01 {
  def main(args: Array[String]): Unit = {
    //需求一：编写类(MethodExec),编程一个方法，方法不需要参数，在方法中打印一个10*8的矩形，在main中调用
    val exec = new MethodExec
    exec.rectangular108()

    //需求二：修改上个程序，编写一个方法，方法不需要参数，计算该矩形的面积，并将其作为返回值，结果保留小数点后两位
     exec.len=10.4
     exec.width=12.2
     print(exec.area())

  }

}

class MethodExec {

  var len = 0.0
  var width = 0.0

  //需求一
  def rectangular108() = {
    for (i <- 0 until 10) {
      for (j <- 0 until 8) {
        print("*")
      }
      print("\n")
    }
  }

  //需求二
  def area(): Double = {
    (this.len * this.width).formatted("%2f").toDouble
  }
}