Groovy Spring Batch Template
============================

is a groovy alternative to the [Simple Spring Batch Project](http://static.springsource.org/spring-batch/getting-started.html) 
template available in [STS](http://www.springsource.com/developer/sts).

Features:
---------

* Groovy implementation (instead of Java)
* Gradle build system (instead of Maven)
* Spock specifications (instead of JUnit)
* IDE agnostic (instead of requiring STS - you're only loosing is the initial package name selection wizard)  
* ready to roll - try launching your job from command line (`gradle run`), then package for distribution (`gradle distZip`)

Future directions:
------------------

* full-featured build
	* code quality report
	* test coverage report
	* docs
	* ...
* get rid of the remaining XML configuration - use Groovy exclusively
* try out [BeanBuilder](http://grails.org/doc/latest/guide/spring.html#14.3 Runtime Spring with the Beans DSL) for configuration
	* watch out for it's awful dependency graph
	* is it worthwhile given [JavaConfig](http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/beans.html#beans-java) works nicely? 
* GORM example
	
	
CI:
-----

check whether the the code works [here](https://robokasofoss.ci.cloudbees.com/job/groovy-spring-batch-template/)

License:
--------

Apache 2.0, i.e. same as [Spring Batch License](http://static.springsource.org/spring-batch/license.html)


Credits:
--------
[<img src="http://web-static-cloudfront.s3.amazonaws.com/images/badges/BuiltOnDEV.png" alt="Cloudbees"/>](http://www.cloudbees.com/foss)