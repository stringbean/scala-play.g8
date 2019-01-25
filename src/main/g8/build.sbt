name := "$name$"
organization := "$organization$"

scalaVersion := "$scalaVersion$"

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  "org.scalatest"           %% "scalatest"            % "$scalatestVersion$"   % Test,
  "org.scalatestplus.play"  %% "scalatestplus-play"   % "$scalatestPlayVersion$"   % Test,
)
