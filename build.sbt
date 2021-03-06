sbtPlugin := true

name := "play-auto-refresh"

organization := "com.jamesward"

scalaVersion := "2.10.6"

scalacOptions ++= Seq("-unchecked", "-deprecation")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

description := "Auto refresh for Play Framework apps"

publishMavenStyle := false

libraryDependencies += "net.databinder" %% "unfiltered-netty-websockets" % "0.8.4"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

enablePlugins(GitVersioning)

git.useGitDescribe := true

bintrayVcsUrl := Some("git@github.com/jamesward/play-auto-refresh.git")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.4" % "provided")
