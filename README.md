[![Build Status](https://travis-ci.org/robokaso/Groovy-Spring-Batch-Template.png)](https://travis-ci.org/robokaso/Groovy-Spring-Batch-Template)

Groovy Spring Batch Template
============================

is a groovy alternative to the [Simple Spring Batch Project](http://static.springsource.org/spring-batch/getting-started.html) 
template shipped with [STS](http://www.springsource.com/developer/sts).

	
What's the difference?
------------------

<table>
<th></th><th>Groovy Spring Batch Template</th> <th>STS Simple Spring Batch Project</th>
<tr> <td>Language</td>			<td>Groovy</td> 	<td>Java</td> 	</tr>
<tr> <td>Build system</td>		<td>Gradle</td>		<td>Maven</td> 	</tr>
<tr> <td>Test framework</td>	<td>Spock</td>		<td>JUnit</td> 	</tr>
<tr> <td>Logging </td>			<td>SLF4J + Logback</td>		<td>Commons Logging + Log4j</td>	</tr>
<tr> <td>Default database</td>	<td>H2</td>			<td>HSQLDB</td>	</tr>
</tr>
</table>


Installation & Usage
--------------------

	git clone git://github.com/robokaso/Groovy-Spring-Batch-Template.git gsbt; cd gsbt
	./gradlew run 		# execute the sample job
	./gradlew check 	# run the tests and generate reports
	./gradlew distZip 	# package the project for distribution 
	
STS users can conveniently import the project into workspace via `File -> Import -> Gradle Project` (you'll need to have the Gradle plugin installed).
Others can resort to gradle support for [Eclipse](http://gradle.org/docs/current/userguide/eclipse_plugin.html) or [Idea](http://gradle.org/docs/current/userguide/idea_plugin.html).


License
--------

Apache 2.0, i.e. same as [Spring Batch License](http://static.springsource.org/spring-batch/license.html)
