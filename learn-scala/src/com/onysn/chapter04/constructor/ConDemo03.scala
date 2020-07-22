package com.onysn.chapter04.constructor

/**
 * @author yummy
 * @date 2020/7/22 19:48
 *       构造器的参数
 *       1) Scala 类的主构造器的形参未用任何修饰符修饰，那么这个参数是局部变量。
 *       2) 如果参数使用 val 关键字声明，那么 Scala 会将参数作为类的私有的只读属性使用
 *       3) 如果参数使用 var 关键字声明，那么那么 Scala 会将参数作为类的成员属性使用,并会提供属性
 *       对应的 xxx()[类似 getter]/xxx_$eq()[类似 setter]方法，即这时的成员属性是私有的，但是可读写。
 */
object ComDemo03 {
  def main(args: Array[String]): Unit = {
    val worker1 = new Worker("yummy")
    //worker.name //不能访问inName

    val worker2 = new Worker2("yummy")
    //worker2.inName //可以访问

    val worker3 = new Worker3("yummy")
    worker3.inName = "Niliria"
    println(worker3.inName)
  }
}

//如果主构造器是Woeker(inName:String) 那inName是一个局部变量
class Worker(inName: String) {
  var name: String = inName
}

//如果主构造器是Worker2(val inName: String) 那么inName就是worker2的一个private的只读属性
class Worker2(val inName: String) {
  var name: String = inName
}

//如果构造器是Worker3(var inName:String) 那么inName就是Worker3的一个private的可读可写属性
class Worker3(var inName: String) {
  var name: String = inName
}