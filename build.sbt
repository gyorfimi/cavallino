organization := "hu.neomit"

name := "cavallino"

version := "1.0-SNAPSHOT"

pdModuleName := "cavallino"

pdModuleDatabaseDeclarationPackageName := "hu.neomit.cavallino.db.mapping"

libraryDependencies ++= Seq(
  "hu.commit" %% "prodigiumintf" % "1.0.3-SNAPSHOT",
  "hu.commit" %% "prodigiumbase" % "1.0.4-SNAPSHOT",
  "hu.commit" %% "prodigium_sc" % "1.0-SNAPSHOT",
  "hu.commit" %% "prodigium_scdb" % "1.0-SNAPSHOT"
)

javacOptions ++= Seq("-encoding", "UTF-8")

