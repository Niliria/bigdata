package com.onysn.chapter02.flowcontrol

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 20:44
 *       双分支
 *       if(条件表达式){
 *       代码块1
 *       }else{
 *       代码块2}
 *
 *       注意事项：1，如果大括号{}内的逻辑代码只有一行，大括号可以省略, 这点和 java 的规定一样。
 *               2，Scala 中任意表达式都是有返回值的，也就意味着 if else 表达式其实是有返回结果的，具体返回
 *       结果的值取决于满足条件的代码体的最后一行内容
 */
object IfAndElseDemo {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age = StdIn.readInt()
    if (age > 18) {
      println("成年了~")
    } else {
      println("未成年~")
    }
  }
}
