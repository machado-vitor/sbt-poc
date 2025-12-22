ThisBuild / scalaVersion := "3.7.3"
ThisBuild / organization := "com.example"

lazy val author = settingKey[String]("Project author name") // settingKey[T], evaluated one at load, used for fixed values.
lazy val greet = taskKey[Unit]("Prints a greeting with project info") // taskKey[T], re-evaluated each call. for side effects, dynamic values
lazy val buildTime = taskKey[String]("Returns current build timestamp") // inputKey[T], task with CLI arguments.

lazy val hello = project
  .in(file("."))
  .settings(
    name := "Hello",
    author := "Vitor",
    greet := { // greet depends on both author, buildTime and other tasks
      val n = name.value
      val v = version.value
      val a = author.value
      val t = buildTime.value
      println(s"$n v$v by $a - built at $t")
    },
    buildTime := { // buildTime has a timestamp that changes on each run
      java.time.LocalDateTime.now().toString
    },
    libraryDependencies ++= Seq(
      // %% makes sbt pick the artifact for the current scalaVersion
      // % Test scopes the dependency to tests only, so it's not on the main classpath.
      "org.scala-lang" %% "toolkit" % "0.7.0", // core toolkit, it brings Filesystem I/O, JSON parsing/serialization, HTTP client and others..
      "org.scala-lang" %% "toolkit-test" % "0.7.0" % Test, // test only, adds lightweight test framework and helpers.
    )
  )