# Awesome Java

A curated list of awesome Java frameworks, libraries and software. Inspired by other [awesome lists](https://github.com/bayandin/awesome-awesomeness).

- [Awesome Java](#awesome-java)
    - [Build Tool](#build-tool)
    - [Bytecode Manipulation](#bytecode-manipulation)
    - [Cluster Management](#cluster-management)
    - [Code Analysis](#code-analysis)
    - [Compiler-compiler](#compiler-compiler)
    - [Configuration](#configuration)
    - [Constraint Satisfaction Problem Solver](#constraint-satisfaction-problem-solver)
    - [Continuous Integration](#continuous-integration)
    - [CSV](#csv)
    - [Database](#database)
    - [Data structures](#data-structures)
    - [Date and Time](#date-and-time)
    - [Dependency Injection](#dependency-injection)
    - [Development](#development)
    - [Distributed Applications](#distributed-applications)
    - [Distributed Databases](#distributed-databases)
    - [Distribution](#distribution)
    - [Document Processing](#document-processing)
    - [Functional Programming](#functional-programming)
    - [Game Development](#game-development)
    - [GUI](#gui)
    - [High Performance](#high-performance)
    - [IDE](#ide)
    - [Imagery](#imagery)
    - [JSON](#json)
    - [JVM and JDK](#jvm-and-jdk)
    - [Logging](#logging)
    - [Machine Learning](#machine-learning)
    - [Messaging](#messaging)
    - [Miscellaneous](#miscellaneous)
    - [Monitoring](#monitoring)
    - [Native](#native)
    - [Natural Language Processing](#natural-language-processing)
    - [Networking](#networking)
    - [ORM](#orm)
    - [PDF](#pdf)
    - [REST Frameworks](#rest-frameworks)
    - [Science](#science)
    - [Search](#search)
    - [Security](#security)
    - [Serialization](#serialization)
    - [Server](#server)
    - [Template Engine](#template-engine)
    - [Testing](#testing)
    - [Utility](#utility)
    - [Web Crawling](#web-crawling)
    - [Web Frameworks](#web-frameworks)
- [Resources](#resources)
    - [Communities](#communities)
    - [Influential Books](#influential-books)
    - [Podcasts](#podcasts)
    - [Twitter](#twitter)
    - [Websites](#websites)
- [Contributing](#contributing)

## Build Tool

*Tools which handle the buildcycle of an application.*

* [Apache Maven](http://maven.apache.org/) - Declarative build and dependency management which favors convention over configuration. It's preferable to Apache Ant which uses a rather procedural approach and can be difficult to maintain.
* [Gradle](http://www.gradle.org/) - Incremental builds which are programmed via Groovy instead of declaring XML. Works well with Maven's dependency management and treats Ant scripts as first-class citizens.

## Bytecode Manipulation

*Libraries to manipulate Java bytecode programmatically.*

* [ASM](http://asm.ow2.org/) - All purpose, low level, bytecode manipulation and analysis.
* [Byte Buddy](http://bytebuddy.net/) - Further simplifies bytecode generation with a fluent API.
* [Javassist](http://www.csg.ci.i.u-tokyo.ac.jp/~chiba/javassist/) - Tries to simplify the editing of bytecode.

## Cluster Management

*Frameworks which can dynamically manage applications inside of a cluster.*

* [Apache Aurora](http://aurora.apache.org/) - Apache Aurora is a Mesos framework for long-running services and cron jobs.
* [Singularity](http://getsingularity.com/) - Singularity is a Mesos framework that makes deployment and operations easy. It supports web services, background workers, scheduled jobs, and one-off tasks.

## Code Analysis

*Tools that provide metrics and quality measurements.*

* [Checkstyle](http://checkstyle.sourceforge.net/) - Static analysis of coding conventions and standards.
* [Error Prone](https://github.com/google/error-prone) - Catches common Java mistakes as compile-time errors.
* [FindBugs](http://findbugs.sourceforge.net/) - Static analysis of bytecode to find potential bugs.
* [PMD](http://pmd.sourceforge.net/) - Source code analysis of bad coding practices.
* [SonarQube](http://www.sonarqube.org/) - Integrates other analysis components via plugins and provides an overview of the metrics over time.

## Compiler-compiler

*Frameworks that help to create parsers, interpreters or compilers.*

* [ANTLR](http://www.antlr.org/) - Complex full-featured framework for top-down parsing.
* [JavaCC](https://javacc.java.net/) - More specific and slightly easier to learn. Has syntactic lookahead.

## Configuration

*Libraries that provide external configuration.*

* [config](https://github.com/typesafehub/config) - Configuration library for JVM languages.

## Constraint Satisfaction Problem Solver

*Libraries that help on implementing optimization and satisfiability problems.*

* [Choco](http://choco-solver.org/) - An off-the-shelf constraint satisfaction problem solver, which uses constraint programming techniques to solve constraint satisfaction problems.
* [JaCoP](https://github.com/radsz/jacop/) - A constraint programming solver that includes an interface for the [FlatZinc language](https://www.minizinc.org/downloads/doc-1.6/flatzinc-spec.pdf), enabling it to execute [MiniZinc](http://www.minizinc.org/) models.
* [OptaPlanner](http://www.optaplanner.org/) - A business planning and resource scheduling optimization solver.
* [Sat4J](http://www.sat4j.org/) - A state-of-the-art SAT solver for boolean and optimization problems in Java.

## Continuous Integration

*Tools which support continuously building, testing and releasing applications.*

* [Bamboo](https://www.atlassian.com/software/bamboo) - Atlassian's solution with good integration of other products. You can either apply for an Open Source license or buy it.
* [CircleCI](https://circleci.com/) - Hosted service with a free trial.
* [Codeship](https://www.codeship.io/features) - Hosted services with a limited free plan.
* [Go](http://www.thoughtworks.com/products/go-continuous-delivery) - ThoughtWork's CI open source solution.
* [Jenkins](http://jenkins-ci.org/) - Provides server-based deployment services.
* [TeamCity](http://www.jetbrains.com/teamcity/) - JetBrain's CI solution with a free version.
* [Travis](https://travis-ci.org) - Hosted service often used for open source projects.

## CSV

* Frameworks and libraries that simplify reading/writing CSV data.*
 
* [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) - One of the fastest and most feature-complete CSV parsers for Java. Also comes with parsers for TSV and fixed width records.

## Database

*Everything which simplifies interactions with the database.*

* [Apache Phoenix](http://phoenix.apache.org/) - High performance relational database layer over HBase for low latency applications.
* [Flyway](http://flywaydb.org/) - Simple database migration with Java API.
* [H2](http://h2database.com/) - Small SQL Database notable for its in-memory functionality.
* [HikariCP](https://github.com/brettwooldridge/HikariCP) - High performance JDBC connection pool.
* [JDBI](http://jdbi.org/) - Convenient abstraction of JDBC.
* [jOOQ](http://www.jooq.org/) - Generates typesafe code based on SQL schema.
* [Liquibase](http://www.liquibase.org/) - An open source database-independent library for tracking, managing and applying database schema changes.
* [Presto](https://github.com/facebook/presto) - Distributed SQL query engine for big data.
* [Querydsl](http://www.querydsl.com/) - Typesafe unified queries for Java.

## Data structures

* [Apache Parquet](https://parquet.incubator.apache.org/) - A columnar storage format based on assembly algorithms from the Dremel paper by Google.

## Date and Time

*Libraries related to handling date and time.*

* [Joda-Time](http://www.joda.org/joda-time/) - De facto standard date/time-library before Java 8.
* [Time4J](https://github.com/MenoData/Time4J) - Advanced date and time library for Java.

## Dependency Injection

*Libraries that help to realize the [Inversion of Control](http://en.wikipedia.org/wiki/Inversion_of_control) paradigm.*

* [Dagger](http://square.github.io/dagger/) - Compile-time injection framework without reflection, mainly for Android.
* [Guice](https://github.com/google/guice) - Lightweight but powerful framework that completes Dagger.
* [HK2](https://hk2.java.net) - A light-weight and dynamic dependency injection framework.

## Development

*Augmentation of the development process at a fundamental level.*

* [ADT4J](https://github.com/sviperll/adt4j) - Algebraic Data Types for Java (JSR-269 code generator).
* [AspectJ](https://eclipse.org/aspectj/) - Seamless aspect-oriented programming extension.
* [Auto](https://github.com/google/auto) - Collection of source code generators.
* [DCEVM](http://dcevm.github.io/) - Modification of the JVM that allows unlimited redefinition of loaded classes at runtime.
* [Immutables](http://immutables.github.io/) - Scala-like case classes in standard Java.
* [JRebel](http://zeroturnaround.com/software/jrebel/) - Commercial software that instantly reloads code and configuration changes without redeploys.
* [Lombok](http://projectlombok.org/) - Code-generator which aims to reduce the verbosity of Java.
* [RxJava](https://github.com/Netflix/RxJava) - Library for composing asynchronous and event-based programs using observable sequences from the JVM.
* [Spring Loaded](https://github.com/spring-projects/spring-loaded) - Another class reloading agent for the JVM.
* [vert.x](http://vertx.io/) - Polyglot event-driven application framework for the JVM.

## Distributed Applications

*Libraries and frameworks for writing distributed and fault-tolerant applications.*

* [Akka](http://akka.io) - Toolkit and runtime for building concurrent, distributed, and fault tolerant event-driven applications.
* [Apache Storm](http://storm.incubator.apache.org/) - Distributed realtime computation system.
* [Apache ZooKeeper](http://zookeeper.apache.org/) - Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems.
* [Hazelcast](http://hazelcast.org/) - Distributed and highly scalable in-memory datagrid.
* [Hystrix](https://github.com/Netflix/Hystrix) - Latency and Fault Tolerance for Distributed Systems.
* [JGroups](http://www.jgroups.org/) - Toolkit for reliable messaging and creating clusters whose nodes can send messages to each other.
* [Orbit](http://orbit.bioware.com/) - Virtual Actors, adding another level of abstraction to traditional Actors.
* [Quasar](http://www.paralleluniverse.co/quasar/) - Lightweight threads and actors for the JVM.

## Distributed Databases

*Databases in a distributed system that appear to applications as a single data source.*

* [Apache Cassandra](http://cassandra.apache.org) - Apache Cassandra is a distributed column-oriented database providing high availability with no single point of failure.
* [Apache HBase](http://hbase.apache.org) - Apache HBase is the Hadoop database, a distributed, scalable, big data store.
* [Infinispan](http://infinispan.org/) -  Distributed and highly concurrent key/value datastore used for caching.

## Distribution

*Tools which handle the distribution of Java applications in native formats.*

* [Bintray](https://bintray.com/) - Version control for binaries which handles the publishing. Can also be used with Maven or Gradle and has a free plan for Open Source Software or several business plans.
* [Central Repository](http://search.maven.org/) - Largest binary component repository available as [a free service to the open source community](http://central.sonatype.org). Default used by Apache Maven and available in all other build tools.
* [IzPack](http://izpack.org/) - Setup authoring tool for cross-platform deployments.
* [JitPack](https://jitpack.io/) - Easy to use package repository for GitHub. Builds Maven/Gradle projects on demand and publishes ready-to-use packages.
* [Launch4j](http://launch4j.sourceforge.net/) - Wraps JARs in lightweight and native Windows executables.
* [Nexus](http://www.sonatype.com/nexus) - Binary management with proxy and caching capabilities.
* [packr](https://github.com/libgdx/packr/) - Packs your JAR, assets and JVM for native distribution on Windows, Linux and Mac OS X.

## Document Processing

*Libraries that assist with processing office document formats.*

* [Apache POI](http://poi.apache.org/) - Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT).
* [jOpenDocument](http://www.jopendocument.org/) - Processes the OpenDocument format.
* [documents4j](http://documents4j.com) - Java API for document format conversion using third-party converters such as MS Word.

## Functional Programming

*Libraries that facilitate functional programming in Java.*

* [Functional Java](http://www.functionaljava.org) - Implements numerous basic and advanced programming abstractions that assist composition oriented development.
* [Javaslang](http://javaslang.com) - Functional component library built for Java 8+ that provides persistent data types and functional control structures.
* [jOOλ](https://github.com/jOOQ/jOOL) - An extension to Java 8 which aims to fix gaps in lambda, providing numerous missing types and a rich set of sequential Stream API additions.

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
* [Koloboke](https://github.com/OpenHFT/Koloboke) - Hash sets and hash maps.
* [HPPC](http://labs.carrotsearch.com/hppc.html) - Primitive collections.
* [Javolution](http://javolution.org/) - Library for real-time and embedded systems.
* [Reactor](http://projectreactor.io/) - Library for building reactive fast-data applications.
* [Trove](http://trove.starlight-systems.com/) - Primitive collections.

## IDE

*Integrated development environments that try to simplify several aspects of development.*

* [Eclipse](http://www.eclipse.org/) - Established, open-souce project with support for lots of plugins and languages.
* [IntelliJ IDEA](http://www.jetbrains.com/idea/) - Supports a lot of JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector.
* [NetBeans](https://netbeans.org/) - Provides integration for several  Java SE and EE features starting with database access and servers to HTML5 and AngularJS.

## Imagery

*Libraries that assist with the creation, evaluation or manipulation of graphical images.*

* [Imgscalr](https://github.com/thebuzzmedia/imgscalr) - Imgscalr is an very simple and efficient (hardware accelerated) image-scaling library implemented in pure Java 2D.
* [Picasso](http://square.github.io/picasso/) - Image downloading and caching library for Android.
* [Thumbnailator](https://code.google.com/p/thumbnailator) - Thumbnailator is a high-quality thumbnail generation library for Java.
* [ZXing](https://github.com/zxing/zxing) - Multi-format 1D/2D barcode image processing library.

## JSON

*Libraries that simplify JSON processing.*

* [Genson](http://owlike.github.io/genson) - Powerful and easy to use Java and Scala to JSON conversion library.
* [Gson](https://github.com/google/gson) - Serializes Java objects to JSON and vice versa. Good performance with on-the-fly usage.
* [Jackson](http://wiki.fasterxml.com/JacksonHome) - Similar to GSON but has performance gains if you need to instantiate the library more often.
* [LoganSquare](https://github.com/bluelinelabs/LoganSquare) - JSON parsing and serializing library based on Jackson's streaming API. Outpeforms GSON & Jackson's library.

## JVM and JDK

*Current implementations of the JVM/JDK.*

* [JDK 9](https://jdk9.java.net/) - Early access releases of JDK 9.
* [OpenJDK](http://openjdk.java.net/) - Open source implementation.

## Logging

*Libraries that log the behavior of an application.*

* [Apache Log4j 2](http://logging.apache.org/log4j/) - Complete rewrite of the previous version. Now has a powerful plugin and configuration architecture.
* [kibana](http://www.elasticsearch.org/overview/kibana/) - Analyzes and visualizes log files.
* [Logback](http://logback.qos.ch/) - Founded by the same developer as Log4j and proves to be a robust logging library with interesting configuration options via Groovy.
* [logstash](http://logstash.net/) - Tool for managing log files.
* [SLF4J](http://www.slf4j.org/) - Abstraction layer which is to be used with an implementation.

## Machine Learning

*Tools that provide specific statistical algorithms which allow to learn from data.*

* [Apache Flink](https://flink.apache.org/) - Fast and reliable large-scale data processing engine.
* [Apache Hadoop](http://hadoop.apache.org/) - Open-source software framework for storage and large-scale processing of data-sets on clusters of commodity hardware.
* [Apache Mahout](https://mahout.apache.org/) - Scalable algorithms focused on collaborative filtering, clustering and classification.
* [Apache Spark](http://spark.apache.org/) - Open-source data analytics cluster computing framework.
* [H2O](http://0xdata.com/) - Analytics engine for statistics over big data.
* [Weka](http://www.cs.waikato.ac.nz/ml/weka/) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization.

## Messaging

*Tools that help sending messages between clients to ensure protocol independency.*

* [Aeron](https://github.com/real-logic/Aeron) - Efficient reliable unicast and multicast message transport.
* [Apache ActiveMQ](http://activemq.apache.org/) - Open-source message broker that implements JMS and converts synchronous to asynchronous communication.
* [Apache Camel](http://camel.apache.org/) - Glues together different transport APIs via Enterprise Integration Patterns.
* [Apache Kafka](http://kafka.apache.org/) - High-throughput distributed messaging system.
* [JBoss HornetQ](http://hornetq.jboss.org/) - Clear, concise, modular and made to be embedded.
* [JeroMQ](https://github.com/zeromq/jeromq) - Pure Java implementation of ZeroMQ.

## Miscellaneous

*Everything else.*

* [Design Patterns](https://github.com/iluwatar/java-design-patterns) - Implementation and explanation of the most common design patterns.
* [fabric8](http://fabric8.io/) - Integration platform for Java containers.
* [Jimfs](https://github.com/google/jimfs) - In-memory file system.
* [Lanterna](https://code.google.com/p/lanterna/) - Easy console text GUI library similar to curses.
* [LightAdmin](http://lightadmin.org/) - Pluggable CRUD UI library for rapid application development.
* [Metrics](http://metrics.codahale.com/) - Create your own metrics or add them for supported frameworks, then expose them via JMX or HTTP, or send them to a database.
* [OpenRefine](http://openrefine.org/) -  Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases.
* [RoboVM](http://www.robovm.org/) - Commercial framework with a free trial to write native iOS apps in Java.

## Monitoring

*Tools that monitor applications in production.*

* [AppDynamics](http://www.appdynamics.com/) - Commercial performance monitor.
* [New Relic](http://newrelic.com/) - Commercial performance monitor.
* [Takipi](https://www.takipi.com/) - Commercial in-production error monitoring and debugging.

## Native
*For working with platform-specific native libraries.*

* [JNA](https://github.com/twall/jna) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries.

## Natural Language Processing

*Libraries that specialize on processing text.*

* [Apache OpenNLP](https://opennlp.apache.org/) - Toolkit for common tasks like tokenization.
* [CoreNLP](http://nlp.stanford.edu/software/corenlp.shtml) - Stanford's CoreNLP provides a set of fundamental tools for tasks like tagging, named entity recognition, sentiment analysis and many more.
* [LingPipe](http://alias-i.com/lingpipe/) - Toolkit for a variety of tasks ranging from POS tagging to sentiment analysis.
* [Mallet](http://mallet.cs.umass.edu/) - Statistical natural language processing, document classification, clustering, topic modeling and more.

## Networking

*Libraries for network programming.*

* [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) - Asynchronous HTTP and WebSocket client library.
* [Grizzly](https://grizzly.java.net/) - NIO framework. Used as a network layer in Glassfish.
* [Netty](http://netty.io/) - A framework for building high performance network applications.
* [OkHttp](http://square.github.io/okhttp/) - An HTTP+SPDY client for Android and Java applications.
* [Undertow](http://undertow.io/) - Web server providing both blocking and non-blocking API’s based on NIO. Used as a network layer in WildFly.

## ORM

*APIs which handle the persistence of objects.*

* [Ebean](http://ebean-orm.github.io/) - ORM Framework that provides fast data access and even faster coding.
* [EclipseLink](https://www.eclipse.org/eclipselink/) - Supports a number of persistence standards: JPA, JAXB, JCA and SDO.
* [Hibernate](http://hibernate.org/orm/) - Robust and widely used with an active community.
* [MyBatis](http://mybatis.github.io/mybatis-3/) - Persistence framework that couples objects with stored procedures or SQL statements.
* [OrmLite](http://ormlite.com/) - Lightweight ORM package avoiding the complexity and overhead of other ORM products.

## PDF

*Everything that helps with the creation of PDF files.*

* [Apache FOP](http://xmlgraphics.apache.org/fop/) - Creates PDF from XSL-FO.
* [Apache PDFBox](http://pdfbox.apache.org/) - Toolbox for creating and manipulating PDF.
* [DynamicReports](http://dynamicreports.org/) - Simplifies JasperReports.
* [iText](http://itextpdf.com/) - Easy to use PDF library which creates PDF files programmatically but requires a license for commercial purposes.
* [JasperReports](http://community.jaspersoft.com/project/jasperreports-library) - Complex reporting engine.

## Performance analysis

*Tools for performance optimization and dynamic program analysis.*

* [JProfiler](https://www.ej-technologies.com/products/jprofiler/overview.html) - Commercial Java profiler.
* [YourKit Java Profiler](https://www.yourkit.com/features/) - Commercial Java profiler.
* [VisualVM](http://visualvm.java.net/) - Visual interface for detailed information about running applications.

## REST Frameworks

*Frameworks specifically for creating RESTful services.*

* [Dropwizard](https://dropwizard.github.io/dropwizard/) - Opinionated framework for setting up modern web applications, includes Jetty, Jackson, Jersey and Metrics.
* [Feign](https://github.com/Netflix/feign) - Java to HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket.
* [Jersey](https://jersey.java.net/) - JAX-RS reference implementation.
* [RESTEasy](http://resteasy.jboss.org/) - Fully certified and portable implementation of the JAX-RS specification.
* [RestX](http://restx.io) - Opinionated framework based one annotation processor, providing support for REST endpoint, type safe DI, hot compile/reload, API doc, metrics, specs-oriented endpoint testing.
* [Retrofit](http://square.github.io/retrofit/) - A type-safe REST client for Java.
* [Spark](http://www.sparkjava.com/) - A Sinatra inspired framework for java.
* [Swagger](https://helloreverb.com/developers/swagger) - Swagger is a specification and complete framework implementation for describing, producing, consuming, and visualizing RESTful web services.

## Science

*Libraries for scientific computing and analysis.*

* [SCaVis](http://jwork.org/scavis/) - Environment for scientific computation, data analysis and data visualization.

## Search

*Engines which index documents for search and analysis.*

* [Apache Solr](http://lucene.apache.org/solr/) - Full enterprise search engine optimized for high volume traffic.
* [Elasticsearch](http://www.elasticsearch.org/) - Distributed, multitenant-capable full-text search engine with a RESTful web interface and schema-free JSON documents.

## Security

*Libraries that handle security, authentication, authorization or session management.*

* [Apache Shiro](http://shiro.apache.org/) - Performs authentication, authorization, cryptography and session management.
* [Cryptomator](http://cryptomator.org/) - Multiplatform transparent client-side encryption of files in the cloud.
* [Keycloak](http://keycloak.jboss.org/) - Integrated SSO and IDM for browser apps and RESTful web services. Currently in beta but looks very promising.
* [PicketLink](http://picketlink.org/) - PicketLink is an umbrella project for security and identity management for Java applications.
* [Spring Security](http://projects.spring.io/spring-security/) - Focuses on authentication/authorization and protects against several attack vectors.

## Serialization

*Libraries that handle serialization with high efficiency.*

* [FlatBuffers](https://github.com/google/flatbuffers) - Memory efficient serialization library that can access serialized data without unpacking and parsing it.
* [Kryo](https://github.com/EsotericSoftware/kryo) - Fast and efficient object graph serialization framework.
* [MessagePack](https://github.com/msgpack/msgpack-java) - Efficient binary serialization format.

## Server

*Servers which are specifically used to deploy applications.*

* [Apache Tomcat](http://tomcat.apache.org/) - Robust all-round server for Servlet and JSP.
* [Apache TomEE](http://tomee.apache.org/) - Tomcat plus Java EE.
* [GlassFish](https://glassfish.java.net/) - Open source reference implementation for Java EE sponsored by Oracle.
* [Jetty](http://www.eclipse.org/jetty/) - Lightweight, small server, often embedded in projects.
* [WebSphere Liberty](https://developer.ibm.com/wasdev/) - Lightweight, modular server developed by IBM
* [WildFly](http://www.wildfly.org/) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support.

## Template Engine

*Tools which substitute expressions in a template.*

* [Apache Velocity](http://velocity.apache.org/) - Templates for HTML pages, emails or source code generation in general.
* [FreeMarker](http://freemarker.org/) - General templating engine without any heavyweight or opinionated dependencies.
* [Handlebars.java](http://jknack.github.io/handlebars.java/) - Logic-less and semantic Mustache templates with Java.
* [JavaServer Pages](https://jsp.java.net/) - Common templating for websites with custom tag libraries.
* [Thymeleaf](http://www.thymeleaf.org/) - Aims to be a substitute for JSP and works for XML files in general.

## Testing

*Tools that test from object to interface level including performance and other benchmarks.*

* [Apache JMeter](http://jmeter.apache.org/) - Functional testing and performance measurements.
* [Arquillian](http://arquillian.org/) - Integration and functional testing platform with integration of Java EE containers.
* [AssertJ](http://joel-costigliola.github.io/assertj/) - Fluent assertions that improve readability.
* [Awaitility](https://github.com/jayway/awaitility) - DSL for synchronizing asynchronous operations.
* [Cucumber](https://github.com/cucumber/cucumber-jvm) - A BDD testing framework that supports the most popular programming languages for the JVM.
* [Gatling](http://gatling.io/) - Gatling is a highly capable load testing tool. It is designed for ease of use, maintainability and high performance.
* [Hamcrest](http://hamcrest.org/JavaHamcrest/) - Matchers that can be combined to create flexible expressions of intent.
* [JMH](http://openjdk.java.net/projects/code-tools/jmh/) - Microbenchmarking tool for the JVM.
* [JMockit](http://jmockit.org/) - The Mock Anything Toolkit for Java, mocks static, final methods and more.
* [JUnit](http://junit.org/) - Common testing framework.
* [Mockito](https://github.com/mockito/mockito) - Creation of test double objects in automated unit tests for the purpose of TDD or BDD.
* [PowerMock](https://github.com/jayway/powermock) - Allows you to unit test code normally regarded as untestable.
* [Selenide](http://selenide.org/) - Concise API around Selenium to write stable and readable UI tests.
* [Selenium](http://docs.seleniumhq.org/) - Portable software testing framework for web applications.
* [Spock](http://docs.spockframework.org/) - Testing framework featuring an expressive Groovy-derived specification language. Compatible with JUnit runners so easy to use with standard build tools and IDEs.
* [TestNG](http://testng.org/) - Testing framework.
* [Unitils](http://www.unitils.org/) - Testing library divided into modules for unit and integration testing.

## Utility

*Libraries which provide general utility functions.*

* [Apache Commons](http://commons.apache.org/) - Provides different general purpose functions like configuration, validation, collections, file upload or XML processing.
* [args4j](http://args4j.kohsuke.org/) - Command line arguments parser.
* [Guava](https://github.com/google/guava) - Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and so forth.
* [JADE](http://jade.tilab.com/) - Providers a framework and an environment to build and to debug multi-agent systems.
* [javatuples](http://www.javatuples.org/) - Does what it says, although the concept of tuples in general is debatable.
* [JCommander](http://jcommander.org/) - Command line arguments parser; its been around, active, and maintained by the creator since 2010.
* [JGraphT](http://jgrapht.org/) - A graph library that provides mathematical graph-theory objects and algorithms.
* [JScience](http://jscience.org/) - Provides a set of classes to work with scientific measurements and units.
* [Protégé](http://protege.stanford.edu/) - Provides an ontology editor and a framework to build knowledge-based systems.

## Web Crawling

*Libraries that analyze the content of websites.*

* [Apache Nutch](http://nutch.apache.org/) - Highly extensible, highly scalable Web crawler for production environment.
* [Crawler4j](https://github.com/yasserg/crawler4j) - Simple lightweight alternative.
* [JSoup](http://jsoup.org/) - Scrapes, parses, manipulates and cleans HTML.

## Web Frameworks

*Frameworks that handle the communication between the layers of an web application.*
h
* [Apache Tapestry](http://tapestry.apache.org/) - Component oriented framework for creating dynamic, robust, highly scalable web applications in Java.
* [Apache Wicket](http://wicket.apache.org/) - Component-based web application framework similar to Tapestry with a stateful GUI.
* [Google Web Toolkit](http://www.gwtproject.org/) - Toolbox which includes a Java-to-JavaScript compiler for client-side code, XML parser, API for RPC, JUnit integration, internationalization support and widgets for the GUI.
* [Grails](https://grails.org/) - Groovy framework with the aim to provide a highly productive environment by favoring convention over configuration, no XML and support for mixins.
* [Ninja](http://www.ninjaframework.org/) - Full stack web framework for Java. Rock solid, fast and super productive.
* [Play](http://www.playframework.com/) - Uses convention over configuration, hot code reloading and display of errors in the browser.
* [PrimeFaces](http://primefaces.org/) - JSF framework which has a free and a commercial version with support. Provides several frontend components.
* [Ratpack](http://www.ratpack.io/) - A set of Java libraries that facilitate fast, efficient, evolvable and well tested HTTP applications.
* [Spring Boot](http://projects.spring.io/spring-boot/) - Microframework which simplifies the development of new Spring applications.
* [Spring](http://projects.spring.io/spring-framework/) - Aims to simplify the development with Java EE and provides packages for dependency injection and aspect-oriented programming.
* [Vaadin](https://vaadin.com/) - Event-driven framework build on top of GWT. Uses server-side architecture with Ajax on the client-side.

# Resources

## Communities

*Active discussions.*

* [r/java](http://www.reddit.com/r/java) - Subreddit for the Java community.
* [stackoverflow](http://stackoverflow.com/questions/tagged/java) - Question/answer platform.
* [vJUG](http://virtualjug.com/) - Online Java user group.

## Influential Books

*Books about Java that had a high impact and are still worth reading.*

* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
* [Java Concurrency in Practice](http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
* [Java 8 in Action](http://www.amazon.com/Java-Action-Lambdas-functional-style-programming/dp/1617291994/)
* [Thinking in Java](http://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

## Podcasts

*Something to listen to while programming.*

* [The Java Posse](http://www.javaposse.com/) (discontinued as of 02/2015)
* [The Java Council](http://virtualjug.com/podcast/)

## Twitter

*Active accounts to follow.*

* [Adam Bien](https://twitter.com/AdamBien/) - Freelancer: Author, JavaONE Rockstar Speaker, Consultant, Java Champion.
* [Antonio Goncalves](https://twitter.com/agoncal/) - Java Champion, JUG Leader, Devoxx France, Java EE 6/7, JCP, Author.
* [Arun Gupta](https://twitter.com/arungupta/) - Java Champion, JavaOne Rockstar, UG Leader, Devoxx4Kids-er, Red Hatter.
* [Bruno Borges](https://twitter.com/brunoborges) - Product Manager/Java Jock at Oracle.
* [Ed Burns](https://twitter.com/edburns) - Consulting Member of the Technical Staff at Oracle.
* [Eugen Paraschiv](https://twitter.com/baeldung) - Author of the Spring Security Course.
* [James Weaver](https://twitter.com/JavaFXpert) - Java/JavaFX/IoT developer, author and speaker.
* [Java EE](https://twitter.com/Java_EE/) - Official Java EE Twitter account.
* [Java Magazine](https://twitter.com/Oraclejavamag) - Official Java Magazine account.
* [Java.net](https://twitter.com/javanetbuzz/) - Official Java.net account.
* [Java](https://twitter.com/java/) - Official Java Twitter account.
* [Javin Paul](https://twitter.com/javinpaul) - Well-known Java blogger.
* [Lukas Eder](https://twitter.com/lukaseder) - Founder and CEO Data Geekery (jOOQ).
* [Mario Fusco](https://twitter.com/mariofusco) - RedHatter, JUG coordinator, frequent speaker and author.
* [Mark Reinhold](https://twitter.com/mreinhold) - Chief Architect, Java Platform Group, Oracle.
* [Markus Eisele](https://twitter.com/myfear) - Java EE evangelist, Red Hat
* [Martijn Verburg](https://twitter.com/karianna) - London JUG co-leader, speaker, author, Java Champion and much more.
* [OpenJDK](https://twitter.com/OpenJDK) - Official OpenJDK account.
* [Peter Lawrey](https://twitter.com/PeterLawrey) - Peter Lawrey, Java performance expert
* [Reza Rahman](https://twitter.com/reza_rahman) - Java EE/GlassFish/WebLogic evangelist, author, speaker, open source hacker.
* [Roberto Cortez](https://twitter.com/radcortez) - Java EE/JPA expert, speaker, open source
* [Simon Maple](https://twitter.com/sjmaple) - Java Champion, virtualJUG founder, LJC leader, RebelLabs author.
* [Stephen Colebourne](https://twitter.com/jodastephen) - Java Champion, speaker.
* [Tim Boudreau](https://twitter.com/kablosna) - Author and NetBeans guru.
* [Trisha Gee](https://twitter.com/trisha_gee) - Java Champion and speaker.

## Websites

*Sites to read.*

* [Android Arsenal](https://android-arsenal.com)
* [Google Java Style](http://google-styleguide.googlecode.com/svn/trunk/javaguide.html)
* [InfoQ](http://www.infoq.com/)
* [Java Code Geeks](http://www.javacodegeeks.com/)
* [Java.net](http://java.net/)
* [Javalobby](http://java.dzone.com/)
* [JavaWorld](http://www.javaworld.com/)
* [Java, SQL, and jOOQ](http://blog.jooq.org/)
* [JAXenter](http://jaxenter.com/)
* [RebelLabs](http://zeroturnaround.com/rebellabs/)
* [The Java Specialist' Newsletter](http://www.javaspecialists.eu/archive/archive.jsp)
* [TheServerSide.com](http://www.theserverside.com/)
* [The Takipi Blog](http://blog.takipi.com/)
* [Thoughts On Java](http://www.thoughts-on-java.org/)
* [Vanilla Java](http://vanillajava.blogspot.ch/)
* [Vlad Mihalcea on Hibernate](http://vladmihalcea.com/)
* [Voxxed](https://www.voxxed.com/)

# Contributing

Contributions are very welcome!

Please have a look at [CONTRIBUTING](https://github.com/akullpp/awesome-java/blob/master/CONTRIBUTING.md) for guidelines.
