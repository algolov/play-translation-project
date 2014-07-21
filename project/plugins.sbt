resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.url("Typesafe Ivy Snapshots Repository", url("http://repo.typesafe.com/typesafe/ivy-snapshots"))(Resolver.ivyStylePatterns),
  "jgit-repo" at "http://download.eclipse.org/jgit/maven",
  Resolver.sonatypeRepo("snapshots"))

addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % "2.3.2")
