ThisBuild / scalaVersion := "3.7.3"
ThisBuild / organization := "com.example"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .aggregate(util, core)
  .settings(
    name := "foo-build"
  )

lazy val util = project
  .settings(
    name := "util",
    libraryDependencies ++= Seq(
      "org.scala-lang" %% "toolkit-test" % "0.7.0" % Test
    )
  )

lazy val core = project
  .dependsOn(util)
  .settings(
    name := "core",
    libraryDependencies ++= Seq(
      "org.scala-lang" %% "toolkit" % "0.7.0",
      "org.scala-lang" %% "toolkit-test" % "0.7.0" % Test
    )
  )
