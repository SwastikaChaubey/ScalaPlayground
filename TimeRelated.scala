package com.swastika
import java.util.{Calendar}

object TimeRelated extends App {

  print("Enter hours ")
  var hr = scala.io.StdIn.readInt()
  print("Enter minutes ")
  var min = scala.io.StdIn.readInt()
  val hour = Calendar.getInstance()
  val currentHour = hour.get(Calendar.HOUR_OF_DAY)
  val minute = Calendar.getInstance()
  val currentMinute = minute.get(Calendar.MINUTE)
  println(calculation(min, hr, currentHour, currentMinute))


  def calculation (min:Int, hr:Int, currentHour:Int, currentMinute:Int) : Any = {
    if(currentHour < hr)
     "Today"
    else if(currentHour > hr)
      "Tomorrow"
    else if(currentHour == hr) {
      if (currentMinute < min)
        "Today"
      else
        "Tomorrow"
    }
  }
}
