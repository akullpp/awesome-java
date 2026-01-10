# Awesome Java [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of awesome Java frameworks, libraries and software.

## Contents

- [Awesome Java](#awesome-java-)
  - [Contents](#contents)
  - [Projects](#projects)
    - [Architecture](#architecture)
    - [Artificial Intelligence](#artificial-intelligence)
    - [Bean Mapping](#bean-mapping)
    - [Build](#build)
    - [Bytecode Manipulation](#bytecode-manipulation)
    - [Caching](#caching)
    - [CLI](#cli)
      - [Argument Parsing](#argument-parsing)
      - [Text-Based User Interfaces](#text-based-user-interfaces)
    - [Cloud](#cloud)
    - [Code Analysis](#code-analysis)
    - [Code Coverage](#code-coverage)
    - [Code Generators](#code-generators)
    - [Compiler-compiler](#compiler-compiler)
    - [Computer Vision](#computer-vision)
    - [Configuration](#configuration)
    - [Constraint Satisfaction Problem Solver](#constraint-satisfaction-problem-solver)
    - [CSV](#csv)
    - [Data Structures](#data-structures)
    - [Database](#database)
    - [Date and Time](#date-and-time)
    - [Decentralization](#decentralization)
    - [Dependency Injection](#dependency-injection)
    - [Development](#development)
    - [Distributed Applications](#distributed-applications)
    - [Distributed Transactions](#distributed-transactions)
    - [Distribution](#distribution)
    - [Document Processing](#document-processing)
    - [Financial](#financial)
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
    - [Introspection](#introspection)
    - [Job Scheduling](#job-scheduling)
    - [JSON](#json)
    - [JVM and JDK](#jvm-and-jdk)
    - [Logging](#logging)
    - [Machine Learning](#machine-learning)
    - [Messaging](#messaging)
    - [Microservice](#microservice)
    - [Miscellaneous](#miscellaneous)
    - [Mobile Development](#mobile-development)
    - [Monitoring](#monitoring)
    - [Native](#native)
    - [Natural Language Processing](#natural-language-processing)
    - [Networking](#networking)
    - [ORM](#orm)
    - [PaaS](#paas)
    - [Pathfinding](#pathfinding)
    - [PDF](#pdf)
    - [Performance analysis](#performance-analysis)
    - [Platform](#platform)
      - [Apache Commons](#apache-commons)
      - [Other](#other)
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
      - [Asynchronous](#asynchronous)
      - [BDD](#bdd)
      - [Fixtures](#fixtures)
      - [Frameworks](#frameworks)
      - [Matchers](#matchers)
      - [Testing Miscellaneous](#testing-miscellaneous)
      - [Mocking](#mocking)
    - [Utility](#utility)
    - [Version Managers](#version-managers)
    - [Web Crawling](#web-crawling)
    - [Web Frameworks](#web-frameworks)
    - [Workflow Orchestration Engines](#workflow-orchestration-engines)
  - [Resources](#resources)
    - [Related Awesome Lists](#related-awesome-lists)
    - [Communities](#communities)
    - [Frontends](#frontends)
    - [Influential Books](#influential-books)
    - [Podcasts and Screencasts](#podcasts-and-screencasts)
    - [People](#people)
      - [Socials](#socials)
    - [Websites](#websites)
  - [Contributing](#contributing)

## Projects

### Architecture

_Frameworks and libraries that help implementing and verifying design and architecture concepts._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ArchUnit](https://github.com/TNG/ArchUnit) | Test library for specifying and asserting architecture rules. | 3.6k | 23h |
| [jMolecules](https://github.com/xmolecules/jmolecules) | Annotations and interfaces to express design and architecture concepts in code. | 1.5k | 1mo |

### Artificial Intelligence

_Frameworks that help you to leverage LLMs and AI._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [LangChain4j](https://github.com/langchain4j/langchain4j) | Simplifies integration of LLMs with unified APIs and a comprehensive toolbox. | 10.3k | 14h |
| [MCP Java SDK](https://github.com/modelcontextprotocol/java-sdk) | Enables applications to interact with AI models and tools through a standardized interface (i.e. Model Context Protocol), supporting both synchronous and asynchronous communication patterns. | 3.0k | 23d |
| [simple-openai](https://github.com/sashirestela/simple-openai) | Library to use the OpenAI API (and compatible ones) in the simplest possible way. | 370 | 3mo |
| [Spring AI](https://spring.io/projects/spring-ai) | Application framework for AI engineering for Spring. | - | - |

### Bean Mapping

_Frameworks that ease bean mapping._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [dOOv](https://github.com/doov-io/doov) | Provides fluent API for typesafe domain model validation and mapping. It uses annotations, code generation and a type safe DSL to make bean validation and mapping fast and easy. | - | - |
| [JMapper](https://github.com/jmapper-framework/jmapper-core) | Uses byte code manipulation for lightning-fast mapping. Supports annotations and API or XML configuration. | 241 | 2y |
| [MapStruct](https://github.com/mapstruct/mapstruct) | Code generator that simplifies mappings between different bean types, based on a convention-over-configuration approach. | 7.6k | 6d |
| [ModelMapper](https://github.com/modelmapper/modelmapper) | Intelligent object mapping library that automatically maps objects to each other. | 2.3k | 1mo |
| [Orika](https://github.com/orika-mapper/orika) | JavaBean-mapping framework that recursively copies (among other capabilities) data from one object to another. | 1.3k | 1y |
| [reMap](https://github.com/remondis-it/remap) | Lambda and method handle-based mapping which requires code and not annotations if objects have different names. | 126 | 5mo |
| [Selma](https://github.com/xebia-france/selma) | Annotation processor-based bean mapper. | - | - |

### Build

_Tools that handle the build cycle and dependencies of an application._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Maven](https://maven.apache.org) | Declarative build and dependency management that favors convention over configuration. It might be preferable to Apache Ant, which uses a rather procedural approach and can be difficult to maintain. | - | - |
| [Bazel](https://bazel.build) | Tool from Google that builds code quickly and reliably. | - | - |
| [Buck2](https://github.com/facebook/buck2) | Encourages the creation of small, reusable modules consisting of code and resources. | 4.2k | 54m |
| [Gradle](https://gradle.org) | Incremental builds programmed via Groovy instead of declaring XML. Works well with Maven's dependency management. | - | - |

### Bytecode Manipulation

_Libraries to manipulate bytecode programmatically._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ASM](https://asm.ow2.io) | All-purpose, low-level bytecode manipulation and analysis. | - | - |
| [Byte Buddy](https://bytebuddy.net) | Further simplifies bytecode generation with a fluent API. | - | - |
| [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) | Java 8 Jar & Android APK reverse engineering suite. (GPL-3.0-only) | 15.4k | 1d |
| [Byteman](https://byteman.jboss.org) | Manipulate bytecode at runtime via DSL (rules); mainly for testing/troubleshooting. (LGPL-2.1-or-later) | - | - |
| [cglib](https://github.com/cglib/cglib) | Bytecode generation library. | 4.9k | 1y |
| [Javassist](https://github.com/jboss-javassist/javassist) | Tries to simplify bytecode editing. | 4.2k | 1y |
| [Maker](https://github.com/cojen/maker) | Provides low level bytecode generation. | 65 | 13d |
| [Mixin](https://github.com/SpongePowered/Mixin) | Manipulate bytecode at runtime using real Java code. | 1.7k | 1y |
| [Perses](https://github.com/nicolasmanic/perses) | Dynamically injects failure/latency at the bytecode level according to principles of chaos engineering. | - | - |
| [Recaf](https://www.coley.software/Recaf/) | JVM reverse engineering toolkit, essentially an IDE for Java bytecode. | - | - |

### Caching

_Libraries that provide caching facilities._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [cache2k](https://cache2k.org) | In-memory high performance caching library. | - | - |
| [Caffeine](https://github.com/ben-manes/caffeine) | High-performance, near-optimal caching library. | 17.4k | 2d |
| [Ehcache](http://www.ehcache.org) | Distributed general-purpose cache. | - | - |
| [Infinispan](https://infinispan.org) | Highly concurrent key/value datastore used for caching. | - | - |

### CLI

_Libraries for everything related to the CLI._

#### Argument Parsing

_Libraries to assist with parsing command line arguments._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Airline](https://rvesse.github.io/airline/) | Annotation-based framework for parsing Git-like command-line arguments. | - | - |
| [JCommander](http://jcommander.org) | Command-line argument-parsing framework with custom types and validation via implementing interfaces. | - | - |
| [jbock](https://github.com/jbock-java/jbock) | Reflectionless command line parser. | 88 | 2d |
| [JLine](https://github.com/jline/jline3) | Includes features from modern shells like completion or history. | 1.7k | 22d |
| [picocli](https://picocli.info) | ANSI colors and styles in usage help with annotation-based POSIX/GNU/any syntax, subcommands, strong typing for both options and positional args. | - | - |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Airline](https://rvesse.github.io/airline/) | Annotation-based framework for parsing Git-like command-line arguments. | - | - |
| [JCommander](http://jcommander.org) | Command-line argument-parsing framework with custom types and validation via implementing interfaces. | - | - |
| [jbock](https://github.com/jbock-java/jbock) | Reflectionless command line parser. | 88 | 2d |
| [JLine](https://github.com/jline/jline3) | Includes features from modern shells like completion or history. | 1.7k | 22d |
| [picocli](https://picocli.info) | ANSI colors and styles in usage help with annotation-based POSIX/GNU/any syntax, subcommands, strong typing for both options and positional args. | - | - |

#### Text-Based User Interfaces

_Libraries that provide TUI frameworks, or building blocks related functions._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Jansi](https://github.com/fusesource/jansi) | ANSI escape codes to format console output. | 1.2k | 8mo |
| [Jexer](https://gitlab.com/AutumnMeowMeow/jexer) | Advanced console (and Swing) text user interface (TUI) library, with mouse-draggable windows, built-in terminal window manager, and sixel image support. Looks like [Turbo Vision](https://en.wikipedia.org/wiki/Turbo_Vision). | - | - |
| [Text-IO](https://github.com/beryx/text-io) | Aids the creation of full console-based applications. | 351 | 5y |
| [Lanterna](https://github.com/mabe02/lanterna) | Easy console text-GUI library, similar to curses. (LGPL-3.0-only) | 2.5k | 5mo |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Jansi](https://github.com/fusesource/jansi) | ANSI escape codes to format console output. | 1.2k | 8mo |
| [Jexer](https://gitlab.com/AutumnMeowMeow/jexer) | Advanced console (and Swing) text user interface (TUI) library, with mouse-draggable windows, built-in terminal window manager, and sixel image support. Looks like [Turbo Vision](https://en.wikipedia.org/wiki/Turbo_Vision). | - | - |
| [Text-IO](https://github.com/beryx/text-io) | Aids the creation of full console-based applications. | 351 | 5y |
| [Lanterna](https://github.com/mabe02/lanterna) | Easy console text-GUI library, similar to curses. (LGPL-3.0-only) | 2.5k | 5mo |

### Cloud

_Libraries to integrate or use cloud-specific features._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [AWS SDK for Java](https://github.com/aws/aws-sdk-java) | Provides Java APIs for interacting with Amazon Web Services. | 4.2k | 2d |
| [Google Cloud Client Libraries](https://github.com/googleapis/google-cloud-java) | Client libraries for accessing Google Cloud services from Java applications. | 2.0k | 16d |

### Code Analysis

_Tools that provide metrics and quality measurements._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Checkstyle](https://github.com/checkstyle/checkstyle) | Static analysis of coding conventions and standards. (LGPL-2.1-or-later) | 8.8k | 2h |
| [Error Prone](https://github.com/google/error-prone) | Catches common programming mistakes as compile-time errors. | 7.1k | 8h |
| [Error Prone Support](https://github.com/PicnicSupermarket/error-prone-support) | Error Prone extensions: extra bug checkers and a large battery of Refaster templates. | 232 | 1d |
| [Infer](https://github.com/facebook/infer) | Modern static analysis tool for verifying the correctness of code. | 15.5k | 1d |
| [jQAssistant](https://jqassistant.org) | Static code analysis with Neo4J-based query language. (GPL-3.0-only) | - | - |
| [NullAway](https://github.com/uber/NullAway) | Eliminates NullPointerExceptions with low build-time overhead. | 4.0k | 10h |
| [PMD](https://github.com/pmd/pmd) | Source code analysis for finding bad coding practices. | 5.3k | 18h |
| [p3c](https://github.com/alibaba/p3c) | Provides Alibaba's coding guidelines for PMD, IDEA and Eclipse. | 30.8k | 3y |
| [RefactorFirst](https://github.com/jimbethancourt/RefactorFirst) | Identifies and prioritizes God Classes and Highly Coupled classes. | - | - |
| [SonarJava](https://github.com/SonarSource/sonar-java) | Static analyzer for SonarQube & SonarLint. (LGPL-3.0-only) | 1.2k | 14h |
| [Spoon](https://github.com/INRIA/spoon) | Library for analyzing and transforming Java source code. | 1.9k | 1d |
| [Spotbugs](https://github.com/spotbugs/spotbugs) | Static analysis of bytecode to find potential bugs. (LGPL-2.1-only) | 3.8k | 3d |

### Code Coverage

_Frameworks and tools that enable code coverage metrics collection for test suites._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Clover](https://www.atlassian.com/software/clover) | Relies on source-code instrumentation instead of bytecode instrumentation. | - | - |
| [Cobertura](https://cobertura.github.io/cobertura/) | Relies on offline (or static) bytecode instrumentation and class loading to collect code coverage metrics. (GPL-2.0-only) | - | - |
| [JaCoCo](https://www.eclemma.org/jacoco/) | Framework that enables collection of code coverage metrics, using both offline and runtime bytecode instrumentation. | - | - |

### Code Generators

_Tools that generate patterns for repetitive code in order to reduce verbosity and error-proneness._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ADT4J](https://github.com/sviperll/adt4j) | JSR-269 code generator for algebraic data types. | 147 | 7y |
| [Auto](https://github.com/google/auto) | Generates factory, service, and value classes. | 10.5k | 11h |
| [Avaje Http Server](https://avaje.io/http/) | Generates Lightweight JAX-RS style http servers using Javalin or Helidon (Nima) SE. | - | - |
| [EasyEntityToDTO](https://github.com/Marcel091004/EasyEntityToDTO) | Annotation processor for automatic DTO and Mapper generation with zero boilerplate. | 6 | 7mo |
| [FreeBuilder](https://github.com/inferred/FreeBuilder) | Automatically generates the Builder pattern. | 833 | 1y |
| [Geci](https://github.com/verhas/javageci) | Discovers files that need generated code, updates automatically and writes to the source with a convenient API. | 135 | 3y |
| [Immutables](https://immutables.github.io) | Annotation processors to generate simple, safe and consistent value objects. | - | - |
| [JavaPoet](https://github.com/square/javapoet) | API to generate source files. | 10.9k | 1y |
| [JHipster](https://github.com/jhipster/generator-jhipster) | Yeoman source code generator for Spring Boot and AngularJS. | 22.3k | 3h |
| [Joda-Beans](https://www.joda.org/joda-beans/) | Small framework that adds queryable properties to Java, enhancing JavaBeans. | - | - |
| [JSpecify Package-Info Generator](https://github.com/bcaillard/jspecify-packageinfo-generator) | Maven plugin that automatically generates package-info.java files with JSpecify annotations (@NullMarked and @NullUnmarked), helping you manage nullness boundaries in your Java projects without manual boilerplate. | 1 | 1mo |
| [Lombok](https://projectlombok.org) | Code generator that aims to reduce verbosity. | - | - |
| [Record-Builder](https://github.com/Randgalt/record-builder) | Companion builder class, withers and templates for Java records. | 900 | 1mo |
| [Telosys](https://www.telosys.org/) | Simple and light code generator available as an Eclipse Plugin and also as a CLI. | - | - |

### Compiler-compiler

_Frameworks that help to create parsers, interpreters or compilers._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ANTLR](https://www.antlr.org) | Complex full-featured framework for top-down parsing. | - | - |
| [JavaCC](https://javacc.github.io/javacc/) | Parser generator that generates top-down parsers. Allows lexical state switching and permits extended BNF specifications. | - | - |
| [JFlex](https://jflex.de) | Lexical analyzer generator. | - | - |

### Computer Vision

_Libraries which seek to gain high level information from images and videos._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [BoofCV](https://boofcv.org) | Library for image processing, camera calibration, tracking, SFM, MVS, 3D vision, QR Code and much more. | - | - |
| [ImageJ](https://imagej.net/ImageJ) | Medical image processing application with an API. | - | - |
| [JavaCV](https://github.com/bytedeco/javacv) | Java interface to OpenCV, FFmpeg, and much more. | 8.3k | 10d |

### Configuration

_Libraries that provide external configuration._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [avaje config](https://avaje.io/config/) | Loads yaml and properties files, supports dynamic configuration, plugins, file-watching and config event listeners. | - | - |
| [centraldogma](https://github.com/line/centraldogma) | Highly-available version-controlled service configuration repository based on Git, ZooKeeper and HTTP/2. | 654 | 5h |
| [config](https://github.com/lightbend/config) | Configuration library supporting Java properties, JSON or its human optimized superset HOCON. | 6.3k | 3mo |
| [Configurate](https://github.com/SpongePowered/Configurate) | Configuration library with support for various configuration formats and transformations. | 449 | 3mo |
| [Curator Framework](https://curator.apache.org/) | High-level API for Apache ZooKeeper. | - | - |
| [dotenv](https://github.com/shyiko/dotenv) | Twelve-factor configuration library which uses environment-specific files. | 50 | 7y |
| [Externalized Properties](https://github.com/joel-jeremy/externalized-properties) | Lightweight yet powerful configuration library which supports resolution of properties from external sources and an extensible post-processing/conversion mechanism. | 32 | 3mo |
| [Gestalt](https://github.com/gestalt-config/gestalt) | Gestalt offers a comprehensive solution to the challenges of configuration management. It allows you to source configuration data from multiple inputs, merge them intelligently, and present them in a structured, type-safe manner. | 94 | 1mo |
| [ini4j](http://ini4j.sourceforge.net) | Provides an API for handling Windows' INI files. | - | - |
| [KAConf](https://github.com/mariomac/kaconf) | Annotation-based configuration system for Java and Kotlin. | 61 | 3y |
| [microconfig](https://microconfig.io) | Configuration system designed for microservices which helps to separate configuration from code. The configuration for different services can have common and specific parts and can be dynamically distributed. | - | - |
| [owner](https://github.com/lviggiano/owner) | Reduces boilerplate of properties. | - | - |

### Constraint Satisfaction Problem Solver

_Libraries that help with implementing optimization and satisfiability problems._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Choco](https://choco-solver.org) | Off-the-shelf constraint satisfaction problem solver that uses constraint programming techniques. | - | - |
| [JaCoP](https://github.com/radsz/jacop) | Includes an interface for the FlatZinc language, enabling it to execute MiniZinc models. (AGPL-3.0) | 231 | 2y |
| [OptaPlanner](https://www.optaplanner.org) | Business planning and resource scheduling optimization solver. | - | - |
| [Timefold](https://timefold.ai/docs) | Flexible solver with Spring/Quarkus support and quickstarts for the Vehicle Routing Problem, Maintenance Scheduling, Employee Shift Scheduling and much more. | - | - |

### CSV

_Frameworks and libraries that simplify reading/writing CSV data._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [FastCSV](https://github.com/osiegmar/FastCSV) | Performance-optimized, dependency-free and RFC 4180 compliant. | 656 | 19d |
| [jackson-dataformat-csv](https://github.com/FasterXML/jackson-dataformat-csv) | Jackson extension for reading and writing CSV. | 194 | 8y |
| [opencsv](http://opencsv.sourceforge.net) | Simple CSV parser. | - | - |
| [Super CSV](https://super-csv.github.io/super-csv/) | Powerful CSV parser with support for Dozer, Joda-Time and Java 8. | - | - |
| [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) | One of the fastest and most feature-complete parsers. Also comes with parsers for TSV and fixed-width records. | 931 | 4y |

### Data Structures

_Efficient and specific data structures._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Avro](https://avro.apache.org) | Data interchange format with dynamic typing, untagged data, and absence of manually assigned IDs. | - | - |
| [Apache Orc](https://orc.apache.org) | Fast and efficient columnar storage format for Hadoop-based workloads. | - | - |
| [Apache Parquet](https://parquet.apache.org) | Columnar storage format based on assembly algorithms from Google's paper on Dremel. | - | - |
| [Apache Thrift](https://thrift.apache.org) | Data interchange format that originated at Facebook. | - | - |
| [Big Queue](https://github.com/bulldog2011/bigqueue) | Fast and persistent queue based on memory-mapped files. | 567 | 9y |
| [HyperMinHash-java](https://github.com/LiveRamp/HyperMinHash-java) | Probabilistic data structure for computing union, intersection, and set cardinality in loglog space. | N/A | N/A |
| [Persistent Collection](https://github.com/hrldcpr/pcollections) | Persistent and immutable analogue of the Java Collections Framework. | 784 | 5mo |
| [Protobuf](https://github.com/protocolbuffers/protobuf) | Google's data interchange format. | 70.2k | 2h |
| [RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) | Fast and efficient compressed bitmap. | 3.8k | 23d |
| [SBE](https://github.com/real-logic/simple-binary-encoding) | Simple Binary Encoding, one of the fastest message formats around. | - | - |
| [Tape](https://github.com/square/tape) | Lightning-fast, transactional, file-based FIFO. | 2.5k | 7y |
| [Wire](https://github.com/square/wire) | Clean, lightweight protocol buffers. | 4.4k | 2d |

### Database

_Everything that simplifies interactions with the database._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Calcite](https://calcite.apache.org) | Dynamic data management framework. It contains many of the pieces that comprise a typical database management system. | - | - |
| [Apache Drill](https://drill.apache.org) | Distributed, schema on-the-fly, ANSI SQL query engine for Big Data exploration. | - | - |
| [Apache Phoenix](https://phoenix.apache.org) | High-performance relational database layer over HBase for low-latency applications. | - | - |
| [ArangoDB](https://github.com/arangodb/arangodb-java-driver) | ArangoDB Java driver. | 205 | 2d |
| [Chronicle Map](https://github.com/OpenHFT/Chronicle-Map) | Efficient, in-memory (opt. persisted to disk), off-heap key-value store. | 2.9k | 16d |
| [Debezium](https://debezium.io/) | Low latency data streaming platform for change data capture. | - | - |
| [druid](https://druid.apache.org) | High-performance, column-oriented, distributed data store. | - | - |
| [eXist](https://github.com/eXist-db/exist) | NoSQL document database and application platform. (LGPL-2.1-only) | 457 | 1d |
| [FlexyPool](https://github.com/vladmihalcea/flexy-pool) | Brings metrics and failover strategies to the most common connection pooling solutions. | 1.2k | 1mo |
| [Flyway](https://flywaydb.org) | Simple database migration tool. | - | - |
| [H2](https://h2database.com) | Small SQL database notable for its in-memory functionality. | - | - |
| [HikariCP](https://github.com/brettwooldridge/HikariCP) | High-performance JDBC connection pool. | 20.9k | 2mo |
| [HSQLDB](https://hsqldb.org/) | HyperSQL 100% Java database. | - | - |
| [JDBI](http://jdbi.org) | Convenient abstraction of JDBC. | - | - |
| [Jedis](https://github.com/xetorthio/jedis) | Small client for interaction with Redis, with methods for commands. | - | - |
| [Jest](https://github.com/searchbox-io/Jest) | Client for the Elasticsearch REST API. | 2.1k | 4y |
| [jetcd](https://github.com/justinsb/jetcd) | Client library for etcd. | 140 | 11y |
| [Jinq](https://github.com/my2iu/Jinq) | Typesafe database queries via symbolic execution of Java 8 Lambdas (on top of JPA or jOOQ). | 663 | 7mo |
| [jOOQ](https://www.jooq.org) | Generates typesafe code based on SQL schema. | - | - |
| [Leaf](https://github.com/Meituan-Dianping/Leaf) | Distributed ID generate service. | 6.7k | 5y |
| [Lettuce](https://lettuce.io/) | Lettuce is a scalable Redis client for building non-blocking Reactive applications. | - | - |
| [Liquibase](http://www.liquibase.org) | Database-independent library for tracking, managing and applying database schema changes. | - | - |
| [MapDB](http://www.mapdb.org) | Embedded database engine that provides concurrent collections backed on disk or in off-heap memory. | - | - |
| [MariaDB4j](https://github.com/vorburger/MariaDB4j) | Launcher for MariaDB that requires no installation or external dependencies. | 15 | 5d |
| [Modality](https://github.com/arkanovicz/modality) | Lightweight ORM with database reverse engineering features. | 15 | 1mo |
| [OpenDJ](https://github.com/OpenIdentityPlatform/OpenDJ) | LDAPv3 compliant directory service, developed for the Java platform, providing a high performance, highly available, and secure store for the identities. | 422 | 27d |
| [Querydsl](http://www.querydsl.com) | Typesafe unified queries. | - | - |
| [QueryStream](https://github.com/querystream/querystream) | Build JPA Criteria queries using a Stream-like API. | 20 | 8mo |
| [QuestDB](https://github.com/questdb/questdb) | High-performance SQL database for time series. Supports InfluxDB line protocol, PostgreSQL wire protocol, and REST. | 16.5k | 10h |
| [Realm](https://github.com/realm/realm-java) | Mobile database to run directly inside phones, tablets or wearables. | 11.5k | 3mo |
| [Redisson](https://github.com/redisson/redisson) | Allows for distributed and scalable data structures on top of a Redis server. | 24.2k | 2d |
| [requery](https://github.com/requery/requery) | Modern, lightweight but powerful object mapping and SQL generator. Easily map to or create databases, or perform queries and updates from any Java-using platform. | 3.1k | 5y |
| [Speedment](https://github.com/speedment/speedment) | Database access library that utilizes Java 8's Stream API for querying. | 2.1k | 2y |
| [Spring Data JPA MongoDB Expressions](https://github.com/mhewedy/spring-data-jpa-mongodb-expressions) | Allows you to use MongoDB query language to query your relational database. | 101 | 19d |
| [Trino](https://trino.io) | Distributed SQL query engine for big data. | - | - |
| [Vibur DBCP](https://www.vibur.org) | JDBC connection pool library with advanced performance monitoring capabilities. | - | - |
| [Xodus](https://github.com/JetBrains/xodus) | Highly concurrent transactional schema-less and ACID-compliant embedded database. | 1.3k | 3mo |
| [CosId](https://github.com/Ahoo-Wang/CosId) | Universal, flexible, high-performance distributed ID generator. | 599 | 1d |
| [Apache ShardingSphere](https://github.com/apache/shardingsphere) | Distributed SQL transaction & query engine that allows for data sharding, scaling, encryption, and more on any database. | 20.6k | 1h |

### Date and Time

_Libraries related to handling date and time._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [iCal4j](https://github.com/ical4j/ical4j) | Parse and build iCalendar [RFC 5545](https://tools.ietf.org/html/rfc5545) data models. | 821 | 9d |
| [Jollyday](https://github.com/svendiedrichsen/jollyday) | Determines the holidays for a given year, country/name and eventually state/region. | 192 | 3y |
| [ThreeTen-Extra](https://github.com/ThreeTen/threeten-extra) | Additional date-time classes that complement those in JDK 8. | 420 | 4mo |
| [Time4J](https://github.com/MenoData/Time4J) | Advanced date and time library. (LGPL-2.1-only) | 470 | 1y |

### Decentralization

_Libraries that handle decentralization tasks._

### Dependency Injection

_Libraries that help to realize the [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control) paradigm._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache DeltaSpike](https://deltaspike.apache.org) | CDI extension framework. | - | - |
| [Avaje Inject](https://avaje.io/inject/) | Microservice-focused compile-time injection framework without reflection. | - | - |
| [Dagger](https://dagger.dev/) | Compile-time injection framework without reflection. | - | - |
| [Feather](https://github.com/zsoltherpai/feather) | Ultra-lightweight, JSR-330-compliant dependency injection library. | 362 | 8y |
| [Governator](https://github.com/Netflix/governator) | Extensions and utilities that enhance Google Guice. | 826 | 22d |
| [Guice](https://github.com/google/guice) | Lightweight and opinionated framework that completes Dagger. | 12.7k | 1mo |
| [HK2](https://eclipse-ee4j.github.io/glassfish-hk2/) | Lightweight and dynamic dependency injection framework. | - | - |
| [JayWire](https://github.com/vanillasource/jaywire) | Lightweight dependency injection framework. (LGPL-3.0-only) | 60 | 5y |

### Development

_Augmentation of the development process at a fundamental level._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [AspectJ](https://www.eclipse.org/aspectj/) | Seamless aspect-oriented programming extension. | - | - |
| [DCEVM](https://dcevm.github.io) | JVM modification that allows unlimited redefinition of loaded classes at runtime. (GPL-2.0-only) | - | - |
| [Faux Pas](https://github.com/zalando/faux-pas) | Library that simplifies error handling by circumventing the issue that none of the functional interfaces in the Java Runtime is allowed by default to throw checked exceptions. | 140 | 6mo |
| [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) | Unlimited runtime class and resource redefinition. (GPL-2.0-only) | 2.5k | 19d |
| [JavaParser](https://github.com/javaparser/javaparser) | Parse, modify and generate Java code. | 6.0k | 6h |
| [JavaSymbolSolver](https://github.com/javaparser/javasymbolsolver) | Symbol solver. | 296 | 7y |
| [Manifold](https://github.com/manifold-systems/manifold) | Re-energizes Java with powerful features like type-safe metaprogramming, structural typing and extension methods. | 2.7k | 7d |
| [NoException](https://noexception.machinezoo.com) | Allows checked exceptions in functional interfaces and converts exceptions to Optional return. | - | - |
| [SneakyThrow](https://github.com/rainerhahnekamp/sneakythrow) | Ignores checked exceptions without bytecode manipulation. Can also be used inside Java 8 stream operations. | 79 | 6y |
| [Tail](https://nrktkt.github.io/tail/) | Enable infinite recursion using tail call optimization. | - | - |

### Distributed Applications

_Libraries and frameworks for writing distributed and fault-tolerant applications._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Geode](https://geode.apache.org) | In-memory data management system that provides reliable asynchronous event notifications and guaranteed message delivery. | - | - |
| [Apache Storm](https://storm.apache.org) | Realtime computation system. | - | - |
| [Apache ZooKeeper](https://zookeeper.apache.org) | Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems. | - | - |
| [Atomix](https://atomix.io) | Fault-tolerant distributed coordination framework. | - | - |
| [Axon](https://axoniq.io) | Framework for creating CQRS applications. | - | - |
| [Dropwizard Circuit Breaker](https://github.com/mtakaki/dropwizard-circuitbreaker) | Circuit breaker design pattern for Dropwizard. (GPL-2.0-only) | 45 | 6y |
| [Failsafe](https://github.com/jhalterman/failsafe) | Simple failure handling with retries and circuit breakers. | - | - |
| [Hazelcast](https://github.com/hazelcast/hazelcast) | Highly scalable in-memory datagrid with a free open-source version. | 6.5k | 2h |
| [JGroups](http://www.jgroups.org) | Toolkit for reliable messaging and cluster creation. | - | - |
| [Quasar](http://docs.paralleluniverse.co/quasar/) | Lightweight threads and actors for the JVM. | - | - |
| [resilience4j](https://github.com/resilience4j/resilience4j) | Functional fault tolerance library. | 10.5k | 6d |
| [OpenIG](https://github.com/OpenIdentityPlatform/OpenIG) | High-performance reverse proxy server with specialized session management and credential replay functionality. | 86 | 22d |
| [ScaleCube Services](https://github.com/scalecube/scalecube-services) | Embeddable Cluster-Membership library based on SWIM and gossip protocol. | 636 | 10h |
| [Zuul](https://github.com/Netflix/zuul) | Gateway service that provides dynamic routing, monitoring, resiliency, security, and more. | 14.0k | 2d |

### Distributed Transactions

_Distributed transactions provide a mechanism for ensuring consistency of data updates in the presence of concurrent access and partial failures._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Atomikos](https://www.atomikos.com) | Provides transactions for REST, SOA and microservices with support for JTA and XA. | - | - |
| [Bitronix](https://github.com/bitronix/btm) | Simple but complete implementation of the JTA 1.1 API. | - | - |
| [Narayana](https://narayana.io) | Provides support for traditional ACID and compensation transactions, also complies with JTA, JTS and other standards. (LGPL-2.1-only) | - | - |
| [Seata](https://github.com/seata/seata) | Delivers high performance and easy to use distributed transaction services under a microservices architecture. | - | - |

### Distribution

_Tools that handle the distribution of applications in native formats._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Artipie](https://github.com/artipie/artipie) | Binary artifact management toolkit which hosts them on the file system or S3. | 649 | 10mo |
| [Capsule](https://github.com/puniverse/capsule) | Simple and powerful packaging and deployment. A fat JAR on steroids, or a "Docker for Java" that supports JVM-optimized containers. | 1.2k | 9y |
| [Central Repository](https://search.maven.org) | Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven, and available in all other build tools. | - | - |
| [Getdown](https://github.com/threerings/getdown) | System for deploying Java applications to end-user computers and keeping them up to date. Developed as an alternative to Java Web Start. | 526 | 1y |
| [IzPack](http://izpack.org) | Setup authoring tool for cross-platform deployments. | - | - |
| [JavaPackager](https://github.com/fvarrui/JavaPackager) | Maven and Gradle plugin which provides an easy way to package Java applications in native Windows, macOS or GNU/Linux executables, and generate installers for them. | - | - |
| [jDeploy](https://www.jdeploy.com) | Deploy desktop apps as native Mac, Windows or Linux bundles. | - | - |
| [jlink.online](https://github.com/AdoptOpenJDK/jlink.online) | Builds optimized runtimes over HTTP. | 50 | 1y |
| [packr](https://github.com/libgdx/packr) | Packs JARs, assets and the JVM for native distribution on Windows, Linux and macOS. | 2.6k | 1y |
| [really-executable-jars-maven-plugin](https://github.com/brianm/really-executable-jars-maven-plugin) | Maven plugin for making self-executing JARs. | 133 | 2y |

### Document Processing

_Libraries that assist with processing office document formats._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache POI](https://poi.apache.org) | Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT). | - | - |
| [documents4j](https://documents4j.com/#/) | API for document format conversion using third-party converters such as MS Word. | - | - |
| [docx4j](https://www.docx4java.org/trac/docx4j) | Create and manipulate Microsoft Open XML files. | - | - |
| [fastexcel](https://github.com/dhatim/fastexcel) | High performance library to read and write large Excel (XLSX) worksheets. | 855 | 22d |
| [zerocell](https://github.com/creditdatamw/zerocell) | Annotation-based API for reading data from Excel sheets into POJOs with focus on reduced overhead. | 81 | 1y |

### Financial

_Libraries related to the financial domain._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Cassandre](https://github.com/cassandre-tech/cassandre-trading-bot) | Trading bot framework. | 650 | 1y |
| [Parity](https://github.com/paritytrading/parity) | Platform for trading venues. | 501 | 3y |
| [Philadelphia](https://github.com/paritytrading/philadelphia) | Low-latency financial information exchange. | 339 | 12d |
| [Square](https://github.com/square/connect-java-sdk) | Integration with the Square API. | 40 | 6y |
| [Stripe](https://github.com/stripe/stripe-java) | Integration with the Stripe API. | 942 | 1d |
| [ta4j](https://github.com/ta4j/ta4j) | Library for technical analysis. | 2.3k | 1d |

### Formal Verification

_Formal-methods tools: proof assistants, model checking, symbolic execution, etc._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [CATG](https://github.com/ksen007/janala2) | Concolic unit testing engine. Automatically generates unit tests using formal methods. | N/A | N/A |
| [Checker Framework](https://checkerframework.org) | Pluggable type systems. Includes nullness types, physical units, immutability types and more. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Daikon](https://plse.cs.washington.edu/daikon/) | Detects likely program invariants and generates JML specs based on those invariants. | - | - |
| [Java Path Finder (JPF)](https://github.com/javapathfinder/jpf-core) | JVM formal verification tool containing a model checker and more. Created by NASA. | 593 | 22d |
| [JMLOK 2.0](https://massoni.computacao.ufcg.edu.br/home/jmlok) | Detects inconsistencies between code and JML specification through feedback-directed random tests generation, and suggests a likely cause for each nonconformance detected. (GPL-3.0-only) | - | - |
| [KeY](https://www.key-project.org) | Formal software development tool that aims to integrate design, implementation, formal specification, and formal verification of object-oriented software as seamlessly as possible. Uses JML for specification and symbolic execution for verification. (GPL-2.0-or-later) | - | - |
| [OpenJML](http://www.openjml.org) | Translates JML specifications into SMT-LIB format and passes the proof problems implied by the program to backend solvers. (GPL-2.0-only) | - | - |

### Functional Programming

_Libraries that facilitate functional programming._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Cyclops](https://github.com/aol/cyclops) | Monad and stream utilities, comprehensions, pattern matching, functional extensions for all JDK collections, future streams, trampolines and much more. | 1.3k | 3y |
| [derive4j](https://github.com/derive4j/derive4j) | Java 8 annotation processor and framework for deriving algebraic data types constructors, pattern-matching and morphisms. (GPL-3.0-only) | 577 | 4y |
| [Fugue](https://bitbucket.org/atlassian/fugue) | Functional extensions to Guava. | - | - |
| [Functional Java](http://www.functionaljava.org) | Implements numerous basic and advanced programming abstractions that assist composition-oriented development. | - | - |
| [jOOλ](https://github.com/jOOQ/jOOL) | Extension to Java 8 that aims to fix gaps in lambda by providing numerous missing types and a rich set of sequential Stream API additions. | 2.1k | 1y |
| [Packrat](https://github.com/jhspetersson/packrat) | Gatherers library for Java Stream API. Gatherers can enhance streams with custom intermediate operations. | 24 | 3d |
| [protonpack](https://github.com/poetix/protonpack) | Collection of stream utilities. | 485 | 1y |
| [StreamEx](https://github.com/amaembo/streamex) | Enhances Java 8 Streams. | 2.3k | 4mo |
| [Vavr](https://www.vavr.io) | Functional component library that provides persistent data types and functional control structures. | - | - |

### Game Development

_Frameworks that support the development of games._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [FXGL](https://almasb.github.io/FXGL/) | JavaFX Game Development Framework. | - | - |
| [JBox2D](http://www.jbox2d.org/) | Port of the renowned C++ 2D physics engine. | - | - |
| [jMonkeyEngine](https://jmonkeyengine.org) | Game engine for modern 3D development. | - | - |
| [libGDX](https://libgdx.com) | All-round cross-platform, high-level framework. | - | - |
| [Litiengine](https://litiengine.com/) | AWT-based, lightweight 2D game engine. | - | - |
| [LWJGL](https://www.lwjgl.org) | Robust framework that abstracts libraries like OpenGL/CL/AL. | - | - |
| [Mini2Dx](https://mini2dx.org) | Beginner-friendly, master-ready framework for rapidly prototyping and building 2D games. | - | - |
| [Void2D](https://github.com/xzripper/Void2D) | High-level 2D game engine with built-in physics based on Swing. | N/A | N/A |
| [vulkan4j](https://github.com/chuigda/vulkan4j) | Vulkan, OpenGL ES2 and GLFW Memory Allocator bindings. | - | - |

### Geospatial

_Libraries for working with geospatial data and algorithms._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache SIS](https://sis.apache.org) | Library for developing geospatial applications. | - | - |
| [Geo](https://github.com/davidmoten/geo) | GeoHash utilities in Java. | 431 | 16d |
| [GeoTools](https://geotools.org) | Library that provides tools for geospatial data. (LGPL-2.1-only) | - | - |
| [GraphHopper](https://github.com/graphhopper/graphhopper) | Road-routing engine. Used as a Java library or standalone web service. | 6.2k | 2d |
| [H2GIS](http://www.h2gis.org) | Spatial extension of the H2 database. (LGPL-3.0-only) | - | - |
| [Jgeohash](https://astrapi69.github.io/jgeohash/) | Library for using the GeoHash algorithm. | - | - |
| [Mapsforge](https://github.com/mapsforge/mapsforge) | Map rendering based on OpenStreetMap data. (LGPL-3.0-only) | 1.3k | 1d |
| [Spatial4j](https://github.com/locationtech/spatial4j) | General-purpose spatial/geospatial library. | 955 | 7mo |

### GUI

_Libraries to create modern graphical user interfaces._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [JavaFX](https://wiki.openjdk.java.net/display/OpenJFX/Main) | Successor of Swing. | - | - |
| [Scene Builder](https://gluonhq.com/products/scene-builder/) | Visual layout tool for JavaFX applications. | - | - |
| [SnapKit](https://github.com/reportmill/SnapKit) | Modern Java UI library for both desktop and web. | 310 | 16h |
| [SWT](https://www.eclipse.org/swt/) | Graphical widget toolkit. | - | - |

### High Performance

_Everything about high-performance computation, from collections to specific libraries._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Agrona](https://github.com/real-logic/Agrona) | Data structures and utility methods that are common in high-performance applications. | - | - |
| [Disruptor](https://lmax-exchange.github.io/disruptor/) | Inter-thread messaging library. | - | - |
| [Eclipse Collections](https://github.com/eclipse/eclipse-collections) | Collections framework inspired by Smalltalk. | - | - |
| [fastutil](http://fastutil.di.unimi.it) | Fast and compact type-specific collections. | - | - |
| [HPPC](https://labs.carrotsearch.com/hppc.html) | Primitive collections. | - | - |
| [JCTools](https://github.com/JCTools/JCTools) | Concurrency tools currently missing from the JDK. | 3.8k | 1y |
| [Koloboke](https://github.com/leventov/Koloboke) | Carefully designed extension of the Java Collections Framework with primitive specializations and more. | 1.0k | 9y |

### HTTP Clients

_Libraries that assist with creating HTTP requests and/or binding responses._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache HttpComponents](https://hc.apache.org/) | Toolset of low-level Java components focused on HTTP and associated protocols. | - | - |
| [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) | Asynchronous HTTP and WebSocket client library. | 6.4k | 7d |
| [Avaje Http Client](https://avaje.io/http-client) | Wrapper on JDK 11's HttpClient that adds Feign-like interface among other enhancements. | - | - |
| [Feign](https://github.com/OpenFeign/feign) | HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket. | 9.8k | 1h |
| [Google HTTP Client](https://github.com/googleapis/google-http-java-client) | Pluggable HTTP transport abstraction with support for java.net.HttpURLConnection, Apache HTTP Client, Android, Google App Engine, XML, Gson, Jackson and Protobuf. | 1.4k | 19d |
| [methanol](https://github.com/mizosoft/methanol) | HTTP client extensions library. | 286 | 17d |
| [Retrofit](https://square.github.io/retrofit/) | Typesafe REST client. | - | - |
| [Ribbon](https://github.com/Netflix/ribbon) | Client-side IPC library that is battle-tested in the cloud. | 4.6k | 22d |
| [Riptide](https://github.com/zalando/riptide) | Client-side response routing for Spring's RestTemplate. | 327 | 4mo |
| [unirest-java](https://github.com/Kong/unirest-java) | Simplified, lightweight HTTP client library. | 2.7k | 1mo |

### Hypermedia Types

_Libraries that handle serialization to hypermedia types._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [hate](https://github.com/blackdoor/hate) | Builds hypermedia-friendly objects according to HAL specification. | 25 | 2y |
| [JSON-LD](https://github.com/jsonld-java/jsonld-java) | JSON-LD implementation. | 386 | 2y |
| [Siren4J](https://github.com/eserating-chwy/siren4j) | Library for the Siren specification. | 28 | 8y |
| [Spring HATEOAS](https://github.com/spring-projects/spring-hateoas) | Standalone and Spring support for building hypermedia-based APIs using HAL, HAL FORMS, Collection+JSON, ALPS and UBER. | 1.1k | 27d |

### IDE

_Integrated development environments that try to simplify several aspects of development._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Eclipse](https://www.eclipse.org) | Established open-source project with support for lots of plugins and languages. | - | - |
| [jGRASP](https://www.jgrasp.org) | Created to provide software visualizations that work in conjunction with the debugger such as Control Structure Diagrams, UML class diagrams and Object Viewer. | - | - |
| [NetBeans](https://netbeans.apache.org) | Provides integration for several Java SE and EE features, from database access to HTML5. | - | - |
| [SnapCode](https://reportmill.com/SnapCode/) | Modern IDE for Java running in the browser, focused on education. | - | - |
| [Visual Studio Code](https://code.visualstudio.com/docs/languages/java) | Provides Java support for lightweight projects with a simple, modern workflow by using extensions from the internal marketplace. | - | - |

### Imagery

_Libraries that assist with the creation, evaluation or manipulation of graphical images._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Barcode-Lib4J](https://github.com/vws-java/Barcode-Lib4J) | Generates QR Code, DataMatrix, and other 1D/2D barcodes as vector (PDF, EPS, SVG) and raster (PNG, BMP, JPG) images with DPI awareness, high precision, and CMYK color model support. | 9 | 15d |
| [Imgscalr](https://github.com/rkalla/imgscalr) | Simple, efficient and hardware-accelerated image-scaling library implemented in pure Java 2D. | 1.2k | 2y |
| [Tess4J](https://github.com/nguyenq/tess4j) | JNA wrapper for Tesseract OCR API. | 1.7k | 11d |
| [Thumbnailator](https://github.com/coobird/thumbnailator) | High-quality thumbnail generation library. | 5.4k | 5d |
| [TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) | Collection of plugins that extend the number of supported image file formats. | 2.1k | 21h |
| [ZXing](https://github.com/zxing/zxing) | Multi-format 1D/2D barcode image processing library. | 33.8k | 1mo |
| [image-comparison](https://github.com/romankh3/image-comparison) | Library that compares 2 images with the same sizes and shows the differences visually by drawing rectangles. Some parts of the image can be excluded from the comparison. | 385 | 7mo |
| [vips-ffm](https://github.com/lopcode/vips-ffm) | Comprehensive bindings for libvips, using Java's "Foreign Function & Memory" API. | 98 | 8d |
| [scrimage](https://sksamuel.github.io/scrimage) | Immutable, functional, and performant JVM library for manipulation of images. | - | - |

### Introspection

_Libraries that help make the Java introspection and reflection API easier and faster to use._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ClassGraph](https://github.com/classgraph/classgraph) | ClassGraph (formerly FastClasspathScanner) is an uber-fast, ultra-lightweight, parallelized classpath scanner and module scanner for Java, Scala, Kotlin and other JVM languages. | 3.0k | 2mo |
| [jOOR](https://github.com/jOOQ/jOOR) | jOOR stands for jOOR Object Oriented Reflection. It is a simple wrapper for the java.lang.reflect package. | 2.8k | 1y |
| [Mirror](http://projetos.vidageek.net/mirror/mirror/) | Mirror was created to bring light to a simple problem, usually named ReflectionUtil, which is on almost all projects that rely on reflection to do advanced tasks. | - | - |
| [Objenesis](http://objenesis.org) | Allows dynamic instantiation without default constructor, e.g. constructors which have required arguments, side effects or throw exceptions. | - | - |
| [ReflectASM](https://github.com/EsotericSoftware/reflectasm) | ReflectASM is a very small Java library that provides high performance reflection by using code generation. | 1.5k | 7mo |
| [Reflections](https://github.com/ronmamo/reflections) | Reflections scans your classpath, indexes the metadata, allows you to query it on runtime and may save and collect that information for many modules within your project. | 4.8k | 2y |

### Job Scheduling

_Libraries for scheduling background jobs._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [JobRunr](https://github.com/jobrunr/jobrunr) | Job scheduling library which utilizes lambdas for fire-and-forget, delayed and recurring jobs. Guarantees execution by single scheduler instance using optimistic locking. Has features for persistence, minimal dependencies and is embeddable. | 2.8k | 2d |
| [Quartz](https://github.com/quartz-scheduler/quartz) | Feature-rich, open source job scheduling library that can be integrated within virtually any Java application. | 6.7k | 1mo |
| [Sundial](https://github.com/knowm/Sundial) | Lightweight framework to simply define jobs, define triggers and start the scheduler. | 276 | 1y |
| [Wisp](https://github.com/Coreoz/Wisp) | Simple library with minimal footprint and straightforward API. | 141 | 7mo |
| [db-scheduler](https://github.com/kagkarlsson/db-scheduler) | Persistent and cluster-friendly scheduler. | 1.5k | 1d |
| [easy-batch](https://github.com/j-easy/easy-batch) | Set up batch jobs with simple processing pipelines. Records are read in sequence from a data source, processed in pipeline and written in batches to a data sink. | 629 | 4y |
| [shedlock](https://github.com/lukas-krecan/ShedLock) | Makes sure that your scheduled tasks are executed at most once at the same time. If a task is being executed on one node, it acquires a lock which prevents execution of the same task from another node or thread. | 4.1k | 9h |

### JSON

_Libraries for serializing and deserializing JSON to and from Java objects._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Avaje Jsonb](https://avaje.io/jsonb/) | Reflection-free Json binding via source code generation with Jackson-like annotations. | - | - |
| [DSL-JSON](https://github.com/ngs-doo/dsl-json) | JSON library with advanced compile time databinding. | 1.1k | 1y |
| [Genson](http://genson.io) | Powerful and easy-to-use Java-to-JSON conversion library. | - | - |
| [Gson](https://github.com/google/gson) | Serializes objects to JSON and vice versa. Good performance with on-the-fly usage. | 24.3k | 6d |
| [HikariJSON](https://github.com/brettwooldridge/HikariJSON) | High-performance JSON parser, 2x faster than Jackson. | 465 | 8y |
| [jackson-modules-java8](https://github.com/FasterXML/jackson-modules-java8) | Set of Jackson modules for Java 8 datatypes and features. | 417 | 8d |
| [Jackson-datatype-money](https://github.com/zalando/jackson-datatype-money) | Open-source Jackson module to support JSON serialization and deserialization of JavaMoney data types. | 264 | 6mo |
| [Jackson](https://github.com/FasterXML/jackson) | Similar to GSON, but offers performance gains if you need to instantiate the library more often. | 9.6k | 5d |
| [JSON-io](https://github.com/jdereg/json-io) | Convert Java to JSON. Convert JSON to Java. Pretty print JSON. Java JSON serializer. | 343 | 2d |
| [jsoniter](http://jsoniter.com) | Fast and flexible library with iterator and lazy parsing API. | - | - |
| [LoganSquare](https://github.com/bluelinelabs/LoganSquare) | JSON parsing and serializing library based on Jackson's streaming API. Outperforms GSON & Jackson's library. | 3.2k | 9y |
| [Moshi](https://github.com/square/moshi) | Modern JSON library, less opinionated and uses built-in types like List and Map. | 10.1k | 3d |
| [Yasson](https://github.com/eclipse-ee4j/yasson) | Binding layer between classes and JSON documents similar to JAXB. | 215 | 5mo |
| [fastjson](https://github.com/alibaba/fastjson) | Very fast processor with no additional dependencies and full data binding. | 25.7k | 2y |
| [Jolt](https://github.com/bazaarvoice/jolt) | JSON to JSON transformation tool. | 1.7k | 2y |
| [JsonPath](https://github.com/json-path/JsonPath) | Extract data from JSON using XPATH-like syntax. | 9.4k | 2mo |
| [JsonSurfer](https://github.com/jsurfer/JsonSurfer) | Streaming JsonPath processor dedicated to processing big and complicated JSON data. | - | - |

### JVM and JDK

_Current implementations of the JVM/JDK._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Which JDK](https://whichjdk.com/) | Overview of common JVMs with pros and cons. | - | - |
| [Adopt Open JDK](https://adoptopenjdk.net) | Community-driven OpenJDK builds, including both HotSpot and OpenJ9. | - | - |
| [Corretto](https://aws.amazon.com/corretto/) | No-cost, multiplatform, production-ready distribution of OpenJDK by Amazon. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Dragonwell8](https://github.com/alibaba/dragonwell8) | Downstream version of OpenJDK optimized for online e-commerce, financial, logistics applications. | - | - |
| [Graal](https://github.com/oracle/graal) | Polyglot embeddable JVM. (GPL-2.0-only WITH Classpath-exception-2.0) | 21.4k | 14h |
| [Liberica JDK](https://bell-sw.com) | Built from OpenJDK, thoroughly tested and passed the JCK. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [OpenJ9](https://github.com/eclipse/openj9) | High performance, enterprise-calibre, flexibly licensed, openly-governed cross-platform JVM extending and augmenting the runtime technology components from the Eclipse OMR and OpenJDK project. | - | - |
| [Open JDK](https://openjdk.java.net) | Open JDK community home. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [ParparVM](https://github.com/codenameone/CodenameOne/tree/master/vm) | VM with non-blocking, concurrent GC for iOS. (GPL-2.0-only WITH Classpath-exception-2.0) | N/A | N/A |
| [RedHat Open JDK](https://developers.redhat.com/products/openjdk/overview) | RedHat's OpenJDK distribution. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [SAP Machine](https://sap.github.io/SapMachine/) | SAP's no-cost, rigorously tested and JCK-verified OpenJDK friendly fork. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Zulu](https://www.azul.com/products/zulu-community/) | OpenJDK builds for Windows, Linux, and macOS. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Microsoft JDK](https://github.com/microsoft/openjdk) | Microsoft Build of OpenJDK, Free, Open Source, Freshly Brewed! | 339 | 2mo |

### Logging

_Libraries that log the behavior of an application._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Log4j 2](https://logging.apache.org/log4j/) | Complete rewrite with a powerful plugin and configuration architecture. | - | - |
| [Echopraxia](https://github.com/tersesystems/echopraxia) | API designed around structured logging, rich context, and conditional logging. There are Logback and Log4J2 implementations, but Echopraxia's API is completely dependency-free, meaning it can be implemented with any logging API. | 58 | 1y |
| [Graylog](https://www.graylog.org) | Open-source aggregator suited for extended role and permission management. (GPL-3.0-only) | - | - |
| [Kibana](https://www.elastic.co/kibana) | Analyzes and visualizes log files. Some features require payment. | - | - |
| [Logback](http://logback.qos.ch) | Robust logging library with interesting configuration options via Groovy. | - | - |
| [Logbook](https://github.com/zalando/logbook) | Extensible, open-source library for HTTP request and response logging. | 2.0k | 8d |
| [Logstash](https://www.elastic.co/logstash) | Tool for managing log files. | - | - |
| [p6spy](https://github.com/p6spy/p6spy) | Enables logging for all JDBC transactions without changes to the code. | 2.2k | 3y |
| [SLF4J](http://www.slf4j.org) | Abstraction layer/simple logging facade. | - | - |
| [tinylog](https://tinylog.org/v2/) | Lightweight logging framework with static logger class. | - | - |
| [OpenTracing Toolbox](https://github.com/zalando/opentracing-toolbox) | Collection of libraries that build on top of OpenTracing and provide extensions and plugins to existing instrumentations. | 180 | 6mo |
| [Flogger](https://google.github.io/flogger/) | Flogger is a fluent logging API for Java. It supports a wide variety of features, and has many benefits over existing logging APIs. | - | - |

### Machine Learning

_Tools that provide specific statistical algorithms for learning from data._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Flink](https://flink.apache.org) | Fast, reliable, large-scale data processing engine. | - | - |
| [Apache Mahout](https://mahout.apache.org) | Scalable algorithms focused on collaborative filtering, clustering and classification. | - | - |
| [DatumBox](http://www.datumbox.com) | Provides several algorithms and pre-trained models for natural language processing. | - | - |
| [Deeplearning4j](https://deeplearning4j.org) | Distributed and multi-threaded deep learning library. | - | - |
| [DJL](https://djl.ai) | High-level and engine-agnostic framework for deep learning. | - | - |
| [Intelligent java](https://github.com/Barqawiz/IntelliJava) | Seamlessly integrate with remote deep learning and language models programmatically. | - | - |
| [JSAT](https://github.com/EdwardRaff/JSAT) | Algorithms for pre-processing, classification, regression, and clustering with support for multi-threaded execution. (GPL-3.0-only) | 800 | 3y |
| [m2cgen](https://github.com/BayesWitnesses/m2cgen) | CLI tool to transpile models into native code. | 2.9k | 3y |
| [Neureka](https://github.com/Gleethos/neureka) | A lightweight, platform independent, OpenCL accelerated nd-array/tensor library. | 86 | 1y |
| [oj! Algorithms](https://www.ojalgo.org/) | High-performance mathematics, linear algebra and optimisation needed for data science, machine learning and scientific computing. | - | - |
| [Oryx 2](https://github.com/OryxProject/oryx) | Framework for building real-time, large-scale machine learning applications. Includes end-to-end applications for collaborative filtering, classification, regression, and clustering. | 1.8k | 4y |
| [Siddhi](https://github.com/siddhi-io/siddhi) | Cloud native streaming and complex event processing engine. | 1.6k | 5mo |
| [Smile](https://github.com/haifengl/smile) | Statistical Machine Intelligence and Learning Engine provides a set of machine learning algorithms and a visualization library. | 6.3k | 8h |
| [Tribuo](https://tribuo.org/) | Provides tools for classification, regression, clustering, model development and interfaces with other libraries such as scikit-learn, pytorch and TensorFlow. | - | - |
| [Weka](https://www.cs.waikato.ac.nz/ml/weka/) | Collection of algorithms for data mining tasks ranging from pre-processing to visualization. (GPL-3.0-only) | - | - |

### Messaging

_Tools that help send messages between clients to ensure protocol independency._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Aeron](https://github.com/real-logic/Aeron) | Efficient, reliable, unicast and multicast message transport. | - | - |
| [Apache ActiveMQ](https://activemq.apache.org) | Message broker that implements JMS and converts synchronous to asynchronous communication. | - | - |
| [Apache Camel](https://camel.apache.org) | Glues together different transport APIs via Enterprise Integration Patterns. | - | - |
| [Apache Kafka](https://kafka.apache.org) | High-throughput distributed messaging system. | - | - |
| [Apache Pulsar](https://pulsar.apache.org) | Distributed pub/sub-messaging system. | - | - |
| [Apache RocketMQ](https://rocketmq.apache.org) | Fast, reliable, and scalable distributed messaging platform. | - | - |
| [Apache Qpid](https://qpid.apache.org) | Apache Qpid makes messaging tools that speak AMQP and support many languages and platforms. | - | - |
| [AutoMQ](https://github.com/AutoMQ/automq-for-kafka) | AutoMQ is a cloud-native, serverless reinvented Kafka that is easily scalable, manage-less and cost-effective. | - | - |
| [Deezpatch](https://github.com/joel-jeremy/deezpatch) | Simple, lightweight, and performant dispatch library for decoupling messages (requests and events) and message handlers. | 64 | 3mo |
| [EventBus](https://github.com/greenrobot/EventBus) | Simple publish/subscribe event bus. | 24.8k | 3y |
| [Hermes](http://hermes.allegro.tech) | Fast and reliable message broker built on top of Kafka. | - | - |
| [JeroMQ](https://github.com/zeromq/jeromq) | Implementation of ZeroMQ. | 2.4k | 10mo |
| [Nakadi](https://github.com/zalando/nakadi) | Provides a RESTful API on top of Kafka. | 968 | 1y |
| [RabbitMQ Java client](https://github.com/rabbitmq/rabbitmq-java-client) | RabbitMQ client. | 1.3k | 48m |
| [Smack](https://github.com/igniterealtime/Smack) | Cross-platform XMPP client library. | 2.4k | 1mo |
| [NATS client](https://github.com/nats-io/nats.java) | NATS client. | 640 | 16h |

### Microservice

_Tools for creating and managing microservices._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ActiveRPC](https://rpc.activej.io) | Lightweight and fast library for complex high-load distributed applications and Memcached-like solutions. | - | - |
| [Armeria](https://github.com/line/armeria) | Asynchronous RPC/REST client/server library built on top of Java 8, Netty, HTTP/2, Thrift and gRPC. | 5.1k | 23h |
| [consul-api](https://github.com/Ecwid/consul-api) | Client for the Consul API: a distributed, highly available and datacenter-aware registry/discovery service. | 423 | 3y |
| [Eureka](https://github.com/Netflix/eureka) | REST-based service registry for resilient load balancing and failover. | 12.7k | 21d |
| [Helidon](https://helidon.io) | Two-style approach for writing microservices: Functional-reactive and as an implementation of MicroProfile. | - | - |
| [JDA](https://github.com/DV8FromTheWorld/JDA) | Wrapping of the Discord REST API and its WebSocket events. | - | - |
| [KeenType](https://github.com/DaveJarvis/KeenType) | Modernized version of a Java-based implementation of the New Typesetting System, which was heavily based on Donald E. Knuth's original TeX. | N/A | N/A |
| [kubernetes-client](https://github.com/fabric8io/kubernetes-client) | Client provides access to the full Kubernetes & OpenShift REST APIs via a fluent DSL. | 3.6k | 15d |
| [Micronaut](https://micronaut.io) | Modern full-stack framework with focus on modularity, minimal memory footprint and startup time. | - | - |
| [Nacos](https://nacos.io) | Dynamic service discovery, configuration and service management platform for building cloud native applications. | - | - |
| [OpenAI-Java](https://github.com/TheoKanning/openai-java) | Java libraries for using OpenAI's GPT-3 API. | 4.8k | 1y |
| [Quarkus](https://quarkus.io) | Kubernetes stack tailored for the HotSpot and Graal VM. | - | - |
| [Sentinel](https://github.com/alibaba/Sentinel) | Flow control component enabling reliability, resilience and monitoring for microservices. | 23.0k | 16d |

### Miscellaneous

_Everything else._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [CQEngine](https://github.com/npgall/cqengine) | Ultra-fast, SQL-like queries on Java collections. | 1.8k | 3y |
| [Design Patterns](https://github.com/iluwatar/java-design-patterns) | Implementation and explanation of the most common design patterns. | 93.6k | 7mo |
| [FF4J](https://github.com/ff4j/ff4j) | Feature Flags for Java. | 1.4k | 18d |
| [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition) | No-nonsense implementation of FizzBuzz made by serious businessmen for serious business purposes. (No explicit license) | 23.1k | 6y |
| [IP2Location.io Java SDK](https://github.com/ip2location/ip2location-io-java) | Wrapper for the IP2Location.io Geolocation API and the IP2WHOIS domain WHOIS API. | 7 | 8d |
| [ISBN core](https://github.com/ladutsko/isbn-core) | A small library that contains a representation object of ISBN-10 and ISBN-13 and tools to parse, validate and format one. | 3 | 11d |
| [J2ObjC](https://github.com/google/j2objc) | Java-to-Objective-C translator for porting Android libraries to iOS. | 6.0k | 14h |
| [JBake](https://jbake.org) | Static website generator. | - | - |
| [JBot](https://github.com/rampatra/jbot) | Framework for building chatbots. (GPL-3.0-only) | 1.2k | 3mo |
| [JCuda](http://jcuda.org) | JCuda offers Java bindings for CUDA and CUDA-related libraries. | - | - |
| [JEmoji](https://github.com/felldo/JEmoji) | An auto-generated emoji library that provides type-safe direct access to emojis and alias support for Discord, Slack, GitHub and many more features. | 102 | 22d |
| [Jimfs](https://github.com/google/jimfs) | In-memory file system. | 2.5k | 6d |
| [Joda-Money](https://www.joda.org/joda-money/) | Basic currency and money classes and algorithms not provided by the JDK. | - | - |
| [jOOX](https://github.com/jooq/joox) | Simple wrapper for the org.w3c.dom package, to allow for fluent XML document creation and manipulation with an API inspired by jQuery. | 505 | 1y |
| [JPad](http://jpad.io) | Snippet runner. | - | - |
| [jsweet](https://github.com/cincheo/jsweet) | Source transpiler to TypeScript/JavaScript. | 1.5k | 2y |
| [Maven Wrapper](https://github.com/takari/maven-wrapper) | Analogue of Gradle Wrapper for Maven, allows building projects without installing maven. | 1.6k | 4y |
| [Membrane Service Proxy](https://github.com/membrane/service-proxy) | Open-source, reverse-proxy framework. | - | - |
| [MinimalFTP](https://github.com/Guichaguri/MinimalFTP) | Lightweight, small and customizable FTP server. | 186 | 6mo |
| [LittleProxy](https://github.com/adamfisk/LittleProxy) | High performance HTTP proxy atop Netty's event-based networking library. | 2.1k | 8y |
| [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) | Popular Java 8 guide. | 16.8k | 2y |
| [Modernizer](https://github.com/gaul/modernizer-maven-plugin) | Detect uses of legacy Java APIs. | 383 | 6d |
| [OctoLinker](https://github.com/OctoLinker/OctoLinker) | Browser extension which allows to navigate through code on GitHub more efficiently. | 5.3k | 2y |
| [OpenRefine](http://openrefine.org) | Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases. | - | - |
| [PipelinR](https://github.com/sizovs/pipelinr) | Small utility library for using handlers and commands with pipelines. | 476 | 4mo |
| [Polyglot for Maven](https://github.com/takari/polyglot-maven) | Extensions for Maven 3.3.1+ that allows writing the POM model in dialects other than XML. | 915 | 6mo |
| [RR4J](https://github.com/Kartikvk1996/RR4J) | RR4J is a tool that records java bytecode execution and later allows developers to replay locally. | 25 | 3y |
| [Simple Java Mail](https://github.com/bbottema/simple-java-mail) | Mailing with a clean and fluent API. | 1.3k | 8mo |
| [Smooks](https://github.com/smooks/smooks) | Framework for fragment-based message processing. (Apache-2.0 OR LGPL-3.0-or-later) | 414 | 10mo |
| [Svix](https://github.com/svix/svix-webhooks/tree/main/java) | Library for the Svix API to send webhooks and verify signatures. | N/A | N/A |
| [Togglz](https://www.togglz.org) | Implementation of the Feature Toggles pattern. | - | - |
| [TypeTools](https://github.com/jhalterman/typetools) | Tools for resolving generic types. | 628 | 2y |
| [webcam-capture](https://github.com/sarxos/webcam-capture) | Library for using built-in and external webcams directly in Java. | 2.3k | 2mo |
| [XMLBeam](https://github.com/SvenEwald/xmlbeam) | Processes XML by using annotations or XPath within code. | 76 | 5mo |
| [yGuard](https://github.com/yWorks/yGuard) | Obfuscation via renaming and shrinking. | 450 | 6mo |
| [JBang](https://github.com/maxandersen/jbang/) | JBang makes it easy to use Java for scripting. It lets you use a single file for code and dependency management and allows you to run it directly. | N/A | N/A |

### Mobile Development

_Tools for creating or managing mobile applications._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Codename One](https://www.codenameone.com) | Cross-platform solution for writing native mobile apps. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [MobileUI](https://mobileui.dev) | Cross-platform framework for developing mobile apps with native UI in Java and Kotlin. | - | - |
| [Multi-OS Engine](https://multi-os-engine.org) | Open-source, cross-platform engine to develop native mobile (iOS, Android, etc.) apps. | - | - |

### Monitoring

_Tools that observe/monitor applications in production by providing telemetry._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apitally](https://github.com/apitally/apitally-java) | Simple, privacy-focused API monitoring, analytics and request logging for Spring Boot apps. | 5 | 3d |
| [Automon](https://github.com/stevensouza/automon) | Combines the power of AOP with monitoring and/or logging tools. | 573 | 1y |
| [Dropwizard Metrics](https://github.com/dropwizard/metrics) | Expose metrics via JMX or HTTP and send them to a database. | 7.9k | 16d |
| [Failsafe Actuator](https://github.com/zalando/failsafe-actuator) | Out of the box monitoring of Failsafe Circuit Breaker in Spring-Boot environment. | 54 | 4y |
| [Glowroot](https://glowroot.org) | Open-source Java APM. | - | - |
| [HertzBeat](https://github.com/dromara/hertzbeat) | Real-time monitoring system with custom-monitor and agentless. | - | - |
| [hippo4j](https://github.com/opengoofy/hippo4j/blob/develop/README-EN.md) | Dynamic and observable thread pool framework. | N/A | N/A |
| [inspectIT](https://www.inspectit.rocks) | Captures detailed run-time information via hooks that can be changed on the fly. It supports tracing over multiple systems via the OpenTracing API and can correlate the data with end user monitoring. | - | - |
| [Jaeger client](https://github.com/jaegertracing/jaeger-client-java) | Jaeger client. | 490 | 3y |
| [JavaMelody](https://github.com/javamelody/javamelody) | Performance monitoring and profiling. | 3.0k | 9d |
| [jmxtrans](https://github.com/jmxtrans/jmxtrans) | Connect to multiple JVMs and query them for their attributes via JMX. Its query language is based on JSON, which allows non-Java programmers to access the JVM attributes. Supports different output writes, including Graphite, Ganglia, and StatsD. | 1.7k | 4y |
| [Jolokia](https://jolokia.org) | JMX over REST. | - | - |
| [Micrometer](https://github.com/micrometer-metrics/micrometer) | Vendor-neutral metrics/observability facade for the most popular metrics/observability libraries. | 4.8k | 7h |
| [Micrometer Tracing](https://github.com/micrometer-metrics/tracing) | Vendor-neutral distributed tracing facade for the most popular tracer libraries. | 287 | 6h |
| [nudge4j](https://github.com/lorenzoongithub/nudge4j) | Remote developer console from the browser for Java 8 via bytecode injection. | 164 | 5y |
| [OpenTelemetry](https://github.com/open-telemetry/opentelemetry-java) | Instrument, generate, collect, and export telemetry data to help you analyze your software’s performance and behavior. | 2.3k | 14h |
| [Pinpoint](https://github.com/naver/pinpoint) | Open-source APM tool. | - | - |
| [Prometheus](https://github.com/prometheus/client_java) | Provides a multi-dimensional data model, DSL, autonomous server nodes and much more. | 2.3k | 6h |
| [Stagemonitor](https://github.com/stagemonitor/stagemonitor) | Open-source performance monitoring and transaction tracing for JVM apps. | 1.7k | 2y |
| [Sysmon](https://github.com/palantir/Sysmon) | Lightweight platform monitoring tool for Java VMs. | 156 | 9y |
| [zipkin](https://zipkin.io) | Distributed tracing system which gathers timing data needed to troubleshoot latency problems in microservice architectures. | - | - |

### Native

_For working with platform-specific native libraries._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Aparapi](https://github.com/Syncleus/aparapi) | Converts bytecode to OpenCL which allows execution on GPUs. | 482 | 4y |
| [JavaCPP](https://github.com/bytedeco/javacpp) | Provides efficient and easy access to native C++. | 4.7k | 29d |
| [JNA](https://github.com/java-native-access/jna) | Work with native libraries without writing JNI. Also provides interfaces to common system libraries. | 8.9k | 29d |
| [JNR](https://github.com/jnr/jnr-ffi) | Work with native libraries without writing JNI. Also provides interfaces to common system libraries. Same goals as JNA, but faster, and serves as the basis for the upcoming [Project Panama](http://openjdk.java.net/projects/panama). | 1.3k | 2mo |
| [native-lib-loader](https://github.com/scijava/native-lib-loader) | Native library loader for extracting and loading native libraries from Java. | 215 | 1y |

### Natural Language Processing

_Libraries that specialize in processing text._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [CogCompNLP](https://github.com/CogComp/cogcomp-nlp) | Provides common annotators for plain text input. (Research and Academic Use License) | 480 | 3y |
| [CoreNLP](https://nlp.stanford.edu/software/corenlp.shtml) | Provides a set of fundamental tools for tasks like tagging, named entity recognition, and sentiment analysis. (GPL-3.0-or-later) | - | - |
| [DKPro](https://dkpro.github.io) | Collection of reusable NLP tools for linguistic pre-processing, machine learning, lexical resources, etc. | - | - |
| [Hypherator](https://github.com/ejossev/hypherator-java) | Java hyphenation library with iterator-like interface. Can be used out-of-the box - dictionaries for multiple languages are bundled in. | 3 | 6mo |
| [LingPipe](http://alias-i.com/lingpipe/) | Toolkit for tasks ranging from POS tagging to sentiment analysis. | - | - |

### Networking

_Libraries for building network servers._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Commons-networking](https://github.com/CiscoSE/commons-networking) | Client for server-sent events (SSE). | 20 | 3y |
| [Comsat](https://github.com/puniverse/comsat) | Integrates standard Java web-related APIs with Quasar fibers and actors. | 595 | 9y |
| [Dubbo](https://github.com/apache/dubbo) | High-performance RPC framework. | 41.7k | 1d |
| [Grizzly](https://javaee.github.io/grizzly/) | NIO framework. Used as a network layer in Glassfish. | - | - |
| [gRPC-java](https://github.com/grpc/grpc-java) | RPC framework based on protobuf and HTTP/2. | 11.9k | 1d |
| [KryoNet](https://github.com/EsotericSoftware/kryonet) | Provides a clean and simple API for efficient TCP and UDP client/server network communication using NIO and Kryo. | 1.8k | 5y |
| [MINA](https://mina.apache.org) | Abstract, event-driven async I/O API for network operations over TCP/IP and UDP/IP via Java NIO. | - | - |
| [Netty](https://netty.io) | Framework for building high-performance network applications. | - | - |
| [Drift](https://github.com/airlift/drift) | Easy-to-use, annotation-based library for creating Thrift clients and serializable types. | 248 | 3mo |
| [ServiceTalk](https://github.com/apple/servicetalk) | Framework built on Netty with APIs tailored to specific protocols and support for multiple programming paradigms. | 1.0k | 9h |
| [sshj](https://github.com/hierynomus/sshj) | Programmatically use SSH, SCP or SFTP. | 2.6k | 7mo |
| [TLS Channel](https://github.com/marianobarrios/tls-channel) | Implements a ByteChannel interface over SSLEngine, enabling easy-to-use (socket-like) TLS. | 207 | 1d |
| [Undertow](http://undertow.io) | Web server providing both blocking and non-blocking APIs based on NIO. Used as a network layer in WildFly. (LGPL-2.1-only) | - | - |
| [urnlib](https://github.com/slub/urnlib) | Represent, parse and encode URNs, as in RFC 2141. (GPL-3.0-only) | 34 | 9d |
| [Fluency](https://github.com/komamitsu/fluency) | High throughput data ingestion logger to Fluentd and Fluent Bit. | 163 | 3d |

### ORM

_APIs that handle the persistence of objects._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Cayenne](https://cayenne.apache.org) | Provides a clean, static API for data access. Also includes a GUI Modeler for working with database mappings, and DB reverse engineering and generation. | - | - |
| [Doma](https://github.com/domaframework/doma) | Database access framework that verifies and generates source code at compile time using annotation processing as well as native SQL templates called two-way SQL. | 494 | 1d |
| [Ebean](https://ebean.io) | Provides simple and fast data access. | - | - |
| [EclipseLink](https://www.eclipse.org/eclipselink/) | Supports a number of persistence standards: JPA, JAXB, JCA and SDO. | - | - |
| [Hibernate](http://hibernate.org/orm/) | Robust and widely used, with an active community. (LGPL-2.1-only) | - | - |
| [MyBatis](https://github.com/mybatis/mybatis-3) | Couples objects with stored procedures or SQL statements. | 20.3k | 6d |
| [MyBatis-Plus](https://github.com/baomidou/mybatis-plus) | A powerful enhanced toolkit of MyBatis for simplifying development. | 17.3k | 8d |
| [ObjectiveSql](https://github.com/braisdom/ObjectiveSql) | ActiveRecord ORM for rapid development and convention over configuration. | 1.3k | 1y |
| [Permazen](https://github.com/permazen/permazen) | Language-natural persistence layer. | 422 | 3mo |
| [SimpleFlatMapper](https://github.com/arnaudroger/SimpleFlatMapper) | Simple database and CSV mapper. | 454 | 1y |

### PaaS

_Java platform as a service._

### Pathfinding

_Algorithms and libraries for finding routes in graphs and spatial environments._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Pathetic](https://github.com/bsommerfeld/pathetic) | A highly configurable 3D A\* pathfinding library that uses specific optimizations for high performance. | 236 | 1h |

### PDF

_Tools to help with PDF files._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache FOP](https://xmlgraphics.apache.org/fop/) | Creates PDFs from XSL-FO. | - | - |
| [Apache PDFBox](https://pdfbox.apache.org) | Toolbox for creating and manipulating PDFs. | - | - |
| [Dynamic Jasper](https://intive-fdv.github.io/DynamicJasper/) | Abstraction layer to JasperReports. (LGPL-3.0-only) | - | - |
| [DynamicReports](https://github.com/dynamicreports/dynamicreports) | Simplifies JasperReports. (LGPL-3.0-only) | 240 | 4mo |
| [Eclipse BIRT](https://www.eclipse.org/birt) | Report engine for creating PDF and other formats (DOCX, XLSX, HTML, etc) using Eclipse-based visual editor. | - | - |
| [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) | XML/XHTML and CSS 2.1 renderer. (LGPL-2.1-or-later) | 2.2k | 5h |
| [JasperReports](https://community.jaspersoft.com/project/jasperreports-library) | Complex reporting engine. (LGPL-3.0-only) | - | - |
| [Open HTML to PDF](https://github.com/danfickle/openhtmltopdf) | Properly supports modern PDF standards based on flyingsaucer and Apache PDFBox. | 2.1k | 3y |
| [OpenPDF](https://github.com/LibrePDF/OpenPDF) | Open-source iText fork. (LGPL-3.0-only & MPL-2.0) | 4.1k | 4mo |
| [Tabula](https://github.com/tabulapdf/tabula-java) | Extracts tables from PDF files. | 2.0k | 9mo |

### Performance analysis

_Tools for performance analysis, profiling and benchmarking._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [honest-profiler](https://github.com/jvm-profiling-tools/honest-profiler) | Low-overhead, bias-free sampling profiler. | 1.3k | 3y |
| [jHiccup](https://github.com/giltene/jHiccup) | Logs and records platform JVM stalls. | 697 | 4y |
| [JITWatch](https://github.com/AdoptOpenJDK/jitwatch) | Analyze the JIT compiler optimisations made by the HotSpot JVM. | 3.3k | 10d |
| [JMH](http://openjdk.java.net/projects/code-tools/jmh/) | Harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM. (GPL-2.0 only WITH Classpath-exception-2.0) | - | - |
| [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) | Utilities for latency measurement and reporting. | 465 | 1y |

### Platform

_Frameworks that are suites of multiple libraries encompassing several categories._

#### Apache Commons

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [BCEL](http://commons.apache.org/proper/commons-bcel/) | Byte Code Engineering Library - analyze, create, and manipulate Java class files. | - | - |
| [BeanUtils](http://commons.apache.org/proper/commons-beanutils/) | Easy-to-use wrappers around the Java reflection and introspection APIs. | - | - |
| [BeanUtils2](http://commons.apache.org/sandbox/commons-beanutils2/) | Redesign of Commons BeanUtils. | - | - |
| [BSF](http://commons.apache.org/proper/commons-bsf/) | Bean Scripting Framework - interface to scripting languages, including JSR-223. | - | - |
| [Chain](http://commons.apache.org/proper/commons-chain/) | Chain of Responsibility pattern implementation. | - | - |
| [ClassScan](http://commons.apache.org/sandbox/commons-classscan/) | Find Class interfaces, methods, fields, and annotations without loading. | - | - |
| [CLI](http://commons.apache.org/proper/commons-cli/) | Command-line arguments parser. | - | - |
| [CLI2](http://commons.apache.org/sandbox/commons-cli2/) | Redesign of Commons CLI. | - | - |
| [Codec](http://commons.apache.org/proper/commons-codec/) | General encoding/decoding algorithms, e.g. phonetic, base64 or URL. | - | - |
| [Collections](http://commons.apache.org/proper/commons-collections/) | Extends or augments the Java Collections Framework. | - | - |
| [Compress](http://commons.apache.org/proper/commons-compress/) | Defines an API for working with tar, zip and bzip2 files. | - | - |
| [Configuration](http://commons.apache.org/proper/commons-configuration/) | Reading of configuration/preferences files in various formats. | - | - |
| [Convert](http://commons.apache.org/sandbox/commons-convert/) | Commons-Convert aims to provide a single library dedicated to the task of converting an object of one type to another. | - | - |
| [CSV](http://commons.apache.org/proper/commons-csv/) | Component for reading and writing comma separated value files. | - | - |
| [Daemon](http://commons.apache.org/proper/commons-daemon/) | Alternative invocation mechanism for unix-daemon-like java code. | - | - |
| [DBCP](http://commons.apache.org/proper/commons-dbcp/) | Database connection pooling services. | - | - |
| [DbUtils](http://commons.apache.org/proper/commons-dbutils/) | JDBC helper library. | - | - |
| [Digester](http://commons.apache.org/proper/commons-digester/) | XML-to-Java-object mapping utility. | - | - |
| [Email](http://commons.apache.org/proper/commons-email/) | Library for sending e-mail from Java. | - | - |
| [Exec](http://commons.apache.org/proper/commons-exec/) | API for dealing with external process execution and environment management in Java. | - | - |
| [FileUpload](http://commons.apache.org/proper/commons-fileupload/) | File upload capability for your servlets and web applications. | - | - |
| [Finder](http://commons.apache.org/sandbox/commons-finder/) | Java library inspired by the UNIX find command. | - | - |
| [Flatfile](http://commons.apache.org/sandbox/commons-flatfile/) | Java library for working with flat data structures. | - | - |
| [Functor](http://commons.apache.org/proper/commons-functor/) | Function that can be manipulated as an object, or an object representing a single, generic function. | - | - |
| [Graph](http://commons.apache.org/sandbox/commons-graph/) | General purpose graph APIs and algorithms. | - | - |
| [I18n](http://commons.apache.org/sandbox/commons-i18n/) | Adds the feature of localized message bundles that consist of one or many localized texts that belong together. | - | - |
| [Id](http://commons.apache.org/sandbox/commons-id/) | Id is a component used to generate identifiers. | - | - |
| [Imaging](http://commons.apache.org/proper/commons-imaging/) | Image library. | - | - |
| [IO](http://commons.apache.org/proper/commons-io/) | Collection of I/O utilities. | - | - |
| [Javaflow](http://commons.apache.org/sandbox/commons-javaflow/) | Continuation implementation to capture the state of the application. | - | - |
| [JCI](http://commons.apache.org/proper/commons-jci/) | Java Compiler Interface. | - | - |
| [JCS](http://commons.apache.org/proper/commons-jcs/) | Java Caching System. | - | - |
| [Jelly](http://commons.apache.org/proper/commons-jelly/) | XML based scripting and processing engine. | - | - |
| [Jexl](http://commons.apache.org/proper/commons-jexl/) | Expression language which extends the Expression Language of the JSTL. | - | - |
| [JNet](http://commons.apache.org/sandbox/commons-jnet/) | JNet allows to use dynamically register url stream handlers through the java.net API. | - | - |
| [JXPath](http://commons.apache.org/proper/commons-jxpath/) | Utilities for manipulating Java Beans using the XPath syntax. | - | - |
| [Lang](http://commons.apache.org/proper/commons-lang/) | Provides extra functionality for classes in java.lang. | - | - |
| [Logging](https://commons.apache.org/proper/commons-logging/) | Wrapper around a variety of logging API implementations. | - | - |
| [Math](http://commons.apache.org/proper/commons-math/) | Lightweight, self-contained mathematics and statistics components. | - | - |
| [Monitoring](http://commons.apache.org/sandbox/commons-monitoring/) | Monitoring aims to provide a simple but extensible monitoring solution for Java applications. | - | - |
| [Nabla](http://commons.apache.org/sandbox/commons-nabla/) | Nabla provides automatic differentiation classes that can generate derivative of any function implemented in the Java language. | - | - |
| [Net](http://commons.apache.org/proper/commons-net/) | Collection of network utilities and protocol implementations. | - | - |
| [OGNL](http://commons.apache.org/proper/commons-ognl/) | Object-graph navigation language. | - | - |
| [OpenPGP](http://commons.apache.org/sandbox/commons-openpgp/) | Interface to signing and verifying data using OpenPGP. | - | - |
| [Performance](http://commons.apache.org/sandbox/commons-performance/) | Small framework for microbenchmark clients, with implementations for Commons DBCP and Pool. | - | - |
| [Pipeline](http://commons.apache.org/sandbox/commons-pipeline/) | Provides a set of pipeline utilities designed around work queues that run in parallel to sequentially process data objects. | - | - |
| [Pool](http://commons.apache.org/proper/commons-pool/) | Generic object pooling component. | - | - |
| [Proxy](http://commons.apache.org/proper/commons-proxy/) | Library for creating dynamic proxies. | - | - |
| [RDF](https://commons.apache.org/proper/commons-rdf/) | Common implementation of RDF 1.1 that could be implemented by systems on the JVM. | - | - |
| [RNG](https://commons.apache.org/proper/commons-rng/) | Commons Rng provides implementations of pseudo-random numbers generators. | - | - |
| [SCXML](http://commons.apache.org/proper/commons-scxml/) | Implementation of the State Chart XML specification aimed at creating and maintaining a Java SCXML engine. | - | - |
| [Validator](http://commons.apache.org/proper/commons-validator/) | Framework to define validators and validation rules in an xml file. | - | - |
| [VFS](http://commons.apache.org/proper/commons-vfs/) | Virtual File System component for treating files, FTP, SMB, ZIP and such like as a single logical file system. | - | - |
| [Weaver](http://commons.apache.org/proper/commons-weaver/) | Provides an easy way to enhance (weave) compiled bytecode. | - | - |

#### Other

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [CUBA Platform](https://www.cuba-platform.com/) | High-level framework for developing enterprise applications with a rich web interface, based on Spring, EclipseLink and Vaadin. | - | - |
| [Light-4J](https://github.com/networknt/light-4j/) | Fast, lightweight and productive microservices framework with built-in [security](https://github.com/networknt/light-oauth2/). | N/A | N/A |
| [Orienteer](https://github.com/OrienteerBAP/Orienteer/) | Open-source business application platform for rapid configuration/development of CRM, ERP, LMS and other applications. | N/A | N/A |
| [Spring](https://spring.io/projects/) | Provides many packages for dependency injection, aspect-oriented programming, security, etc. | - | - |

### Processes

_Libraries that help the management of operating system processes._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ch.vorburger.exec](https://github.com/vorburger/ch.vorburger.exec) | Convenient API around Apache Commons Exec. | 38 | 2d |
| [zt-exec](https://github.com/zeroturnaround/zt-exec) | Provides a unified API to Apache Commons Exec and ProcessBuilder. | 910 | 1y |
| [zt-process-killer](https://github.com/zeroturnaround/zt-process-killer) | Stops processes started from Java or the system processes via PID. | 136 | 2y |

### Reactive libraries

_Libraries for developing reactive applications._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Akka](https://akka.io) | Toolkit and runtime for building concurrent, distributed, fault-tolerant and event-driven applications. | - | - |
| [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) | Provides a standard for asynchronous stream processing with non-blocking backpressure. | 4.9k | 2y |
| [Reactor](https://github.com/reactor/reactor) | A framework for building non-blocking applications on the JVM, providing support for reactive programming. | 3.7k | 29d |
| [RxJava](https://github.com/ReactiveX/RxJava) | Allows for composing asynchronous and event-based programs using observable sequences. | 48.5k | 21d |
| [vert.x](https://vertx.io) | Polyglot event-driven application framework. | - | - |

### REST Frameworks

_Frameworks specifically for creating RESTful services._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Dropwizard](https://github.com/dropwizard/dropwizard) | Opinionated framework for setting up modern web applications with Jetty, Jackson, Jersey and Metrics. | 8.6k | 43m |
| [Elide](https://elide.io) | Opinionated framework for JSON- or GraphQL-APIs based on a JPA data model. | - | - |
| [Jersey](https://jersey.github.io) | JAX-RS reference implementation. | - | - |
| [Microserver](https://github.com/aol/micro-server) | Convenient, extensible microservices plugin system for Spring & Spring Boot. With more than 30 plugins and growing, it supports both micro-monolith and pure microservices styles. | 934 | 5y |
| [Rapidoid](https://www.rapidoid.org) | Simple, secure and extremely fast framework consisting of an embedded HTTP server, GUI components and dependency injection. | - | - |
| [rest.li](https://github.com/linkedin/rest.li) | Framework for building robust, scalable RESTful architectures using typesafe bindings and asynchronous, non-blocking IO with an end-to-end developer workflow that promotes clean practices, uniform interface design and consistent data modeling. | 2.5k | 2mo |
| [RESTEasy](https://resteasy.github.io) | Fully certified and portable implementation of the JAX-RS specification. | - | - |
| [RestExpress](https://github.com/RestExpress/RestExpress) | Thin wrapper on the JBoss Netty HTTP stack that provides scaling and performance. | 940 | 1y |
| [Restlet Framework](https://github.com/restlet/restlet-framework-java) | Pioneering framework with powerful routing and filtering capabilities, and a unified client and server API. | 661 | 1mo |
| [Spark](http://sparkjava.com) | Sinatra inspired framework. | - | - |
| [Crnk](http://www.crnk.io) | Implementation of the JSON API specification to build resource-oriented REST endpoints with sorting, filtering, paging, linking, object graphs, type-safety, bulk updates, integrations and more. | - | - |
| [springdoc-openapi](https://github.com/springdoc/springdoc-openapi) | Automates the generation of API documentation using Spring Boot projects. | 3.7k | 6d |
| [Swagger](https://swagger.io) | Standard, language-agnostic interface to REST APIs. | - | - |
| [openapi-generator](https://github.com/OpenAPITools/openapi-generator) | Allows generation of API client libraries, SDKs, server stubs, documentation and configuration automatically given an OpenAPI Spec. | 25.6k | 22m |

### Science

_Libraries for scientific computing, analysis and visualization._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [BioJava](https://biojava.org/) | Facilitates processing biological data by providing algorithms, file format parsers, sequencing and 3D visualization commonly used in bioinformatics. | - | - |
| [Chart-FX](https://github.com/GSI-CS-CO/chart-fx) | Scientific charting library with focus on performance optimised real-time data visualisation at 25 Hz update rates for large data sets. | - | - |
| [DataMelt](https://datamelt.org/) | Environment for scientific computation, data analysis and data visualization. (GPL-3.0-or-later) | - | - |
| [Erdos](https://github.com/Erdos-Graph-Framework/Erdos) | Modular, light and easy graph framework for theoretic algorithms. | 127 | 2y |
| [GraphStream](http://graphstream-project.org) | Library for modeling and analyzing dynamic graphs. | - | - |
| [JFreeChart](http://www.jfree.org/jfreechart/) | 2D chart library for Swing, JavaFX and server-side applications. (LGPL-2.1-only) | - | - |
| [JGraphT](https://github.com/jgrapht/jgrapht) | Graph library that provides mathematical graph-theory objects and algorithms. | 2.7k | 11h |
| [JGraphX](https://github.com/jgraph/jgraphx) | Library for visualizing (mainly Swing) and interacting with node-edge graphs. | 687 | 5y |
| [LogicNG](https://github.com/logic-ng/LogicNG) | Library for creating, manipulating and solving Boolean and Pseudo-Boolean formulas. | 149 | 1y |
| [Mines Java Toolkit](https://github.com/MinesJTK/jtk) | Library for geophysical scientific computation, visualization and digital signal analysis. | 82 | 5y |
| [Morpheus](https://github.com/zavtech/morpheus-core) | Provides a versatile two-dimensional memory efficient tabular data structure called a DataFrame to enable efficient in-memory analytics for scientific computing on the JVM. | 244 | 7y |
| [Orekit](https://www.orekit.org/) | A low level space flight dynamics library providing basic elements (orbits, dates, attitude, frames...) and various algorithms (conversions, propagations, pointing...) to handle them. | - | - |
| [Orson-Charts](https://github.com/jfree/orson-charts) | Generates a wide variety of 3D charts that can be displayed with Swing and JavaFX or exported to PDF, SVG, PNG and JPEG. (GPL-3.0-only) | 120 | 6mo |
| [Tablesaw](https://github.com/jtablesaw/tablesaw) | Includes a data-frame, an embedded column store, and hundreds of methods to transform, summarize, or filter data. | 3.7k | 6mo |
| [XChart](https://github.com/knowm/XChart) | Light-weight library for plotting data. Many customizable chart types are available. | 1.6k | 3mo |

### Search

_Engines that index documents for search and analysis._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Lucene](https://lucene.apache.org) | High-performance, full-featured, cross-platform, text search engine library. | - | - |
| [Apache Solr](https://lucene.apache.org/solr/) | Enterprise search engine optimized for high-volume traffic. | - | - |
| [Elasticsearch](https://www.elastic.co) | Distributed, multitenant-capable, full-text search engine with a RESTful web interface and schema-free JSON documents. | - | - |
| [Indexer4j](https://github.com/haeungun/indexer4j) | Simple and light full text indexing and searching library. | 56 | 6y |

### Security

_Libraries that handle security, authentication, authorization or session management._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Shiro](https://shiro.apache.org) | Performs authentication, authorization, cryptography and session management. | - | - |
| [Ayza](https://github.com/Hakky54/ayza) | High-level SSL configuration builder for configuring HTTP clients and servers with SSL/TLS. | 564 | 5d |
| [Bouncy Castle](https://www.bouncycastle.org/java.html) | All-purpose cryptographic library and JCA provider offering a wide range of functions, from basic helpers to PGP/SMIME operations. | - | - |
| [DependencyCheck](https://github.com/jeremylong/DependencyCheck) | Detects publicly disclosed vulnerabilities contained within a project's dependencies. | 40 | 10mo |
| [Cryptomator](https://cryptomator.org) | Multiplatform, transparent, client-side encryption of files in the cloud. (GPL-3.0-only) | - | - |
| [Hdiv](https://github.com/hdiv/hdiv) | Runtime application that repels application security risks included in the OWASP Top 10, including SQL injection, cross-site scripting, cross-site request forgery, data tampering, and brute force attacks. | 219 | 4y |
| [jjwt](https://github.com/jwtk/jjwt) | JSON web token for Java and Android. | 11.0k | 2mo |
| [jwt-java](https://github.com/BastiaanJansen/jwt-java) | Easily create and parse JSON Web Tokens and create customized JWT validators using a fluent API. | 14 | 5mo |
| [Jwks RSA](https://github.com/auth0/jwks-rsa-java) | JSON Web Key Set parser. | 204 | 3mo |
| [Kalium](https://github.com/abstractj/kalium) | Binding for the Networking and Cryptography (NaCl) library. | 218 | 7y |
| [Keycloak](https://www.keycloak.org) | Integrated SSO and IDM for browser apps and RESTful web services. | - | - |
| [Keywhiz](https://github.com/square/keywhiz) | System for distributing and managing secrets. | 2.6k | 2y |
| [Nbvcxz](https://github.com/GoSimpleLLC/nbvcxz) | Advanced password strength estimation. | 308 | 4mo |
| [OACC](http://oaccframework.org) | Provides permission-based authorization services. | - | - |
| [OpenAM](https://github.com/OpenIdentityPlatform/OpenAM) | Access management solution that includes authentication, SSO, authorization, federation, entitlements and web services security. | 860 | 22d |
| [OTP-Java](https://github.com/BastiaanJansen/OTP-Java) | One-time password generator library according to RFC 4226 (HOTP) and RFC 6238 (TOTP). | 232 | 1y |
| [pac4j](https://github.com/pac4j/pac4j) | Security engine. | 2.5k | 2h |
| [Passay](http://www.passay.org/) | Enforce password policy by validating candidate passwords against a configurable rule set. | - | - |
| [Password4j](https://github.com/Password4j/password4j) | User-friendly cryptographic library that supports Argon2, Bcrypt, Scrypt, PBKDF2 and various other cryptographic hash functions. | 398 | 4mo |
| [SecurityBuilder](https://github.com/tersesystems/securitybuilder) | Fluent Builder API for JCA and JSSE classes and especially X.509 certificates. | 47 | 4y |
| [Themis](https://github.com/cossacklabs/themis) | Multi-platform high-level cryptographic library provides easy-to-use encryption for protecting sensitive data: secure messaging with forward secrecy, secure data storage (AES256GCM); suits for building end-to-end encrypted applications. | 1.9k | 1y |
| [Tink](https://github.com/google/tink) | Provides a simple and misuse-proof API for common cryptographic tasks. | - | - |
| [Topaz](https://www.topaz.sh) | Fine-grained authorization for applications with support for RBAC, ABAC, and ReBAC. | - | - |

### Serialization

_Libraries that handle serialization with high efficiency._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [FlatBuffers](https://github.com/google/flatbuffers) | Memory-efficient serialization library that can access serialized data without unpacking and parsing it. | 25.3k | 17d |
| [FST](https://github.com/RuedigerMoeller/fast-serialization) | JDK-compatible, high-performance object graph serialization. | 1.6k | 4y |
| [Fury](https://github.com/alipay/fury) | Blazing fast object graph serialization framework powered by JIT and zero-copy. | - | - |
| [Kryo](https://github.com/EsotericSoftware/kryo) | Fast and efficient object graph serialization framework. | 6.5k | 23d |
| [MessagePack](https://github.com/msgpack/msgpack-java) | Efficient binary serialization format. | 1.5k | 2d |
| [PHP Serializer](https://github.com/marcospassos/java-php-serializer) | Serializing objects in the PHP serialization format. | 19 | 7y |

### Server

_Servers specifically used to deploy applications._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Tomcat](https://tomcat.apache.org) | Robust, all-round server for Servlet and JSP. | - | - |
| [Apache TomEE](https://tomee.apache.org) | Tomcat plus Java EE. | - | - |
| [Jetty](https://www.eclipse.org/jetty/) | Provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. | - | - |
| [nanohttpd](https://github.com/NanoHttpd/nanohttpd) | Tiny, easily embeddable HTTP server. | 7.2k | 6y |
| [WildFly](https://www.wildfly.org) | Formerly known as JBoss and developed by Red Hat with extensive Java EE support. (LGPL-2.1-only) | - | - |

### Template Engine

_Tools that substitute expressions in a template._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Freemarker](https://freemarker.apache.org) | Library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data. | - | - |
| [Handlebars.java](https://jknack.github.io/handlebars.java/) | Logicless and semantic Mustache templates. | - | - |
| [Jade4J](https://github.com/neuland/jade4j) | Implementation of Pug (formerly known as Jade). | 706 | 4y |
| [Jamal](https://github.com/verhas/jamal) | Extendable template engine embedded into Maven/JavaDoc, supporting multiple extensions (Groovy, Ruby, JavaScript, JShell, PlantUml) with support for snippet handling. | 65 | 8mo |
| [jstachio](https://github.com/jstachio/jstachio) | Typesafe Mustache templating engine. | 315 | 8mo |
| [jte](https://github.com/casid/jte) | Compiles to classes, and uses an easy syntax, several features to make development easier and provides fast execution and a small footprint. | 1.1k | 2d |
| [Jtwig](https://github.com/jtwig/jtwig) | Modular, configurable and fully tested template engine. | 300 | 8y |
| [Pebble](https://pebbletemplates.io) | Inspired by Twig and separates itself with its inheritance feature and its easy-to-read syntax. It ships with built-in autoescaping for security and it includes integrated support for internationalization. | - | - |
| [Rocker](https://github.com/fizzed/rocker) | Optimized, memory efficient and speedy template engine producing statically typed, plain objects. | 781 | 2mo |
| [StringTemplate](https://github.com/antlr/stringtemplate4) | Template engine for generating source code, web pages, emails, or any other formatted text output. | 1.0k | 7mo |
| [Thymeleaf](https://www.thymeleaf.org) | Aims to be a substitute for JSP and works for XML files. | - | - |

### Testing

_Tools that test from model to the view._

#### Asynchronous

_Tools that simplify testing asynchronous services._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Awaitility](https://github.com/awaitility/awaitility) | DSL for synchronizing asynchronous operations. | 4.0k | 10mo |
| [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) | Toolkit for testing multi-threaded and asynchronous applications. | 427 | 2y |
| [GreenMail](https://greenmail-mail-test.github.io/greenmail/) | In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL. (GPL-2.0-only) | - | - |
| [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) | Native bindings for Hoverfly, a proxy which allows you to simulate HTTP services. | 174 | 18d |
| [Karate](https://github.com/intuit/karate) | DSL that combines API test-automation, mocks and performance-testing making testing REST/HTTP services easy. | - | - |
| [REST Assured](https://github.com/rest-assured/rest-assured) | DSL for easy testing of REST/HTTP services. | 7.1k | 26d |
| [WebTau](https://github.com/testingisdocumenting/webtau) | Test across REST-API, Graph QL, Browser, Database, CLI and Business Logic with consistent set of matchers and concepts. | 379 | 3mo |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Awaitility](https://github.com/awaitility/awaitility) | DSL for synchronizing asynchronous operations. | 4.0k | 10mo |
| [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) | Toolkit for testing multi-threaded and asynchronous applications. | 427 | 2y |
| [GreenMail](https://greenmail-mail-test.github.io/greenmail/) | In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL. (GPL-2.0-only) | - | - |
| [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) | Native bindings for Hoverfly, a proxy which allows you to simulate HTTP services. | 174 | 18d |
| [Karate](https://github.com/intuit/karate) | DSL that combines API test-automation, mocks and performance-testing making testing REST/HTTP services easy. | - | - |
| [REST Assured](https://github.com/rest-assured/rest-assured) | DSL for easy testing of REST/HTTP services. | 7.1k | 26d |
| [WebTau](https://github.com/testingisdocumenting/webtau) | Test across REST-API, Graph QL, Browser, Database, CLI and Business Logic with consistent set of matchers and concepts. | 379 | 3mo |

#### BDD

_Testing for the software development process that emerged from TDD and was heavily influenced by DDD and OOAD._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Cucumber](https://github.com/cucumber/cucumber-jvm) | Provides a way to describe features in a plain language which customers can understand. | 2.8k | 1d |
| [Cukes-REST](https://github.com/ctco/cukes) | Collection of Gherkin steps for REST-service testing using Cucumber. | 110 | 3y |
| [J8Spec](https://github.com/j8spec/j8spec) | Follows a Jasmine-like syntax. | 48 | 3y |
| [JBehave](https://jbehave.org) | Extensively configurable framework that describes stories. | - | - |
| [JGiven](http://jgiven.org) | Provides a fluent API which allows for simpler composition. | - | - |
| [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) | Aims to provide a fluent API to write tests in long and descriptive sentences that read like plain English. | 253 | 5y |
| [Serenity BDD](https://github.com/serenity-bdd/serenity-core) | Automated Acceptance testing and reporting library that works with Cucumber, JBehave and JUnit to make it easier to write high quality executable specifications. | 744 | 12h |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Cucumber](https://github.com/cucumber/cucumber-jvm) | Provides a way to describe features in a plain language which customers can understand. | 2.8k | 1d |
| [Cukes-REST](https://github.com/ctco/cukes) | Collection of Gherkin steps for REST-service testing using Cucumber. | 110 | 3y |
| [J8Spec](https://github.com/j8spec/j8spec) | Follows a Jasmine-like syntax. | 48 | 3y |
| [JBehave](https://jbehave.org) | Extensively configurable framework that describes stories. | - | - |
| [JGiven](http://jgiven.org) | Provides a fluent API which allows for simpler composition. | - | - |
| [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) | Aims to provide a fluent API to write tests in long and descriptive sentences that read like plain English. | 253 | 5y |
| [Serenity BDD](https://github.com/serenity-bdd/serenity-core) | Automated Acceptance testing and reporting library that works with Cucumber, JBehave and JUnit to make it easier to write high quality executable specifications. | 744 | 12h |

#### Fixtures

_Everything related to the creation and handling of random data._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [AutoParams](https://github.com/AutoParams/AutoParams) | Supports generating test data or combining scenarios for parameterized tests. | 368 | 5mo |
| [Beanmother](https://github.com/keepcosmos/beanmother) | Sets up beans from YAML fixtures. | 121 | 3y |
| [Datafaker](https://github.com/datafaker-net/datafaker) | Modern fake data generator forked from Java Faker. | 1.7k | 5h |
| [Fixture Factory](https://github.com/six2six/fixture-factory) | Generates fake objects from a template. | 446 | 3y |
| [jFairy](https://github.com/Devskiller/jfairy) | Fake data generator. | - | - |
| [Instancio](https://github.com/instancio/instancio) | Automates data setup in unit tests by generating fully-populated, reproducible objects. Includes JUnit 5 extension. | 1.1k | 6m |
| [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) | JUnit test runner and plugins for running JUnit tests with pseudo-randomness. | 180 | 10mo |
| [Java Faker](https://github.com/DiUS/java-faker) | Port of Ruby's fake data generator. | 4.9k | 3y |
| [Mockneat](https://github.com/nomemory/mockneat) | Another fake data generator. | 536 | 3y |
| [JMock](https://github.com/xcancloud/JMock) | JMock is a high-performance data generation and simulation component library implemented in Java. | 422 | 2mo |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [AutoParams](https://github.com/AutoParams/AutoParams) | Supports generating test data or combining scenarios for parameterized tests. | 368 | 5mo |
| [Beanmother](https://github.com/keepcosmos/beanmother) | Sets up beans from YAML fixtures. | 121 | 3y |
| [Datafaker](https://github.com/datafaker-net/datafaker) | Modern fake data generator forked from Java Faker. | 1.7k | 5h |
| [Fixture Factory](https://github.com/six2six/fixture-factory) | Generates fake objects from a template. | 446 | 3y |
| [jFairy](https://github.com/Devskiller/jfairy) | Fake data generator. | - | - |
| [Instancio](https://github.com/instancio/instancio) | Automates data setup in unit tests by generating fully-populated, reproducible objects. Includes JUnit 5 extension. | 1.1k | 6m |
| [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) | JUnit test runner and plugins for running JUnit tests with pseudo-randomness. | 180 | 10mo |
| [Java Faker](https://github.com/DiUS/java-faker) | Port of Ruby's fake data generator. | 4.9k | 3y |
| [Mockneat](https://github.com/nomemory/mockneat) | Another fake data generator. | 536 | 3y |
| [JMock](https://github.com/xcancloud/JMock) | JMock is a high-performance data generation and simulation component library implemented in Java. | 422 | 2mo |

#### Frameworks

_Provide environments to run tests for a specific use case._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache JMeter](http://jmeter.apache.org) | Functional testing and performance measurements. | - | - |
| [JMeter DSL.java](https://abstracta.github.io/jmeter-java-dsl/) | Load tests with JMeter as simple as a JUnit test. | - | - |
| [Arquillian](http://arquillian.org) | Integration and functional testing platform for Java EE containers. | - | - |
| [cdi-test](https://github.com/guhilling/cdi-test) | JUnit extension for easy and efficient testing of CDI components. | 27 | 1d |
| [Citrus](https://citrusframework.org) | Integration testing framework that focuses on both client- and server-side messaging. | - | - |
| [Gatling](https://gatling.io) | Load testing tool designed for ease of use, maintainability and high performance. | - | - |
| [JUnit](https://junit.org/junit5/) | Common testing framework. | - | - |
| [jqwik](https://jqwik.net) | Engine for property-based testing built on JUnit 5. | - | - |
| [Pact JVM](https://github.com/DiUS/pact-jvm) | Consumer-driven contract testing. | - | - |
| [PIT](http://pitest.org) | Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test suites. | - | - |
| [weld-testing](https://github.com/weld/weld-testing) | Set of test framework extensions (JUnit 4, JUnit 5, Spock) to enhance the testing of CDI components via Weld. Supports Weld 5. | 112 | 2d |
| [selenium](https://github.com/SeleniumHQ/selenium) | Browser automation framework and ecosystem. | 33.9k | 1h |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache JMeter](http://jmeter.apache.org) | Functional testing and performance measurements. | - | - |
| [JMeter DSL.java](https://abstracta.github.io/jmeter-java-dsl/) | Load tests with JMeter as simple as a JUnit test. | - | - |
| [Arquillian](http://arquillian.org) | Integration and functional testing platform for Java EE containers. | - | - |
| [cdi-test](https://github.com/guhilling/cdi-test) | JUnit extension for easy and efficient testing of CDI components. | 27 | 1d |
| [Citrus](https://citrusframework.org) | Integration testing framework that focuses on both client- and server-side messaging. | - | - |
| [Gatling](https://gatling.io) | Load testing tool designed for ease of use, maintainability and high performance. | - | - |
| [JUnit](https://junit.org/junit5/) | Common testing framework. | - | - |
| [jqwik](https://jqwik.net) | Engine for property-based testing built on JUnit 5. | - | - |
| [Pact JVM](https://github.com/DiUS/pact-jvm) | Consumer-driven contract testing. | - | - |
| [PIT](http://pitest.org) | Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test suites. | - | - |
| [weld-testing](https://github.com/weld/weld-testing) | Set of test framework extensions (JUnit 4, JUnit 5, Spock) to enhance the testing of CDI components via Weld. Supports Weld 5. | 112 | 2d |
| [selenium](https://github.com/SeleniumHQ/selenium) | Browser automation framework and ecosystem. | 33.9k | 1h |

#### Matchers

_Libraries that provide custom matchers._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [AssertJ](https://joel-costigliola.github.io/assertj/) | Fluent assertions that improve readability. | - | - |
| [Hamcrest](http://hamcrest.org/JavaHamcrest/) | Matchers that can be combined to create flexible expressions of intent. | - | - |
| [JSONAssert](http://jsonassert.skyscreamer.org) | Simplifies testing JSON strings. | - | - |
| [JsonUnit](https://github.com/lukas-krecan/JsonUnit) | Library that simplifies JSON comparison in tests. | 975 | 13h |
| [Truth](https://truth.dev) | Google's fluent assertion and proposition framework. | - | - |
| [XMLUnit](https://github.com/xmlunit/xmlunit) | Simplifies testing for XML output. | 314 | 2mo |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [AssertJ](https://joel-costigliola.github.io/assertj/) | Fluent assertions that improve readability. | - | - |
| [Hamcrest](http://hamcrest.org/JavaHamcrest/) | Matchers that can be combined to create flexible expressions of intent. | - | - |
| [JSONAssert](http://jsonassert.skyscreamer.org) | Simplifies testing JSON strings. | - | - |
| [JsonUnit](https://github.com/lukas-krecan/JsonUnit) | Library that simplifies JSON comparison in tests. | 975 | 13h |
| [Truth](https://truth.dev) | Google's fluent assertion and proposition framework. | - | - |
| [XMLUnit](https://github.com/xmlunit/xmlunit) | Simplifies testing for XML output. | 314 | 2mo |

#### Testing Miscellaneous

_Other stuff related to testing._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ConsoleCaptor](https://github.com/Hakky54/console-captor) | Captures console output for unit testing purposes. | 33 | 16d |
| [junit-dataprovider](https://github.com/TNG/junit-dataprovider) | TestNG-like data provider/runner for JUnit. | 249 | 25d |
| [junit-pioneer](https://junit-pioneer.org/) | JUnit 5 extension pack, pushing the frontiers on Jupiter. | - | - |
| [LogCaptor](https://github.com/Hakky54/log-captor) | Captures log entries for unit testing purposes. | 421 | 16d |
| [log-capture](https://github.com/dm-drogeriemarkt/log-capture) | Captures log entries and provides assertions for unit and integration testing. | 15 | 1mo |
| [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) | Reports whether instances of a given class are immutable. | 241 | 2mo |
| [pojo-tester](https://www.pojo.pl) | Automatically performs tests on basic POJO methods. (LGPL-3.0-only) | - | - |
| [raml-tester](https://github.com/nidi3/raml-tester) | Tests if a request/response matches a given RAML definition. | 73 | 7y |
| [Selfie](https://github.com/diffplug/selfie) | Snapshot testing (inline and on disk). | 87 | 1mo |
| [Stebz](https://github.com/stebz/stebz) | Multi-approach framework for test steps managing. | 17 | 1d |
| [Testcontainers](https://github.com/testcontainers/testcontainers-java) | Provides throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container. | 8.6k | 23d |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ConsoleCaptor](https://github.com/Hakky54/console-captor) | Captures console output for unit testing purposes. | 33 | 16d |
| [junit-dataprovider](https://github.com/TNG/junit-dataprovider) | TestNG-like data provider/runner for JUnit. | 249 | 25d |
| [junit-pioneer](https://junit-pioneer.org/) | JUnit 5 extension pack, pushing the frontiers on Jupiter. | - | - |
| [LogCaptor](https://github.com/Hakky54/log-captor) | Captures log entries for unit testing purposes. | 421 | 16d |
| [log-capture](https://github.com/dm-drogeriemarkt/log-capture) | Captures log entries and provides assertions for unit and integration testing. | 15 | 1mo |
| [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) | Reports whether instances of a given class are immutable. | 241 | 2mo |
| [pojo-tester](https://www.pojo.pl) | Automatically performs tests on basic POJO methods. (LGPL-3.0-only) | - | - |
| [raml-tester](https://github.com/nidi3/raml-tester) | Tests if a request/response matches a given RAML definition. | 73 | 7y |
| [Selfie](https://github.com/diffplug/selfie) | Snapshot testing (inline and on disk). | 87 | 1mo |
| [Stebz](https://github.com/stebz/stebz) | Multi-approach framework for test steps managing. | 17 | 1d |
| [Testcontainers](https://github.com/testcontainers/testcontainers-java) | Provides throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container. | 8.6k | 23d |

#### Mocking

_Tools which mock collaborators to help testing single, isolated units._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [JMockit](http://jmockit.github.io) | Integration testing, API mocking and faking, and code coverage. | - | - |
| [Mockito](https://github.com/mockito/mockito) | Mocking framework that lets you write tests with a clean and simple API. | 15.4k | 2d |
| [MockServer](https://www.mock-server.com) | Allows mocking of systems integrated with HTTPS. | - | - |
| [Moco](https://github.com/dreamhead/moco) | Concise web services for stubs and mocks. | 4.4k | 1y |
| [PowerMock](https://github.com/powermock/powermock) | Mocks static methods, constructors, final classes and methods, private methods, and removal of static initializers. | 4.2k | 3y |
| [WireMock](http://wiremock.org) | Stubs and mocks web services. | - | - |
| [EasyMock](https://github.com/easymock/easymock) | EasyMock is a Java library that provides an easy way to use Mock Objects in unit testing. | 831 | 2d |

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [JMockit](http://jmockit.github.io) | Integration testing, API mocking and faking, and code coverage. | - | - |
| [Mockito](https://github.com/mockito/mockito) | Mocking framework that lets you write tests with a clean and simple API. | 15.4k | 2d |
| [MockServer](https://www.mock-server.com) | Allows mocking of systems integrated with HTTPS. | - | - |
| [Moco](https://github.com/dreamhead/moco) | Concise web services for stubs and mocks. | 4.4k | 1y |
| [PowerMock](https://github.com/powermock/powermock) | Mocks static methods, constructors, final classes and methods, private methods, and removal of static initializers. | 4.2k | 3y |
| [WireMock](http://wiremock.org) | Stubs and mocks web services. | - | - |
| [EasyMock](https://github.com/easymock/easymock) | EasyMock is a Java library that provides an easy way to use Mock Objects in unit testing. | 831 | 2d |

### Utility

_Libraries which provide general utility functions._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Arthas](https://github.com/alibaba/arthas) | Allows to troubleshoot production issues for applications without modifying code or restarting servers. | 37.0k | 2d |
| [bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) | Rate limiting library based on token-bucket algorithm. | - | - |
| [cactoos](https://github.com/yegor256/cactoos) | Collection of object-oriented primitives. | 763 | 19h |
| [Chocotea](https://github.com/cleopatra27/chocotea) | Generates postman collection, environment and integration tests from java code. | 48 | 2y |
| [CRaSH](http://www.crashub.org) | Provides a shell into a JVM that's running CRaSH. Used by Spring Boot and others. (LGPL-2.1-or-later) | - | - |
| [Dex](https://github.com/PatMartin/Dex) | Java/JavaFX tool capable of powerful ETL and data visualization. | 1.3k | 6y |
| [dregex](https://github.com/marianobarrios/dregex) | Regular expression engine that uses deterministic finite automata. It supports some Perl-style features and yet retains linear matching time, and also offers set operations. | 48 | 23h |
| [Embulk](https://github.com/embulk/embulk) | Bulk data loader that helps data transfer between various databases, storages, file formats, and cloud services. | 1.8k | 1mo |
| [fswatch](https://github.com/vorburger/ch.vorburger.fswatch) | Micro library to watch for directory file system changes, simplifying java.nio.file.WatchService. | 31 | 5d |
| [Gephi](https://github.com/gephi/gephi) | Cross-platform for visualizing and manipulating large graph networks. (GPL-3.0-only) | 6.3k | 2d |
| [Guava](https://github.com/google/guava) | Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and more. | 51.4k | 1d |
| [JADE](https://jade.tilab.com) | Framework and environment for building and debugging multi-agent systems. (LGPL-2.0-only) | - | - |
| [Javadoc Publisher](https://github.com/MathieuSoysal/Javadoc-publisher.yml) | Generate Javadoc from your maven/gradle project and deploy it automatically on GitHub Page. | 55 | 1mo |
| [Java Diff Utils](https://java-diff-utils.github.io/java-diff-utils/) | Utilities for text or data comparison and patching. | - | - |
| [JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) | Library that helps with constructing difficult regular expressions. | 2.6k | 1mo |
| [JGit](https://www.eclipse.org/jgit/) | Lightweight, pure Java library implementing the Git version control system. | - | - |
| [JKScope](https://github.com/evpl/jkscope) | Java scope functions inspired by Kotlin. | 21 | 11mo |
| [minio-java](https://github.com/minio/minio-java) | Provides simple APIs to access any Amazon S3-compatible object storage server. | 1.3k | 22d |
| [Protégé](https://protege.stanford.edu) | Provides an ontology editor and a framework to build knowledge-based systems. | - | - |
| [Semver4j](https://github.com/semver4j/semver4j) | Lightweight library that helps you handling semantic versioning with different modes. | 106 | 23h |
| [Underscore-java](https://github.com/javadev/underscore-java) | Port of Underscore.js functions. | 547 | 29d |

### Version Managers

_Utilities that help create the development shell environment and switch between different Java versions._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [jabba](https://github.com/shyiko/jabba) | Java Version Manager inspired by nvm. Supports macOS, Linux and Windows. | 3.3k | 4y |
| [jenv](https://github.com/jenv/jenv) | Java Version Manager inspired by rbenv. Can configure globally or per project. Tested on Debian and macOS. | 6.5k | 14d |
| [SDKMan](https://github.com/sdkman/sdkman-cli) | Java Version Manager inspired by RVM and rbenv. Supports UNIX-based platforms and Windows. | 6.6k | 10h |

### Web Crawling

_Libraries that analyze the content of websites._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Apache Nutch](https://nutch.apache.org) | Highly extensible, highly scalable web crawler for production environments. | - | - |
| [Crawler4j](https://github.com/yasserg/crawler4j) | Simple and lightweight web crawler. | 4.6k | 5y |
| [jsoup](https://jsoup.org) | Scrapes, parses, manipulates and cleans HTML. | - | - |
| [StormCrawler](http://stormcrawler.net) | SDK for building low-latency and scalable web crawlers. | - | - |
| [webmagic](https://github.com/code4craft/webmagic) | Scalable crawler with downloading, url management, content extraction and persistent. | 11.7k | 6mo |

### Web Frameworks

_Frameworks that handle the communication between the layers of a web application._

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [ActiveJ](https://activej.io) | Lightweight asynchronous framework built from the ground up for developing high-performance web applications. | - | - |
| [Apache Tapestry](https://tapestry.apache.org) | Component-oriented framework for creating dynamic, robust, highly scalable web applications. | - | - |
| [Apache Wicket](https://wicket.apache.org) | Component-based web application framework similar to Tapestry, with a stateful GUI. | - | - |
| [Blade](https://github.com/lets-blade/blade) | Lightweight, modular framework that aims to be elegant and simple. | 5.9k | 11mo |
| [Bootique](https://bootique.io) | Minimally opinionated framework for runnable apps. | - | - |
| [Firefly](http://www.fireflysource.com) | Asynchronous framework for rapid development of high-performance web application. | - | - |
| [Javalin](https://javalin.io/) | Microframework for web applications. | - | - |
| [Jooby](http://www.jooby.org) | Scalable, fast and modular micro-framework that offers multiple programming models. | - | - |
| [Ninja](http://www.ninjaframework.org) | Full-stack web framework. | - | - |
| [Pippo](http://www.pippo.ro) | Small, highly modularized, Sinatra-like framework. | - | - |
| [Play](https://www.playframework.com) | Built on Akka, it provides predictable and minimal resource consumption (CPU, memory, threads) for highly-scalable applications in Java and Scala. | - | - |
| [PrimeFaces](https://www.primefaces.org) | JSF framework with both free and commercial/support versions and frontend components. | - | - |
| [Ratpack](https://ratpack.io) | Set of libraries that facilitate fast, efficient, evolvable and well-tested HTTP applications. | - | - |
| [Takes](https://github.com/yegor256/takes) | Opinionated web framework which is built around the concepts of True Object-Oriented Programming and immutability. | 868 | 6d |
| [Vaadin](https://vaadin.com) | Full-stack open-source Java framework that simplifies web app development. Build complex, interactive applications with Java alone, and enhance with TypeScript and React components, without needing deep JavaScript, CSS, or HTML expertise. | - | - |
| [WebForms Core](https://github.com/webforms-core) | A technology for managing HTML tags from the server. | - | - |

### Workflow Orchestration Engines

| Name | Description | Stars | Updated |
| :--- | :---------- | :---: | :-----: |
| [Cadence](https://cadenceworkflow.io) | Stateful code platform from Uber. | - | - |
| [flowable](https://github.com/flowable/flowable-engine) | Compact and efficient workflow and business process management platform. | 9.0k | 1d |
| [Temporal](https://temporal.io) | Microservice orchestration platform, forked from Cadence but gRPC based. | - | - |

## Resources

### Related Awesome Lists

_Awesome Lists related to the Java & JVM ecosystem._

- [Awesome Annotation Processing](https://github.com/gunnarmorling/awesome-annotation-processing)
- [Awesome Graal](https://github.com/neomatrix369/awesome-graal)
- [Awesome Gradle Plugins](https://github.com/ksoichiro/awesome-gradle)
- [Awesome Java libraries and hidden gems](https://libs.tech/java)
- [Awesome J2ME](https://github.com/hstsethi/awesome-j2me)
- [AwesomeJavaFX](https://github.com/mhrimaz/AwesomeJavaFX)
- [Awesome JVM](https://github.com/deephacks/awesome-jvm)
- [Awesome Microservices](https://github.com/mfornos/awesome-microservices)
- [Awesome REST](https://github.com/marmelab/awesome-rest)
- [Awesome Selenium](https://github.com/christian-bromann/awesome-selenium)
- [Awesome Hybris](https://github.com/eminyagiz42/awesome-hybris)
- [ciandcd](https://github.com/ciandcd/awesome-ciandcd)
- [Useful Java Links](https://github.com/Vedenin/useful-java-links)
- [Java Concurrency Checklist](https://github.com/code-review-checklists/java-concurrency)
- [Java Developer Roadmap](https://github.com/s4kibs4mi/java-developer-roadmap)

### Communities

_Active discussions._

- [r/java](https://www.reddit.com/r/java/) - Subreddit for the Java community.
- [Stack Overflow](https://stackoverflow.com/questions/tagged/java) - Question/answer platform.

### Frontends

_Websites that provide a frontend for this list. Please note, there won't be an official website. We don't associate with a particular website and everybody is allowed to create one._

- [java.libhunt.com](https://java.libhunt.com)

### Influential Books

_Books that made a big impact and are still worth reading._

- [Core Java Volume I--Fundamentals](https://www.amazon.com/Core-Java-I-Fundamentals-10th/dp/0134177304)
- [Core Java, Volume II--Advanced Features](https://www.amazon.com/Core-Java-II-Advanced-Features-10th/dp/0134177290)
- [Effective Java (3rd Edition)](https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997)
- [Head First Java (3rd Edition)](https://www.oreilly.com/library/view/head-first-java/9781492091646/)
- [Java Concurrency in Practice](https://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
- [The Well-Grounded Java Developer (2nd Edition)](https://www.manning.com/books/the-well-grounded-java-developer-second-edition)
- [Thinking in Java](https://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

### Podcasts and Screencasts

_Something to look at or listen to while programming._

- [140 Second Ducklings](https://twitter.com/debugagent/status/1491075324805001219) - Short videos on Twitter explaining Java debugging in depth.
- [A Bootiful Podcast](https://bootifulpodcast.fm)
- [Foojay Podcast](https://foojay.io/today/category/podcast/)
- [Inside Java](https://inside.java/podcast) (Official)
- [Java Off Heap](http://www.javaoffheap.com)
- [The Java Posse](http://www.javaposse.com) - Discontinued as of 02/2015.

### People

#### Socials

_Active accounts to follow. Descriptions from their socials._

- [Adam Bien](https://twitter.com/AdamBien) - Freelance author, JavaOne Rockstar speaker, consultant, Java Champion.
- [Aleksey Shipilëv](https://twitter.com/shipilev) - Performance geek, benchmarking czar, concurrency bug hunter.
- [Antonio Goncalves](https://twitter.com/agoncal) - Java Champion, JUG Leader, Devoxx France, Java EE 6/7, JCP, Author.
- [Arun Gupta](https://twitter.com/arungupta) - Java Champion, JavaOne Rockstar, JUG Leader, Devoxx4Kids-er, VP of Developer Advocacy at Couchbase.
- [Brian Goetz](https://bsky.app/profile/briangoetz.bsky.social) - Java Language Architect at Oracle.
- [Bruno Borges](https://twitter.com/brunoborges) - Product Manager/Java Jock at Oracle.
- [Chris Engelbert](https://twitter.com/noctarius2k) - Open Source Enthusiast, Speaker, Developer, Developer Advocacy at TimescaleDB.
- [Chris Richardson](https://bsky.app/profile/crichardson.bsky.social) - Software architect, consultant, and serial entrepreneur, Java Champion, JavaOne Rock Star, \*POJOs in Action- author.
- [Ed Burns](https://twitter.com/edburns) - Consulting Member of the Technical Staff at Oracle.
- [Eugen Paraschiv](https://twitter.com/baeldung) - Author of the Spring Security Course.
- [Heinz Kabutz](https://twitter.com/heinzkabutz) - Java Champion, speaker, author of The Java Specialists' Newsletter, concurrency performance expert.
- [Holly Cummins](https://twitter.com/holly_cummins) - Technical Lead of IBM London's Bluemix Garage, Java Champion, developer, author, JavaOne rockstar.
- [James Weaver](https://twitter.com/JavaFXpert) - Java/JavaFX/IoT developer, author and speaker.
- [Java](https://twitter.com/java) - Official Java Twitter account.
- [Javin Paul](https://twitter.com/javinpaul) - Well-known Java blogger.
- [Josh Long](https://twitter.com/starbuxman) - Spring Advocate at Pivotal, author of O'Reilly's Cloud Native Java- and Building Microservices with Spring Boot, JavaOne Rock Star.
- [Lukas Eder](https://bsky.app/profile/lukaseder.bsky.social) - Java Champion, speaker, Founder and CEO Data Geekery (jOOQ).
- [Mani Sarkar](https://twitter.com/theNeomatrix369) - Java champion, Polyglot, Software Crafter involved with @graalvm, AI/ML/DL, Data Science, Developer communities, speaker & blogger. Creator of couple of awesome lists like this one.
- [Mario Fusco](https://twitter.com/mariofusco) - RedHatter, JUG coordinator, frequent speaker and author.
- [Mark Heckler](https://twitter.com/MkHeck) - Pivotal Principal Technologist and Developer Advocate, conference speaker, published author, and Java Champion, focusing on Internet of Things and the cloud.
- [Markus Eisele](https://twitter.com/myfear) - Java EE evangelist, Red Hat.
- [Martijn Verburg](https://twitter.com/karianna) - London JUG co-leader, speaker, author, Java Champion and much more.
- [Martin Thompson](https://twitter.com/mjpt777) - Pasty faced performance gangster.
- [Monica Beckwith](https://twitter.com/mon_beck) - Performance consultant, JavaOne Rock Star.
- [OpenJDK](https://twitter.com/OpenJDK) - Official OpenJDK account.
- [Peter Lawrey](https://twitter.com/PeterLawrey) - Peter Lawrey, Java performance expert.
- [Randy Shoup](https://twitter.com/randyshoup) - Stitch Fix VP Engineering, speaker, JavaOne Rock Star.
- [Reza Rahman](https://twitter.com/reza_rahman) - Java EE/GlassFish/WebLogic evangelist, author, speaker, open source hacker.
- [Sander Mak](https://twitter.com/Sander_Mak) - Java Champion, author.
- [Simon Maple](https://twitter.com/sjmaple) - Java Champion, VirtualJUG founder, LJC leader, RebelLabs author.
- [Spencer Gibb](https://twitter.com/spencerbgibb) - Software Engineer, Dad, Geek, Co-founder and Lead of Spring Cloud Core @pivotal.
- [Stephen Colebourne](https://bsky.app/profile/jodastephen.bsky.social) - Java Champion, speaker.
- [Trisha Gee](https://twitter.com/trisha_gee) - Java Champion and speaker.
- [Venkat Subramaniam](https://twitter.com/venkat_s) - Author, University of Houston professor, MicroSoft MVP award recipient, JavaOne Rock Star, Java Champion.
- [Vlad Mihalcea](https://twitter.com/vlad_mihalcea) - Java Champion working on Hypersistence Optimizer, database aficionado, author of High-Performance Java Persistence book.

### Websites

_Sites to read._

- [Baeldung](https://www.baeldung.com)
- [Dzone](https://dzone.com)
- [foojay.io](https://foojay.io)
- [Google Java Style](https://google.github.io/styleguide/javaguide.html)
- [InfoQ](https://www.infoq.com)
- [Java Algorithms and Clients](https://algs4.cs.princeton.edu/code)
- [Java, SQL, and jOOQ](https://blog.jooq.org)
- [Java.net](https://community.oracle.com/community/java)
- [Javalobby](https://dzone.com/java-jdk-development-tutorials-tools-news)
- [JavaWorld](https://www.javaworld.com)
- [JAXenter](https://jaxenter.com)
- [RebelLabs](https://zeroturnaround.com/rebellabs)
- [OverOps Blog](https://blog.overops.com)
- [TheServerSide.com](http://www.theserverside.com)
- [Vanilla Java](https://vanilla-java.github.io)
- [Voxxed](https://www.voxxed.com)
- [Java Weekly](https://discu.eu/weekly/java/)

## Contributing

Contributions are very welcome!

Please have a look at the [CONTRIBUTING](https://github.com/akullpp/awesome-java/blob/master/CONTRIBUTING.md) guidelines and [the validation tools](https://github.com/akullpp/awesome-java-lint).
