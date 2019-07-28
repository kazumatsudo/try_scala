ThisBuild / organization := "try_scala"
ThisBuild / scalaVersion := "2.13.0"
ThisBuild / version      := "0.1.0-SNAPSHOT"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  )