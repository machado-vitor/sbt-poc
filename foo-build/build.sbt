ThisBuild / scalaVersion := "3.7.3"
ThisBuild / organization := "com.example"

lazy val hello = project
  .in(file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scala-lang" %% "toolkit-test" % "0.7.0" % Test
  )