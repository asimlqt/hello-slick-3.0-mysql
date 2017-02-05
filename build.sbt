name := """hello-slick-3.0"""

mainClass in Compile := Some("HelloSlick")

scalaVersion := "2.11.6"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.0.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "mysql" % "mysql-connector-java" % "5.1.34",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)


fork in run := true