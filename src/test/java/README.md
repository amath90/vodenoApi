## Requirements
* JDK 8(JAVA_HOME variable configured, bin folder in PATH variable)
* maven (tested with version 4.0.0) (mvn/bin folder in PATH system variable)
* git client

## Running tests
To run test go to location of project pom.xml file and run proper maven command, see below:

* 'mvn test' - will run all tests
* 'mvn test -Dtest=IdMaxValueTest' - will run IdMaxValueTest, to run another test specify desired test by test=desiredTest
