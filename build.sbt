lazy val root = (project in file("."))
  .settings(
    name := "Hello",
    organization := "try_scala",
    scalaVersion := "2.13.0",
    version := "0.1.0-SNAPSHOT",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xlint",
      "-Xfatal-warnings",
      "-Ywarn-dead-code",
      "-Ywarn-numeric-widen",
      "-Ywarn-unused",
      "-Ywarn-value-discard"),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
