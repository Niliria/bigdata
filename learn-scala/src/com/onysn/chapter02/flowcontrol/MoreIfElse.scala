package com.onysn.chapter02.flowcontrol

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 21:07
 *       多分支
 *       案例：
 *       岳小鹏参加 scala 考试，他和父亲岳不群达成承诺
 *       如果：
 *       成绩为 100 分时，奖励一辆 BMW；
 *       成绩为(80，99]时，奖励一台 iphone7plus；
 *       当成绩为[60,80]时，奖励一个 iPad；
 *       其它时，什么奖励也没有。
 */
object MoreIfElse {
  def main(args: Array[String]): Unit = {
    println("岳小鹏的成绩是：")
    val sorce = StdIn.readInt()
    if (sorce == 100) {
      println("成绩为100分,奖励一辆 BMW;")
    } else if (sorce >= 80 && sorce <= 99) {
      println("奖励一台 iphone7plus；")
    } else if (sorce >= 60 && sorce < 80) {
      println("奖励一个 iPad；")
    } else {
      println("回家放牛吧~")
    }
  }
}
