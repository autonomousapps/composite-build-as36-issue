This repo reproduces an issue with Android Studio and Gradle's composite build feature. 
Specifically, the "separate composite build" approach discussed at https://docs.gradle.org/current/userguide/composite_builds.html#separate_composite.

# To reproduce:
1. Open `composite/build.gradle` in AS 3.6 RC 1 (and maybe other versions)
2. Attempt to build with the green arrow.

# Expected
Project builds.

# Observed
Project fails to compile with error
> e: /path/to/composite/CompositeConsumer/app/src/main/java/com/example/compositeconsumer/MainActivity.kt: (13, 19): Unresolved reference: hello

# Notes
Even though the project fails to build from AS, the IDE nevertheless offers code completion, as expected.

You can successfully build the project by running, from the command line in the `composite` project, `./gradlew installDebug`.
This builds and installs the app on a device.

You can also successfully build the project, from AS, by un-commenting line 5 in `CompositeConsumer/settings.gradle`.
What this indicates is that, while "separate composite builds" don't seem to work, other composite builds seem to work fine.

These facts lead me to believe this is an Android Studio bug, as opposed to a Gradle bug.
