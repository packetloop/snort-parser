name := "snort-parser"

version := "1.0"

resolvers ++= Seq(
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "scodec-stream" % "1.0.0-SNAPSHOT"
)
