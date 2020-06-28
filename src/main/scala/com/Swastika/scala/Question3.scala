package com.Swastika.scala

object Question3 extends App {
  //def func(n:Int, a:List[Int]): List[Int] = a.flatMap(i => List.fill(n)(i))

  def func(n:Int, a:List[Int]): List[Int] = a.flatMap(List.fill(n)(_))
}
