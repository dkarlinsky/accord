name := "accord"

libraryDependencies <+= scalaVersion( "org.scala-lang" % "scala-reflect" % _ % "provided" )

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0" % "test"

autoCompilerPlugins := true

resolvers += Resolver.sonatypeRepo( "snapshots" )

addCompilerPlugin( "org.scala-lang.plugins" % "macro-paradise" % "2.0.0-SNAPSHOT" cross CrossVersion.full )

description := "Accord is a validation library written in and for Scala. Its chief aim is to provide a composable, " +
               "dead-simple and self-contained story for defining validation rules and executing them on object " +
               "instances. Feedback, bug reports and improvements are welcome!"

