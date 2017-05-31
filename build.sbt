name := "couchbase-streams-wrapper"

organization := "io.outofaxis"

version := "1.0.3-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature", "-language:postfixOps")

libraryDependencies ++= {
  val scalaTestV = "3.0.0"
  val akkaV = "2.4.11"
  Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaV,
    "com.typesafe.play" %% "play-json" % "2.5.9",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
    "com.couchbase.client" % "java-client" % "2.3.4",
    "io.reactivex" % "rxjava-reactive-streams" % "1.0.1",
    "io.reactivex" %% "rxscala" % "0.26.1",
    "com.github.nscala-time" %% "nscala-time" % "2.14.0",
    "org.scalatest" %% "scalatest" % scalaTestV % "test"
  )
}

publishTo := {
  val nexus = "http://taxitube.ge:8081/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "content/repositories/releases")
}

credentials += Credentials("Sonatype Nexus Repository Manager", "taxitube.ge", "admin", "F9bz4Nx3rwul")

