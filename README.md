# Awesome Java

A curated list of awesome Java frameworks, libraries and software. Inspired by [awesome-python](https://github.com/vinta/awesome-python). Topics which have no libraries as of yet are located in README.tmp!

- [Awesome Java](#awesome-java)
    - [Application Server](#application-server)
    - [Build Tool](#build-tool)
    - [Code Analysis](#code-analysis)
    - [Compiler-compiler](#compiler-compiler)
    - [Continuous Integration](#continuous-integration)
    - [Database Access](#database-access)
    - [Date and Time](#date-and-time)
    - [Dependency Injection](#dependency-injection)
    - [Development Tools](#development-tools)
    - [Distributed Applications](#distributed-applications)
    - [GUI](#gui)
    - [Game Development](#game-development)
    - [High Performance](#high-performance)
    - [IDE](#ide)
    - [JSON](#json)
    - [Logging](#logging)
    - [Machine Learning](#machine-learning)
    - [MapReduce](#mapreduce)
    - [Messaging](#messaging)
    - [Miscellaneous](#miscellaneous)
    - [Natural Language Processing](#natural-language-processing)
    - [ORM](#orm)
    - [Permissions](#permissions)
    - [Template Engine](#template-engine)
    - [Testing](#testing)
    - [Utility](#utility)
    - [Web Crawling](#web-crawling)
    - [Web Frameworks](#web-frameworks)
    - [REST Frameworks](#rest-frameworks)
- [Resources](#resources)
    - [Twitter](#twitter)
    - [Websites](#websites)
    - [Communities](#communities)
    - [Influental Books](#influental-books)
- [Contributing](#contributing)

## Application Server

*Servers which are specifically used to deploy applications*

* [GlassFish](https://glassfish.java.net/) - Open source reference implementation for Java EE sponsored by Oracle
* [WildFly](http://www.wildfly.org/) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support
* [Jetty](http://www.eclipse.org/jetty/) - Lightweight, small server often embedded in projects. Part of the Eclipse Foundation
* [Apache Tomcat](http://tomcat.apache.org/) - Robust allround server for Servlet and JSP

## Build Tool

*Tools which handle the buildcycle of an application*

* [Apache Ant](http://ant.apache.org/) - Procedural build configurations via XML files
* [Apache Maven](http://maven.apache.org/) - Declarative lifecycle and dependency managment which favors conventions
* [Gradle](http://www.gradle.org/) - Incremental builds which are programmed via Groovy 

## Code Analysis

*Tools that provide metrics and quality measurements of static code*

* [SonarQube](http://www.sonarqube.org/) - Inspection tool for code quality
* [FindBugs](http://findbugs.sourceforge.net/) - Static analysis to find potential bugs

## Compiler-compiler

*Tools that create parsers, interpreters or compilers*

* [ANTLR](http://www.antlr.org/)
* [JavaCC](https://javacc.java.net/)

## Continuous Integration

*Tools which support continuously building, testing and releasing applications*

* [Jenkins](http://jenkins-ci.org/) - Provides server-based CI services, often seen as the successor to Hudson

## Database Access

*Everything which simplifies the access to the database*

* [DBeaver](http://dbeaver.jkiss.org/) - Graphical database manager
* [JDBI](http://jdbi.org/) - Simplification of JDBC
* [jOOQ](http://www.jooq.org/) - Generates typesafe code based on SQL schema
* [Spring JDBCTemplate](http://www.spring.io/) - Simplification of JDBC

## Date and Time

*Libraries related to date and time.*

* [Java 8 SE: Date and Time API](http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html) - Basically it incorporates Joda-Time
* [Joda-Time](http://joda-time.sourceforge.net/) - De facto standard date/time-library before Java 8

## Dependency Injection

*Libraries that help to realize the [Inversion Of Control](http://en.wikipedia.org/wiki/Inversion_of_control) paradigm*

* [Dagger](http://square.github.io/dagger/)
* [Google Guice](http://de.wikipedia.org/wiki/Google_Guice)
* [Spring](http://spring.io/)
* [Weld](http://docs.jboss.org/weld/reference/latest/en-US/html_single/) - CDI reference implementation

## Development Tools

* [DCEVM](http://ssw.jku.at/dcevm/) - A modification of the JVM that allows unlimited redefinition of loaded classes at runtime
* [JRebel](http://zeroturnaround.com/software/jrebel/) - Instantly reloads code and configuration changes without redeploys

## Distributed Applications
*Libraries and frameworks used to ease writing distributed and fault-tolerant applications*

* [Akka](http://akka.io) - Toolkit and runtime for building highly concurrent, distributed, and fault tolerant event-driven applications on the JVM.
* [JGroups](http://www.jgroups.org/) - Toolkit for reliable messaging and creating clusters whose nodes can send messages to each other

## GUI

*Libraries to create modern graphical user interfaces*

* [JavaFX](http://www.oracle.com/technetwork/java/javase/overview/javafx-overview-2158620.html)

## Game Development

*Frameworks that support the development of games*

* [LWJGL](http://lwjgl.org/)
* [libGDX](http://libgdx.badlogicgames.com/)

## High Performance

*Everything about high performance computation, from collections to specific libraries*

* [Trove](http://trove.starlight-systems.com/) - High performance collections
* [HPPC](http://labs.carrotsearch.com/hppc.html) - High performance collections
* [Disruptor](http://lmax-exchange.github.io/disruptor/) - High Performance Inter-Thread Messaging Library

## IDE

*Integrated development environments that try to simplify several aspects of development*

* [NetBeans](https://netbeans.org/)
* [Eclipse](http://www.eclipse.org/)
* [IntelliJ](http://www.jetbrains.com/idea/)

## JSON

*Libraries that simplify JSON processing*

* [Google Gson](https://code.google.com/p/google-gson/)
* [Jackson](http://wiki.fasterxml.com/JacksonHome)

## Logging

*Libraries that log the behavior of an application*

* [SLF4J](http://www.slf4j.org/) - An abstraction layer which is to be used with an implementation
* [Log4j](http://logging.apache.org/log4j/)
* [Logback](http://logback.qos.ch/)

## Machine Learning

*Tools that allow to learn from data via a set of specific algorithms*

* [Apache Mahout](https://mahout.apache.org/)
* [Apache Spark](http://spark.apache.org/)
* [Mallet](http://mallet.cs.umass.edu/)
* [Weka](http://www.cs.waikato.ac.nz/ml/weka/)

## MapReduce

*Libraries that provide access to the MapReduce model*

* [Apache Hadoop](http://hadoop.apache.org/)

## Messaging

*Tools that help sending messages between clients to ensure protocol independency*

* [Apache ActiveMQ](http://activemq.apache.org/)
* [JBoss HornetQ](http://hornetq.jboss.org/)

## Miscellaneous

*Everything else*

* [Jimfs](https://github.com/google/jimfs) - An in-memory file system
* [Lombok](http://projectlombok.org/) - Code-generator which aims to reduce the verbosity of Java

## Natural Language Processing

*Libraries that are specialized on processing text*

* [Apache OpenNLP](https://opennlp.apache.org/)
* [LingPipe](http://alias-i.com/lingpipe/)

## ORM

*APIs which handle the persistence of objects*

* [EclipseLink](https://www.eclipse.org/eclipselink/)
* [Hibernate](http://hibernate.org/orm/)

## Permissions

*Libraries that handle role/rights with associated permissions*

* [Apache Shiro](http://shiro.apache.org/)

## Template Engine

*Tools which substitute expressions in a template*

* JSP
* [Apache Tapestry](http://tapestry.apache.org/)
* [Apache Velocity](http://velocity.apache.org/)
* [Freemarker](http://freemarker.org/)
* [Thymeleaf](http://www.thymeleaf.org/)
* [Jtwig](http://jtwig.org/)

## Testing

*Tools that test from object to interface level*

* [Apache JMeter](http://jmeter.apache.org/) - Functional testing and performance measurements
* [Mockito](http://code.google.com/p/mockito/)
* [Arquillian](http://arquillian.org/)
* [Selenium](http://docs.seleniumhq.org/) - Frontend testing
* [VisualVM](http://visualvm.java.net/)
* [Eclipse Memory Analyzer Tool](http://www.eclipse.org/mat/)
* [Hamcrest](http://hamcrest.org/JavaHamcrest/) - Framework for writing declarative assertion matchers
* [FEST](https://code.google.com/p/fest/) - Collection of testing libraries
* [AssertJ](http://joel-costigliola.github.io/assertj/) - Fluent assertions
* [Calipher](https://code.google.com/p/caliper/) - Microbenchmarking framework
* [JMH](http://openjdk.java.net/projects/code-tools/jmh/) - Microbenchmarking
* [TestNG](http://testng.org/) - Testing framework
* [JUnit](http://junit.org/) - Testing framework

## Utility

*Libraries which provide unspecific functionality, e.g. optimized datastructures*

* [Apache Commons](http://commons.apache.org/)
* [Google Guava](http://code.google.com/p/guava-libraries/)
* [JavaTuples](http://www.javatuples.org/) - Tuples for Java

## Web Crawling

*Libraries that analyze the content of websites*

* [Apache Nutch](http://nutch.apache.org/)
* [Crawler4j](https://code.google.com/p/crawler4j/)

## Web Frameworks

*Frameworks that handle the communication between the layers of an web application*

* [Spring](http://projects.spring.io/spring-framework/)
* [Grails](https://grails.org/)
* [Vaadin](https://vaadin.com/)
* [GWT](http://www.gwtproject.org/)
* [Apache Wicket](http://wicket.apache.org/)
* [Play](http://www.playframework.com/)
* [Apache Struts](http://struts.apache.org/)
* [PrimeFaces](http://primefaces.org/)

## REST Frameworks

*Frameworks specifically for creating RESTful services*

* [Dropwizard](https://dropwizard.github.io/dropwizard/) - Opinionated framework for setting up modern web applications, includes Jetty, Jackson, Jersey and Metrics
* [Jersey](https://jersey.java.net/) - JAX-RS reference implementation

# Resources

## Twitter

*People to follow*

* [Adam Bien](https://twitter.com/AdamBien/)
* [Antonio Goncalves](https://twitter.com/agoncal/)
* [Arun Gupta](https://twitter.com/arungupta/)
* [Java](https://twitter.com/java/)
* [Java EE](https://twitter.com/Java_EE/)
* [Java.net](https://twitter.com/javanetbuzz/)
* [Joshua Bloch](https://twitter.com/joshbloch/)
* [Pete Muir](https://twitter.com/plmuir/)

## Websites

*Important websites*

* [Java.net](http://java.net/)

## Communities

* [r/java](http://www.reddit.com/r/java) - Subreddit for the Reddit Java community

## Influental Books

*Books about Java that had a high impact and are still worth reading*

* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
* [Java Concurrence in Practice](http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
* [Thinking in Java](http://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

# Contributing

Contributions are very welcome. Just mind the general style.
