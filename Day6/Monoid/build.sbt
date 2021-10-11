ThisProject / scalaVersion := "3.1.0-RC2"

lazy val hello = project.in(file("."))
  .settings(
    scalaVersion := "3.1.0-RC2",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.6.1"
  )
