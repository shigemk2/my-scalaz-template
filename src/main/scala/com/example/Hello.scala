package com.example

import scalaz._
import std.option._, std.list._
import std.list._
import syntax.bind._

object Hello {
  def main(args: Array[String]): Unit = {
    println(Apply[Option].apply2(some(1), some(2))((a, b) => a + b))
    println(Traverse[List].traverse(List(1, 2, 3))(i => some(i)))
    println(List(List(1)).join)
    println(List(true, false).ifM(List(0, 1), List(2, 3)))
    println(List(true, true).ifM(List(0, 1), List(2, 3)))
    println("Hello, world!")
  }
}
