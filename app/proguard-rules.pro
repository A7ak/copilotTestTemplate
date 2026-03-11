# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/a7/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.

# Keep our MathUtils from being obfuscated as a test
-keep class com.a7.copilottesttemplate.MathUtils { *; }
