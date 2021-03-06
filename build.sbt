lazy val akkaLog4j = project
  .copy(id = "akka-logj4")
  .in(file("."))
  .enablePlugins(AutomateHeaderPlugin, GitVersioning)

name := "akka-log4j"

libraryDependencies ++= Vector(
  Library.akkaActor,
  Library.log4jApi,
  Library.akkaTestkit % "test",
  Library.log4jCore   % "test",
  Library.scalaCheck  % "test",
  Library.scalaTest   % "test"
)

initialCommands := """|import de.heikoseeberger.akkalog4j._""".stripMargin
