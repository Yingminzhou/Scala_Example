package com.giiso.zym.example

class UsageOfApply {
  
}

class ApplyTest{
  def apply() = "This apply is in China"
  def test{
    println("test")
  }
}

object ApplyTest{
  var count = 0
  def apply() = new ApplyTest
  def static{
    println("I am a static method!!!")
  }
  def incr = {
    count = count + 1
  }
}

object UsageOfApply extends App{
  //ApplyTest.static
  /*
   * val a = ApplyTest()的使用会导致apply方法的调用并返回该方法调用的值，也就是ApplyTest的实例化对象
   */
  //val a = ApplyTest()
  //a.test
  //val a = new ApplyTest
  //println(a())
  
  for(i <- 1 to 10){
    ApplyTest.incr
  }
  println(ApplyTest.count)
}