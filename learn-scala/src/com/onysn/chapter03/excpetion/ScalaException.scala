package com.onysn.chapter03.excpetion

/**
 * @author yummy
 * @date 2020/7/22 14:30
 *       scala中的异常处理
 */
object ScalaException {
  def main(args: Array[String]): Unit = {
    try {
      val num = 1 / 0
    } catch {
      //1,在Scala中只有一个catch
      //2,在catch中有多个case,每个case可以匹配一个异常,case ex: ArithmeticException
      //3,=>关键符号，表示对异常处理的代码块
      case ex: ArithmeticException => {
        println("捕获到了算术异常")
      }
      case ex: Exception => {
        println("捕获到了异常")
      }
    } finally {
      //最终要执行的代码块
      println("scala-finally__")
    }
    println("继续执行~~")
  }

  def test(): Nothing = {
    throw new ArithmeticException("算术异常...")
  }

  @throws(classOf[NumberFormatException]) //等同于NumberFormatException.class
  def fll()={

  }
}
