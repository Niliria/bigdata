package com.onysn.chapter02.cycle

/**
 * @author yummy
 * @date 2020/7/21 22:40
 *       while循环控制
 *       while(循环条件){
 *       循环体
 *       循环变量迭代
 *       }
 *       1,  循环条件是返回一个布尔值的表达式
 *       2,  while 循环是先判断再执行语句
 *       3,  与 If 语句不同，While 语句本身没有值，即整个 While 语句的结果是 Unit 类型的()
 *       4,  因为 while 中没有返回值,所以当要用该语句来计算并返回结果时,就不可避免的使用变量 ，而
 *       变量需要声明在 while 循环的外部，那么就等同于循环的内部对外部的变量造成了影响，所以不推荐使
 *       用，而是推荐使用 for 循环。
 */
object WhileDemo {
  def main(args: Array[String]): Unit = {
    //使用while输出10遍yummy
    var i = 1
    while (i <= 10) {
      println("yummy" + i)
      i += 1
    }
  }
}
