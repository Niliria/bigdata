package com.onysn.chapter03.detail

/**
 * @author yummy
 * @date 2020/7/22 12:02
 *       如果函数存在多个参数，每一个参数都可以设定默认值，那么这个时候，传递的参数到底是覆盖
 *       默认值，还是赋值给没有默认值的参数，就不确定了(默认按照声明顺序[从左到右])。在这种情况下， 可
 *       以采用带名参数
 */
object FunDetails03 {
  def main(args: Array[String]): Unit = {
    //mysqlCon()
    // mysqlCon("127.0.0.1","888")  //从左到右覆盖
    //如果我们希望指定覆盖某个默认值，则使用带名参数即可,比如修改用户名和密码
    mysqlCon(user = "yummy", password = "hadoop")

    f6(p2 = "v2")

  }

  def mysqlCon(add: String = "localhost", port: String = "3306",
               user: String = "root", password: String = "root123") = {
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("password=" + password)
  }

  def f6(p1: String = "yummy", p2: String) {
    println(p1 + p2)
  }

}
