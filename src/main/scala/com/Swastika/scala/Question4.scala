package com.Swastika.scala

object Question4 {
  def func(n:Int, a:List[Int]): List[Int] = for(i <- a if i<n) yield i

}
