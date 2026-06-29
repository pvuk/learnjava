# 🔄 Switching Between Java Versions
Option 1: Update JAVA_HOME directly
# Linux/macOS:

bash
export JAVA_HOME=/usr/local/java/jdk-25
export PATH=$JAVA_HOME/bin:$PATH
Add to ~/.bashrc or ~/.zshrc.

# Windows:

Edit System Environment Variables → change JAVA_HOME to C:\Java\jdk-25.

Update PATH → %JAVA_HOME%\bin.

# Option 2: Keep both and switch
## Keep both Java 8 and JDK 25 installed.

Write small scripts to toggle:

use-java8.sh → sets JAVA_HOME to Java 8.

use-java25.sh → sets JAVA_HOME to JDK 25.

# ✅ Verification
After switching, run:

bash
java -version
javac -version

REM :: For User variables
REM setx JAVA_HOME "C:\Java\jdk-25.0.1"
REM setx PATH "%JAVA_HOME%\bin;%PATH%"

REM 📌 Recommendation
REM Keep System JAVA_HOME only.
REM Use /M in your batch files to update system variables.