# compile and create a JAR file
mvn package

# execute
mvn exec:java -Dexec.mainClass="net.haesleinhuepf.clij.executable.MainExecutable" -Dexec.args="argumentABC"

