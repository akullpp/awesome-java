# Awesome Java

A curated list of awesome Java frameworks, libraries and software. Inspired by [awesome-python](https://github.com/vinta/awesome-python). Topics which have no libraries as of yet are located in README.tmp!

- [Awesome Java](#awesome-java)
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
    - [JVM And JDK](#jvm-and-jdk)
    - [JSON](#json)
    - [Logging](#logging)
    - [Machine Learning](#machine-learning)
    - [MapReduce](#mapreduce)
    - [Messaging](#messaging)
    - [Miscellaneous](#miscellaneous)
    - [Natural Language Processing](#natural-language-processing)
    - [ORM](#orm)
    - [PDF](#pdf)
    - [Permissions](#permissions)
    - [Science and Data Analysis](#science-and-data-analysis)
    - [Server](#server)
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

## Build Tool

*Tools which handle the buildcycle of an application*

* [Apache Ant](http://ant.apache.org/) - Procedural build configurations via XML files
* [Apache Buildr](http://buildr.apache.org/) - Perform builds using Ruby scripts
* [Apache Maven](http://maven.apache.org/) - Declarative lifecycle and dependency managment which favors conventions
* [Gradle](http://www.gradle.org/) - Incremental builds which are programmed via Groovy 
* [sbt](http://www.scala-sbt.org/) - Interactive build tool using Scala

## Code Analysis

*Tools that provide metrics and quality measurements of static code*

* [SonarQube](http://www.sonarqube.org/) - Inspection tool for code quality
* [FindBugs](http://findbugs.sourceforge.net/) - Static analysis to find potential bugs
* [Metrics](http://metrics.codahale.com/)

## Compiler-compiler

*Tools that create parsers, interpreters or compilers*

* [ANTLR](http://www.antlr.org/)
* [JavaCC](https://javacc.java.net/)

## Continuous Integration

*Tools which support continuously building, testing and releasing applications*

* [Hudson](http://jenkins-ci.org/)
* [Jenkins](http://jenkins-ci.org/) - Provides server-based CI services, often seen as the successor to Hudson

## Database Access

*Everything which simplifies the access to the database*

* [DBeaver](http://dbeaver.jkiss.org/) - Graphical database manager
* [JDBI](http://jdbi.org/) - Simplification of JDBC
* [jOOQ](http://www.jooq.org/) - Generates typesafe code based on SQL schema
* [Liquibase](http://www.liquibase.org/) - Source control for your database
* [Spring JDBCTemplate](http://www.spring.io/) - Simplification of JDBC
* [MapDB](http://www.mapdb.org/) - Database engine with optimized datastructures

## Date and Time

*Libraries related to date and time.*

* [Java 8 SE: Date and Time API](http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html) - Incorporates Joda-Time
* [Joda-Time](http://joda-time.sourceforge.net/) - De facto standard date/time-library before Java 8

## Dependency Injection

*Libraries that help to realize the [Inversion Of Control](http://en.wikipedia.org/wiki/Inversion_of_control) paradigm*

* [Dagger](http://square.github.io/dagger/) - A compile-time injection framework without reflection, mainly for Android
* [Google Guice](http://de.wikipedia.org/wiki/Google_Guice)
* [Spring](http://spring.io/) - The Spring Context module provides DI
* [Weld](http://docs.jboss.org/weld/reference/latest/en-US/html_single/) - CDI reference implementation

## Development Tools

* [DCEVM](http://ssw.jku.at/dcevm/) - A modification of the JVM that allows unlimited redefinition of loaded classes at runtime
* [JRebel](http://zeroturnaround.com/software/jrebel/) - Instantly reloads code and configuration changes without redeploys

## Distributed Applications
*Libraries and frameworks used to ease writing distributed and fault-tolerant applications*

* [Akka](http://akka.io) - Toolkit and runtime for building highly concurrent, distributed, and fault tolerant event-driven applications on the JVM.
* [JGroups](http://www.jgroups.org/) - Toolkit for reliable messaging and creating clusters whose nodes can send messages to each other
* [Apache ZooKeeper](http://zookeeper.apache.org/) - Coordination service

## GUI

*Libraries to create modern graphical user interfaces*

* [JavaFX](http://www.oracle.com/technetwork/java/javase/overview/javafx-overview-2158620.html)

## Game Development

*Frameworks that support the development of games*

* [LWJGL](http://lwjgl.org/) - Robust framework that abstracts libraries like OpenGL/CL/AL
* [libGDX](http://libgdx.badlogicgames.com/) Allround cross-plattform, high-level framework

## High Performance

*Everything about high performance computation, from collections to specific libraries*

* [Trove](http://trove.starlight-systems.com/) - Primitive collections
* [HPPC](http://labs.carrotsearch.com/hppc.html) - Primitive collections
* [Disruptor](http://lmax-exchange.github.io/disruptor/) - Inter-thread messaging library
* [Javalution](http://javolution.org/) - Library for real-time and embedded systems

## IDE

*Integrated development environments that try to simplify several aspects of development*

* [NetBeans](https://netbeans.org/)
* [Eclipse](http://www.eclipse.org/)
* [IntelliJ IDEA](http://www.jetbrains.com/idea/)

## JVM And JDK

*Various implementations of the JVM/JDK*

* [HotSpot](http://openjdk.java.net/groups/hotspot/) - Official JVM
* [IBM J9](https://www.ibm.com/developerworks/java/jdk/)
* [JDK 9](https://jdk9.java.net/) - Early access releases of JDK 9
* [JRockit](http://www.oracle.com/technetwork/middleware/jrockit/overview/index.html) - Originally developed by BEA, has a different kind of GC and is often used with WebLogic
* [OpenJDK](http://openjdk.java.net/) - Open source implementation

## JSON

*Libraries that simplify JSON processing*

* [Google Gson](https://code.google.com/p/google-gson/)
* [Jackson](http://wiki.fasterxml.com/JacksonHome)	

## Logging

*Libraries that log the behavior of an application*

* [Apache Log4j](http://logging.apache.org/log4j/)
* [SLF4J](http://www.slf4j.org/) - An abstraction layer which is to be used with an implementation
* [Logback](http://logback.qos.ch/)

## Machine Learning

*Tools that allow to learn from data via a set of specific algorithms*

* [Apache Mahout](https://mahout.apache.org/) - Scalable algorithms focused on collaborative filtering, clustering and classification
* [Apache Spark](http://spark.apache.org/) - Open-source data analytics cluster computing framework 
* [Weka](http://www.cs.waikato.ac.nz/ml/weka/) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization

## MapReduce

*Libraries that provide access to the MapReduce model*

* [Apache Crunch](http://crunch.apache.org/) - Framework for simple MapReduce pipelines
* [Apache Hadoop](http://hadoop.apache.org/) - Open-source software framework for storage and large-scale processing of data-sets on clusters of commodity hardware

## Messaging

*Tools that help sending messages between clients to ensure protocol independency*

* [Apache ActiveMQ](http://activemq.apache.org/)
* [JBoss HornetQ](http://hornetq.jboss.org/)
* [Spring AMQP](http://projects.spring.io/spring-amqp/)
* [Spring Integration](http://projects.spring.io/spring-integration/) - Enterprise Service Bus

## Miscellaneous

*Everything else*

* [Jimfs](https://github.com/google/jimfs) - An in-memory file system
* [Lombok](http://projectlombok.org/) - Code-generator which aims to reduce the verbosity of Java

## Natural Language Processing

*Libraries that are specialized on processing text*

* [Apache OpenNLP](https://opennlp.apache.org/) Toolkit for common tasks like tokenization
* [LingPipe](http://alias-i.com/lingpipe/) - Toolkit for a variety of tasks ranging from POS tagging to sentiment analysis
* [Mallet](http://mallet.cs.umass.edu/) - Statistical natural language processing, document classification, clustering, topic modeling, etc.

## ORM

*APIs which handle the persistence of objects*

* [EclipseLink](https://www.eclipse.org/eclipselink/)
* [Hibernate](http://hibernate.org/orm/)

## PDF

*Everything that helps with the creation of PDF files*

* [Apache FOP](http://xmlgraphics.apache.org/fop/) - Creates PDF from XSL-FO
* [Apache PDFBox](http://pdfbox.apache.org/) - Toolbox for creating and manipulating PDF
* [JasperReports](http://community.jaspersoft.com/project/jasperreports-library) - Complex reporting engine
* [DynamicJasper](http://dynamicjasper.com/) - Simplifies JasperReports
* [DynamicReports](http://dynamicreports.org/) - Simplifies JasperReports
* [iText](http://itextpdf.com/) - Easy to use PDF library but for commercial products you need a license
* [PDF Clown](http://www.stefanochizzolini.it/en/projects/clown/features.html)

## Permissions

*Libraries that handle role/rights with associated permissions*

* [Apache Shiro](http://shiro.apache.org/)
* [Keycloak](http://keycloak.jboss.org/) - Integrated SSO and IDM for browser apps and RESTful web services
* [PicketLink](http://picketlink.org/) - PicketLink is an umbrella project for security and identity management for Java Applications

## Science and Data Analysis

*Libraries for scientific computing and analysis*

* [Colt](http://acs.lbl.gov/ACSSoftware/colt/) - High performance scientific and technical computing
* [JTransforms](https://sites.google.com/site/piotrwendykier/software/jtransforms) - Multithread FFT library
* [Mines JTK](http://inside.mines.edu/~dhale/jtk/) - Tools for digital signal processing, linear algebra, inversion, 2-D and 3-D graphics, and more
* [Parallel Colt](https://sites.google.com/site/piotrwendykier/software/parallelcolt) - Multithread high performance scientific and technical computing

## Server

*Servers which are specifically used to deploy applications*

* [GlassFish](https://glassfish.java.net/) - Open source reference implementation for Java EE sponsored by Oracle
* [WildFly](http://www.wildfly.org/) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support
* [Jetty](http://www.eclipse.org/jetty/) - Lightweight, small server often embedded in projects. Part of the Eclipse Foundation
* [Apache Tomcat](http://tomcat.apache.org/) - Robust allround server for Servlet and JSP
* [Apache TomEE](http://tomee.apache.org/) - Tomcat plus Java EE

## Template Engine

*Tools which substitute expressions in a template*

* JSP
* [Apache Tapestry](http://tapestry.apache.org/)
* [Apache Velocity](http://velocity.apache.org/)
* [Freemarker](http://freemarker.org/)
* [Jtwig](http://jtwig.org/)
* [Mustache](http://mustache.github.io/)
* [Thymeleaf](http://www.thymeleaf.org/)

## Testing

*Tools that test from object to interface level including performance and other benchmarks*

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
* [Spark](http://www.sparkjava.com/why.html)

## REST Frameworks

*Frameworks specifically for creating RESTful services*

* [Dropwizard](https://dropwizard.github.io/dropwizard/) - Opinionated framework for setting up modern web applications, includes Jetty, Jackson, Jersey and Metrics
* [Jersey](https://jersey.java.net/) - JAX-RS reference implementation
* [RESTEasy](http://resteasy.jboss.org/) - Fully certified and portable implementation of the JAX-RS specification

# Resources

## Twitter

*People to follow*

* [Adam Bien](https://twitter.com/AdamBien/)
* [Antonio Goncalves](https://twitter.com/agoncal/)
* [Arun Gupta](https://twitter.com/arungupta/)
* [Ed Burns](https://twitter.com/edburns)
* [Java](https://twitter.com/java/)
* [Java EE](https://twitter.com/Java_EE/)
* [Java.net](https://twitter.com/javanetbuzz/)
* [Java Magazine](https://twitter.com/Oraclejavamag)
* [Mark Reinhold](https://twitter.com/mreinhold)
* [OpenJDK](https://twitter.com/OpenJDK)
* [Pete Muir](https://twitter.com/plmuir/)
* [Reza Rahman](https://twitter.com/reza_rahman)
* [Simon Maple](https://twitter.com/sjmaple)
* [Tim Boudreau](https://twitter.com/kablosna)

## Websites

*Important websites*

* [Java.net](http://java.net/)

## Communities

* [r/java](http://www.reddit.com/r/java) - Subreddit for the Java community

## Influental Books

*Books about Java that had a high impact and are still worth reading*

* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
* [Java Concurrency in Practice](http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
* [Thinking in Java](http://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

# Contributing

Contributions are very welcome. Just mind the general style.
