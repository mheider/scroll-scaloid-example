import android.Keys._

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

android.Plugin.androidBuild

name := "hello-scaloid-sbt"

scalaVersion := "2.11.6"

proguardCache in Android ++= Seq(
  ProguardCache("org.scaloid") % "org.scaloid"
)

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-keepattributes Signature", "-printseeds target/seeds.txt", "-printusage target/usage.txt"
  , "-dontwarn scala.collection.**" // required from Scala 2.11.4
  , "-dontwarn org.scaloid.**" // this can be omitted if current Android Build target is android-16
)

libraryDependencies ++= Seq( "org.scaloid" %% "scaloid" % "4.0-RC1",
                            "com.github.max-leuthaeuser" %% "scroll" % "0.4")

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android

retrolambdaEnable in Android := false
