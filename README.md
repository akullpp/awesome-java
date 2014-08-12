# Awesome Java

A curated list of awesome Java frameworks, libraries and software. Inspired by other [awesome lists](https://github.com/bayandin/awesome-awesomeness).

- [Awesome Java](#awesome-java)
    - [Cmd Line Parser](#Cmd-Line-Parser)
    - [Build Tool](#build-tool)
    - [Code Analysis](#code-analysis)
    - [Compiler-compiler](#compiler-compiler)
    - [Continuous Integration](#continuous-integration)
    - [Database](#database)
    - [Date and Time](#date-and-time)
    - [Dependency Injection](#dependency-injection)
    - [Development](#development)
    - [Distributed Applications](#distributed-applications)
    - [Distribution](#distribution)
    - [Document Processing](#document-processing)
    - [Game Development](#game-development)
    - [GUI](#gui)
    - [High Performance](#high-performance)
    - [HTTP](#http)
    - [IDE](#ide)
    - [Imagery](#imagery)
    - [JSON](#json)
    - [JVM and JDK](#jvm-and-jdk)
    - [Logging](#logging)
    - [Machine Learning](#machine-learning)
    - [Messaging](#messaging)
    - [Miscellaneous](#miscellaneous)
    - [Natural Language Processing](#natural-language-processing)
    - [Networking](#networking)
    - [ORM](#orm)
    - [PDF](#pdf)
    - [REST Frameworks](#rest-frameworks)
    - [Science](#science)
    - [Search](#search)
    - [Security](#security)
    - [Server](#server)
    - [Template Engine](#template-engine)
    - [Testing](#testing)
    - [Utility](#utility)
    - [Visualization](#visualization)
    - [Web Crawling](#web-crawling)
    - [Web Frameworks](#web-frameworks)
- [Resources](#resources)
    - [Communities](#communities)
    - [Influential Books](#influential-books)
    - [Podcasts](#podcasts)
    - [Twitter](#twitter)
    - [Websites](#websites)
- [Contributing](#contributing)
- 

## Cmd-Line-Parser
*Tools for parsing CUI arguments*

* [arg4j](https://github.com/kohsuke/args4j)

## Build Tool

*Tools which handle the buildcycle of an application.*

* [Apache Maven](http://maven.apache.org/) - Declarative build and dependency management which favors convention over configuration. It's preferable to Apache Ant which uses a rather procedural approach and can be difficult to maintain.
* [Gradle](http://www.gradle.org/) - Incremental builds which are programmed via Groovy instead of declaring XML. Works well with Maven's dependency management and treats Ant scripts as first-class citizens.

## Code Analysis

*Tools that provide metrics and quality measurements of static code.*

* [FindBugs](http://findbugs.sourceforge.net/) - Static analysis of bytecode to find potential bugs.
* [SonarQube](http://www.sonarqube.org/) - Inspection tool for code quality. It integrates with several external tools like Gradle, Jira and Jenkins and provides an overview of the metrics over time.

## Compiler-compiler

*Tools that create parsers, interpreters or compilers.*

* [ANTLR](http://www.antlr.org/) - Complex full-featured framework for top-down parsing.
* [JavaCC](https://javacc.java.net/) - More specific and slightly easier to learn. Has syntactic lookahead.

## Continuous Integration

*Tools which support continuously building, testing and releasing applications.*

* [Jenkins](http://jenkins-ci.org/) - Provides server-based services. Often seen as the successor to Hudson, although it is still actively developed.
* [Shippable](https://www.shippable.com/) - Based on Docker, it provides also Bitbucket integration.
* [Travis](https://travis-ci.org) - A hosted continuous integration service that integrates with GitHub repositories.

## Database

*Everything which simplifies interactions with the database.*

* [JDBI](http://jdbi.org/) - Convenient abstraction of JDBC.
* [jOOQ](http://www.jooq.org/) - Generates typesafe code based on SQL schema.
* [Liquibase](http://www.liquibase.org/) - Source control for your database which can be embedded.
* [presto](https://github.com/facebook/presto) - Distributed SQL query engine for big data.

## Date and Time

*Libraries related to date and time.*

* [Java 8 SE: Date and Time API](http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html) - Basically, it incorporates Joda-Time.
* [Joda-Time](http://joda-time.sourceforge.net/) - De facto standard date/time-library before Java 8.

## Dependency Injection

*Libraries that help to realize the [Inversion of Control](http://en.wikipedia.org/wiki/Inversion_of_control) paradigm.*

* [Dagger](http://square.github.io/dagger/) - Compile-time injection framework without reflection, mainly for Android.
* [Google Guice](http://de.wikipedia.org/wiki/Google_Guice) - Lightweight but powerful framework.
* [Spring](http://spring.io/) - Only Spring Context is needed for injections.
* [Weld](http://docs.jboss.org/weld/reference/latest/en-US/html_single/) - CDI reference implementation.

## Development

*Integrated environments that augment the process of development at a fundamental level.*

* [DCEVM](http://ssw.jku.at/dcevm/) - Modification of the JVM that allows unlimited redefinition of loaded classes at runtime.
* [JRebel](http://zeroturnaround.com/software/jrebel/) - Instantly reloads code and configuration changes without redeploys.
* [RxJava](https://github.com/Netflix/RxJava) - Library for composing asynchronous and event-based programs using observable sequences from the JVM.
* [vert.x](http://vertx.io/) - Polyglot event-driven application framework for the JVM.

## Distributed Applications

*Libraries and frameworks used to ease writing distributed and fault-tolerant applications.*

* [Akka](http://akka.io) - Toolkit and runtime for building highly concurrent, distributed, and fault tolerant event-driven applications.
* [Apache Storm](http://storm.incubator.apache.org/) - Distributed realtime computation system.
* [Apache ZooKeeper](http://zookeeper.apache.org/) - Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems.
* [Hazelcast](http://hazelcast.org/) - Distributed and highly scalable data distribution platform for Java.
* [Hystrix](https://github.com/Netflix/Hystrix) - Latency and fault tolerance library designed to isolate points of access to remote systems, services and 3rd party libraries, stop cascading failure and enable resilience in complex distributed systems where failure is inevitable.
* [JGroups](http://www.jgroups.org/) - Toolkit for reliable messaging and creating clusters whose nodes can send messages to each other.

## Distribution

*Tools which handle the distribution of Java applications in native formats.*

* [Bintray](https://bintray.com/) - Version control for your binaries which handles the publishing. Can also be used with Maven or Gradle.
* [Launch4j](http://launch4j.sourceforge.net/) - Wraps JARs in lightweight and native Windows executables.
* [packr](https://github.com/libgdx/packr#packr) - Packs your JAR, assets and JVM for native distribution on Windows, Linux and Mac OS X.

## Document Processing

*Libraries that assist with processing office document formats.*

* [Apache POI](http://poi.apache.org/) - Supports OOXML (e.g XLSX, DOCX, PPTX) as well as OLE2 (e.g. XLS, DOC or PPT).
* [jOpenDocument](http://www.jopendocument.org/) - Processes the OpenDocument format.

## Game Development

*Frameworks that support the development of games.*

* [jMonkeyEngine](http://jmonkeyengine.org/) - Game engine for modern 3D development.
* [libGDX](http://libgdx.badlogicgames.com/) - All-round cross-platform, high-level framework.
* [LWJGL](http://lwjgl.org/) - Robust framework that abstracts libraries like OpenGL/CL/AL.

## GUI

*Libraries to create modern graphical user interfaces.*

* [JavaFX](http://www.oracle.com/technetwork/java/javase/overview/javafx-overview-2158620.html) - The successor of Swing.
* [Scene Builder](http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-info-2157684.html) - Visual layout tool for JavaFX applications.

## High Performance

*Everything about high performance computation, from collections to specific libraries.*

* [Disruptor](http://lmax-exchange.github.io/disruptor/) - Inter-thread messaging library.
* [fastutil](http://fastutil.di.unimi.it/) - Fast and compact type-specific collections for Java.
* [GS Collections](https://github.com/goldmansachs/gs-collections) - Collection framework inspired by Smalltalk.
* [hftc](https://github.com/OpenHFT/hftc) - Hash sets and hash maps.
* [HPPC](http://labs.carrotsearch.com/hppc.html) - Primitive collections.
* [Javolution](http://javolution.org/) - Library for real-time and embedded systems.
* [Trove](http://trove.starlight-systems.com/) - Primitive collections.

## HTTP

*Libraries for working with HTTP.*

* [OkHttp](http://square.github.io/okhttp/) - An HTTP+SPDY client for Android and Java applications.

## IDE

*Integrated development environments that try to simplify several aspects of development.*

* [Eclipse](http://www.eclipse.org/) - Does a lot of things in the background. Noteworthy are its large amount of plugins.
* [IntelliJ IDEA](http://www.jetbrains.com/idea/) - Supports a lot of JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector.
* [NetBeans](https://netbeans.org/) - Provides integration for several  Java SE and EE features starting with database access and servers to HTML5 and AngularJS.

## Imagery

*Libraries that assist with the creation, evaluation or manipulation of graphical images.*

* [Picasso](http://square.github.io/picasso/) - Image downloading and caching library for Android.
* [ZXing](https://github.com/zxing/zxing) - Multi-format 1D/2D barcode image processing library.

## JSON

*Libraries that simplify JSON processing.*

* [Google Gson](https://code.google.com/p/google-gson/) - Serializes Java objects to JSON and vice versa. Good performance with on-the-fly usage.
* [Jackson](http://wiki.fasterxml.com/JacksonHome) - Similar to GSON but has performance gains if you need to instantiate the library more often.

## JVM and JDK

*Various implementations of the JVM/JDK.*

* [HotSpot](http://openjdk.java.net/groups/hotspot/) - Official JVM.
* [JDK 9](https://jdk9.java.net/) - Early access releases of JDK 9.
* [OpenJDK](http://openjdk.java.net/) - Open source implementation.

## Logging

*Libraries that log the behavior of an application.*

* [Apache Log4j 2](http://logging.apache.org/log4j/) - Complete rewrite of the previous version. Now has a powerful plugin and configuration architecture.
* [Logback](http://logback.qos.ch/) - Founded by the same developer as Log4j and proves to be a robust logging library with interesting configuration options via Groovy.
* [logstash](http://logstash.net/) - Tool for managing log files.
* [SLF4J](http://www.slf4j.org/) - Abstraction layer which is to be used with an implementation.

## Machine Learning

*Tools that provide specific statistical algorithms which allow to learn from data.*

* [Apache Hadoop](http://hadoop.apache.org/) - Open-source software framework for storage and large-scale processing of data-sets on clusters of commodity hardware.
* [Apache Mahout](https://mahout.apache.org/) - Scalable algorithms focused on collaborative filtering, clustering and classification.
* [Apache Spark](http://spark.apache.org/) - Open-source data analytics cluster computing framework.
* [h2o](http://0xdata.github.io/h2o/) - Analytics engine for statistics over big data. 
* [Weka](http://www.cs.waikato.ac.nz/ml/weka/) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization.

## Messaging

*Tools that help sending messages between clients to ensure protocol independency.*

* [Apache ActiveMQ](http://activemq.apache.org/) - Open-source message broker that implements JMS and converts synchronous to asynchronous communication.
* [Apache Kafka](http://kafka.apache.org/) - High-throughput distributed messaging system.
* [JBoss HornetQ](http://hornetq.jboss.org/) - Clear, concise, modular and made to be embedded.

## Miscellaneous

*Everything else.*

* [AspectJ](https://eclipse.org/aspectj/) - Aspect-oriented programming for Java.
* [Jimfs](https://github.com/google/jimfs) - In-memory file system.
* [Lanterna](https://code.google.com/p/lanterna/) - Easy console text GUI library similar to curses.
* [Lombok](http://projectlombok.org/) - Code-generator which aims to reduce the verbosity of Java.
* [Metrics](http://metrics.codahale.com/) - Create your own metrics (counters, gauges, timers) or add them for supported frameworks, then expose them via JMX or HTTP, or send them to a database (Graphite, Ganglia).
* [OpenRefine](http://openrefine.org/) -  Tool for working with messy data: cleaning it; transforming it from one format into another; extending it with web services; and linking it to databases.
* [RoboVM](http://www.robovm.org/) - Write native iOS apps in Java.

## Natural Language Processing

*Libraries that specialize on processing text.*

* [Apache OpenNLP](https://opennlp.apache.org/) - Toolkit for common tasks like tokenization.
* [LingPipe](http://alias-i.com/lingpipe/) - Toolkit for a variety of tasks ranging from POS tagging to sentiment analysis.
* [Mallet](http://mallet.cs.umass.edu/) - Statistical natural language processing, document classification, clustering, topic modeling, etc.

## Networking

*Libraries for network programming.*

* [Netty](http://netty.io/) - A framework for building high performance network applications.

## ORM

*APIs which handle the persistence of objects.*

* [EclipseLink](https://www.eclipse.org/eclipselink/) - Supports a number of persistence standards: JPA, JAXB, JCA and SDO.
* [Hibernate](http://hibernate.org/orm/) - Robust and widely used with an active community.

## PDF

*Everything that helps with the creation of PDF files.*

* [Apache FOP](http://xmlgraphics.apache.org/fop/) - Creates PDF from XSL-FO.
* [Apache PDFBox](http://pdfbox.apache.org/) - Toolbox for creating and manipulating PDF.
* [DynamicReports](http://dynamicreports.org/) - Simplifies JasperReports.
* [iText](http://itextpdf.com/) - Easy to use PDF library which creates PDF files programmatically but requires a license for commercial purposes.
* [JasperReports](http://community.jaspersoft.com/project/jasperreports-library) - Complex reporting engine.

## REST Frameworks

*Frameworks specifically for creating RESTful services.*

* [Dropwizard](https://dropwizard.github.io/dropwizard/) - Opinionated framework for setting up modern web applications, includes Jetty, Jackson, Jersey and Metrics.
* [Jersey](https://jersey.java.net/) - JAX-RS reference implementation.
* [RESTEasy](http://resteasy.jboss.org/) - Fully certified and portable implementation of the JAX-RS specification.
* [RESTX](http://restx.io/) - A lightweight REST framework with emphasis on modularity, speed and dev-friendly features (light specs compiled to unit tests and documentation, authentication needed by default, ...)
* [Retrofit](http://square.github.io/retrofit/) - A type-safe REST client for Java.
* [swookiee](http://swookiee.com/) - JVM Runtime for REST Services.

## Science

*Libraries for scientific computing and analysis.*

* [JScience](http://www.jscience.org/) - Comprehensive framework of science related libraries.
* [JTransforms](https://sites.google.com/site/piotrwendykier/software/jtransforms) - Multithread FFT library.
* [Parallel Colt](https://sites.google.com/site/piotrwendykier/software/parallelcolt) - Multithread high performance scientific and technical computing.
* [SCaVis](http://jwork.org/scavis/) - Environment for scientific computation, data analysis and data visualization.

## Search

*Engines which index documents for search and analysis.*

* [Apache Solr](http://lucene.apache.org/solr/) - Full enterprise search engine optimized for high volume traffic.
* [Elasticsearch](http://www.elasticsearch.org/) - Distributed, multitenant-capable full-text search engine with a RESTful web interface and schema-free JSON documents. 

## Security

*Libraries that handle security, authentication, authorization or session management.*

* [Apache Shiro](http://shiro.apache.org/) - Performs authentication, authorization, cryptography and session management.
* [Keycloak](http://keycloak.jboss.org/) - Integrated SSO and IDM for browser apps and RESTful web services. Currently in beta but looks very promising.
* [PicketLink](http://picketlink.org/) - PicketLink is an umbrella project for security and identity management for Java applications.
* [Spring Security](http://projects.spring.io/spring-security/) - Focuses on authentication/authorization and protects against several attack vectors.

## Server

*Servers which are specifically used to deploy applications.*

* [Apache Tomcat](http://tomcat.apache.org/) - Robust all-round server for Servlet and JSP.
* [Apache TomEE](http://tomee.apache.org/) - Tomcat plus Java EE.
* [GlassFish](https://glassfish.java.net/) - Open source reference implementation for Java EE sponsored by Oracle.
* [Jetty](http://www.eclipse.org/jetty/) - Lightweight, small server, often embedded in projects.
* [WildFly](http://www.wildfly.org/) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support.

## Template Engine

*Tools which substitute expressions in a template.*

* [Apache Velocity](http://velocity.apache.org/) - Templates for HTML pages, emails or source code generation in general.
* [FreeMarker](http://freemarker.org/) - General templating engine without any heavyweight or opinionated dependencies.
* [JavaServer Pages](https://jsp.java.net/) - Aged templating for websites with custom tag libraries.
* [Thymeleaf](http://www.thymeleaf.org/) - Aims to be a substitute for JSP and works for XML files in general.

## Testing

*Tools that test from object to interface level including performance and other benchmarks.*

* [Apache JMeter](http://jmeter.apache.org/) - Functional testing and performance measurements.
* [Arquillian](http://arquillian.org/) - Integration and functional testing platform with integration of Java EE containers.
* [AssertJ](http://joel-costigliola.github.io/assertj/) - Fluent assertions.
* [Caliper](https://code.google.com/p/caliper/) - Microbenchmarking framework.
* [FEST](https://code.google.com/p/fest/) - Collection of testing libraries.
* [Hamcrest](http://hamcrest.org/JavaHamcrest/) - Framework for writing declarative assertion matchers.
* [JMH](http://openjdk.java.net/projects/code-tools/jmh/) - Microbenchmarking.
* [JUnit](http://junit.org/) - Testing framework.
* [Mockito](http://code.google.com/p/mockito/) - Creation of test double objects in automated unit tests for the purpose of TDD or BDD.
* [Selenium](http://docs.seleniumhq.org/) - Portable software testing framework for web applications.
* [TestNG](http://testng.org/) - Testing framework.
* [VisualVM](http://visualvm.java.net/) - Visual interface for viewing detailed information about Java applications while they are running on a JVM.

## Utility

*Libraries which provide unspecific functionality, e.g. optimized datastructures.*

* [Apache Commons](http://commons.apache.org/) - Provides different general purpose functions like configuration, validation, collections, file upload or XML processing.
* [Google Guava](http://code.google.com/p/guava-libraries/) - Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and so forth.
* [javatuples](http://www.javatuples.org/) - Does what it says, although the concept of tuples in general is debatable.

## Visualization

*Libraries or frameworks which allow you to visualize data.*

* [kibana](http://www.elasticsearch.org/overview/kibana/) - Analyzes and visualizes log files.
* [Processing](https://www.processing.org/) - A project deeply rooted in visual art which allows you to program the visualization of data.

## Web Crawling

*Libraries that analyze the content of websites.*

* [Apache Nutch](http://nutch.apache.org/) - Highly extensible, highly scalable Web crawler for production environment.
* [Crawler4j](https://code.google.com/p/crawler4j/) - Simple lightweight alternative.
* [jsoup](http://jsoup.org/) - Scrapes, parses, manipulates and cleans HTML.

## Web Frameworks

*Frameworks that handle the communication between the layers of an web application.*

* [Apache Tapestry](http://tapestry.apache.org/) - Component oriented framework for creating dynamic, robust, highly scalable web applications in Java.
* [Apache Wicket](http://wicket.apache.org/) - Component-based web application framework similar to Tapestry with a stateful GUI.
* [Google Web Toolkit](http://www.gwtproject.org/) - Toolbox which includes a Java-to-JavaScript compiler for client-side code, XML parser, API for RPC, JUnit integration, internationalization support and widgets for the GUI.
* [Grails](https://grails.org/) - Groovy framework with the aim to provide a highly productive environment by favoring convention over configuration, no XML and support for mixins.
* [Play](http://www.playframework.com/) - Uses convention over configuration, hot code reloading and display of errors in the browser.
* [PrimeFaces](http://primefaces.org/) - JSF framework which has a free and a commercial version with support. Provides several frontend components.
* [Spark](http://www.sparkjava.com/why.html) - Unique framework which focuses not on complex MVC patterns but on rapid development.
* [Spring Boot](http://projects.spring.io/spring-boot/) - Microframework which simplifies the development of new Spring applications.
* [Spring](http://projects.spring.io/spring-framework/) - Aims to simplify the development with Java EE and provides packages for dependency injection and aspect-oriented programming.
* [Vaadin](https://vaadin.com/) - Event-driven framework build on top of GWT. Uses server-side architecture with Ajax on the client-side.

# Resources

## Communities

*Active discussions.*

* [r/java](http://www.reddit.com/r/java) - Subreddit for the Java community.
* [stackoverflow](http://stackoverflow.com/questions/tagged/java) - Question/answer platform.

## Influential Books

*Books about Java that had a high impact and are still worth reading.*

* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
* [Java Concurrency in Practice](http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
* [Thinking in Java](http://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

## Podcasts

*Something to listen to while programming.*

* [The Java Posse](http://www.javaposse.com/)

## Twitter

*People to follow.*

* [Adam Bien](https://twitter.com/AdamBien/)
* [Antonio Goncalves](https://twitter.com/agoncal/)
* [Arun Gupta](https://twitter.com/arungupta/)
* [Ed Burns](https://twitter.com/edburns)
* [Java EE](https://twitter.com/Java_EE/)
* [Java Magazine](https://twitter.com/Oraclejavamag)
* [Java.net](https://twitter.com/javanetbuzz/)
* [Java](https://twitter.com/java/)
* [Mark Reinhold](https://twitter.com/mreinhold)
* [OpenJDK](https://twitter.com/OpenJDK)
* [Pete Muir](https://twitter.com/plmuir/)
* [Reza Rahman](https://twitter.com/reza_rahman)
* [Simon Maple](https://twitter.com/sjmaple)
* [Tim Boudreau](https://twitter.com/kablosna)

## Websites

*Sites to read.*

* [Java.net](http://java.net/)
* [Javalobby](http://java.dzone.com/)
* [JavaWorld](http://www.javaworld.com/)
* [RebelLabs](http://zeroturnaround.com/rebellabs/)

# Contributing

Contributions are very welcome!

Please have a look at [CONTRIBUTING](https://github.com/akullpp/awesome-java/blob/master/CONTRIBUTING.md) for guidelines.

Topics which have no libraries as of yet are located in [TOPICS](https://github.com/akullpp/awesome-java/blob/master/TOPICS.md).
