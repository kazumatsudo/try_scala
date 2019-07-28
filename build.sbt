ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "hello"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  )