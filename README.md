Groovy Spring Batch Template
============================

is a groovy alternative to the [Simple Spring Batch Project](http://static.springsource.org/spring-batch/getting-started.html) 
template available in [STS](http://www.springsource.com/developer/sts).

Features:
---------

* Groovy implementation (instead of Java)
* Gradle build system (instead of Maven)
* Spock specifications (instead of JUnit)
* no IDE dependency (instead of requiring STS - all you're loosing is the package name selection wizard anyway)  

Future directions:
------------------

* full-featured build
	* standalone executable jar (requires merging META-INF/spring.handlers)
	* code quality report
	* test coverage report
	* ...
* get rid of the remaining XML configuration - use Groovy exclusively
* try out [BeanBuilder](http://grails.org/doc/latest/guide/spring.html#14.3 Runtime Spring with the Beans DSL) for configuration
	* watch out for it's awful dependency graph
	* is it worthwhile given [JavaConfig](http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/beans.html#beans-java) works nicely? 
	
	
CI:
-----

check whether the the code works [here](https://robokasofoss.ci.cloudbees.com/job/groovy-spring-batch-template/),
thanks to free [Cloudbees FOSS support](http://www.cloudbees.com/foss).

![Cloudbees](http://web-static-cloudfront.s3.amazonaws.com/images/badges/BuiltOnDEV.png)