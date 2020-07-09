package com.onysn.chapter01.operation

/**
 * @author yummy
 * @date 2020/7/1 17:42
 *       1) 假如还有 97 天放假，问：xx 个星期零 xx 天
 *       2) 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),请求出华氏度，测试232.5
 */
object Case01 {
  def main(args: Array[String]): Unit = {
    //第一题
    val days = 97
    println(days / 7 + "个星期" + "零" + days % 7 + "天")

    //第二题
    val fahreneit = 232.5
    val cc = 5.0 / 9 * (fahreneit - 100)
    println(cc.formatted("%.2f"))
  }
}
