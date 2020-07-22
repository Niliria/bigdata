package com.onysn.chapter02.cycle

import scala.io.StdIn

/**
 * @author yummy
 * @date 2020/7/21 22:55
 *       多重循环控制
 *       1，将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for ,while ,do…while 均可以作为
 *       外层循环和内层循环。【建议一般使用两层，最多不要超过 3 层】
 *       2，实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为 false
 *       时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环。
 *       3， 设外层循环次数为 m 次，内层为 n 次， 则内层循环体实际上需要执行 m*n=mn 次。
 */
object Case03 {
  def main(args: Array[String]): Unit = {
    //案例：统计三个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
    //统计三个班及格人数，每个班有 5 名同学
    //班级平均分
    var classScore = 0.0
    //所有班级的总分
    var totalScore = 0.0
    //及格人数
    var passNum = 0

    for (i <- 1 to 3) {
      classScore = 0.0
      passNum = 0
      for (j <- 1 to 5) {
        println("请输入第" + i + "个班下，第" + j + "个学生成绩：")
        val score = StdIn.readInt()
        if (score >= 60) passNum += 1
        classScore += score
      }
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / 5)
      printf("第%d班级的及格人数为%d\n", i, passNum)
    }
    printf("所有班级的平均分为%.2f", totalScore / (5 * 3))
  }
}
