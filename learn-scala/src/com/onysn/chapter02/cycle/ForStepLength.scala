package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:24
 *       for循环控制步长
 */
object ForStepLength {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i)
    }
    //控制步长为2
    //def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    println("===============")
    for (i <- Range(1, 10, 2)) {
      println("i=" + i)
    }


    println("===============")
    //控制步长的第二种方法 使用循环守卫
    for (i <- 1 to 10 if i % 2 ==1){
      println("i=" + i)
    }

  }
}
