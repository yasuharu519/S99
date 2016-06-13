name := """S99"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

// build.sbt

// scoverage
instrumentSettings

org.scoverage.coveralls.CoverallsPlugin.coverallsSettings

// この設定をしないと、結果レポートのhtmlのハイライトがおかしくなる
ScoverageKeys.highlighting := true
