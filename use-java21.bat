REM RUN CMD IN ADMIN MODE THEN GOTO use-java21.bat LOCATION THEN CLICK ON use-java21.bat BELOW COMMANDS WILL EXECUTE
@echo off
REM 📌 Recommendation
REM Keep System JAVA_HOME only.
REM Use /M in your batch files to update system variables.

:: Update System JAVA_HOME (requires admin)
setx JAVA_HOME "C:\Program Files\Java\jdk-21.0.10" /M

:: Update System PATH (prepend Java bin)
setx PATH "C:\Program Files\Java\jdk-21.0.10\bin;%PATH%" /M

echo Switched to Java 21
java -version
