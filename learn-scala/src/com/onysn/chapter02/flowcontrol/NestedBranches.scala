package com.onysn.chapter02.flowcontrol

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 21:23
 *       嵌套循环 嵌套分支不要超过3层
 */
object NestedBranches {
  def main(args: Array[String]): Unit = {
    //案例：参加百米运动会，如果用时 8 秒以内进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组。
    println("请输入您的成绩：")
    val socre = StdIn.readDouble()
    if (socre != null && socre < 8.0) {
      println("请输入性别：")
      val sex = StdIn.readLine()
      if (sex == "男") {
        println("请进入男子组")
      } else {
        println("请进入女子组")
      }
    } else {
      println("很遗憾未能进入决赛")
    }
    /*
    案例 出票系统：根据淡旺季的月份和年龄，
    4_10 旺季：
        成人（18-60）：60
        儿童（<18）:半价
        老人（>60）:1/3
    淡季：
        成人：40
        其他：20
    */
    println("请选择月份")
    val month = StdIn.readInt()
    println("请输入您的年龄")
    val age = StdIn.readInt()
    val ticket = 60

    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        println("票价" + ticket + "元")
      } else if (age < 18) {
        println("票价" + ticket / 2 + "元")
      } else {
        println("票价" + ticket / 3 + "元")
      }
    } else {
      if (age >= 18 && age <= 60) {
        println("票价" + 40 + "元")
      } else {
        println("票价为" + 20 + "元")
      }
    }
  }
}
