package com.giiso.zym.example

class OOPInScala {
  
}

/*
 class Person{
  var name: String = _
  val age = 22
  private[this] val gender = "female"
}
*/

/**
 * 1，主构造器直接跟在类名后面，主构造器中的参数会被编译成类的字段；
	 2，主构造器执行的时候会执行类中的所有不包含在方法体中的语句；
	 3，如果在 主构造器函数的参数中没有用val或者var去声明变量，那此时的变量是private[this]级别的，只能够被类内部访问；
 */

/*
class Person(val name : String, val age : Int){
    println("This is the primary constructor! ")
}
*/


class Person(val name : String, val age : Int){
    println("This is the primary constructor! ")
    var gender: String = _
    /*
     1，附属构造器是用this来声明的；
     2，附属构造器中必须调用主构造或者其它附属构造器；
     */
    def this(name : String, age: Int, gender : String){
      this( name, age)
      this.gender = gender
    }
    
    val University = "Csu"
}


class Student(name: String, age: Int, val major : String) extends Person (name,age){
  println("this is the subclass of Person, major is: " + major);
  
  override def toString = "Overrided toString method..."
  override val University = "Tsinghua"
  
}


object OOPInScala
{
  def main(args: Array[String]){
    
    // val p = new Person
    // p.name = "Yingmin"
    // println(p.name+" : " + p.age + " : " + p.gender);
    // val p = new Person("Yingmin",22,"female")
    //println(p.name+" : " + p.gender);
    val s = new Student("Yingmin",22,"Computer Science");
    println(s.toString)
    println(s.University)
    
  }
}