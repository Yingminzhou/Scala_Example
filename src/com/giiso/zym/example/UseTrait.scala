package com.giiso.zym.example

/*
 * trait类似于Java 8中可以带default method的接口。
 * trait中可以带有实现的方法，也可以带有抽象方法，使用trait的方式是with而混入类中。
 */

class UseTrait {
  
}

trait Logger{
  def log(msg:String){
    println("log: "+msg)
  }
}

class ConcreteLogger extends Logger{
  def concreteLog{
    log("It's me!")
  }
}

trait FLogger{
  def log(msg:String){
    println("Log content is:"+ msg)
  }
}

trait MessageLogger extends FLogger{
  override def log(msg:String){
    println("Log message is:"+ msg)
  }
}

abstract class Account{
  def save
}

class MyAccount extends Account with FLogger{
  def save{
    log("10000")
  }
}

object UseTrait extends App{
  
  //val logger = new ConcreteLogger
  //logger.concreteLog
  //val acc = new MyAccount 
  //acc.save
  val acc = new MyAccount with MessageLogger
  acc.save
}