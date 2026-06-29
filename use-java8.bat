@echo off
REM 📌 Recommendation
REM Keep System JAVA_HOME only.
REM Use /M in your batch files to update system variables.

:: Update System JAVA_HOME (requires admin)
setx JAVA_HOME "C:\Program Files\Java\jdk1.8.0_221" /M

:: Update System PATH (prepend Java bin)
setx PATH "C:\Program Files\Java\jdk1.8.0_221\bin;%PATH%" /M

echo Switched to Java 8
java -version
