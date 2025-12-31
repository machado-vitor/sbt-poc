package core

import util.StringUtils

@main def run(): Unit =
  val text = "Hello from multi-project build"
  println(s"Original: $text")
  println(s"Upper: ${StringUtils.toUpperCase(text)}")
  println(s"Lower: ${StringUtils.toLowerCase(text)}")
  println(s"Reversed: ${StringUtils.reverse(text)}")
  println(s"Word count: ${StringUtils.wordCount(text)}")