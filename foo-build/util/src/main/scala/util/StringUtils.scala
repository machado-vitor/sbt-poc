package util

object StringUtils:
  def toUpperCase(s: String): String = s.toUpperCase
  def toLowerCase(s: String): String = s.toLowerCase
  def reverse(s: String): String = s.reverse
  def wordCount(s: String): Int = s.split("\\s+").count(_.nonEmpty)