name := """my-scalaz-template"""

version := "1.0"

scalaVersion := "2.12.0"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.8",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

