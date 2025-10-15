ThisBuild / scalaVersion := "3.7.3"
ThisBuild / organization := "com.example"

lazy val hello = project
  .in(file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(
      // %% makes sbt pick the artifact for the current scalaVersion
      // % Test scopes the dependency to tests only, so it's not on the main classpath.
      "org.scala-lang" %% "toolkit" % "0.7.0", // core toolkit, it brings Filesystem I/O, JSON parsing/serialization, HTTP client and others..
      "org.scala-lang" %% "toolkit-test" % "0.7.0" % Test, // test only, adds lightweight test framework and helpers.
    )
  )