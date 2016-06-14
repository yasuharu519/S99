// project/plugins.sbt
// resolvers += Classpaths.sbtPluginReleases

// sbtでScoverage使えるようにするプラグイン
addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.3.5")

// Scoverageの結果をCOVERALLSに送信するプラグイン
addSbtPlugin("org.scoverage" %% "sbt-coveralls" % "1.1.0")
