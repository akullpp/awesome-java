# Awesome Java [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of awesome Java frameworks, libraries and software.

## Contents

- [Projects](#projects)
  - [Bean Mapping](#bean-mapping)
  - [Build](#build)
  - [Bytecode Manipulation](#bytecode-manipulation)
  - [Caching](#caching)
  - [CLI](#cli)
  - [Cluster Management](#cluster-management)
  - [Code Analysis](#code-analysis)
  - [Code Coverage](#code-coverage)
  - [Code Generators](#code-generators)
  - [Compiler-compiler](#compiler-compiler)
  - [Configuration](#configuration)
  - [Constraint Satisfaction Problem Solver](#constraint-satisfaction-problem-solver)
  - [CSV](#csv)
  - [Data structures](#data-structures)
  - [Database](#database)
  - [Date and Time](#date-and-time)
  - [Dependency Injection](#dependency-injection)
  - [Development](#development)
  - [Distributed Applications](#distributed-applications)
  - [Distributed Transactions](#distributed-transactions)
  - [Distribution](#distribution)
  - [Document Processing](#document-processing)
  - [Formal Verification](#formal-verification)
  - [Functional Programming](#functional-programming)
  - [Game Development](#game-development)
  - [Geospatial](#geospatial)
  - [GUI](#gui)
  - [High Performance](#high-performance)
  - [HTTP Clients](#http-clients)
  - [Hypermedia Types](#hypermedia-types)
  - [IDE](#ide)
  - [Imagery](#imagery)
  - [JSON Processing](#json-processing)
  - [JSON](#json)
  - [JVM and JDK](#jvm-and-jdk)
  - [Logging](#logging)
  - [Machine Learning](#machine-learning)
  - [Messaging](#messaging)
  - [Microservice](#microservice)
  - [Miscellaneous](#miscellaneous)
  - [Monitoring](#monitoring)
  - [Native](#native)
  - [Natural Language Processing](#natural-language-processing)
  - [Networking](#networking)
  - [ORM](#orm)
  - [PaaS](#paas)
  - [PDF](#pdf)
  - [Performance analysis](#performance-analysis)
  - [Platform](#platform)
  - [Processes](#processes)
  - [Reactive libraries](#reactive-libraries)
  - [REST Frameworks](#rest-frameworks)
  - [Science](#science)
  - [Search](#search)
  - [Security](#security)
  - [Serialization](#serialization)
  - [Server](#server)
  - [Template Engine](#template-engine)
  - [Testing](#testing)
  - [Utility](#utility)
  - [Version Managers](#version-managers)
  - [Web Crawling](#web-crawling)
  - [Web Frameworks](#web-frameworks)
- [Resources](#resources)
  - [Awesome Lists](#awesome-lists)
  - [Communities](#communities)
  - [Frontends](#frontends)
  - [Influential Books](#influential-books)
  - [Podcasts and Screencasts](#podcasts-and-screencasts)
  - [Twitter](#twitter)
  - [Websites](#websites)
- [Contributing](#contributing)

## Projects

### Bean Mapping

*Frameworks that ease bean mapping.*

- [dOOv](https://github.com/doov-io/doov) - Provides fluent API for typesafe domain model validation and mapping. It uses annotations, code generation and a type safe DSL to make bean validation and mapping fast and easy. (doov-io/doov apache-2.0)
- [Dozer](https://github.com/DozerMapper/dozer) - Mapper that copies data from one object to another using annotations and API or XML configuration. (DozerMapper/dozer apache-2.0)
- [JMapper](https://jmapper-framework.github.io/jmapper-core) - Uses byte code manipulation for lightning-fast mapping. Supports annotations and API or XML configuration. (jmapper-framework/jmapper-core apache-2.0)
- [MapStruct](https://github.com/mapstruct/mapstruct) - Code generator that simplifies mappings between different bean types, based on a convention-over-configuration approach. (mapstruct/mapstruct other)
- [ModelMapper](https://github.com/jhalterman/modelmapper) - Intelligent object mapping library that automatically maps objects to each other. (jhalterman/modelmapper apache-2.0)
- [Orika](https://github.com/orika-mapper/orika) - JavaBean-mapping framework that recursively copies (among other capabilities) data from one object to another. (orika-mapper/orika apache-2.0)
- [Selma](https://github.com/xebia-france/selma) - Annotation processor-based bean mapper. (xebia-france/selma apache-2.0)

### Build

*Tools that handle the build cycle and dependencies of an application.*

- [Apache Maven](https://maven.apache.org) - Declarative build and dependency management that favors convention over configuration. It might be preferable to Apache Ant, which uses a rather procedural approach and can be difficult to maintain. (apache/maven-site NA)
- [Bazel](https://bazel.io) - Tool from Google that builds code quickly and reliably. (bazelbuild/bazel apache-2.0)
- [Buck](https://github.com/facebook/buck) - Encourages the creation of small, reusable modules consisting of code and resources. (facebook/buck apache-2.0)
- [Gradle](https://gradle.org) - Incremental builds programmed via Groovy instead of declaring XML. Works well with Maven's dependency management. (gradle/gradle apache-2.0)

### Bytecode Manipulation

*Libraries to manipulate bytecode programmatically.*

- [ASM](http://asm.ow2.org) - All-purpose, low-level bytecode manipulation and analysis.
- [Byte Buddy](http://bytebuddy.net) - Further simplifies bytecode generation with a fluent API. (raphw/byte-buddy apache-2.0)
- [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) - Java 8 Jar & Android APK reverse engineering suite. (Konloch/bytecode-viewer gpl-3.0)
- [Byteman](https://byteman.jboss.org) - Manipulate bytecode at runtime via DSL (rules); mainly for testing/troubleshooting. (bytemanproject/byteman NA)
- [cglib](https://github.com/cglib/cglib) - Bytecode generation library. (cglib/cglib apache-2.0)
- [Javassist](https://jboss-javassist.github.io/javassist) - Tries to simplify bytecode editing. (jasonlong/cayman-theme NA) (jboss-javassist/javassist other)
- [Mixin](https://github.com/SpongePowered/Mixin) - Manipulate bytecode at runtime using real Java code. (SpongePowered/Mixin mit)
- [Perses](https://github.com/nicolasmanic/perses) - Dynamically injects failure/latency at the bytecode level according to principles of chaos engineering.  (nicolasmanic/perses mit)

### Caching

*Libraries that provide caching facilities.*

- [cache2k](https://cache2k.org) - In-memory high performance caching library. (cache2k/cache2k apache-2.0) (cb372/scalacache other) (headissue/cache2k apache-2.0)
- [Caffeine](https://github.com/ben-manes/caffeine) - High-performance, near-optimal caching library. (ben-manes/caffeine apache-2.0)
- [Ehcache](http://www.ehcache.org) - Distributed general-purpose cache. (ehcache/ehcache3 apache-2.0)
- [Infinispan](http://infinispan.org) - Highly concurrent key/value datastore used for caching. (infinispan/infinispan.github.io other) (jbossorg/bootstrap-community apache-2.0)

### CLI

*Libraries for everything related to the CLI.*

- [ASCII Table](https://github.com/vdmeer/asciitable) - Library to draw tables in ASCII. (vdmeer/asciitable apache-2.0)
- [Airline](https://github.com/airlift/airline) - Annotation-based framework for parsing Git-like command-line arguments. (airlift/airline apache-2.0)
- [args4j](http://args4j.kohsuke.org) - Small library to parse command-line arguments. (kohsuke/args4j mit)
- [Jansi](https://github.com/fusesource/jansi) - ANSI escape codes to format console output. (fusesource/jansi apache-2.0)
- [Java ASCII Render](https://github.com/indvd00m/java-ascii-render) - Graphical primitives for the console. (indvd00m/java-ascii-render apache-2.0)
- [JCommander](http://jcommander.org) - Command-line argument-parsing framework with custom types and validation via implementing interfaces. (cbeust/jcommander apache-2.0) (cbeust/kobalt apache-2.0) (cbeust/testng apache-2.0)
- [jbock](https://github.com/h908714124/jbock) - Typesafe, reflection-free, annotation based command-line parser  (h908714124/jbock mit)
- [JLine](https://github.com/jline/jline3) - Includes features from modern shells like completion or history. (jline/jline3 other)
- [JOpt Simple](https://jopt-simple.github.io/jopt-simple) - Fluent parser that uses the POSIX#getopt and GNU#getopt_long syntaxes. (remkop/picocli apache-2.0)
- [picocli](http://picocli.info) - ANSI colors and styles in usage help with annotation-based POSIX/GNU/any syntax, subcommands, strong typing for both options and positional args. (Microsoft/WSL NA) (adoxa/ansicon other) (fusesource/jansi apache-2.0) (remkop/picocli apache-2.0)
- [Text-IO](https://github.com/beryx/text-io) - Aids the creation of full console-based applications. (beryx/text-io other)
- [Lanterna](https://github.com/mabe02/lanterna) - Easy console text-GUI library, similar to curses. (mabe02/lanterna lgpl-3.0)

### Cluster Management

*Frameworks that can dynamically manage applications inside of a cluster.*

- [Apache Aurora](https://aurora.apache.org) - Mesos framework for long-running services and cron jobs.
- [Apache Mesos](https://mesos.apache.org) - Abstracts CPU, memory, storage, and other compute resources away from machines.
- [Singularity](http://getsingularity.com) - Mesos framework that makes deployment and operations easy. It supports web services, background workers, scheduled jobs, and one-off tasks. (HubSpot/Baragon apache-2.0) (HubSpot/Singularity apache-2.0)

### Code Analysis

*Tools that provide metrics and quality measurements.*

- [Checkstyle](https://github.com/checkstyle/checkstyle) - Static analysis of coding conventions and standards. (checkstyle/checkstyle other)
- [Error Prone](https://github.com/google/error-prone) - Catches common programming mistakes as compile-time errors. (google/error-prone apache-2.0)
- [Infer](https://github.com/facebook/infer) - Modern static analysis tool for verifying the correctness of code. (facebook/infer mit)
- [jQAssistant](https://jqassistant.org) - Static code analysis with Neo4J-based query language. (buschmais/jqassistant NA) (buschmais/sar-framework NA) (jqassistant-contrib/jqassistant-asciidoc-report-plugin gpl-3.0) (jqassistant-contrib/jqassistant-plantuml-rule-plugin gpl-3.0) (jqassistant-contrib/jqassistant-test-impact-analysis-plugin gpl-3.0) (jqassistant-contrib/sonar-jqassistant-plugin NA) (kontext-e/jqassistant-plugins gpl-3.0) (larusba/jqa-nmap-plugin gpl-3.0) (softvis-research/jqa-dashboard apache-2.0)
- [NullAway](https://github.com/uber/NullAway) - Eliminates NullPointerExceptions with low build-time overhead. (uber/NullAway mit)
- [PMD](https://github.com/pmd/pmd) - Source code analysis for finding bad coding practices. (pmd/pmd other)
- [SonarJava](https://github.com/SonarSource/sonar-java) - Static analyzer for SonarQube & SonarLint. (SonarSource/sonar-java other)
- [Sourcetrail ![c]](https://www.sourcetrail.com) - Visual source code navigator. (CoatiSoftware/SourcetrailBugTracker NA) (CoatiSoftware/SourcetrailDB apache-2.0)
- [Spoon](https://github.com/INRIA/spoon) - Library for analyzing and transforming Java source code. (INRIA/spoon other)
- [Spotbugs](https://github.com/spotbugs/spotbugs) - Static analysis of bytecode to find potential bugs. (spotbugs/spotbugs lgpl-2.1)

### Code Coverage

*Frameworks and tools that enable code coverage metrics collection for test suites.*

- [Clover ![c]](https://www.atlassian.com/software/clover/overview) - Relies on source-code instrumentation instead of bytecode instrumentation.
- [Cobertura](https://cobertura.github.io/cobertura) - Relies on offline (or static) bytecode instrumentation and class loading to collect code coverage metrics. (cobertura/cobertura gpl-2.0)
- [JaCoCo](http://eclemma.org/jacoco) - Framework that enables collection of code coverage metrics, using both offline and runtime bytecode instrumentation. (jacoco/jacoco other) (jacoco/www.eclemma.org NA)

### Code Generators

*Tools that generate patterns for repetitive code in order to reduce verbosity and error-proneness.*

- [ADT4J](https://github.com/sviperll/adt4j) - JSR-269 code generator for algebraic data types. (sviperll/adt4j other)
- [Auto](https://github.com/google/auto) - Generates factory, service, and value classes. (google/auto apache-2.0)
- [FreeBuilder](https://github.com/google/FreeBuilder) - Automatically generates the Builder pattern. (google/FreeBuilder apache-2.0)
- [Immutables](https://immutables.github.io) - Annotation processors to generate simple, safe and consistent value objects. (immutables/immutables apache-2.0)
- [JavaPoet](https://github.com/square/javapoet) - API to generate source files. (square/javapoet apache-2.0)
- [JHipster](https://github.com/jhipster/generator-jhipster) - Yeoman source code generator for Spring Boot and AngularJS. (jhipster/generator-jhipster apache-2.0)
- [Joda-Beans](http://www.joda.org/joda-beans) - Small framework that adds queryable properties to Java, enhancing JavaBeans. (JodaOrg/joda-beans apache-2.0) (JodaOrg/reflow-maven-skin apache-2.0)
- [Lombok](https://projectlombok.org) - Code generator that aims to reduce verbosity. (rzwitserloot/lombok mit)

### Compiler-compiler

*Frameworks that help to create parsers, interpreters or compilers.*

- [ANTLR](http://www.antlr.org) - Complex full-featured framework for top-down parsing. (antlr/antlr4 other)
- [JavaCC](https://javacc.org) - Parser generator that generates top-down parsers. Allows lexical state switching and permits extended BNF specifications. (javacc/javacc other)
- [JFlex](http://jflex.de) - A lexical analyzer generator. (jflex-de/jflex other)

### Configuration

*Libraries that provide external configuration.*

- [centraldogma](https://github.com/line/centraldogma) - Highly-available version-controlled service configuration repository based on Git, ZooKeeper and HTTP/2. (line/centraldogma apache-2.0)
- [cfg4j](https://github.com/cfg4j/cfg4j) - Modern configuration library for distributed apps written in Java. (cfg4j/cfg4j apache-2.0)
- [config](https://github.com/typesafehub/config) - Configuration library for JVM languages. (typesafehub/config apache-2.0)
- [dotenv](https://github.com/shyiko/dotenv) - A twelve-factor configuration library for Java. (shyiko/dotenv NA)
- [ini4j](http://ini4j.sourceforge.net) - Provides an API for handling Windows' INI files.
- [KAConf](https://github.com/mariomac/kaconf) - Annotation-based configuration system for Java and Kotlin. (mariomac/kaconf apache-2.0)
- [owner](https://github.com/lviggiano/owner) - Reduces boilerplate of properties. (lviggiano/owner bsd-3-clause)

### Constraint Satisfaction Problem Solver

*Libraries that help with implementing optimization and satisfiability problems.*

- [Choco](http://choco-solver.org) - Off-the-shelf constraint satisfaction problem solver that uses constraint programming techniques. (aengelberg/loco NA) (chocoteam/choco-solver other)
- [JaCoP](https://github.com/radsz/jacop) - Includes an interface for the FlatZinc language, enabling it to execute MiniZinc models. (radsz/jacop agpl-3.0)
- [OptaPlanner](https://www.optaplanner.org) - Business planning and resource scheduling optimization solver. (kiegroup/optaplanner apache-2.0) (kiegroup/optaplanner-website apache-2.0)

### CSV

*Frameworks and libraries that simplify reading/writing CSV data.*

- [jackson-dataformat-csv](https://github.com/FasterXML/jackson-dataformat-csv) - Jackson extension for reading and writing CSV. (FasterXML/jackson-dataformat-csv NA)
- [opencsv](http://opencsv.sourceforge.net) - Simple CSV parser.
- [Super CSV](https://super-csv.github.io/super-csv) - Powerful CSV parser with support for Dozer, Joda-Time and Java 8. (super-csv/super-csv apache-2.0)
- [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) - One of the fastest and most feature-complete parsers. Also comes with parsers for TSV and fixed-width records. (uniVocity/univocity-parsers other)

### Database

*Everything that simplifies interactions with the database.*

- [Apache Drill](https://drill.apache.org) - Distributed, schema on-the-fly, ANSI SQL query engine for Big Data exploration.
- [Apache Phoenix](https://phoenix.apache.org) - High-performance relational database layer over HBase for low-latency applications.
- [AranoDB](https://github.com/arangodb/arangodb-java-driver) -  ArangoDB Java driver. (arangodb/arangodb-java-driver apache-2.0)
- [Chronicle Map](https://github.com/OpenHFT/Chronicle-Map) - Efficient, in-memory (opt. persisted to disk), off-heap key-value store. (OpenHFT/Chronicle-Map apache-2.0)
- [druid](http://druid.io) - High-performance, column-oriented, distributed data store. (apache/incubator-druid apache-2.0)
- [eXist](https://github.com/eXist-db/exist) - A NoSQL document database and application platform. (eXist-db/exist lgpl-2.1)
- [FlexyPool](https://github.com/vladmihalcea/flexy-pool) - Brings metrics and failover strategies to the most common connection pooling solutions. (vladmihalcea/flexy-pool apache-2.0)
- [Flyway](https://flywaydb.org) - Simple database migration tool. (flyway/flyway other)
- [H2](https://h2database.com) - Small SQL database notable for its in-memory functionality.
- [HikariCP](https://github.com/brettwooldridge/HikariCP) - High-performance JDBC connection pool. (brettwooldridge/HikariCP apache-2.0)
- [jasync-sql](https://github.com/jasync-sql/jasync-sql) - Async DB driver for MySQL and PostgreSQL. (jasync-sql/jasync-sql apache-2.0)
- [JDBI](http://jdbi.org) - Convenient abstraction of JDBC. (arteam/dropwizard-jdbi3 mit) (arteam/metrics-jdbi3 apache-2.0) (jdbi/jdbi other) (opentable/otj-pg-embedded apache-2.0)
- [Jedis](https://github.com/xetorthio/jedis) - Small client for interaction with Redis, with methods for commands. (xetorthio/jedis mit)
- [Jest](https://github.com/searchbox-io/Jest) - Client for the Elasticsearch REST API. (searchbox-io/Jest apache-2.0)
- [jetcd](https://github.com/justinsb/jetcd) - Client library for etcd. (justinsb/jetcd apache-2.0)
- [Jinq](https://github.com/my2iu/Jinq) - Typesafe database queries via symbolic execution of Java 8 Lambdas (on top of JPA or jOOQ). (my2iu/Jinq other)
- [jOOQ](https://www.jooq.org) - Generates typesafe code based on SQL schema. (jOOQ/jOOQ other)
- [Liquibase](http://www.liquibase.org) - Database-independent library for tracking, managing and applying database schema changes. (liquibase/liquibase.github.com NA)
- [MapDB](http://www.mapdb.org) - Embedded database engine that provides concurrent collections backed on disk or in off-heap memory.
- [MariaDB4j](https://github.com/vorburger/MariaDB4j) - Launcher for MariaDB that requires no installation or external dependencies. (vorburger/MariaDB4j apache-2.0)
- [OrientDB](https://orientdb.com/orientdb) - Embeddable distributed database written on top of Hazelcast. (orientechnologies/orientdb apache-2.0)
- [Presto](https://github.com/prestodb/presto) - Distributed SQL query engine for big data. (prestodb/presto apache-2.0)
- [Querydsl](http://www.querydsl.com) - Typesafe unified queries. (querydsl/querydsl apache-2.0)
- [Realm](https://github.com/realm/realm-java) - Mobile database to run directly inside phones, tablets or wearables. (realm/realm-java other)
- [Redisson](https://github.com/mrniko/redisson) - Allows for distributed and scalable data structures on top of a Redis server. (mrniko/redisson apache-2.0)
- [requery](https://github.com/requery/requery) - A modern, lightweight but powerful object mapping and SQL generator. Easily map to or create databases, or perform queries and updates from any Java-using platform. (requery/requery apache-2.0)
- [Speedment](https://github.com/speedment/speedment) - Database access library that utilizes Java 8's Stream API for querying. (speedment/speedment other)
- [sql2o](https://sql2o.org) - Thin JDBC wrapper that simplifies database access and provides simple mapping of ResultSets to POJOs. (aaberg/sql2o mit)
- [Vibur DBCP](https://www.vibur.org) - JDBC connection pool library with advanced performance monitoring capabilities. (ben-manes/concurrentlinkedhashmap apache-2.0) (vibur/vibur-dbcp apache-2.0) (vibur/vibur-dbcp-hibernate3 apache-2.0) (vibur/vibur-dbcp-hibernate4 apache-2.0) (vibur/vibur-dbcp-hibernate5 apache-2.0) (vibur/vibur-dbcp.git NA)
- [Xodus](https://jetbrains.github.io/xodus) - Highly concurrent transactional schema-less and ACID-compliant embedded database. (JetBrains/xodus apache-2.0) (OpenHFT/Chronicle-Map apache-2.0) (jankotek/MapDB apache-2.0) (lehvolk/xodus-entity-browser apache-2.0)

### Data Structures

*Efficient and specific data structures.*

- [Apache Avro](https://avro.apache.org) - Data interchange format with dynamic typing, untagged data, and absence of manually assigned IDs.
- [Apache Orc](https://orc.apache.org) - Fast and efficient columnar storage format for Hadoop-based workloads.
- [Apache Parquet](https://parquet.apache.org) - Columnar storage format based on assembly algorithms from Google's paper on Dremel. (apache/parquet-mr apache-2.0)
- [Apache Thrift](https://thrift.apache.org) - Data interchange format that originated at Facebook. (apache/thrift apache-2.0)
- [Big Queue](https://github.com/bulldog2011/bigqueue) - A big, fast and persistent queue based on memory-mapped files. (bulldog2011/bigqueue apache-2.0)
- [HyperMinHash-java](https://github.com/LiveRamp/HyperMinHash-java) - Probabilistic data structure for computing union, intersection, and set cardinality in loglog space.  (LiveRamp/HyperMinHash-java other)
- [Persistent Collection](https://pcollections.org) - Persistent and immutable analogue of the Java Collections Framework. (google/guava apache-2.0) (hrldcpr/pcollections mit) (pcollections/pcollections.git NA)
- [Protobuf](https://github.com/google/protobuf) - Google's data interchange format. (google/protobuf other)
- [SBE](https://github.com/real-logic/simple-binary-encoding) - Simple Binary Encoding, one of the fastest message formats around. (real-logic/simple-binary-encoding apache-2.0)
- [Tape](https://github.com/square/tape) - A lightning-fast, transactional, file-based FIFO. (square/tape apache-2.0)
- [Wire](https://github.com/square/wire) - Clean, lightweight protocol buffers. (square/wire apache-2.0)

### Date and Time

*Libraries related to handling date and time.*

- [Almanac Converter](https://github.com/hypotemoose/almanac-converter) - Simple conversion between different calendar systems. (hypotemoose/almanac-converter apache-2.0)
- [iCal4j](https://github.com/ical4j/ical4j) - Parse and build iCalendar [RFC 5545](https://tools.ietf.org/html/rfc5545) data models. (ical4j/ical4j bsd-3-clause)
- [ThreeTen-Extra](https://github.com/ThreeTen/threeten-extra) - Additional date-time classes that complement those in JDK 8. (ThreeTen/threeten-extra bsd-3-clause)
- [Time4J](https://github.com/MenoData/Time4J) - Advanced date and time library. (MenoData/Time4J lgpl-2.1)

### Dependency Injection

*Libraries that help to realize the [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control) paradigm.*

- [Apache DeltaSpike](https://deltaspike.apache.org) - CDI extension framework.
- [Dagger2](https://google.github.io/dagger) - Compile-time injection framework without reflection. (google/dagger apache-2.0) (square/dagger apache-2.0)
- [Feather](https://github.com/zsoltherpai/feather) - Ultra-lightweight, JSR-330-compliant dependency injection library. (zsoltherpai/feather other)
- [Governator](https://github.com/Netflix/governator) - Extensions and utilities that enhance Google Guice. (Netflix/governator apache-2.0)
- [Guice](https://github.com/google/guice) - Lightweight and opinionated framework that completes Dagger. (google/guice apache-2.0)
- [HK2](https://javaee.github.io/hk2) - Lightweight and dynamic dependency injection framework. (javaee/hk2 other)
- [JayWire](https://github.com/vanillasource/jaywire) - Lightweight dependency injection framework. (vanillasource/jaywire NA)

### Development

*Augmentation of the development process at a fundamental level.*

- [AspectJ](https://eclipse.org/aspectj) - Seamless aspect-oriented programming extension.
- [DCEVM](https://dcevm.github.io) - JVM modification that allows unlimited redefinition of loaded classes at runtime. (TravaOpenJDK/trava-jdk-11-dcevm apache-2.0) (dcevm/dcevm NA) (dcevm/dcevm.github.io NA)
- [Faux Pas](https://github.com/zalando/faux-pas) - Library that simplifies error handling by circumventing the issue that none of the functional interfaces in the Java Runtime is allowed by default to throw checked exceptions. (zalando/faux-pas mit)
- [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Unlimited runtime class and resource redefinition. (HotswapProjects/HotswapAgent gpl-2.0)
- [JavaParser](https://github.com/javaparser/javaparser) - Parse, modify and generate Java code. (javaparser/javaparser other)
- [JavaSymbolSolver](https://github.com/javaparser/javasymbolsolver) - A symbol solver for Java. (javaparser/javasymbolsolver apache-2.0)
- [JRebel ![c]](https://zeroturnaround.com/software/jrebel) - Instantly reloads code and configuration changes without redeploys.
- [Manifold](https://manifold.systems) - Re-energizes Java with powerful features like type-safe metaprogramming, structural typing and extension methods.
- [NoException](https://noexception.machinezoo.com) - Allows checked exceptions in functional interfaces and converts exceptions to Optional return. (SeregaLBN/StreamUnthrower NA) (StefanLiebenberg/throwable-interfaces mit) (diffplug/durian apache-2.0) (fge/throwing-lambdas other) (jOOQ/jOOL apache-2.0) (robertvazan/noexception apache-2.0) (zalando/faux-pas mit)
- [SneakyThrow](https://github.com/rainerhahnekamp/sneakythrow) - Ignores checked exceptions without bytecode manipulation. Can also be used inside Java 8 stream operations. (rainerhahnekamp/sneakythrow mit)

### Distributed Applications

*Libraries and frameworks for writing distributed and fault-tolerant applications.*

- [Apache Geode](https://geode.apache.org) - In-memory data management system that provides reliable asynchronous event notifications and guaranteed message delivery. (apache/geode apache-2.0)
- [Apache Storm](https://storm.apache.org) - Realtime computation system.
- [Apache ZooKeeper](https://zookeeper.apache.org) - Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems.
- [Atomix](http://atomix.io/) - Fault-tolerant distributed coordination framework.
- [Axon Framework](http://www.axonframework.org) - Framework for creating CQRS applications.
- [Dropwizard Circuit Breaker](https://github.com/mtakaki/dropwizard-circuitbreaker) - Circuit breaker design pattern for Dropwizard. (mtakaki/dropwizard-circuitbreaker gpl-2.0)
- [Failsafe](https://github.com/jhalterman/failsafe) - Simple failure handling with retries and circuit breakers. (jhalterman/failsafe apache-2.0)
- [Hazelcast ![c]](https://hazelcast.org) - Highly scalable in-memory datagrid with a free open-source version. (hazelcast/hazelcast apache-2.0) (hazelcast/hazelcast-code-samples NA) (hazelcast/hazelcast-cpp-client apache-2.0) (hazelcast/hazelcast-csharp-client apache-2.0) (hazelcast/hazelcast-go-client apache-2.0) (hazelcast/hazelcast-nodejs-client apache-2.0) (hazelcast/hazelcast-python-client apache-2.0)
- [Hystrix](https://github.com/Netflix/Hystrix) - Provides latency and fault tolerance. (Netflix/Hystrix apache-2.0)
- [JGroups](http://www.jgroups.org) - Toolkit for reliable messaging and cluster creation.
- [Orbit](http://www.orbit.cloud) - Virtual actors; adds another level of abstraction to traditional actors. (orbit/orbit other)
- [Quasar](https://www.paralleluniverse.co/quasar) - Lightweight threads and actors for the JVM. (puniverse/quasar other)
- [resilience4j](https://github.com/resilience4j/resilience4j) - Functional fault tolerance library. (resilience4j/resilience4j apache-2.0)
- [ScaleCube](https://github.com/scalecube/scalecube) - Embeddable Cluster-Membership library based on SWIM and gossip protocol. (scalecube/scalecube apache-2.0)
- [Zuul](https://github.com/Netflix/zuul) - A gateway service that provides dynamic routing, monitoring, resiliency, security, and more. (Netflix/zuul apache-2.0)

### Distributed Transactions

*Distributed transactions provide a mechanism for ensuring consistency of data updates in the presence of concurrent access and partial failures.*

- [Atomikos](https://www.atomikos.com) - Provides transactions for REST, SOA and microservices with support for JTA and XA.
- [Bitronix](https://github.com/bitronix/btm) - A simple but complete implementation of the JTA 1.1 API. (bitronix/btm apache-2.0)
- [Narayana](http://narayana.io) - Provides support for traditional ACID and compensation transactions, also complies with JTA, JTS and other standards. (jbosstm/quickstart other)

### Distribution

*Tools that handle the distribution of applications in native formats.*

- [Bintray ![c]](https://bintray.com) - Version control for binaries that handle publishing. Compatible with Maven or Gradle, with a free plan for open-source software as well as several business plans.
- [Boxfuse](https://boxfuse.com) - Deployment of JVM applications to AWS using the principles of immutable infrastructure.
- [Capsule](http://www.capsule.io) - Simple and powerful packaging and deployment. A fat JAR on steroids, or a "Docker for Java" that supports JVM-optimized containers. (puniverse/capsule epl-1.0)
- [Central Repository](https://search.maven.org) - Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven, and available in all other build tools.
- [Cloudsmith ![c]](https://cloudsmith.io) - Fully managed package management SaaS with support for Maven/Gradle/SBT.
- [IzPack](http://izpack.org) - Setup authoring tool for cross-platform deployments.
- [JitPack](https://jitpack.io) - Easy-to-use package repository for GitHub. Builds Maven/Gradle projects on demand and publishes ready-to-use packages. (User/Repo NA) (blog/1547-release-your-software NA) (jitpack/jitpack.io mit)
- [Nexus ![c]](https://www.sonatype.com/nexus/solution-overview) - Binary management with proxy and caching capabilities.
- [packr](https://github.com/libgdx/packr) - Packs JARs, assets and the JVM for native distribution on Windows, Linux and Mac OS X. (libgdx/packr apache-2.0)
- [really-executable-jars-maven-plugin](https://github.com/brianm/really-executable-jars-maven-plugin) - Maven plugin for making self-executing JARs. (brianm/really-executable-jars-maven-plugin NA)

### Document Processing

*Libraries that assist with processing office document formats.*

- [Apache POI](https://poi.apache.org/) - Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT).
- [documents4j](http://documents4j.com) - API for document format conversion using third-party converters such as MS Word. (documents4j/documents4j apache-2.0) (raphw/documents4j NA)
- [docx4j](https://www.docx4java.org/trac/docx4j) - Create and manipulate Microsoft Open XML files. (davidgohel/ReporteRs NA) (plutext/docx4j NA) (plutext/docx4j-ImportXHTML NA) (plutext/docx4j.NET apache-2.0)
- [zerocell](https://github.com/creditdatamw/zerocell) - Annotation-based API for reading data from Excel sheets into POJOs with focus on reduced overhead. (creditdatamw/zerocell apache-2.0)

### Formal Verification

*Formal-methods tools: proof assistants, model checking, symbolic execution, etc.*

- [CATG](https://github.com/ksen007/janala2) - Concolic unit testing engine. Automatically generates unit tests using formal methods. (ksen007/janala2 other)
- [Checker Framework](https://types.cs.washington.edu/checker-framework) - Pluggable type systems. Includes nullness types, physical units, immutability types and more. (glts/safer-spring-petclinic NA) (typetools/annotation-tools mit) (typetools/checker-framework other)
- [Daikon](https://plse.cs.washington.edu/daikon) - Detects likely program invariants and generates JML specs based on those invariants.
- [Java Path Finder (JPF)](https://babelfish.arc.nasa.gov/trac/jpf) - JVM formal verification tool containing a model checker and more. Created by NASA.
- [JMLOK 2.0](http://massoni.computacao.ufcg.edu.br/home/jmlok) - Detects inconsistencies between code and JML specification through feedback-directed random tests generation, and suggests a likely cause for each nonconformance detected.
- [KeY](https://key-project.org) - Formal software development tool that aims to integrate design, implementation, formal specification, and formal verification of object-oriented software as seamlessly as possible. Uses JML for specification and symbolic execution for verification.
- [OpenJML](https://openjml.github.io) - Translates JML specifications into SMT-LIB format and passes the proof problems implied by the program to backend solvers. (OpenJML/OpenJML NA)

### Functional Programming

*Libraries that facilitate functional programming.*

- [cyclops-react](https://github.com/aol/cyclops-react) - Monad and stream utilities, comprehensions, pattern matching, functional extensions for all JDK collections, future streams, trampolines and much more. (aol/cyclops-react apache-2.0)
- [derive4j](https://github.com/derive4j/derive4j) - Java 8 annotation processor and framework for deriving algebraic data types constructors, pattern-matching and morphisms. (derive4j/derive4j NA)
- [Fugue](https://bitbucket.org/atlassian/fugue) - Functional extensions to Guava.
- [Functional Java](http://www.functionaljava.org) - Implements numerous basic and advanced programming abstractions that assist composition-oriented development. (orfjackal/retrolambda apache-2.0)
- [jOOλ](https://github.com/jOOQ/jOOL) - Extension to Java 8 that aims to fix gaps in lambda by providing numerous missing types and a rich set of sequential Stream API additions. (jOOQ/jOOL apache-2.0)
- [protonpack](https://github.com/poetix/protonpack) - Collection of stream utilities. (poetix/protonpack mit)
- [StreamEx](https://github.com/amaembo/streamex) - Enhances Java 8 Streams. (amaembo/streamex apache-2.0)
- [Vavr](http://www.vavr.io) - Functional component library that provides persistent data types and functional control structures. (vavr-io/vavr other) (vavr-io/vavr-gson apache-2.0) (vavr-io/vavr-gwt NA) (vavr-io/vavr-jackson apache-2.0) (vavr-io/vavr-render mit)

### Game Development

*Frameworks that support the development of games.*

- [FXGL](https://almasb.github.io/FXGL) - JavaFX Game Development Framework. (AlmasB/FXGL mit) (AlmasB/FXGL-Gradle mit) (AlmasB/FXGL-GradleKt mit) (AlmasB/FXGL-Maven mit) (AlmasB/FXGL-MavenKt mit) (AlmasB/FXGL-MobileApp mit) (AlmasB/FXGL-WebApp mit) (AlmasB/FXGL11-Gradle mit) (AlmasB/FXGLGames mit)
- [jMonkeyEngine](http://jmonkeyengine.org) - Game engine for modern 3D development. (jMonkeyEngine/jmonkeyengine other) (jMonkeyEngine/sdk bsd-3-clause)
- [libGDX](https://libgdx.badlogicgames.com) - All-round cross-platform, high-level framework. (libGDX/libGDX other)
- [LWJGL](https://www.lwjgl.org) - Robust framework that abstracts libraries like OpenGL/CL/AL.

### Geospatial

*Libraries for working with geospatial data and algorithms.*

- [Apache SIS](https://sis.apache.org) - Library for developing geospatial applications.
- [Geo](https://github.com/davidmoten/geo) - GeoHash utilities in Java. (davidmoten/geo apache-2.0)
- [Geotoolkit.org](http://www.geotoolkit.org) - Library for developing geospatial applications. Built on top of the Apache SIS project. (Geomatys/geotoolkit.git NA)
- [GeoTools](http://geotools.org) - Library that provides tools for geospatial data. (geotools/geotools lgpl-2.1)
- [GraphHopper](https://github.com/graphhopper/graphhopper) - Road-routing engine. Used as a Java library or standalone web service. (graphhopper/graphhopper apache-2.0)
- [H2GIS](http://www.h2gis.org) - A spatial extension of the H2 database. (orbisgis/h2gis lgpl-3.0)
- [Jgeohash](https://astrapi69.github.io/jgeohash) - Library for using the GeoHash algorithm. (astrapi69/jgeohash apache-2.0) (jasonlong/cayman-theme NA)
- [Mapsforge](https://github.com/mapsforge/mapsforge) - Map rendering based on OpenStreetMap data. (mapsforge/mapsforge lgpl-3.0)
- [Spatial4j](https://github.com/locationtech/spatial4j) - General-purpose spatial/geospatial library. (locationtech/spatial4j NA)

### GUI

*Libraries to create modern graphical user interfaces.*

- [JavaFX](https://www.oracle.com/technetwork/java/javase/overview/javafx-overview-2158620.html) - The successor of Swing.
- [Scene Builder](https://gluonhq.com/open-source/scene-builder) - Visual layout tool for JavaFX applications.
- [SWT](https://www.eclipse.org/swt) - The Standard Widget Toolkit, a graphical widget toolkit.

### High Performance

*Everything about high-performance computation, from collections to specific libraries.*

- [Agrona](https://github.com/real-logic/Agrona) - Data structures and utility methods that are common in high-performance applications. (real-logic/Agrona apache-2.0)
- [Disruptor](https://lmax-exchange.github.io/disruptor) - Inter-thread messaging library. (LMAX-Exchange/disruptor apache-2.0) (odeheurles/Disruptor-net other)
- [Eclipse Collections](https://github.com/eclipse/eclipse-collections) - Collections framework inspired by Smalltalk. (eclipse/eclipse-collections other)
- [fastutil](http://fastutil.di.unimi.it) - Fast and compact type-specific collections. (vigna/fastutil apache-2.0)
- [HPPC](https://labs.carrotsearch.com/hppc.html) - Primitive collections. (carrotsearch/hppc apache-2.0)
- [JCTools](https://github.com/JCTools/JCTools) - Concurrency tools currently missing from the JDK. (JCTools/JCTools apache-2.0)
- [Koloboke](https://github.com/OpenHFT/Koloboke) - Hash sets and hash maps. (OpenHFT/Koloboke NA)

### HTTP Clients

*Libraries that assist with creating HTTP requests and/or binding responses.*

- [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) - Asynchronous HTTP and WebSocket client library. (AsyncHttpClient/async-http-client other)
- [Feign](https://github.com/Netflix/feign) - HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket. (Netflix/feign apache-2.0)
- [OkHttp](https://square.github.io/okhttp) - HTTP+SPDY client. (google/conscrypt other) (square/okhttp apache-2.0) (square/okio apache-2.0)
- [Play WS](https://github.com/playframework/play-ws) - Typesafe client with reactive streams and caching. (playframework/play-ws apache-2.0)
- [restQL-core](https://github.com/B2W-BIT/restQL-core) - Microservice query language that fetches information from multiple services. (B2W-BIT/restQL-core mit)
- [Retrofit](https://square.github.io/retrofit) - Typesafe REST client. (google/gson apache-2.0) (square/moshi apache-2.0) (square/okhttp apache-2.0) (square/retrofit apache-2.0) (square/wire apache-2.0)
- [Ribbon](https://github.com/Netflix/ribbon) - Client-side IPC library that is battle-tested in cloud. (Netflix/ribbon apache-2.0)
- [Riptide](https://github.com/zalando/riptide) - Client-side response routing for Spring's RestTemplate. (zalando/riptide mit)

### Hypermedia Types

*Libraries that handle serialization to hypermedia types.*

- [JSON-LD](https://github.com/jsonld-java/jsonld-java) - JSON-LD implementation. (jsonld-java/jsonld-java bsd-3-clause)
- [Siren4J](https://github.com/eserating/siren4j) - Library for the Siren specification. (eserating/siren4j mit)

### IDE

*Integrated development environments that try to simplify several aspects of development.*

- [Eclipse](https://www.eclipse.org) - Established open-source project with support for lots of plugins and languages.
- [IntelliJ IDEA ![c]](https://www.jetbrains.com/idea) - Supports many JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector.
- [NetBeans](https://netbeans.org) - Provides integration for several Java SE and EE features, from database access to HTML5.
- [Visual Studio Code](https://code.visualstudio.com/docs/languages/java) - Provides Java support for lightweight projects with a simple, modern workflow by using extensions from the internal marketplace. (Microsoft/java-debug epl-1.0) (Microsoft/vscode-docs other) (eclipse/buildship NA) (eclipse/eclipse.jdt.ls epl-1.0)

### Imagery

*Libraries that assist with the creation, evaluation or manipulation of graphical images.*

- [Imgscalr](https://github.com/thebuzzmedia/imgscalr) - Simple, efficient and hardware-accelerated image-scaling library implemented in pure Java 2D. (thebuzzmedia/imgscalr apache-2.0)
- [Tess4J](https://github.com/nguyenq/tess4j) - A JNA wrapper for Tesseract OCR API. (nguyenq/tess4j apache-2.0)
- [Thumbnailator](https://github.com/coobird/thumbnailator) - High-quality thumbnail generation library. (coobird/thumbnailator other)
- [TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) - Collection of plugins that extend the number of supported image file formats. (haraldk/TwelveMonkeys bsd-3-clause)
- [ZXing](https://github.com/zxing/zxing) - Multi-format 1D/2D barcode image processing library. (zxing/zxing apache-2.0)

### JSON

*Libraries for serializing and deserializing JSON to and from Java objects.*

- [DSL-JSON](https://github.com/ngs-doo/dsl-json) - JSON library with advanced compile time databinding. (ngs-doo/dsl-json other)
- [Genson](https://owlike.github.io/genson) - Powerful and easy-to-use Java-to-JSON conversion library. (owlike/genson NA)
- [Gson](https://github.com/google/gson) - Serializes objects to JSON and vice versa. Good performance with on-the-fly usage. (google/gson apache-2.0)
- [HikariJSON](https://github.com/brettwooldridge/HikariJSON) - High-performance JSON parser, 2x faster than Jackson. (brettwooldridge/HikariJSON apache-2.0)
- [jackson-modules-java8](https://github.com/FasterXML/jackson-modules-java8) - Set of Jackson modules for Java 8 datatypes and features. (FasterXML/jackson-modules-java8 apache-2.0)
- [Jackson-datatype-money](https://github.com/zalando/jackson-datatype-money) - Open-source Jackson module to support JSON serialization and deserialization of JavaMoney data types. (zalando/jackson-datatype-money mit)
- [Jackson](https://github.com/FasterXML/jackson) - Similar to GSON, but offers performance gains if you need to instantiate the library more often. (FasterXML/jackson NA)
- [JSON-io](https://github.com/jdereg/json-io) - Convert Java to JSON. Convert JSON to Java. Pretty print JSON. Java JSON serializer. (jdereg/json-io apache-2.0)
- [jsoniter](http://jsoniter.com) - Fast and flexible library with iterator and lazy parsing API. (buger/jsonparser mit) (json-iterator/go mit) (json-iterator/java mit) (ngs-doo/dsl-json other)
- [LoganSquare](https://github.com/bluelinelabs/LoganSquare) - JSON parsing and serializing library based on Jackson's streaming API. Outperforms GSON & Jackson's library. (bluelinelabs/LoganSquare apache-2.0)
- [Moshi](https://github.com/square/moshi) - Modern JSON library, less opinionated and uses built-in types like List and Map. (square/moshi apache-2.0)
- [Yasson](https://github.com/eclipse/yasson) - Binding layer between classes and JSON documents similar to JAXB. (eclipse/yasson other)

### JSON Processing

*Libraries for processing data in JSON format.*

- [fastjson](https://github.com/alibaba/fastjson) - Very fast processor with no additional dependencies and full data binding. (alibaba/fastjson other)
- [Jolt](https://github.com/bazaarvoice/jolt) - JSON to JSON transformation tool. (bazaarvoice/jolt apache-2.0)
- [JsonPath](https://github.com/jayway/JsonPath) - Extract data from JSON using XPATH-like syntax. (jayway/JsonPath apache-2.0)
- [JsonSurfer](https://github.com/jsurfer/JsonSurfer) - Streaming JsonPath processor dedicated to processing big and complicated JSON data. (jsurfer/JsonSurfer mit)

### JVM and JDK

*Current implementations of the JVM/JDK.*

- [Adopt Open JDK](https://adoptopenjdk.net) - OpenJDK builds which allows to choose between HotSpot and OpenJ9. (AdoptOpenJDK/openjdk-build apache-2.0) (AdoptOpenJDK/openjdk-infrastructure apache-2.0) (AdoptOpenJDK/openjdk-tests apache-2.0) (AdoptOpenJDK/openjdk-website apache-2.0)
- [Avian](https://github.com/ReadyTalk/avian) - JVM with JIT, AOT modes and iOS port. (ReadyTalk/avian other)
- [Corretto](https://aws.amazon.com/corretto) - No-cost, multiplatform, production-ready distribution of OpenJDK by Amazon.
- [Graal](https://github.com/oracle/graal) - Polyglot embeddable JVM. (oracle/graal other)
- [Liberica JDK](https://www.bell-sw.com/java.html) - Built from OpenJDK, thoroughly tested and passed the JCK. (bell-sw/homebrew-liberica NA)
- [OpenJ9](https://github.com/eclipse/openj9) - High performance, enterprise-calibre, flexibly licensed, openly-governed cross-platform JVM extending and augmenting the runtime technology components from the Eclipse OMR and OpenJDK project. (eclipse/openj9 other)
- [Open JDK](https://openjdk.java.net) - Open JDK distributed by Oracle.
- [ParparVM](https://github.com/codenameone/CodenameOne/tree/master/vm) - VM with non-blocking, concurrent GC for iOS. (codenameone/CodenameOne gpl-2.0)
- [RedHat Open JDK](https://developers.redhat.com/products/openjdk/overview) - RedHat's OpenJDK distribution.
- [Zulu](https://www.azul.com/downloads/zulu) - OpenJDK builds for Windows, Linux, and Mac OS X.

### Logging

*Libraries that log the behavior of an application.*

- [Apache Log4j 2](https://logging.apache.org/log4j) - Complete rewrite with a powerful plugin and configuration architecture.
- [Graylog](https://www.graylog.org) - Open-source aggregator suited for extended role and permission management.
- [Kibana](https://www.elastic.co/products/kibana) - Analyzes and visualizes log files. Some features require payment.
- [Logback](https://logback.qos.ch) - Robust logging library with interesting configuration options via Groovy.
- [Logbook](https://github.com/zalando/logbook) - Extensible, open-source library for HTTP request and response logging. (zalando/logbook mit)
- [Logstash](https://www.elastic.co/products/logstash) - Tool for managing log files.
- [p6spy](https://github.com/p6spy/p6spy) - Enables logging for all JDBC transactions without changes to the code. (p6spy/p6spy apache-2.0)
- [SLF4J](https://www.slf4j.org) - Abstraction layer/simple logging facade.
- [tinylog](http://www.tinylog.org) - Lightweight logging framework with static logger class. (pmwmedia/tinylog apache-2.0)
- [Tracer](https://github.com/zalando/tracer) - Call tracing and log correlation in distributed systems. (zalando/tracer mit)

### Machine Learning

*Tools that provide specific statistical algorithms for learning from data.*

- [Apache Flink](https://flink.apache.org) - Fast, reliable, large-scale data processing engine. (apache/flink apache-2.0)
- [Apache Mahout](https://mahout.apache.org) - Scalable algorithms focused on collaborative filtering, clustering and classification. (apache/mahout other)
- [Apache Spark](https://spark.apache.org) - Data analytics cluster-computing framework. (amplab/spark-ec2 apache-2.0)
- [DatumBox](http://www.datumbox.com) - Provides several algorithms and pre-trained models for natural language processing. (datumbox/datumbox-framework apache-2.0)
- [DeepDive](http://deepdive.stanford.edu) - Creates structured information from unstructured data and integrates it into an existing database. (HazyResearch/deepdive apache-2.0)
- [Deeplearning4j](https://deeplearning4j.org) - Distributed and multi-threaded deep learning library. (deeplearning4j/deeplearning4j apache-2.0) (deeplearning4j/dl4j-examples other) (eclipse/deeplearning4j apache-2.0)
- [H2O](https://www.h2o.ai) - Analytics engine for statistics over big data.
- [JSAT](https://github.com/EdwardRaff/JSAT) - Algorithms for pre-processing, classification, regression, and clustering with support for multi-threaded execution. (EdwardRaff/JSAT gpl-3.0)
- [Oryx 2](https://github.com/OryxProject/oryx) - Framework for building real-time, large-scale machine learning applications. Includes end-to-end applications for collaborative filtering, classification, regression, and clustering. (OryxProject/oryx apache-2.0)
- [Smile](https://haifengl.github.io/smile) - The Statistical Machine Intelligence and Learning Engine provides a set of machine learning algorithms and a visualization library. (haifengl/smile apache-2.0)
- [Weka](https://www.cs.waikato.ac.nz/ml/weka) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization.

### Messaging

*Tools that help send messages between clients to ensure protocol independency.*

- [Aeron](https://github.com/real-logic/Aeron) - Efficient, reliable, unicast and multicast message transport. (real-logic/Aeron apache-2.0)
- [Apache ActiveMQ](https://activemq.apache.org) - Message broker that implements JMS and converts synchronous to asynchronous communication.
- [Apache Camel](https://camel.apache.org) - Glues together different transport APIs via Enterprise Integration Patterns. (apache/camel apache-2.0)
- [Apache Kafka](https://kafka.apache.org) - High-throughput distributed messaging system.
- [Apache Pulsar](https://pulsar.apache.org) - Distributed pub/sub-messaging system. (apache/incubator-pulsar apache-2.0) (apache/pulsar apache-2.0)
- [Apache RocketMQ](https://rocketmq.apache.org/) - A fast, reliable, and scalable distributed messaging platform. (apache/rocketmq apache-2.0)
- [Apache Qpid](https://qpid.apache.org) - Apache Qpid makes messaging tools that speak AMQP and support many languages and platforms. (apache/qpid-proton apache-2.0)
- [EventBus](https://github.com/greenrobot/EventBus) - Simple publish/subscribe event bus. (greenrobot/EventBus apache-2.0)
- [Hermes](http://hermes.allegro.tech) - Fast and reliable message broker built on top of Kafka. (allegro/hermes other)
- [JeroMQ](https://github.com/zeromq/jeromq) - Implementation of ZeroMQ. (zeromq/jeromq mpl-2.0)
- [Nakadi](https://github.com/zalando/nakadi) - Provides a RESTful API on top of Kafka. (zalando/nakadi mit)
- [RabbitMQ Java client](https://github.com/rabbitmq/rabbitmq-java-client) - RabbitMQ client. (rabbitmq/rabbitmq-java-client other)
- [Smack](https://github.com/igniterealtime/Smack) - Cross-platform XMPP client library. (igniterealtime/Smack apache-2.0)
- [NATS client](https://github.com/nats-io/java-nats) - NATS client. (nats-io/java-nats apache-2.0)

### Miscellaneous

*Everything else.*

- [Codename One](https://www.codenameone.com) - Cross-platform solution for writing native mobile apps. (codenameone/CodenameOne gpl-2.0)
- [CQEngine](https://github.com/npgall/cqengine) - Ultra-fast, SQL-like queries on Java collections. (npgall/cqengine apache-2.0)
- [Design Patterns](https://github.com/iluwatar/java-design-patterns) - Implementation and explanation of the most common design patterns. (iluwatar/java-design-patterns mit)
- [Failsafe](https://github.com/jhalterman/failsafe) - Simple failure handling with retries and circuit breakers. (jhalterman/failsafe apache-2.0)
- [FF4J](https://github.com/ff4j/ff4j) - Feature Flags for Java. (ff4j/ff4j NA)
- [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition) - No-nonsense implementation of FizzBuzz made by serious businessmen for serious business purposes. (EnterpriseQualityCoding/FizzBuzzEnterpriseEdition NA)
- [J2ObjC](https://github.com/google/j2objc) - Java-to-Objective-C translator for porting Android libraries to iOS. (google/j2objc apache-2.0)
- [JavaCV](https://github.com/bytedeco/javacv) - Java interface to OpenCV, FFmpeg, and more. (bytedeco/javacv other)
- [JavaX](http://javax.botcompany.de) - Reinventing and extending Java with a focus on simplicity.
- [JBake](http://jbake.org) - Static website generator. (jbake-org/jbake mit) (neuland/jade4j mit)
- [JBot](https://github.com/ramswaroop/jbot) - Framework for building chatbots. (ramswaroop/jbot gpl-3.0)
- [JCuda](http://jcuda.org) - JCuda offers Java bindings for CUDA and CUDA-related libraries. (MysterionRise/mavenized-jcuda mit) (jcuda/jcuda-main mit) (jcuda/jcuda-samples mit) (jcuda/jcudnn mit)
- [Jimfs](https://github.com/google/jimfs) - In-memory file system. (google/jimfs apache-2.0)
- [Joda-Money](http://www.joda.org/joda-money) - Basic currency and money classes and algorithms not provided by the JDK. (JodaOrg/joda-money apache-2.0) (JodaOrg/reflow-maven-skin apache-2.0)
- [JPad](http://jpad.io) - Snippet runner.
- [LightAdmin](http://lightadmin.org) - Pluggable CRUD UI library for rapid application development.
- [Maven Wrapper](https://github.com/takari/maven-wrapper) - Analogue of Gradle Wrapper for Maven, allows building projects without installing maven. (takari/maven-wrapper apache-2.0)
- [Membrane Service Proxy](https://github.com/membrane/service-proxy) - An open-source, reverse-proxy framework written in Java. (membrane/service-proxy NA)
- [MinimalFTP](https://github.com/Guichaguri/MinimalFTP) - Lightweight, small and customizable FTP server. (Guichaguri/MinimalFTP apache-2.0)
- [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) - Popular Java 8 guide. (winterbe/java8-tutorial mit)
- [Modernizer](https://github.com/andrewgaul/modernizer-maven-plugin) - Detect uses of legacy Java APIs. (andrewgaul/modernizer-maven-plugin apache-2.0)
- [Multi-OS Engine](https://software.intel.com/en-us/multi-os-engine) - An open-source, cross-platform engine to develop native mobile (iOS, Android, etc.) apps.
- [OpenRefine](http://openrefine.org) - Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases. (OpenRefine/OpenRefine bsd-3-clause)
- [PipelinR](https://github.com/sizovs/pipelinr) – Small utility library for using handlers and commands with pipelines.  (sizovs/pipelinr mit)
- [Polyglot for Maven](https://github.com/takari/polyglot-maven) - Extensions for Maven 3.3.1+ that allows writing the POM model in dialects other than XML. (takari/polyglot-maven other)
- [Smooks](https://github.com/smooks/smooks) - Extensible framework for building applications that process data which means bindings, transformations, message processing and enrichment. (smooks/smooks NA)
- [Togglz](https://www.togglz.org) - Implementation of the Feature Toggles pattern. (togglz/togglz apache-2.0)
- [TypeTools](https://github.com/jhalterman/typetools) - Tools for resolving generic types. (jhalterman/typetools apache-2.0)
- [XMLBeam](https://github.com/SvenEwald/xmlbeam) - Processes XML by using annotations or XPath within code. (SvenEwald/xmlbeam apache-2.0)
- [OctoLinker](https://github.com/OctoLinker/browser-extension) - Browser extension which allows to navigate through code on GitHub more efficiently. (OctoLinker/browser-extension mit)

### Microservice

*Tools for creating and managing microservices.*

- [Apollo](https://spotify.github.io/apollo) - Libraries for writing composable microservices. (spotify/apollo apache-2.0)
- [consul-api](https://github.com/Ecwid/consul-api) - Client for the [Consul](https://www.consul.io) API: a distributed, highly available and datacenter-aware registry/discovery service. (Ecwid/consul-api apache-2.0)
- [Eureka](https://github.com/Netflix/eureka) - REST-based service registry for resilient load balancing and failover. (Netflix/eureka apache-2.0)
- [Helidon](https://helidon.io) - Two-style approach for writing microservices: Functional-reactive and as an implementation of [MicroProfile](https://microprofile.io). (eclipse/microprofile apache-2.0)
- [Lagom](https://www.lightbend.com/lagom) - Framework for creating microservice-based systems. (lagom/lagom apache-2.0)
- [Micronaut](http://micronaut.io) - Modern full-stack framework with focus on modularity, minimal memory footprint and startup time.

### Monitoring

*Tools that monitor applications in production.*

- [AppDynamics ![c]](https://www.appdynamics.com) - Performance monitor.
- [Automon](https://github.com/stevensouza/automon) - Combines the power of AOP with monitoring and/or logging tools. (stevensouza/automon apache-2.0)
- [BugSnag ![c]](https://www.bugsnag.com) - Exception and error monitoring with an integration of several third party tools for a better workflow and a free hobbyist tier. (bugsnag/bugsnag-android other) (bugsnag/bugsnag-cocoa mit) (bugsnag/bugsnag-java mit) (bugsnag/bugsnag-js NA) (bugsnag/bugsnag-ruby mit)
- [LeakCanary](https://github.com/square/leakcanary) - Memory leak detection. (square/leakcanary apache-2.0)
- [Failsafe Actuator](https://github.com/zalando-incubator/failsafe-actuator) - Out of the box monitoring of Failsafe Circuit Breaker in Spring-Boot environment. (zalando-incubator/failsafe-actuator mit)
- [Glowroot](https://glowroot.org) - Open-source Java APM. (glowroot/glowroot apache-2.0)
- [inspectIT](http://www.inspectit.rocks) - Captures detailed run-time information via hooks that can be changed on the fly. It supports tracing over multiple systems via the OpenTracing API and can correlate the data with end user monitoring. (inspectIT/inspectit-ocelot other)
- [Instrumental ![c]](https://instrumentalapp.com) - Real-time Java application performance monitoring. A commercial service with free development accounts.
- [JavaMelody](https://github.com/javamelody/javamelody) - Performance monitoring and profiling. (javamelody/javamelody apache-2.0)
- [Jaeger client](https://github.com/jaegertracing/jaeger-client-java) - Jaeger client. (jaegertracing/jaeger-client-java other)
- [jmxtrans](https://github.com/jmxtrans/jmxtrans) - Connect to multiple JVMs and query them for their attributes via JMX. Its query language is based on JSON, which allows non-Java programmers to access the JVM attributes. Supports different output writes, including Graphite, Ganglia, and StatsD. (jmxtrans/jmxtrans mit)
- [Jolokia](https://jolokia.org) - JMX over REST. (hawtio/hawtio apache-2.0) (rhuss/aji NA) (rhuss/jolokia apache-2.0) (rhuss/jolokia-extra apache-2.0)
- [Kamon](http://www.kamon.io) - Tool for monitoring applications running on the JVM.
- [Metrics](http://metrics.dropwizard.io) - Expose metrics via JMX or HTTP and send them to a database.
- [New Relic ![c]](https://newrelic.com) - Performance monitor.
- [Datadog ![c]](https://docs.datadoghq.com/tracing/setup/java/) - Modern monitoring & analytics. (DataDog/dd-trace-java other) (DataDog/documentation other) (openzipkin/b3-propagation apache-2.0)
- [nudge4j](https://github.com/lorenzoongithub/nudge4j) - Remote developer console from the browser for Java 8 via bytecode injection. (lorenzoongithub/nudge4j mit)
- [OverOps ![c]](https://www.overops.com) - In-production error monitoring and debugging.
- [Pinpoint](https://github.com/naver/pinpoint) - Open-source APM tool. (naver/pinpoint apache-2.0)
- [Prometheus](https://prometheus.io) - Provides a multi-dimensional data model, DSL, autonomous server nodes and much more.
- [SPM ![c]](https://sematext.com/spm) - Performance monitor with distributing transaction tracing for JVM apps.
- [Stagemonitor](https://github.com/stagemonitor/stagemonitor) - Open-source performance monitoring and transaction tracing for JVM apps. (stagemonitor/stagemonitor apache-2.0)
- [Sysmon](https://github.com/palantir/Sysmon) - Lightweight platform monitoring tool for Java VMs. (palantir/Sysmon apache-2.0)
- [zipkin](https://zipkin.io) - Distributed tracing system which gathers timing data needed to troubleshoot latency problems in microservice architectures. (openzipkin/zipkin apache-2.0)

### Native
*For working with platform-specific native libraries.*

- [JavaCPP](https://github.com/bytedeco/javacpp) - Provides efficient and easy access to native C++. (bytedeco/javacpp other)
- [JNA](https://github.com/java-native-access/jna) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries. (java-native-access/jna other)
- [JNR](https://github.com/jnr/jnr-ffi) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries. Same goals as JNA, but faster, and serves as the basis for the upcoming [Project Panama](http://openjdk.java.net/projects/panama). (jnr/jnr-ffi other)

### Natural Language Processing

*Libraries that specialize in processing text.*

- [CogCompNLP](https://github.com/CogComp/cogcomp-nlp) - Provides common annotators for plain text input. (CogComp/cogcomp-nlp other)
- [CoreNLP](https://nlp.stanford.edu/software/corenlp.shtml) - Provides a set of fundamental tools for tasks like tagging, named entity recognition, and sentiment analysis. (EducationalTestingService/stanford-thrift NA) (Wordseer/stanford-corenlp-python gpl-2.0) (brendano/stanford-corepywrapper NA) (dasmith/stanford-corenlp-python gpl-2.0) (gilesc/stanford-corenlp apache-2.0) (guokr/stan-cn-nlp other) (hiteshjoshi/node-stanford-corenlp other) (jconwell/coreNlp apache-2.0) (johnb30/stanford-corepywrapper NA) (jonnywray/mod-stanford-corenlp apache-2.0) (kedz/corenlp NA) (klintan/corenlp-swedish-pos-model NA) (kowey/corenlp-server NA) (louismullie/stanford-core-nlp other) (louismullie/treat other) (mhewett/stanford-corenlp-node NA) (ngrunwald/stanford-nlp-tools NA) (relwell/stanford-corenlp-python gpl-2.0) (sistanlp/processors NA) (stanfordnlp/CoreNLP other) (westei/stanbol-stanfordnlp other) (xissy/node-stanford-simple-nlp other)
- [DKPro](https://dkpro.github.io) - Collection of reusable NLP tools for linguistic pre-processing, machine learning, lexical resources, etc. (dkpro/dkpro-c4corpus apache-2.0)
- [Lingua](https://github.com/pemistahl/lingua) - Natural language detection library, especially suited for short paragraphs of text. (pemistahl/lingua apache-2.0)
- [LingPipe](http://alias-i.com/lingpipe) - Toolkit for tasks ranging from POS tagging to sentiment analysis.

### Networking

*Libraries for building network servers.*

- [AkkaGRPC](https://github.com/akka/akka-grpc) - Support for building streaming gRPC servers and clients on top of Akka Streams. (akka/akka-grpc apache-2.0)
- [Comsat](https://github.com/puniverse/comsat) - Integrates standard Java web-related APIs with Quasar fibers and actors. (puniverse/comsat other)
- [Dubbo](https://github.com/alibaba/dubbo) - High-performance RPC framework. (alibaba/dubbo apache-2.0)
- [Finagle](https://github.com/twitter/finagle) - Extensible RPC system for constructing high-concurrency servers. It implements uniform client and server APIs for several protocols, and is protocol-agnostic to simplify implementation of new protocols. (twitter/finagle apache-2.0)
- [Grizzly](https://javaee.github.io/grizzly) - NIO framework. Used as a network layer in Glassfish. (AsyncHttpClient/async-http-client other) (javaee/grizzly-ahc other)
- [gRPC](https://github.com/grpc/grpc-java) - RPC framework based on protobuf and HTTP/2. (grpc/grpc-java apache-2.0)
- [KryoNet](https://github.com/EsotericSoftware/kryonet) - Provides a clean and simple API for efficient TCP and UDP client/server network communication using NIO and Kryo. (EsotericSoftware/kryonet bsd-3-clause)
- [MINA](https://mina.apache.org) - Abstract, event-driven async I/O API for network operations over TCP/IP and UDP/IP via Java NIO.
- [Netty](https://netty.io) - Framework for building high-performance network applications. (netty/netty apache-2.0)
- [Nifty](https://github.com/facebook/nifty) - Implementation of Thrift clients and servers on Netty. (facebook/nifty apache-2.0)
- [sshj](https://github.com/hierynomus/sshj) - Programatically use SSH, SCP or SFTP. (hierynomus/sshj other)
- [TLS Channel](https://github.com/marianobarrios/tls-channel) - Implements a ByteChannel interface over SSLEngine, enabling easy-to-use (socket-like) TLS. (marianobarrios/tls-channel mit)
- [Undertow](http://undertow.io) - Web server providing both blocking and non-blocking APIs based on NIO. Used as a network layer in WildFly. (wildfly/wildfly lgpl-2.1)
- [urnlib](https://github.com/slub/urnlib) - Represent, parse and encode URNs, as in RFC 2141. (slub/urnlib gpl-3.0)

### ORM

*APIs that handle the persistence of objects.*

- [Apache Cayenne](https://cayenne.apache.org) - Provides a clean, static API for data access. Also includes a GUI Modeler for working with database mappings, and DB reverse engineering and generation. (apache/cayenne NA)
- [Doma 2](https://doma.readthedocs.io) - Database access framework that verifies and generates source code at compile time using annotation processing as well as native SQL templates called two-way SQL. (domaframework/doma apache-2.0) (domaframework/simple-examples apache-2.0) (rtfd/sphinx NA)
- [Ebean](https://ebean-orm.github.io) - Provides simple and fast data access. (ebean-orm/ebean other)
- [EclipseLink](https://www.eclipse.org/eclipselink) - Supports a number of persistence standards: JPA, JAXB, JCA and SDO.
- [Hibernate](http://hibernate.org/orm) - Robust and widely used, with an active community. (hibernate/hibernate-orm NA)
- [MyBatis](http://www.mybatis.org/mybatis-3) - Couples objects with stored procedures or SQL statements. (mybatis/mybatis-3 other)
- [SimpleFlatMapper](https://github.com/arnaudroger/SimpleFlatMapper) - Simple database and CSV mapper. (arnaudroger/SimpleFlatMapper mit)

### PaaS

*Java platform as a service.*

- [AWS Elastic Beanstalk ![c]](https://aws.amazon.com/elasticbeanstalk) - AWS-based, with support for Tomcat and Jetty.
- [AWS Lambda ![c]](https://aws.amazon.com/lambda) - Serverless computation. (awslabs/lambda-refarch-fileprocessing apache-2.0) (awslabs/lambda-refarch-iotbackend apache-2.0) (awslabs/lambda-refarch-mobilebackend apache-2.0) (awslabs/lambda-refarch-streamprocessing apache-2.0) (awslabs/lambda-refarch-webapp apache-2.0)
- [Google App Engine ![c]](https://cloud.google.com) - PaaS on Google's infrastructure.
- [Heroku ![c]](https://www.heroku.com) - Abstract computing environments.
- [Jelastic ![c]](https://jelastic.com) - Supports Tomcat, Jetty, GlassFish, JBoss, TomEE and WildFly.
- [OpenShift Enterprise ![c]](https://www.openshift.com) - On-premise solution.

### PDF

*Tools to help with PDF file creation.*

- [Apache FOP](https://xmlgraphics.apache.org/fop) - Creates PDFs from XSL-FO.
- [Apache PDFBox](https://pdfbox.apache.org) - Toolbox for creating and manipulating PDFs.
- [Dynamic Jasper](http://dynamicjasper.com) - Abstraction layer to JasperReports. (FDVSolutions/DynamicJasper lgpl-3.0)
- [DynamicReports](https://github.com/dynamicreports/dynamicreports) - Simplifies JasperReports. (dynamicreports/dynamicreports lgpl-3.0)
- [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) - XML/XHTML and CSS 2.1 renderer. (flyingsaucerproject/flyingsaucer other)
- [iText ![c]](https://itextpdf.com) - Creates PDF files programmatically.
- [JasperReports](https://community.jaspersoft.com/project/jasperreports-library) - Complex reporting engine. (Jaspersoft/jasperreports lgpl-3.0)
- [Open HTML to PDF](https://github.com/danfickle/openhtmltopdf) - Properly supports modern PDF standards based on flyingsaucer and Apache PDFBox. (danfickle/openhtmltopdf other)

### Performance analysis

*Tools for performance analysis, profiling and benchmarking.*

- [fastThread ![c]](http://fastthread.io) - Analyze and visualize thread dumps with a free cloud-based upload interface.
- [GCeasy ![c]](http://gceasy.io) - Tool to analyze and visualize GC logs. It provides a free cloud-based upload interface.
- [honest-profiler](https://github.com/RichardWarburton/honest-profiler) - A low-overhead, bias-free sampling profiler. (RichardWarburton/honest-profiler other)
- [jHiccup](https://github.com/giltene/jHiccup) - Logs and records platform JVM stalls. (giltene/jHiccup other)
- [JITWatch](https://github.com/AdoptOpenJDK/jitwatch) - Analyze the JIT compiler optimisations made by the HotSpot JVM. (AdoptOpenJDK/jitwatch other)
- [JMH](http://openjdk.java.net/projects/code-tools/jmh) - a Java harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM. (artyushov/idea-jmh-plugin mit) (brianfromoregon/jmh-plugin NA) (ktoso/sbt-jmh apache-2.0) (melix/jmh-gradle-plugin apache-2.0) (presidentio/teamcity-plugin-jmh apache-2.0)
- [JProfiler ![c]](https://www.ej-technologies.com/products/jprofiler/overview.html) - Database profiling for JDBC, JPA and NoSQL, with JEE support.
- [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) - Utilities for latency measurement and reporting. (LatencyUtils/LatencyUtils other)
- [XRebel ![c]](https://zeroturnaround.com/software/xrebel) - Real-time profiling for web applications, with an in-browser widget.
- [YourKit Java Profiler ![c]](https://www.yourkit.com/features) - Profiler for any application running on the JVM.

### Platform

*Frameworks that are suites of multiple libraries encompassing several categories.*

#### Apache Commons

- [BCEL](http://commons.apache.org/proper/commons-bcel) - Byte Code Engineering Library - analyze, create, and manipulate Java class files. (apache/commons-bcel other)
- [BeanUtils](http://commons.apache.org/proper/commons-beanutils) - Easy-to-use wrappers around the Java reflection and introspection APIs.
- [BeanUtils2](http://commons.apache.org/sandbox/commons-beanutils2) - Redesign of Commons BeanUtils.
- [BSF](http://commons.apache.org/proper/commons-bsf) - Bean Scripting Framework - interface to scripting languages, including JSR-223.
- [Chain](http://commons.apache.org/proper/commons-chain) - Chain of Responsibility pattern implementation.
- [ClassScan](http://commons.apache.org/sandbox/commons-classscan) - Find Class interfaces, methods, fields, and annotations without loading.
- [CLI](http://commons.apache.org/proper/commons-cli) - Command-line arguments parser.
- [CLI2](http://commons.apache.org/sandbox/commons-cli2) Redesign of Commons CLI.
- [Codec](http://commons.apache.org/proper/commons-codec) - General encoding/decoding algorithms (for example phonetic, base64, URL).
- [Collections](http://commons.apache.org/proper/commons-collections) - Extends or augments the Java Collections Framework. (apache/commons-collections apache-2.0)
- [Compress](http://commons.apache.org/proper/commons-compress) - Defines an API for working with tar, zip and bzip2 files. (google/brotli mit) (luben/zstd-jni other)
- [Configuration](http://commons.apache.org/proper/commons-configuration) - Reading of configuration/preferences files in various formats.
- [Convert](http://commons.apache.org/sandbox/commons-convert) - Commons-Convert aims to provide a single library dedicated to the task of converting an object of one type to another.
- [CSV](http://commons.apache.org/proper/commons-csv) - Component for reading and writing comma separated value files. (apache/commons-csv other)
- [Daemon](http://commons.apache.org/proper/commons-daemon) - Alternative invocation mechanism for unix-daemon-like java code.
- [DBCP](http://commons.apache.org/proper/commons-dbcp) - Database connection pooling services.
- [DbUtils](http://commons.apache.org/proper/commons-dbutils) - JDBC helper library.
- [Digester](http://commons.apache.org/proper/commons-digester) - XML-to-Java-object mapping utility.
- [Email](http://commons.apache.org/proper/commons-email) - Library for sending e-mail from Java.
- [Exec](http://commons.apache.org/proper/commons-exec) - API for dealing with external process execution and environment management in Java.
- [FileUpload](http://commons.apache.org/proper/commons-fileupload) - File upload capability for your servlets and web applications.
- [Finder](http://commons.apache.org/sandbox/commons-finder) - Java library inspired by the UNIX find command.
- [Flatfile](http://commons.apache.org/sandbox/commons-flatfile) - Java library for working with flat data structures.
- [Functor](http://commons.apache.org/proper/commons-functor) - A functor is a function that can be manipulated as an object, or an object representing a single, generic function.
- [Graph](http://commons.apache.org/sandbox/commons-graph) - A general purpose Graph APIs and algorithms.
- [I18n](http://commons.apache.org/sandbox/commons-i18n) - Adds the feature of localized message bundles that consist of one or many localized texts that belong together.
- [Id](http://commons.apache.org/sandbox/commons-id) - Id is a component used to generate identifiers.
- [Imaging](http://commons.apache.org/proper/commons-imaging) - A pure-Java image library. (apache/commons-imaging apache-2.0)
- [IO](http://commons.apache.org/proper/commons-io) - Collection of I/O utilities.
- [Javaflow](http://commons.apache.org/sandbox/commons-javaflow) - Continuation implementation to capture the state of the application.
- [JCI](http://commons.apache.org/proper/commons-jci) - Java Compiler Interface.
- [JCS](http://commons.apache.org/proper/commons-jcs) - Java Caching System.
- [Jelly](http://commons.apache.org/proper/commons-jelly) - XML based scripting and processing engine.
- [Jexl](http://commons.apache.org/proper/commons-jexl) - Expression language which extends the Expression Language of the JSTL.
- [JNet](http://commons.apache.org/sandbox/commons-jnet) - JNet allows to use dynamically register url stream handlers through the java.net API.
- [JXPath](http://commons.apache.org/proper/commons-jxpath) - Utilities for manipulating Java Beans using the XPath syntax.
- [Lang](http://commons.apache.org/proper/commons-lang) - Provides extra functionality for classes in java.lang. (apache/commons-lang apache-2.0)
- [Logging](https://en.wikipedia.org/wiki/Apache_Commons_Logging) Wrapper around a variety of logging API implementations.
- [Math](http://commons.apache.org/proper/commons-math) - Lightweight, self-contained mathematics and statistics components.
- [Monitoring](http://commons.apache.org/sandbox/commons-monitoring) - Monitoring aims to provide a simple but extensible monitoring solution for Java applications.
- [Nabla](http://commons.apache.org/sandbox/commons-nabla) - Nabla provides automatic differentiation classes that can generate derivative of any function implemented in the Java language.
- [Net](http://commons.apache.org/proper/commons-net) - Collection of network utilities and protocol implementations.
- [OGNL](http://commons.apache.org/proper/commons-ognl) - An Object-Graph Navigation Language.
- [OpenPGP](http://commons.apache.org/sandbox/commons-openpgp) - Interface to signing and verifying data using OpenPGP.
- [Performance](http://commons.apache.org/sandbox/commons-performance) - A small framework for microbenchmark clients, with implementations for Commons DBCP and Pool.
- [Pipeline](http://commons.apache.org/sandbox/commons-pipeline) - Provides a set of pipeline utilities designed around work queues that run in parallel to sequentially process data objects.
- [Pool](http://commons.apache.org/proper/commons-pool) - Generic object pooling component.
- [Proxy](http://commons.apache.org/proper/commons-proxy) - Library for creating dynamic proxies.
- [RDF](https://commons.apache.org/proper/commons-rdf) - Common implementation of RDF 1.1 that could be implemented by systems on the JVM. (apache/commons-rdf other)
- [RNG](https://commons.apache.org/proper/commons-rng) - Commons Rng provides implementations of pseudo-random numbers generators.
- [SCXML](http://commons.apache.org/proper/commons-scxml) - An implementation of the State Chart XML specification aimed at creating and maintaining a Java SCXML engine. (jbeard4/SCION apache-2.0) (jbeard4/SCION-Java apache-2.0)
- [Validator](http://commons.apache.org/proper/commons-validator) - Framework to define validators and validation rules in an xml file.
- [VFS](http://commons.apache.org/proper/commons-vfs) - Virtual File System component for treating files, FTP, SMB, ZIP and such like as a single logical file system.
- [Weaver](http://commons.apache.org/proper/commons-weaver) - Provides an easy way to enhance (weave) compiled bytecode.

#### Other

- [CUBA Platform](https://cuba-platform.com) - High-level framework for developing enterprise applications with a rich web interface, based on Spring, EclipseLink and Vaadin. (cuba-platform/cuba apache-2.0)
- [Light-Java](https://github.com/networknt/light-java) - A fast, lightweight and productive microservices framework with built-in [security](https://github.com/networknt/light-oauth2). (networknt/light-java apache-2.0) (networknt/light-oauth2 apache-2.0)
- [Orienteer](https://github.com/OrienteerBAP/Orienteer) - Open-source business application platform for rapid configuration/development of CRM, ERP, LMS and other applications. (OrienteerBAP/Orienteer apache-2.0)
- [Spring](https://spring.io/projects) - Provides many packages for dependency injection, aspect-oriented programming, security, etc. (spring-projects/rest-shell apache-2.0) (spring-projects/spring-flex apache-2.0) (spring-projects/spring-loaded apache-2.0)

### Processes

*Libraries that help the management of operating system processes.*

- [ch.vorburger.exec](https://github.com/vorburger/ch.vorburger.exec) - Convenient API around Apache Commons Exec. (vorburger/ch.vorburger.exec apache-2.0)
- [zt-exec](https://github.com/zeroturnaround/zt-exec) - Provides a unified API to Apache Commons Exec and ProcessBuilder. (zeroturnaround/zt-exec apache-2.0)
- [zt-process-killer](https://github.com/zeroturnaround/zt-process-killer) - Stops processes started from Java or the system processes via PID. (zeroturnaround/zt-process-killer other)

### Reactive libraries

*Libraries for developing reactive applications.*

- [Akka](https://akka.io) - Toolkit and runtime for building concurrent, distributed, fault-tolerant and event-driven applications. (akka/akka other)
- [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) - Provides a standard for asynchronous stream processing with non-blocking backpressure. (reactive-streams/reactive-streams-jvm other)
- [Reactor](https://projectreactor.io) - Library for building reactive fast-data applications. (cloudfoundry/cf-java-client apache-2.0) (reactive-streams/reactive-streams-jvm other) (reactor/projectreactor.io apache-2.0) (reactor/reactive-streams-commons apache-2.0) (reactor/reactor apache-2.0)
- [RxJava](https://github.com/ReactiveX/RxJava) - Allows for composing asynchronous and event-based programs using observable sequences. (ReactiveX/RxJava apache-2.0)
- [vert.x](http://vertx.io) - Polyglot event-driven application framework. (vert-x3/vertx-examples apache-2.0) (vert-x3/wiki apache-2.0)

### REST Frameworks

*Frameworks specifically for creating RESTful services.*

- [Dropwizard](https://dropwizard.github.io/dropwizard) - Opinionated framework for setting up modern web applications with Jetty, Jackson, Jersey and Metrics.
- [Elide](http://elide.io/) - Opinionated framework for JSON- or GraphQL-APIs based on a JPA data model. (yahoo/elide other)
- [javalin](https://javalin.io) - Javalin is just a few thousand lines of code on top of Jetty, which means its performance is almost equivalent to pure Jetty. (javalin/javalin.github.io NA) (tipsy/javalin apache-2.0)
- [Jersey](https://jersey.github.io) - JAX-RS reference implementation. (eclipse-ee4j/jersey other)
- [Microserver](https://github.com/aol/micro-server) — A convenient, extensible microservices plugin system for Spring & Spring Boot. With more than 30 plugins and growing, it supports both micro-monolith and pure microservices styles. (aol/micro-server apache-2.0)
- [Rapidoid](https://www.rapidoid.org) - A simple, secure and extremely fast framework consisting of an embedded HTTP server, GUI components and dependency injection. (rapidoid/rapidoid apache-2.0)
- [rest.li](https://github.com/linkedin/rest.li) - Framework for building robust, scalable RESTful architectures using typesafe bindings and asynchronous, non-blocking IO with an end-to-end developer workflow that promotes clean practices, uniform interface design and consistent data modeling. (linkedin/rest.li other)
- [RESTEasy](https://resteasy.jboss.org) - Fully certified and portable implementation of the JAX-RS specification. (resteasy/Resteasy other)
- [RestExpress](https://github.com/RestExpress/RestExpress) - Thin wrapper on the JBoss Netty HTTP stack that provides scaling and performance. (RestExpress/RestExpress apache-2.0)
- [Restlet Framework](https://github.com/restlet/restlet-framework-java) - Pioneering framework with powerful routing and filtering capabilities, and a unified client and server API. (restlet/restlet-framework-java NA)
- [Spark](http://sparkjava.com) - Sinatra inspired framework. (perwendel/spark apache-2.0)
- [Crnk](http://www.crnk.io) - Implementation of the JSON API specification to build resource-oriented REST endpoints with sorting, filtering, paging, linking, object graphs, type-safety, bulk updates, integrations and more. (crnk-project/crnk-example apache-2.0) (crnk-project/crnk-framework apache-2.0)
- [Swagger](https://swagger.io) - Standard, language-agnostic interface to REST APIs.

### Science

*Libraries for scientific computing, analysis and visualization.*

- [DataMelt](http://jwork.org/dmelt) - Environment for scientific computation, data analysis and data visualization.
- [Erdos](https://github.com/Erdos-Graph-Framework/Erdos) - Modular, light and easy graph framework for theoretic algorithms. (Erdos-Graph-Framework/Erdos mit)
- [GraphStream](http://graphstream-project.org) - Library for modeling and analyzing dynamic graphs. (graphstream/gs-core other)
- [JFreeChart](http://www.jfree.org/jfreechart) - 2D chart library for Swing, JavaFX and server-side applications. (jfree/jfreechart lgpl-2.1)
- [JGraphT](https://github.com/jgrapht/jgrapht) - Graph library that provides mathematical graph-theory objects and algorithms. (jgrapht/jgrapht other)
- [JGraphX](https://github.com/jgraph/jgraphx) - Library for visualizing (mainly Swing) and interacting with node-edge graphs. (jgraph/jgraphx other)
- [Mines Java Toolkit](https://github.com/MinesJTK/jtk) - Library for geophysical scientific computation, visualization and digital signal analysis. (MinesJTK/jtk apache-2.0)
- [Morpheus](http://www.zavtech.com/morpheus/docs) - Provides a versatile two-dimensional memory efficient tabular data structure called a DataFrame to enable efficient in-memory analytics for scientific computing on the JVM. (zavtech/morpheus-core apache-2.0) (zavtech/morpheus-google NA) (zavtech/morpheus-quandl NA) (zavtech/morpheus-viz NA) (zavtech/morpheus-yahoo NA)
- [Orson-Charts](https://github.com/jfree/orson-charts) - Generates a wide variety of 3D charts that can be displayed with Swing and JavaFX or exported to PDF, SVG, PNG and JPEG. (jfree/orson-charts gpl-3.0)
- [Tablesaw](https://github.com/lwhite1/tablesaw) - Includes a data-frame, an embedded column store, and hundreds of methods to transform, summarize, or filter data. (lwhite1/tablesaw apache-2.0)
- [XChart](https://github.com/knowm/XChart) - A light-weight library for plotting data. Many customizable chart types are available. (knowm/XChart apache-2.0)

### Search

*Engines that index documents for search and analysis.*

- [Apache Lucene](https://lucene.apache.org) - High-performance, full-featured, cross-platform, text search engine library.
- [Apache Solr](https://lucene.apache.org/solr) - Enterprise search engine optimized for high-volume traffic.
- [Elasticsearch](https://www.elastic.co) - Distributed, multitenant-capable, full-text search engine with a RESTful web interface and schema-free JSON documents.
- [Indexer4j](https://github.com/haeungun/indexer4j) - Simple and light full text indexing and searching library. (haeungun/indexer4j apache-2.0)

### Security

*Libraries that handle security, authentication, authorization or session management.*

- [Apache Shiro](https://shiro.apache.org) - Performs authentication, authorization, cryptography and session management. (apache/shiro apache-2.0)
- [Bouncy Castle](https://www.bouncycastle.org/java.html) - All-purpose cryptographic library and JCA provider offering a wide range of functions, from basic helpers to PGP/SMIME operations. (bcgit/bc-java other)
- [Cryptomator](https://cryptomator.org) - Multiplatform, transparent, client-side encryption of files in the cloud. (cryptomator/cryptomator gpl-3.0)
- [Hdiv](https://github.com/hdiv/hdiv) - Runtime application that repels application security risks included in the OWASP Top 10, including SQL injection, cross-site scripting, cross-site request forgery, data tampering, and brute force attacks. (hdiv/hdiv other)
- [jjwt](https://github.com/jwtk/jjwt) - JSON web token for Java and Android. (jwtk/jjwt apache-2.0)
- [Jwks RSA](https://github.com/auth0/jwks-rsa-java) - JSON Web Key Set parser. (auth0/jwks-rsa-java mit)
- [Kalium](https://github.com/abstractj/kalium) - Binding for the Networking and Cryptography (NaCl) library. (abstractj/kalium apache-2.0)
- [Keycloak](https://keycloak.jboss.org) - Integrated SSO and IDM for browser apps and RESTful web services.
- [Keyczar](https://github.com/google/keyczar) - Easy-to-use, safe encryption framework with key versioning. (google/keyczar apache-2.0)
- [Keywhiz](https://github.com/square/keywhiz) - System for distributing and managing secrets. (square/keywhiz apache-2.0)
- [Nbvcxz](https://github.com/GoSimpleLLC/nbvcxz) - Advanced password strength estimation. (GoSimpleLLC/nbvcxz mit)
- [OACC](http://oaccframework.org) - Provides permission-based authorization services. (acciente/oacc-core apache-2.0) (tholman/github-corners mit)
- [pac4j](https://github.com/pac4j/pac4j) - Security engine. (pac4j/pac4j apache-2.0)
- [PicketLink](http://picketlink.org) - Umbrella project for security and identity management. (jbossorg/bootstrap-community apache-2.0) (picketlink/picketlink other) (picketlink/web-picketlink.org NA)
- [SecurityBuilder](https://github.com/tersesystems/securitybuilder) - Fluent Builder API for JCA and JSSE classes and especially X.509 certificates. (tersesystems/securitybuilder apache-2.0)
- [Themis](https://github.com/cossacklabs/themis) - Multi-platform high-level cryptographic library provides easy-to-use encryption for protecting sensitive data: secure messaging with forward secrecy, secure data storage (AES256GCM); suits for building end-to-end encrypted applications. (cossacklabs/themis apache-2.0)
- [Tink](http://github.com/google/tink) - Provides a simple and misuse-proof API for common cryptographic tasks. (google/tink apache-2.0)
- [Vault](https://www.vaultproject.io) - Secures, stores, and tightly controls access to tokens, passwords, certificates, API keys, and other secrets. It handles leasing, key revocation, key rolling, and auditing. Through a unified API, users can access an encrypted Key/Value store and network encryption-as-a-service, or generate AWS IAM/STS credentials, SQL/NoSQL databases, X.509 certificates, SSH credentials, and more. (hashicorp/vault mpl-2.0)

### Serialization

*Libraries that handle serialization with high efficiency.*

- [FlatBuffers](https://github.com/google/flatbuffers) - Memory-efficient serialization library that can access serialized data without unpacking and parsing it. (google/flatbuffers apache-2.0)
- [FST](https://github.com/RuedigerMoeller/fast-serialization) - JDK-compatible, high-performance object graph serialization. (RuedigerMoeller/fast-serialization apache-2.0)
- [Kryo](https://github.com/EsotericSoftware/kryo) - Fast and efficient object graph serialization framework. (EsotericSoftware/kryo bsd-3-clause)
- [MessagePack](https://github.com/msgpack/msgpack-java) - Efficient binary serialization format. (msgpack/msgpack-java apache-2.0)
- [PHP Serializer](https://github.com/marcospassos/java-php-serializer) - Serializing objects in the PHP serialization format. (marcospassos/java-php-serializer mit)

### Server

*Servers specifically used to deploy applications.*

- [Apache Tomcat](https://tomcat.apache.org) - Robust, all-round server for Servlet and JSP.
- [Apache TomEE](https://tomee.apache.org) - Tomcat plus Java EE.
- [Jetty](https://www.eclipse.org/jetty) - Provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. (eclipse/jetty.project other)
- [nanohttpd](https://github.com/NanoHttpd/nanohttpd) - Tiny, easily embeddable HTTP server. (NanoHttpd/nanohttpd bsd-3-clause)
- [WebSphere Liberty](https://developer.ibm.com/wasdev) - Lightweight, modular server developed by IBM. (WP-API/WP-API gpl-2.0)
- [WildFly](http://www.wildfly.org) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support. (jbossorg/bootstrap-community apache-2.0) (wildfly/wildfly lgpl-2.1) (wildfly/wildfly.org apache-2.0)

### Template Engine

*Tools that substitute expressions in a template.*

- [Handlebars.java](https://jknack.github.io/handlebars.java) - Logicless and semantic Mustache templates. (jknack/handlebars.java other)
- [Jade4J](https://github.com/neuland/jade4j) - Implementation of Pug (formerly known as Jade). (neuland/jade4j mit)
- [Jtwig](http://jtwig.org) - Modular, configurable and fully tested template engine. (jtwig/jtwig NA)
- [Pebble](https://pebbletemplates.io) - Inspired by Twig and separates itself with its inheritance feature and its easy-to-read syntax. It ships with built-in autoescaping for security and it includes integrated support for internationalization.
- [Rocker](https://github.com/fizzed/rocker) - Optimized, memory efficient and speedy template engine producing statically typed, plain objects. (fizzed/rocker NA)
- [Thymeleaf](http://www.thymeleaf.org) - Aims to be a substitute for JSP and works for XML files.

### Testing

*Tools that test from model to the view.*

#### Asynchronous

*Tools that simplify testing asynchronous services.*

- [Awaitility](https://github.com/jayway/awaitility) - DSL for synchronizing asynchronous operations. (jayway/awaitility apache-2.0)
- [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) - Toolkit for testing multi-threaded and asynchronous applications. (jhalterman/concurrentunit apache-2.0)
- [GreenMail](http://www.icegreen.com/greenmail) - In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL. (alextir/play-module-greenmail NA) (greenmail-mail-test/greenmail apache-2.0) (jrbsoft/testmail-jca-adapter gpl-2.0) (salyh/javamail-mock2 apache-2.0)
- [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) - Native bindings for Hoverfly, a proxy which allows you to simulate HTTP services. (SpectoLabs/hoverfly-java other)
- [REST Assured](https://github.com/jayway/rest-assured) - DSL for easy testing of REST/HTTP services. (jayway/rest-assured apache-2.0)

#### BDD

*Testing for the software development process that emerged from TDD and was heavily influenced by DDD and OOAD.*

- [Cucumber](https://github.com/cucumber/cucumber-jvm) - Provides a way to describe features in a plain language which customers can understand. (cucumber/cucumber-jvm mit)
- [Cukes-REST](https://github.com/ctco/cukes-rest) - A collection of Gherkin steps for REST-service testing using Cucumber. (ctco/cukes-rest apache-2.0)
- [J8Spec](https://github.com/j8spec/j8spec) - Follows a Jasmine-like syntax. (j8spec/j8spec mit)
- [JBehave](http://jbehave.org) - Extensively configurable framework that describes stories.
- [JGiven](http://jgiven.org) - Provides a fluent API which allows for simpler composition. (TNG/JGiven apache-2.0)
- [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) - Aims to provide a fluent API to write tests in long and descriptive sentences that read like plain English. (RichardWarburton/lambda-behave mit)
- [Serenity BDD](https://www.thucydides.info) - Automated Acceptance testing and reporting library that works with Cucumber, JBehave and JUnit to make it easier to write high quality executable specifications.

#### Fixtures

*Everything related to the creation and handling of random data.*

- [Beanmother](https://github.com/keepcosmos/beanmother) - Sets up beans from YAML fixtures. (keepcosmos/beanmother apache-2.0)
- [Fixture Factory](https://github.com/six2six/fixture-factory) - Generates fake objects from a template. (six2six/fixture-factory apache-2.0)
- [JFairy](https://github.com/Codearte/jfairy) - Fake data generator. (Codearte/jfairy apache-2.0)
- [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) - JUnit test runner and plugins for running JUnit tests with pseudo-randomness. (randomizedtesting/randomizedtesting apache-2.0)
- [Java Faker](https://github.com/DiUS/java-faker) - A port of Ruby's fake data generator. (DiUS/java-faker other)

#### Frameworks

*Provide environments to run tests for a specific use case.*

- [ArchUnit](https://github.com/TNG/ArchUnit) - Test library for specifying and asserting architecture rules. (TNG/ArchUnit apache-2.0)
- [Apache JMeter](http://jmeter.apache.org) - Functional testing and performance measurements. (apache/jmeter apache-2.0)
- [Arquillian](http://arquillian.org) - Integration and functional testing platform for Java EE containers. (arquillian/arquillian.github.com other)
- [Citrus](https://citrusframework.org) - Integration testing framework that focuses on both client- and server-side messaging. (citrusframework/citrus apache-2.0)
- [Gatling](https://gatling.io) - Load testing tool designed for ease of use, maintainability and high performance. (gatling/gatling apache-2.0)
- [JUnit](http://junit.org) - Common testing framework. (junit-team/junit5 other)
- [Pact JVM](https://github.com/DiUS/pact-jvm) - Consumer-driven contract testing. (DiUS/pact-jvm apache-2.0)
- [PIT](http://pitest.org) - Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test suites. (hcoles/pitest apache-2.0)

#### Matchers

*Libraries that provide custom matchers.*

- [AssertJ](https://joel-costigliola.github.io/assertj) - Fluent assertions that improve readability. (joel-costigliola/assertj-examples NA)
- [JSONAssert](http://jsonassert.skyscreamer.org) - Simplifies testing JSON strings. (skyscreamer/JSONassert apache-2.0) (skyscreamer/jsonassert apache-2.0)
- [Truth](https://github.com/google/truth) - Google's assertion and proposition framework. (google/truth apache-2.0)

#### Miscellaneous

*Other stuff related to testing.*

- [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) - Reports whether instances of a given class are immutable. (MutabilityDetector/MutabilityDetector apache-2.0)
- [raml-tester](https://github.com/nidi3/raml-tester) - Tests if a request/response matches a given RAML definition. (nidi3/raml-tester apache-2.0)
- [TestContainers](https://github.com/testcontainers/testcontainers-java) - Provides throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container. (testcontainers/testcontainers-java mit)
- [pojo-tester](http://www.pojo.pl) - Automatically performs tests on basic POJO methods. (sta-szek/pojo-tester lgpl-3.0)

#### Mocking

*Tools which mock collaborators to help testing single, isolated units.*

- [JMockit](http://jmockit.github.io) - Integration testing, API mocking and faking, and code coverage. (jmockit/jmockit1 other)
- [Mockito](https://github.com/mockito/mockito) - Mocking framework that lets you write tests with a clean and simple API. (mockito/mockito mit)
- [MockServer](https://www.mock-server.com) - Allows mocking of systems integrated with HTTPS. (jamesdbloom/mockserver apache-2.0)
- [Moco](https://github.com/dreamhead/moco) - Concise web services for stubs and mocks. (dreamhead/moco mit)
- [PowerMock](https://github.com/jayway/powermock) - Mocks static methods, constructors, final classes and methods, private methods, and removal of static initializers. (jayway/powermock apache-2.0)
- [WireMock](http://wiremock.org) - Stubs and mocks web services. (tomakehurst/wiremock apache-2.0)

#### Parameterization

*Simplifies the writing of parameterized tests.*

- [Burst](https://github.com/square/burst) - A unit testing library for varying test data. (square/burst apache-2.0)
- [junit-dataprovider](https://github.com/TNG/junit-dataprovider) - A TestNG-like data provider/runner for JUnit. (TNG/junit-dataprovider apache-2.0)
- [JUnitParams](https://pragmatists.github.io/JUnitParams) - Creates readable and maintainable parametrised tests. (Pragmatists/JUnitParams apache-2.0) (Pragmatists/junitparams apache-2.0) (Pragmatists/junitparams-spring-integration-example NA)

### Utility

*Libraries which provide general utility functions.*

- [bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) - Rate limiting library based on token-bucket algorithm. (vladimir-bukhtoyarov/bucket4j apache-2.0)
- [cactoos](http://www.cactoos.org) - Collection of object-oriented primitives. (yegor256/cactoos mit)
- [CRaSH](http://www.crashub.org) - Provides a shell into a JVM that's running CRaSH. Used by Spring Boot and others. (crashub/crash NA) (crashub/mod-shell NA) (tjdett/play2-crash-plugin other)
- [Dex](https://github.com/PatMartin/Dex) - Java/JavaFX tool capable of powerful ETL and data visualization. (PatMartin/Dex apache-2.0)
- [Embulk](http://www.embulk.org) - Bulk data loader that helps data transfer between various databases, storages, file formats, and cloud services.
- [fswatch](https://github.com/vorburger/ch.vorburger.fswatch) - Micro library to watch for directory file system changes, simplifying java.nio.file.WatchService (vorburger/ch.vorburger.fswatch apache-2.0)
- [Gephi](https://github.com/gephi/gephi) - Cross-platform for visualizing and manipulating large graph networks. (gephi/gephi other)
- [Guava](https://github.com/google/guava) - Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and more. (google/guava apache-2.0)
- [JADE](http://jade.tilab.com) - Framework and environment for building and debugging multi-agent systems.
- [JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) - Library that helps with constructing difficult regular expressions. (VerbalExpressions/JavaVerbalExpressions mit)
- [JGit](https://eclipse.org/jgit) - A lightweight, pure Java library implementing the Git version control system.
- [minio-java](https://github.com/minio/minio-java) - Provides simple APIs to access any Amazon S3-compatible object storage server. (minio/minio-java apache-2.0)
- [Protégé](https://protege.stanford.edu) - Provides an ontology editor and a framework to build knowledge-based systems.
- [Underscore-java](https://github.com/javadev/underscore-java) - Port of Underscore.js functions. (javadev/underscore-java mit)

### Version Managers

*Utilities that help create the development shell environment and switch between different Java versions.*

- [jabba](https://github.com/shyiko/jabba) - Java Version Manager inspired by nvm. Supports Mac OS X, Linux and Windows. (shyiko/jabba NA)
- [jenv](https://github.com/gcuisinier/jenv) - Java Version Manager inspired by rbenv. Can configure globally or per project. Tested on Debian and Mac OS X. (gcuisinier/jenv mit)
- [SDKMan](https://github.com/sdkman/sdkman-cli) - Java Version Manager inspired by RVM and rbenv. Supports UNIX-based platforms and Windows. (sdkman/sdkman-cli apache-2.0)

### Web Crawling

*Libraries that analyze the content of websites.*

- [Apache Nutch](https://nutch.apache.org) - Highly extensible, highly scalable web crawler for production environments.
- [Crawler4j](https://github.com/yasserg/crawler4j) - Simple and lightweight web crawler. (yasserg/crawler4j apache-2.0)
- [jsoup](https://jsoup.org) - Scrapes, parses, manipulates and cleans HTML. (jhy/jsoup mit)
- [StormCrawler](http://stormcrawler.net) - SDK for building low-latency and scalable web crawlers. (DigitalPebble/storm-crawler apache-2.0)
- [webmagic](https://github.com/code4craft/webmagic) - Scalable crawler with downloading, url management, content extraction and persistent. (code4craft/webmagic apache-2.0)

### Web Frameworks

*Frameworks that handle the communication between the layers of a web application.*

- [Apache Tapestry](https://tapestry.apache.org) - Component-oriented framework for creating dynamic, robust, highly scalable web applications.
- [Apache Wicket](https://wicket.apache.org) - Component-based web application framework similar to Tapestry, with a stateful GUI.
- [Blade](https://github.com/biezhi/blade) - Lightweight, modular framework that aims to be elegant and simple. (biezhi/blade apache-2.0)
- [Bootique](http://bootique.io) - Minimally opinionated framework for runnable apps. (bootique/bootique apache-2.0)
- [Firefly](http://www.fireflysource.com) - Asynchronous framework for rapid development of high-performance web application. (hypercube1024/firefly apache-2.0)
- [Grails](https://grails.org) - Groovy framework that provides a highly productive environment by favoring convention over configuration, no XML and support for mixins. (grails/grails-core apache-2.0)
- [Jooby](http://jooby.org) - Scalable, fast and modular micro-framework that offers multiple programming models. (google/guice apache-2.0) (jooby-project/jooby apache-2.0)
- [Ninja](http://www.ninjaframework.org) - Full-stack web framework. (ninjaframework/ninja apache-2.0)
- [Pippo](http://www.pippo.ro) - Small, highly modularized, Sinatra-like framework. (decebals/pippo apache-2.0) (pippo-java/pippo apache-2.0)
- [Play](https://www.playframework.com) - Built on Akka, it provides predictable and minimal resource consumption (CPU, memory, threads) for highly-scalable applications in Java and Scala.
- [PrimeFaces](https://primefaces.org) - JSF framework with both free and commercial/support versions and frontend components. (primefaces/primeng mit) (primefaces/primereact mit) (primefaces/primevue mit)
- [Ratpack](https://ratpack.io) - Set of libraries that facilitate fast, efficient, evolvable and well-tested HTTP applications. (ratpack/ratpack other)
- [Takes](https://github.com/yegor256/takes) - Opinionated web framework which is built around the concepts of True Object-Oriented Programming and immutability. (yegor256/takes mit)
- [Vaadin Flow](https://vaadin.com/flow) - Event-driven framework that uses standard web components. Server-side architecture with Ajax on the client side.

## Resources

### Awesome Lists

*Awesome lists related to the Java & JVM ecosystem.*

- [Awesome Annotation Processing](https://github.com/gunnarmorling/awesome-annotation-processing) (gunnarmorling/awesome-annotation-processing other)
- [Awesome Gradle Plugins](https://github.com/ksoichiro/awesome-gradle) (ksoichiro/awesome-gradle NA)
- [AwesomeJavaFX](https://github.com/mhrimaz/AwesomeJavaFX) (mhrimaz/AwesomeJavaFX other)
- [Awesome JVM](https://github.com/deephacks/awesome-jvm) (deephacks/awesome-jvm cc0-1.0)
- [Awesome Microservices](https://github.com/mfornos/awesome-microservices) (mfornos/awesome-microservices cc0-1.0)
- [Awesome REST](https://github.com/marmelab/awesome-rest) (marmelab/awesome-rest NA)
- [Awesome Selenium](https://github.com/christian-bromann/awesome-selenium) (christian-bromann/awesome-selenium cc0-1.0)
- [ciandcd](https://github.com/ciandcd/awesome-ciandcd) (ciandcd/awesome-ciandcd gpl-2.0)
- [Useful Java Links](https://github.com/Vedenin/useful-java-links) (Vedenin/useful-java-links other)
- [Java Concurrency Checklist](https://github.com/code-review-checklists/java-concurrency) (code-review-checklists/java-concurrency NA)
- [Java Developer Roadmap](https://github.com/s4kibs4mi/java-developer-roadmap) (s4kibs4mi/java-developer-roadmap NA)

### Communities

*Active discussions.*

- [r/java](https://www.reddit.com/r/java) - Subreddit for the Java community. (gregorriegler/seamer mit) (h4t0n/gemini apache-2.0) (raptor4694/JavaPy gpl-3.0)
- [stackoverflow](https://stackoverflow.com/questions/tagged/java) - Question/answer platform.
- [VirtualJUG](https://virtualjug.com) - Virtual Java User Group. (virtualjug/virtualjug.github.io NA)

### Frontends

*Websites that provide a frontend for this list. Please note, there won't be an official website. We don't associate with a particular website and everybody is allowed to create one.*

- [java.libhunt.com](https://java.libhunt.com)

### Influential Books

*Books that made a big impact and are still worth reading.*

- [Core Java Volume I--Fundamentals](https://www.amazon.com/Core-Java-I-Fundamentals-10th/dp/0134177304)
- [Core Java, Volume II--Advanced Features](https://www.amazon.com/Core-Java-II-Advanced-Features-10th/dp/0134177290)
- [Effective Java (3rd Edition)](https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997)
- [Java Concurrency in Practice](https://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
- [Thinking in Java](https://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

### Podcasts and Screencasts

*Something to look at or listen to while programming.*

- [Java Off Heap](http://www.javaoffheap.com)
- [Marco Behler's Screencasts](https://www.marcobehler.com/series) - Screencasts about modern Java development.
- [The Java Council](https://virtualjug.com/#podcast) (virtualjug/virtualjug.github.io NA)
- [The Java Posse](http://www.javaposse.com) - Discontinued as of 02/2015. (Netflix/Hystrix apache-2.0) (Netflix/Priam apache-2.0) (Netflix/RxJava apache-2.0) (Netflix/asgard apache-2.0) (Netflix/edda apache-2.0) (Netflix/staash apache-2.0) (Netflix/zuul apache-2.0) (ReactiveX/RxJava apache-2.0) (clojure/clojurescript NA) (codahale/metrics mit) (creationix/nstore mit) (dickwall/subcut NA) (dropwizard/metrics apache-2.0) (etsy/statsd mit) (harrah/xsbt other) (linkedin/glu NA) (milessabin/shapeless apache-2.0) (mozilla/socorro mpl-2.0) (rundeck/rundeck apache-2.0) (scalaz/scalaz other) (spray/spray other) (spray/spray-json apache-2.0) (strangeloop/clojurewest2012-slides NA) (twitter/ostrich apache-2.0) (typesafehub/zinc NA) (xamarin/XobotOS NA)

### Twitter

*Active accounts to follow. Descriptions from Twitter.*

- [Adam Bien](https://twitter.com/AdamBien) - Freelance author, JavaOne Rockstar speaker, consultant, Java Champion.
- [Aleksey Shipilëv](https://twitter.com/shipilev) - Performance geek, benchmarking czar, concurrency bug hunter.
- [Antonio Goncalves](https://twitter.com/agoncal) - Java Champion, JUG Leader, Devoxx France, Java EE 6/7, JCP, Author. (quarkusio/quarkus apache-2.0)
- [Arun Gupta](https://twitter.com/arungupta) - Java Champion, JavaOne Rockstar, JUG Leader, Devoxx4Kids-er, VP of Developer Advocacy at Couchbase. (firecracker-microvm/firecracker apache-2.0) (weaveworks/ignite apache-2.0)
- [Brian Goetz](https://twitter.com/BrianGoetz) - Java Language Architect at Oracle.
- [Bruno Borges](https://twitter.com/brunoborges) - Product Manager/Java Jock at Oracle. (c-guntur/java-katas mit) (junit-team/junit5 other)
- [Chris Richardson](https://twitter.com/crichardson) - Software architect, consultant, and serial entrepreneur, Java Champion, JavaOne Rock Star, *POJOs in Action- author.
- [Ed Burns](https://twitter.com/edburns) - Consulting Member of the Technical Staff at Oracle.
- [Eugen Paraschiv](https://twitter.com/baeldung) - Author of the Spring Security Course.
- [Heinz Kabutz](https://twitter.com/heinzkabutz) - Java Champion, speaker, author of The Java Specialists' Newsletter, concurrency performance expert.
- [Holly Cummins](https://twitter.com/holly_cummins) - Technical Lead of IBM London's Bluemix Garage, Java Champion, developer, author, JavaOne rockstar. (dustinspecker/pushit mit)
- [James Weaver](https://twitter.com/JavaFXpert) - Java/JavaFX/IoT developer, author and speaker.
- [Java EE](https://twitter.com/Java_EE) - Official Java EE Twitter account. (sgalles/ceylon-dddsample mit)
- [Java Magazine](https://twitter.com/Oraclejavamag) - Official Java Magazine account.
- [Java](https://twitter.com/java) - Official Java Twitter account. (junit-team/junit5 other)
- [Javin Paul](https://twitter.com/javinpaul) - Well-known Java blogger.
- [Josh Long](https://twitter.com/starbuxman) - Spring Advocate at Pivotal, author of O'Reilly's Cloud Native Java- and Building Microservices with Spring Boot, JavaOne Rock Star.
- [Lukas Eder](https://twitter.com/lukaseder) - Java Champion, speaker, JUG.ch co-leader, Founder and CEO Data Geekery (jOOQ). (jOOQ/jOOQ other) (jOOQ/jOOQ-pro NA) (querydsl/querydsl apache-2.0)
- [Mario Fusco](https://twitter.com/mariofusco) - RedHatter, JUG coordinator, frequent speaker and author.
- [Mark Heckler](https://twitter.com/MkHeck) - Pivotal Principal Technologist and Developer Advocate, conference speaker, published author, and Java Champion, focusing on Internet of Things and the cloud.
- [Mark Reinhold](https://twitter.com/mreinhold) - Chief Architect, Java Platform Group, Oracle. (sormuras/modules apache-2.0)
- [Markus Eisele](https://twitter.com/myfear) - Java EE evangelist, Red Hat. (yusuke/shogun apache-2.0)
- [Martijn Verburg](https://twitter.com/karianna) - London JUG co-leader, speaker, author, Java Champion and much more. (eclipse-ee4j/jakartaee-platform epl-2.0) (oracle/graal other)
- [Martin Thompson](https://twitter.com/mjpt777) - Pasty faced performance gangster. (google/syzkaller apache-2.0) (mockito/mockito mit) (real-logic/aeron apache-2.0)
- [Monica Beckwith](https://twitter.com/mon_beck) - Performance consultant, JavaOne Rock Star. (c-guntur/java-katas mit) (eclipse/omr other) (oracle/graal other)
- [OpenJDK](https://twitter.com/OpenJDK) - Official OpenJDK account. (openjdk/skara gpl-2.0)
- [Peter Lawrey](https://twitter.com/PeterLawrey) - Peter Lawrey, Java performance expert. (dotnet/try mit)
- [Randy Shoup](https://twitter.com/randyshoup) - Stitch Fix VP Engineering, speaker, JavaOne Rock Star.
- [Reza Rahman](https://twitter.com/reza_rahman) - Java EE/GlassFish/WebLogic evangelist, author, speaker, open source hacker.
- [Sander Mak](https://twitter.com/Sander_Mak) - Java Champion, author. (corretto/amazon-corretto-crypto-provider apache-2.0)
- [Simon Maple](https://twitter.com/sjmaple) - Java Champion, VirtualJUG founder, LJC leader, RebelLabs author.
- [Stephen Colebourne](https://twitter.com/jodastephen) - Java Champion, speaker.
- [Trisha Gee](https://twitter.com/trisha_gee) - Java Champion and speaker.
- [Venkat Subramaniam](https://twitter.com/venkat_s) - Author, University of Houston professor, MicroSoft MVP award recipient, JavaOne Rock Star, Java Champion.

### Websites

*Sites to read.*

- [Baeldung](https://www.baeldung.com)
- [Dzone](https://dzone.com)
- [Google Java Style](https://google.github.io/styleguide/javaguide.html)
- [InfoQ](https://www.infoq.com)
- [Java Algorithms and Clients](https://algs4.cs.princeton.edu/code) (kevin-wayne/algs4 gpl-3.0)
- [Java, SQL, and jOOQ](https://blog.jooq.org) (google/guice apache-2.0) (jOOQ/jOOQ other) (jOOQ/sql-benchmarks apache-2.0)
- [Java.net](https://community.oracle.com/community/java)
- [Javalobby](https://dzone.com/java-jdk-development-tutorials-tools-news)
- [JavaWorld](https://www.javaworld.com)
- [JAXenter](https://jaxenter.com)
- [RebelLabs](https://zeroturnaround.com/rebellabs)
- [OverOps Blog](https://blog.overops.com)
- [TheServerSide.com](http://www.theserverside.com)
- [Vanilla Java](https://vanilla-java.github.io)
- [Voxxed](https://www.voxxed.com)

## Contributing

Contributions are very welcome!

Please have a look at the [CONTRIBUTING](https://github.com/akullpp/awesome-java/blob/master/CONTRIBUTING.md) guidelines. (akullpp/awesome-java other)

[c]: https://cdn.rawgit.com/akullpp/23246ca832bda82bb505230bf3538e2a/raw/d9bcdb769bf025292f9c6bc1290f01f1fcd1f864/commercial.svg
