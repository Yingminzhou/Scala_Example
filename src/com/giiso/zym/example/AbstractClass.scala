package com.giiso.zym.example

class AbstractClass {
  
}

abstract class People{
  def speak
  val name: String
  var age: Int  
}

class Worker extends People{
  def speak{
    println("Hello Everyone!!!")
  }
  
  val name = "Yingmin"
  var age = 22
}

/*
 * 把直接运行的代码放在了App这个trait的子类中，App内部帮助我们实现了main方法并管理了工程师写的代码
 */

object AbstractClass extends App{
  val worker = new Worker
  worker.speak
  println(worker.name+" : "+worker.age)
}