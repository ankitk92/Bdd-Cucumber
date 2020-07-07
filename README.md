To run tests:
> Run TestRunner.java
> mvn test or mvn clean install

Run tests based on tags:
> Update tags={""} in TestRunner.java
> mvn test -Dcucumber.options="--tags @sum,@multiply"   ------------> OR Separated
> mvn test -Dcucmber.options="--tags @sum --tags @math" ------------> AND Separated

Reports: 
target>reports>index.js


Create new Feature:
Create under - src > test > resources > features

Create new Step Def:
Create under - src\test\java\bdd\cucumber\java 
