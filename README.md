# Scift [![](https://jitpack.io/v/Nova-Committee/Scift.svg)](https://jitpack.io/#Nova-Committee/Scift)

##### Scala runtime libraries for Rift

Scift provides the runtime and libraries required for creating Rift mods in Scala. For usage, append the following to
your Gradle build script:

```groovy
plugins {
    id 'scala' version '2.12.7'
}

repositories {
    maven { url = 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.Nova-Committee:Scift:1.0.0'
}
```