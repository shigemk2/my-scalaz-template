package com.example

import scalaz._
import std.option._, std.list._

object Hello {
  def main(args: Array[String]): Unit = {
    println(Apply[Option].apply2(some(1), some(2))((a, b) => a + b))
    println("Hello, world!")
  }
}
