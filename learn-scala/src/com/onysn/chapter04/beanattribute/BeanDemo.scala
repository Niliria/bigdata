package com.onysn.chapter04.beanattribute

import scala.beans.BeanProperty

/**
 * @author yummy
 * @date 2020/7/22 20:04
 */
object BeanDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "保时捷"
    println(car.name)

    //使用 @BeanProperty 自动生成 getXxx 和 setXxx
    car.setName("法拉利")
    println(car.getName)


  }
}

/*
给某个属性加入@BeanPropetry 注解后，会生成 getXXX 和 setXXX 的方法
并且对原来底层自动生成类似 xxx(),xxx_$eq()方法，没有冲突，二者可以共存
 */
class Car {
  @BeanProperty var name: String = _
}