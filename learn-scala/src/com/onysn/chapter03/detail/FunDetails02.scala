package com.onysn.chapter03.detail

/**
 * @author yummy
 * @date 2020/7/22 11:25
 *       函数的注意事项
 */
object FunDetails02 {
  def main(args: Array[String]): Unit = {
    var res = getSum4(4, 5)
    println(res) //返回值()

    var res2 = getSum5(4, 1)
    println(res2) //返回值()

    var res3 = f7("string") //yummyok
    println(res3)

    println(sayOk("yummy"))


  }

  //Scala 中的函数可以根据函数体最后一行代码自行推断函数返回值类型
  def getSum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  //因为 Scala 可以自行推断，所以在省略 return 关键字的场合，返回值类型也可以省略
  def getSum2(n1: Int, n2: Int) = {
    n1 + n2
  }

  //如果函数明确使用 return 关键字，那么函数返回就不能使用自行推断了,这时要明确写成 : 返回类型 = {}
  def getSum3(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //如果返回值这里什么什么都没有写，即表示该函数没有返回值
  //这时 return 无效,返回值为() .
  def getSum4(n1: Int, n2: Int) {
    return n1 + n2
  }

  //如果函数明确声明无返回值（声明 Unit），那么函数体中即使使用 return 关键字也不会有返回值
  def getSum5(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }

  //如果明确函数无返回值或不确定返回值类型，那么返回值类型可以省略(或声明为 Any)
  def f6(s1: String) = {
    if (s1.length > 3) {
      s1 + "123"
    } else {
      3
    }
  }

  def f7(s1: String): Any = {
    if (s1.length > 3) {
      s1 + "123"
    } else {
      3
    }
  }

  // Scala 函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实参，则会使用默认值。
  // 如果指定了实参，则实参会覆盖默认值。
  def sayOk(name: String = "jack"): String = {
    return name + "ok!"
  }

}
