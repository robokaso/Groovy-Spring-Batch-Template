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
<tr> <td>Logging facade</td>	<td>SLF4J</td>		<td>Commons Logging</td>	</tr>
</tr>
</table>


Installation & Usage
--------------------

	git clone git://github.com/robokaso/Groovy-Spring-Batch-Template.git gsbt; cd gsbt
	./gradlew run 		# executes the sample job
	./gradlew distZip 	# packages the project for distribution 
	./gradlew cobertura	check 	# runs the tests and generates code quality and test coverage reports
	
STS users can conveniently import the project into workspace via `File -> Import -> Gradle Project` (you'll need to have the Gradle plugin installed).
Others can resort to gradle support for [Eclipse](http://gradle.org/docs/current/userguide/eclipse_plugin.html) or [Idea](http://gradle.org/docs/current/userguide/idea_plugin.html).

CI
----

check whether the the code works [here](https://robokasofoss.ci.cloudbees.com/job/groovy-spring-batch-template/)


Future directions
-----------------

* get rid of the remaining XML configuration - use Groovy exclusively
* try out [BeanBuilder](http://grails.org/doc/latest/guide/spring.html#14.3 Runtime Spring with the Beans DSL) for configuration
	* watch out for it's awful dependency graph
	* is it worthwhile given [JavaConfig](http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/beans.html#beans-java) works nicely? 
* GORM example
	
	

License
--------

Apache 2.0, i.e. same as [Spring Batch License](http://static.springsource.org/spring-batch/license.html)


Credits
-------
[<img src="http://web-static-cloudfront.s3.amazonaws.com/images/badges/BuiltOnDEV.png" alt="Cloudbees"/>](http://www.cloudbees.com/foss)