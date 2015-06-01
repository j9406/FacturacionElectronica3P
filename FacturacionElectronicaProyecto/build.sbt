name := """FacturacionElectronicaProyecto"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.apache.poi" % "poi" % "3.8",
  "org.apache.poi" % "poi-ooxml" % "3.9"
)


fork in run := true