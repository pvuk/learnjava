@echo off
REM :: For User variables
REM setx JAVA_HOME "C:\Java\jdk-25.0.1"
REM setx PATH "%JAVA_HOME%\bin;%PATH%"

REM 📌 Recommendation
REM Keep System JAVA_HOME only.
REM Use /M in your batch files to update system variables.

@echo off
:: Update System JAVA_HOME (requires admin)
setx JAVA_HOME "C:\Java\jdk-25.0.1" /M

:: Update System PATH (prepend Java bin)
setx PATH "C:\Java\jdk-25.0.1\bin;%PATH%" /M

echo Switched to JDK 25
java -version
