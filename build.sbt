organization := "th.pt"
name := "demockrazy"
version := "1.0.1"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.7"
  , "org.scala-lang" % "scala-reflect" % scalaVersion.value
  , "com.github.javafaker" % "javafaker" % "0.13"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

crossScalaVersions := Seq("2.11.8", "2.12.1")

publishTo := Some("Artifactory Realm" at "https://artifact.billme.in.th/artifactory/billme-public")

credentials += Credentials("Artifactory Realm", "artifact.billme.in.th", "admin", "")
