package com.onysn.chapter04.oop

/**
 * @author yummy
 * @date 2020/7/22 15:07
 *       scala 面向对象编程入门程序
 */
object CatDemo {
  def main(args: Array[String]): Unit = {
    //创建出一只小猫
    val cat = new Cat

    //给猫咪的属性赋值
    //1，cat.name = "小白" 不是直接访问属性，而是cat.name_$eq("小白")
    cat.name = "小白"
    cat.age = 2
    cat.color = "粉色"
    printf("猫咪的信息如下：\n姓名:%s 年龄:%d 颜色:%s", cat.name, cat.age, cat.color)
  }

}

//定义一个类 Cat
//一个 class Cat 对应的字节码文件只有一个 Cat.class ,默认是 public
class Cat {
  //定义/声明三个属性
  //1. 当我们声明了 var name :String 时, 在底层对应 private name
  //2.同时会生成 两个public方法name() <=类似=> getter public name_$eq() => setter

  var name = "" //表示给一个默认值可以用 ”“, 也可以使用下划线_默认值为null
  var age: Int = _ //表示给age一个默认值，属性必须要指定类型，如果是Int类型默认值为0
  var color: String = _
}