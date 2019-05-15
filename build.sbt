name := "mars-scala-rtb"

version := "0.1"

scalaVersion := "2.11.8"

scalacOptions in ThisBuild ++= Seq("-feature", "-Xfatal-warnings", "-deprecation", "-unchecked", "-Ywarn-unused-import")


scalacOptions in (Compile, console) := Seq("-feature", "-Xfatal-warnings", "-deprecation", "-unchecked")

licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0"))

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "[version]",
  "com.github.finagle" %% "finch-circe" % "[version]",
  "io.circe" %% "circe-core" % "[version]",
  "io.circe" %% "circe-generic" % "[version]",
  "io.circe" %% "circe-parser" % "[version]",
  "org.scalatest" %% "scalatest" % "[version]" % "test",
  "org.scalacheck" %% "scalacheck" % "[version]" % "test"
)

initialCommands in console := """
                                |rtb.Rtb.server
                              """.trim.stripMargin

cleanupCommands in console := """
                                |rtb.Rtb.server.close()
                              """.trim.stripMargin