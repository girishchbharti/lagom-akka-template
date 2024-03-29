resolvers += Resolver.sonatypeRepo("public")

// IDE integration plugins
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.12")

// The Lagom plugin
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.5.1")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

// Static code analysis tools
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

//Conductr
//addSbtPlugin("com.lightbend.conductr" % "sbt-conductr" % "2.7.2")
