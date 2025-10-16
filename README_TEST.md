# Awesome Java [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of awesome Java frameworks, libraries and software.

## Contents

- [Projects](#projects)
  - [Architecture](#architecture)
  - [Artificial Intelligence](#artificial-intelligence)
  - [Bean Mapping](#bean-mapping)
  - [Build](#build)
  - [Bytecode Manipulation](#bytecode-manipulation)
  - [Caching](#caching)
  - [CLI](#cli)
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
  - [Decentralization](#decentraliation)
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
  - [Workflow Orchestration Engines](#workflow-orchestration-engines)
- [Resources](#resources)
  - [Related Awesome Lists](#related-awesome-lists)
  - [Communities](#communities)
  - [Frontends](#frontends)
  - [Influential Books](#influential-books)
  - [Podcasts and Screencasts](#podcasts-and-screencasts)
  - [People](#people)
  - [Websites](#websites)
- [Contributing](#contributing)

## Projects

### Architecture

_Frameworks and libraries that help implementing and verifying design and architecture concepts._

|---|---|---|---|
| [ArchUnit](https://github.com/TNG/ArchUnit) | Test library for specifying and asserting architecture rules. | ![](https://img.shields.io/github/stars/TNG/ArchUnit?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/TNG/ArchUnit?style=flat-square&label=)
| [jMolecules](https://github.com/xmolecules/jmolecules) | Annotations and interfaces to express design and architecture concepts in code. | ![](https://img.shields.io/github/stars/xmolecules/jmolecules?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/xmolecules/jmolecules?style=flat-square&label=)

### Artificial Intelligence

_Frameworks that help you to leverage LLMs and AI._

|---|---|---|---|
| [LangChain4j](https://github.com/langchain4j/langchain4j) | Simplifies integration of LLMs with unified APIs and a comprehensive toolbox. | ![](https://img.shields.io/github/stars/langchain4j/langchain4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/langchain4j/langchain4j?style=flat-square&label=)
| [MCP Java SDK](https://github.com/modelcontextprotocol/java-sdk) | Enables applications to interact with AI models and tools through a standardized interface. | ![](https://img.shields.io/github/stars/modelcontextprotocol/java-sdk?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/modelcontextprotocol/java-sdk?style=flat-square&label=)
| [simple-openai](https://github.com/sashirestela/simple-openai) | Library to use the OpenAI API (and compatible ones) in the simplest possible way. | ![](https://img.shields.io/github/stars/sashirestela/simple-openai?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/sashirestela/simple-openai?style=flat-square&label=)
| [Spring AI](https://spring.io/projects/spring-ai) | Application framework for AI engineering for Spring. | - | - |

### Bean Mapping

_Frameworks that ease bean mapping._

|---|---|---|---|
| [dOOv](https://github.com/doov-io/doov) | Provides fluent API for typesafe domain model validation and mapping. | ![](https://img.shields.io/github/stars/doov-io/doov?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/doov-io/doov?style=flat-square&label=)
| [JMapper](https://github.com/jmapper-framework/jmapper-core) | Uses byte code manipulation for lightning-fast mapping. Supports annotations and API or XML configuration. | ![](https://img.shields.io/github/stars/jmapper-framework/jmapper-core?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jmapper-framework/jmapper-core?style=flat-square&label=)
| [MapStruct](https://github.com/mapstruct/mapstruct) | Code generator that simplifies mappings between different bean types, based on a convention-over-configuration approach. | ![](https://img.shields.io/github/stars/mapstruct/mapstruct?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mapstruct/mapstruct?style=flat-square&label=)
| [ModelMapper](https://github.com/modelmapper/modelmapper) | Intelligent object mapping library that automatically maps objects to each other. | ![](https://img.shields.io/github/stars/modelmapper/modelmapper?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/modelmapper/modelmapper?style=flat-square&label=)
| [Orika](https://github.com/orika-mapper/orika) | JavaBean-mapping framework that recursively copies (among other capabilities) data from one object to another. | ![](https://img.shields.io/github/stars/orika-mapper/orika?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/orika-mapper/orika?style=flat-square&label=)
| [reMap](https://github.com/remondis-it/remap) | Lambda and method handle-based mapping which requires code and not annotations if objects have different names. | ![](https://img.shields.io/github/stars/remondis-it/remap?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/remondis-it/remap?style=flat-square&label=)
| [Selma](https://github.com/xebia-france/selma) | Annotation processor-based bean mapper. | ![](https://img.shields.io/github/stars/xebia-france/selma?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/xebia-france/selma?style=flat-square&label=)

### Build

_Tools that handle the build cycle and dependencies of an application._

|---|---|---|---|
| [Apache Maven](https://maven.apache.org) | Declarative build and dependency management that favors convention over configuration. | - | - |
| [Bazel](https://bazel.build) | Tool from Google that builds code quickly and reliably. | - | - |
| [Buck2](https://github.com/facebook/buck2) | Encourages the creation of small, reusable modules consisting of code and resources. | ![](https://img.shields.io/github/stars/facebook/buck2?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/facebook/buck2?style=flat-square&label=)
| [Gradle](https://gradle.org) | Incremental builds programmed via Groovy instead of declaring XML. Works well with Maven's dependency management. | - | - |

### Bytecode Manipulation

_Libraries to manipulate bytecode programmatically._

|---|---|---|---|
| [ASM](https://asm.ow2.io) | All-purpose, low-level bytecode manipulation and analysis. | - | - |
| [Byte Buddy](https://bytebuddy.net) | Further simplifies bytecode generation with a fluent API. | - | - |
| [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) | Java 8 Jar & Android APK reverse engineering suite. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/Konloch/bytecode-viewer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Konloch/bytecode-viewer?style=flat-square&label=)
| [Byteman](https://byteman.jboss.org) | Manipulate bytecode at runtime via DSL (rules); mainly for testing/troubleshooting. (LGPL-2.1-or-later) | - | - |
| [cglib](https://github.com/cglib/cglib) | Bytecode generation library. | ![](https://img.shields.io/github/stars/cglib/cglib?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cglib/cglib?style=flat-square&label=)
| [Javassist](https://github.com/jboss-javassist/javassist) | Tries to simplify bytecode editing. | ![](https://img.shields.io/github/stars/jboss-javassist/javassist?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jboss-javassist/javassist?style=flat-square&label=)
| [Maker](https://github.com/cojen/maker) | Provides low level bytecode generation. | ![](https://img.shields.io/github/stars/cojen/maker?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cojen/maker?style=flat-square&label=)
| [Mixin](https://github.com/SpongePowered/Mixin) | Manipulate bytecode at runtime using real Java code. | ![](https://img.shields.io/github/stars/SpongePowered/Mixin?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/SpongePowered/Mixin?style=flat-square&label=)
| [Perses](https://github.com/nicolasmanic/perses) | Dynamically injects failure/latency at the bytecode level according to principles of chaos engineering. | ![](https://img.shields.io/github/stars/nicolasmanic/perses?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/nicolasmanic/perses?style=flat-square&label=)
| [Recaf](https://www.coley.software/Recaf/) | JVM reverse engineering toolkit, essentially an IDE for Java bytecode. | - | - |

### Caching

_Libraries that provide caching facilities._

|---|---|---|---|
| [cache2k](https://cache2k.org) | In-memory high performance caching library. | - | - |
| [Caffeine](https://github.com/ben-manes/caffeine) | High-performance, near-optimal caching library. | ![](https://img.shields.io/github/stars/ben-manes/caffeine?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ben-manes/caffeine?style=flat-square&label=)
| [Ehcache](http://www.ehcache.org) | Distributed general-purpose cache. | - | - |
| [Infinispan](https://infinispan.org) | Highly concurrent key/value datastore used for caching. | - | - |

### CLI

_Libraries for everything related to the CLI._

#### Argument Parsing
_Libraries to assist with parsing command line arguments._

#### Text-Based User Interfaces
_Libraries that provide TUI frameworks, or building blocks related functions._

|---|---|---|---|
| [Airline](https://rvesse.github.io/airline/) | Annotation-based framework for parsing Git-like command-line arguments. | - | - |
| [JCommander](http://jcommander.org) | Command-line argument-parsing framework with custom types and validation via implementing interfaces. | - | - |
| [jbock](https://github.com/jbock-java/jbock) | Reflectionless command line parser. | ![](https://img.shields.io/github/stars/jbock-java/jbock?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jbock-java/jbock?style=flat-square&label=)
| [JLine](https://github.com/jline/jline3) | Includes features from modern shells like completion or history. | ![](https://img.shields.io/github/stars/jline/jline3?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jline/jline3?style=flat-square&label=)
| [picocli](https://picocli.info) | ANSI colors and styles in usage help with annotation-based POSIX/GNU/any syntax, subcommands, strong typing for both options and positional args. | - | - |
| [Jansi](https://github.com/fusesource/jansi) | ANSI escape codes to format console output. | ![](https://img.shields.io/github/stars/fusesource/jansi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/fusesource/jansi?style=flat-square&label=)
| [Jexer](https://gitlab.com/AutumnMeowMeow/jexer) | Mouse-draggable windows, built-in terminal window manager, and sixel image support. | - | - |
| [Text-IO](https://github.com/beryx/text-io) | Aids the creation of full console-based applications. | ![](https://img.shields.io/github/stars/beryx/text-io?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/beryx/text-io?style=flat-square&label=)
| [Lanterna](https://github.com/mabe02/lanterna) | Easy console text-GUI library, similar to curses. (LGPL-3.0-only) | ![](https://img.shields.io/github/stars/mabe02/lanterna?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mabe02/lanterna?style=flat-square&label=)

### Cloud

_Libraries to integrate or use cloud-specific features._

|---|---|---|---|
| [AWS SDK for Java](https://github.com/aws/aws-sdk-java) | Provides Java APIs for interacting with Amazon Web Services. | ![](https://img.shields.io/github/stars/aws/aws-sdk-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/aws/aws-sdk-java?style=flat-square&label=)
| [Google Cloud Client Libraries](https://github.com/googleapis/google-cloud-java) | Client libraries for accessing Google Cloud services from Java applications. | ![](https://img.shields.io/github/stars/googleapis/google-cloud-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/googleapis/google-cloud-java?style=flat-square&label=)

### Code Analysis

_Tools that provide metrics and quality measurements._

|---|---|---|---|
| [Checkstyle](https://github.com/checkstyle/checkstyle) | Static analysis of coding conventions and standards. (LGPL-2.1-or-later) | ![](https://img.shields.io/github/stars/checkstyle/checkstyle?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/checkstyle/checkstyle?style=flat-square&label=)
| [Error Prone](https://github.com/google/error-prone) | Catches common programming mistakes as compile-time errors. | ![](https://img.shields.io/github/stars/google/error-prone?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/error-prone?style=flat-square&label=)
| [Error Prone Support](https://github.com/PicnicSupermarket/error-prone-support) | Error Prone extensions: extra bug checkers and a large battery of Refaster templates. | ![](https://img.shields.io/github/stars/PicnicSupermarket/error-prone-support?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/PicnicSupermarket/error-prone-support?style=flat-square&label=)
| [Infer](https://github.com/facebook/infer) | Modern static analysis tool for verifying the correctness of code. | ![](https://img.shields.io/github/stars/facebook/infer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/facebook/infer?style=flat-square&label=)
| [jQAssistant](https://jqassistant.org) | Static code analysis with Neo4J-based query language. (GPL-3.0-only) | - | - |
| [NullAway](https://github.com/uber/NullAway) | Eliminates NullPointerExceptions with low build-time overhead. | ![](https://img.shields.io/github/stars/uber/NullAway?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/uber/NullAway?style=flat-square&label=)
| [PMD](https://github.com/pmd/pmd) | Source code analysis for finding bad coding practices. | ![](https://img.shields.io/github/stars/pmd/pmd?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/pmd/pmd?style=flat-square&label=)
| [p3c](https://github.com/alibaba/p3c) | Provides Alibaba's coding guidelines for PMD, IDEA and Eclipse. | ![](https://img.shields.io/github/stars/alibaba/p3c?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/alibaba/p3c?style=flat-square&label=)
| [RefactorFirst](https://github.com/jimbethancourt/RefactorFirst) | Identifies and prioritizes God Classes and Highly Coupled classes. | ![](https://img.shields.io/github/stars/jimbethancourt/RefactorFirst?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jimbethancourt/RefactorFirst?style=flat-square&label=)
| [SonarJava](https://github.com/SonarSource/sonar-java) | Static analyzer for SonarQube & SonarLint. (LGPL-3.0-only) | ![](https://img.shields.io/github/stars/SonarSource/sonar-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/SonarSource/sonar-java?style=flat-square&label=)
| [Spoon](https://github.com/INRIA/spoon) | Library for analyzing and transforming Java source code. | ![](https://img.shields.io/github/stars/INRIA/spoon?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/INRIA/spoon?style=flat-square&label=)
| [Spotbugs](https://github.com/spotbugs/spotbugs) | Static analysis of bytecode to find potential bugs. (LGPL-2.1-only) | ![](https://img.shields.io/github/stars/spotbugs/spotbugs?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/spotbugs/spotbugs?style=flat-square&label=)

### Code Coverage

_Frameworks and tools that enable code coverage metrics collection for test suites._

|---|---|---|---|
| [Clover](https://www.atlassian.com/software/clover) | Relies on source-code instrumentation instead of bytecode instrumentation. | - | - |
| [Cobertura](https://cobertura.github.io/cobertura/) | Relies on offline (or static) bytecode instrumentation and class loading to collect code coverage metrics. (GPL-2.0-only) | - | - |
| [JaCoCo](https://www.eclemma.org/jacoco/) | Framework that enables collection of code coverage metrics, using both offline and runtime bytecode instrumentation. | - | - |

### Code Generators

_Tools that generate patterns for repetitive code in order to reduce verbosity and error-proneness._

|---|---|---|---|
| [ADT4J](https://github.com/sviperll/adt4j) | JSR-269 code generator for algebraic data types. | ![](https://img.shields.io/github/stars/sviperll/adt4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/sviperll/adt4j?style=flat-square&label=)
| [Auto](https://github.com/google/auto) | Generates factory, service, and value classes. | ![](https://img.shields.io/github/stars/google/auto?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/auto?style=flat-square&label=)
| [Avaje Http Server](https://avaje.io/http/) | Generates Lightweight JAX-RS style http servers using Javalin or Helidon (Nima) SE. | - | - |
| [EasyEntityToDTO](https://github.com/Marcel091004/EasyEntityToDTO) | Annotation processor for automatic DTO and Mapper generation with zero boilerplate. | ![](https://img.shields.io/github/stars/Marcel091004/EasyEntityToDTO?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Marcel091004/EasyEntityToDTO?style=flat-square&label=)
| [FreeBuilder](https://github.com/inferred/FreeBuilder) | Automatically generates the Builder pattern. | ![](https://img.shields.io/github/stars/inferred/FreeBuilder?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/inferred/FreeBuilder?style=flat-square&label=)
| [Geci](https://github.com/verhas/javageci) | Discovers files that need generated code, updates automatically and writes to the source with a convenient API. | ![](https://img.shields.io/github/stars/verhas/javageci?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/verhas/javageci?style=flat-square&label=)
| [Immutables](https://immutables.github.io) | Annotation processors to generate simple, safe and consistent value objects. | - | - |
| [JavaPoet](https://github.com/square/javapoet) | API to generate source files. | ![](https://img.shields.io/github/stars/square/javapoet?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/square/javapoet?style=flat-square&label=)
| [JHipster](https://github.com/jhipster/generator-jhipster) | Yeoman source code generator for Spring Boot and AngularJS. | ![](https://img.shields.io/github/stars/jhipster/generator-jhipster?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jhipster/generator-jhipster?style=flat-square&label=)
| [Joda-Beans](https://www.joda.org/joda-beans/) | Small framework that adds queryable properties to Java, enhancing JavaBeans. | - | - |
| [JSpecify Package-Info Generator](https://github.com/bcaillard/jspecify-packageinfo-generator) | Maven plugin that automatically generates package-info.java files with JSpecify annotations. | ![](https://img.shields.io/github/stars/bcaillard/jspecify-packageinfo-generator?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bcaillard/jspecify-packageinfo-generator?style=flat-square&label=)
| [Lombok](https://projectlombok.org) | Code generator that aims to reduce verbosity. | - | - |
| [Record-Builder](https://github.com/Randgalt/record-builder) | Companion builder class, withers and templates for Java records. | ![](https://img.shields.io/github/stars/Randgalt/record-builder?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Randgalt/record-builder?style=flat-square&label=)
| [Telosys](https://www.telosys.org/) | Simple and light code generator available as an Eclipse Plugin and also as a CLI. | - | - |

### Compiler-compiler

_Frameworks that help to create parsers, interpreters or compilers._

|---|---|---|---|
| [ANTLR](https://www.antlr.org) | Complex full-featured framework for top-down parsing. | - | - |
| [JavaCC](https://javacc.github.io/javacc/) | Parser generator that generates top-down parsers. Allows lexical state switching and permits extended BNF specifications. | - | - |
| [JFlex](https://jflex.de) | Lexical analyzer generator. | - | - |

### Computer Vision

_Libraries which seek to gain high level information from images and videos._

|---|---|---|---|
| [BoofCV](https://boofcv.org) | Library for image processing, camera calibration, tracking, SFM, MVS, 3D vision, QR Code and much more. | - | - |
| [ImageJ](https://imagej.net/ImageJ) | Medical image processing application with an API. | - | - |
| [JavaCV](https://github.com/bytedeco/javacv) | Java interface to OpenCV, FFmpeg, and much more. | ![](https://img.shields.io/github/stars/bytedeco/javacv?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bytedeco/javacv?style=flat-square&label=)

### Configuration

_Libraries that provide external configuration._

|---|---|---|---|
| [avaje config](https://avaje.io/config/) | Loads yaml and properties files, supports dynamic configuration, plugins, file-watching and config event listeners. | - | - |
| [centraldogma](https://github.com/line/centraldogma) | Highly-available version-controlled service configuration repository based on Git, ZooKeeper and HTTP/2. | ![](https://img.shields.io/github/stars/line/centraldogma?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/line/centraldogma?style=flat-square&label=)
| [config](https://github.com/lightbend/config) | Configuration library supporting Java properties, JSON or its human optimized superset HOCON. | ![](https://img.shields.io/github/stars/lightbend/config?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lightbend/config?style=flat-square&label=)
| [Configurate](https://github.com/SpongePowered/Configurate) | Configuration library with support for various configuration formats and transformations. | ![](https://img.shields.io/github/stars/SpongePowered/Configurate?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/SpongePowered/Configurate?style=flat-square&label=)
| [Curator Framework](https://curator.apache.org/) | High-level API for Apache ZooKeeper. | - | - |
| [dotenv](https://github.com/shyiko/dotenv) | Twelve-factor configuration library which uses environment-specific files. | ![](https://img.shields.io/github/stars/shyiko/dotenv?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/shyiko/dotenv?style=flat-square&label=)
| [Externalized Properties](https://github.com/joel-jeremy/externalized-properties) | Supports resolution of properties from external sources and an extensible post-processing/conversion mechanism. | ![](https://img.shields.io/github/stars/joel-jeremy/externalized-properties?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/joel-jeremy/externalized-properties?style=flat-square&label=)
| [Gestalt](https://github.com/gestalt-config/gestalt) | Allows you to source configuration data from multiple inputs, merge them intelligently, and present them in a structured, type-safe manner. | ![](https://img.shields.io/github/stars/gestalt-config/gestalt?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/gestalt-config/gestalt?style=flat-square&label=)
| [ini4j](http://ini4j.sourceforge.net) | Provides an API for handling Windows' INI files. | - | - |
| [KAConf](https://github.com/mariomac/kaconf) | Annotation-based configuration system for Java and Kotlin. | ![](https://img.shields.io/github/stars/mariomac/kaconf?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mariomac/kaconf?style=flat-square&label=)
| [microconfig](https://microconfig.io) | Configuration system designed for microservices which helps to separate configuration from code. The configuration for different services can have common and specific parts and can be dynamically distributed. | - | - |
| [owner](https://github.com/lviggiano/owner) | Reduces boilerplate of properties. | ![](https://img.shields.io/github/stars/lviggiano/owner?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lviggiano/owner?style=flat-square&label=)

### Constraint Satisfaction Problem Solver

_Libraries that help with implementing optimization and satisfiability problems._

|---|---|---|---|
| [Choco](https://choco-solver.org) | Off-the-shelf constraint satisfaction problem solver that uses constraint programming techniques. | - | - |
| [JaCoP](https://github.com/radsz/jacop) | Includes an interface for the FlatZinc language, enabling it to execute MiniZinc models. (AGPL-3.0) | ![](https://img.shields.io/github/stars/radsz/jacop?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/radsz/jacop?style=flat-square&label=)
| [OptaPlanner](https://www.optaplanner.org) | Business planning and resource scheduling optimization solver. | - | - |
| [Timefold](https://timefold.ai/docs) | Flexible solver with Spring/Quarkus support and quickstarts for the Vehicle Routing Problem, Maintenance Scheduling, Employee Shift Scheduling and much more. | - | - |

### CSV

_Frameworks and libraries that simplify reading/writing CSV data._

|---|---|---|---|
| [FastCSV](https://github.com/osiegmar/FastCSV) | Performance-optimized, dependency-free and RFC 4180 compliant. | ![](https://img.shields.io/github/stars/osiegmar/FastCSV?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/osiegmar/FastCSV?style=flat-square&label=)
| [jackson-dataformat-csv](https://github.com/FasterXML/jackson-dataformat-csv) | Jackson extension for reading and writing CSV. | ![](https://img.shields.io/github/stars/FasterXML/jackson-dataformat-csv?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/FasterXML/jackson-dataformat-csv?style=flat-square&label=)
| [opencsv](http://opencsv.sourceforge.net) | Simple CSV parser. | - | - |
| [Super CSV](https://super-csv.github.io/super-csv/) | Powerful CSV parser with support for Dozer, Joda-Time and Java 8. | - | - |
| [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) | One of the fastest and most feature-complete parsers. Also comes with parsers for TSV and fixed-width records. | ![](https://img.shields.io/github/stars/uniVocity/univocity-parsers?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/uniVocity/univocity-parsers?style=flat-square&label=)

### Data Structures

_Efficient and specific data structures._

|---|---|---|---|
| [Apache Avro](https://avro.apache.org) | Data interchange format with dynamic typing, untagged data, and absence of manually assigned IDs. | - | - |
| [Apache Orc](https://orc.apache.org) | Fast and efficient columnar storage format for Hadoop-based workloads. | - | - |
| [Apache Parquet](https://parquet.apache.org) | Columnar storage format based on assembly algorithms from Google's paper on Dremel. | - | - |
| [Apache Thrift](https://thrift.apache.org) | Data interchange format that originated at Facebook. | - | - |
| [Big Queue](https://github.com/bulldog2011/bigqueue) | Fast and persistent queue based on memory-mapped files. | ![](https://img.shields.io/github/stars/bulldog2011/bigqueue?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bulldog2011/bigqueue?style=flat-square&label=)
| [HyperMinHash-java](https://github.com/LiveRamp/HyperMinHash-java) | Probabilistic data structure for computing union, intersection, and set cardinality in loglog space. | ![](https://img.shields.io/github/stars/LiveRamp/HyperMinHash-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/LiveRamp/HyperMinHash-java?style=flat-square&label=)
| [Persistent Collection](https://github.com/hrldcpr/pcollections) | Persistent and immutable analogue of the Java Collections Framework. | ![](https://img.shields.io/github/stars/hrldcpr/pcollections?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/hrldcpr/pcollections?style=flat-square&label=)
| [Protobuf](https://github.com/protocolbuffers/protobuf) | Google's data interchange format. | ![](https://img.shields.io/github/stars/protocolbuffers/protobuf?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/protocolbuffers/protobuf?style=flat-square&label=)
| [RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) | Fast and efficient compressed bitmap. | ![](https://img.shields.io/github/stars/RoaringBitmap/RoaringBitmap?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/RoaringBitmap/RoaringBitmap?style=flat-square&label=)
| [SBE](https://github.com/real-logic/simple-binary-encoding) | Simple Binary Encoding, one of the fastest message formats around. | ![](https://img.shields.io/github/stars/real-logic/simple-binary-encoding?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/real-logic/simple-binary-encoding?style=flat-square&label=)
| [Tape](https://github.com/square/tape) | Lightning-fast, transactional, file-based FIFO. | ![](https://img.shields.io/github/stars/square/tape?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/square/tape?style=flat-square&label=)
| [Wire](https://github.com/square/wire) | Clean, lightweight protocol buffers. | ![](https://img.shields.io/github/stars/square/wire?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/square/wire?style=flat-square&label=)

### Database

_Everything that simplifies interactions with the database._

|---|---|---|---|
| [Apache Calcite](https://calcite.apache.org) | Dynamic data management framework. It contains many of the pieces that comprise a typical database management system. | - | - |
| [Apache Drill](https://drill.apache.org) | Distributed, schema on-the-fly, ANSI SQL query engine for Big Data exploration. | - | - |
| [Apache Phoenix](https://phoenix.apache.org) | High-performance relational database layer over HBase for low-latency applications. | - | - |
| [ArangoDB](https://github.com/arangodb/arangodb-java-driver) | ArangoDB Java driver. | ![](https://img.shields.io/github/stars/arangodb/arangodb-java-driver?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/arangodb/arangodb-java-driver?style=flat-square&label=)
| [Chronicle Map](https://github.com/OpenHFT/Chronicle-Map) | Efficient, in-memory (opt. persisted to disk), off-heap key-value store. | ![](https://img.shields.io/github/stars/OpenHFT/Chronicle-Map?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OpenHFT/Chronicle-Map?style=flat-square&label=)
| [Debezium](https://debezium.io/) | Low latency data streaming platform for change data capture. | - | - |
| [druid](https://druid.apache.org) | High-performance, column-oriented, distributed data store. | - | - |
| [eXist](https://github.com/eXist-db/exist) | NoSQL document database and application platform. (LGPL-2.1-only) | ![](https://img.shields.io/github/stars/eXist-db/exist?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/eXist-db/exist?style=flat-square&label=)
| [FlexyPool](https://github.com/vladmihalcea/flexy-pool) | Brings metrics and failover strategies to the most common connection pooling solutions. | ![](https://img.shields.io/github/stars/vladmihalcea/flexy-pool?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vladmihalcea/flexy-pool?style=flat-square&label=)
| [Flyway](https://flywaydb.org) | Simple database migration tool. | - | - |
| [H2](https://h2database.com) | Small SQL database notable for its in-memory functionality. | - | - |
| [HikariCP](https://github.com/brettwooldridge/HikariCP) | High-performance JDBC connection pool. | ![](https://img.shields.io/github/stars/brettwooldridge/HikariCP?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/brettwooldridge/HikariCP?style=flat-square&label=)
| [HSQLDB](https://hsqldb.org/) | HyperSQL 100% Java database. | - | - |
| [JDBI](http://jdbi.org) | Convenient abstraction of JDBC. | - | - |
| [Jedis](https://github.com/xetorthio/jedis) | Small client for interaction with Redis, with methods for commands. | ![](https://img.shields.io/github/stars/xetorthio/jedis?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/xetorthio/jedis?style=flat-square&label=)
| [Jest](https://github.com/searchbox-io/Jest) | Client for the Elasticsearch REST API. | ![](https://img.shields.io/github/stars/searchbox-io/Jest?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/searchbox-io/Jest?style=flat-square&label=)
| [jetcd](https://github.com/justinsb/jetcd) | Client library for etcd. | ![](https://img.shields.io/github/stars/justinsb/jetcd?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/justinsb/jetcd?style=flat-square&label=)
| [Jinq](https://github.com/my2iu/Jinq) | Typesafe database queries via symbolic execution of Java 8 Lambdas (on top of JPA or jOOQ). | ![](https://img.shields.io/github/stars/my2iu/Jinq?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/my2iu/Jinq?style=flat-square&label=)
| [jOOQ](https://www.jooq.org) | Generates typesafe code based on SQL schema. | - | - |
| [Leaf](https://github.com/Meituan-Dianping/Leaf) | Distributed ID generate service. | ![](https://img.shields.io/github/stars/Meituan-Dianping/Leaf?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Meituan-Dianping/Leaf?style=flat-square&label=)
| [Lettuce](https://lettuce.io/) | Lettuce is a scalable Redis client for building non-blocking Reactive applications. | - | - |
| [Liquibase](http://www.liquibase.org) | Database-independent library for tracking, managing and applying database schema changes. | - | - |
| [MapDB](http://www.mapdb.org) | Embedded database engine that provides concurrent collections backed on disk or in off-heap memory. | - | - |
| [MariaDB4j](https://github.com/vorburger/MariaDB4j) | Launcher for MariaDB that requires no installation or external dependencies. | ![](https://img.shields.io/github/stars/vorburger/MariaDB4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vorburger/MariaDB4j?style=flat-square&label=)
| [Modality](https://github.com/arkanovicz/modality) | Lightweight ORM with database reverse engineering features. | ![](https://img.shields.io/github/stars/arkanovicz/modality?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/arkanovicz/modality?style=flat-square&label=)
| [OpenDJ](https://github.com/OpenIdentityPlatform/OpenDJ) | LDAPv3 compliant directory service, developed for the Java platform, providing a high performance, highly available, and secure store for the identities. | ![](https://img.shields.io/github/stars/OpenIdentityPlatform/OpenDJ?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OpenIdentityPlatform/OpenDJ?style=flat-square&label=)
| [Querydsl](http://www.querydsl.com) | Typesafe unified queries. | - | - |
| [QueryStream](https://github.com/querystream/querystream) | Build JPA Criteria queries using a Stream-like API. | ![](https://img.shields.io/github/stars/querystream/querystream?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/querystream/querystream?style=flat-square&label=)
| [QuestDB](https://github.com/questdb/questdb) | High-performance SQL database for time series. Supports InfluxDB line protocol, PostgreSQL wire protocol, and REST. | ![](https://img.shields.io/github/stars/questdb/questdb?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/questdb/questdb?style=flat-square&label=)
| [Realm](https://github.com/realm/realm-java) | Mobile database to run directly inside phones, tablets or wearables. | ![](https://img.shields.io/github/stars/realm/realm-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/realm/realm-java?style=flat-square&label=)
| [Redisson](https://github.com/redisson/redisson) | Allows for distributed and scalable data structures on top of a Redis server. | ![](https://img.shields.io/github/stars/redisson/redisson?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/redisson/redisson?style=flat-square&label=)
| [requery](https://github.com/requery/requery) | Modern, lightweight but powerful object mapping and SQL generator. Easily map to or create databases, or perform queries and updates from any Java-using platform. | ![](https://img.shields.io/github/stars/requery/requery?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/requery/requery?style=flat-square&label=)
| [Speedment](https://github.com/speedment/speedment) | Database access library that utilizes Java 8's Stream API for querying. | ![](https://img.shields.io/github/stars/speedment/speedment?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/speedment/speedment?style=flat-square&label=)
| [Spring Data JPA MongoDB Expressions](https://github.com/mhewedy/spring-data-jpa-mongodb-expressions) | Allows you to use MongoDB query language to query your relational database. | ![](https://img.shields.io/github/stars/mhewedy/spring-data-jpa-mongodb-expressions?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mhewedy/spring-data-jpa-mongodb-expressions?style=flat-square&label=)
| [Trino](https://trino.io) | Distributed SQL query engine for big data. | - | - |
| [Vibur DBCP](https://www.vibur.org) | JDBC connection pool library with advanced performance monitoring capabilities. | - | - |
| [Xodus](https://github.com/JetBrains/xodus) | Highly concurrent transactional schema-less and ACID-compliant embedded database. | ![](https://img.shields.io/github/stars/JetBrains/xodus?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/JetBrains/xodus?style=flat-square&label=)
| [CosId](https://github.com/Ahoo-Wang/CosId) | Universal, flexible, high-performance distributed ID generator. | ![](https://img.shields.io/github/stars/Ahoo-Wang/CosId?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Ahoo-Wang/CosId?style=flat-square&label=)

### Date and Time

_Libraries related to handling date and time._

|---|---|---|---|
| [iCal4j](https://github.com/ical4j/ical4j) | Parse and build iCalendar [RFC 5545](https://tools.ietf.org/html/rfc5545) data models. | ![](https://img.shields.io/github/stars/ical4j/ical4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ical4j/ical4j?style=flat-square&label=)
| [Jollyday](https://github.com/svendiedrichsen/jollyday) | Determines the holidays for a given year, country/name and eventually state/region. | ![](https://img.shields.io/github/stars/svendiedrichsen/jollyday?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/svendiedrichsen/jollyday?style=flat-square&label=)
| [ThreeTen-Extra](https://github.com/ThreeTen/threeten-extra) | Additional date-time classes that complement those in JDK 8. | ![](https://img.shields.io/github/stars/ThreeTen/threeten-extra?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ThreeTen/threeten-extra?style=flat-square&label=)
| [Time4J](https://github.com/MenoData/Time4J) | Advanced date and time library. (LGPL-2.1-only) | ![](https://img.shields.io/github/stars/MenoData/Time4J?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/MenoData/Time4J?style=flat-square&label=)

### Decentralization

_Libraries that handle decentralization tasks._

### Dependency Injection

_Libraries that help to realize the [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control) paradigm._

|---|---|---|---|
| [Apache DeltaSpike](https://deltaspike.apache.org) | CDI extension framework. | - | - |
| [Avaje Inject](https://avaje.io/inject/) | Microservice-focused compile-time injection framework without reflection. | - | - |
| [Dagger](https://dagger.dev/) | Compile-time injection framework without reflection. | - | - |
| [Feather](https://github.com/zsoltherpai/feather) | Ultra-lightweight, JSR-330-compliant dependency injection library. | ![](https://img.shields.io/github/stars/zsoltherpai/feather?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zsoltherpai/feather?style=flat-square&label=)
| [Governator](https://github.com/Netflix/governator) | Extensions and utilities that enhance Google Guice. | ![](https://img.shields.io/github/stars/Netflix/governator?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Netflix/governator?style=flat-square&label=)
| [Guice](https://github.com/google/guice) | Lightweight and opinionated framework that completes Dagger. | ![](https://img.shields.io/github/stars/google/guice?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/guice?style=flat-square&label=)
| [HK2](https://eclipse-ee4j.github.io/glassfish-hk2/) | Lightweight and dynamic dependency injection framework. | - | - |
| [JayWire](https://github.com/vanillasource/jaywire) | Lightweight dependency injection framework. (LGPL-3.0-only) | ![](https://img.shields.io/github/stars/vanillasource/jaywire?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vanillasource/jaywire?style=flat-square&label=)

### Development

_Augmentation of the development process at a fundamental level._

|---|---|---|---|
| [AspectJ](https://www.eclipse.org/aspectj/) | Seamless aspect-oriented programming extension. | - | - |
| [DCEVM](https://dcevm.github.io) | JVM modification that allows unlimited redefinition of loaded classes at runtime. (GPL-2.0-only) | - | - |
| [Faux Pas](https://github.com/zalando/faux-pas) | Library that simplifies error handling by circumventing the issue that none of the functional interfaces in the Java Runtime is allowed by default to throw checked exceptions. | ![](https://img.shields.io/github/stars/zalando/faux-pas?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/faux-pas?style=flat-square&label=)
| [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) | Unlimited runtime class and resource redefinition. (GPL-2.0-only) | ![](https://img.shields.io/github/stars/HotswapProjects/HotswapAgent?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/HotswapProjects/HotswapAgent?style=flat-square&label=)
| [JavaParser](https://github.com/javaparser/javaparser) | Parse, modify and generate Java code. | ![](https://img.shields.io/github/stars/javaparser/javaparser?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/javaparser/javaparser?style=flat-square&label=)
| [JavaSymbolSolver](https://github.com/javaparser/javasymbolsolver) | Symbol solver. | ![](https://img.shields.io/github/stars/javaparser/javasymbolsolver?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/javaparser/javasymbolsolver?style=flat-square&label=)
| [Manifold](https://github.com/manifold-systems/manifold) | Re-energizes Java with powerful features like type-safe metaprogramming, structural typing and extension methods. | ![](https://img.shields.io/github/stars/manifold-systems/manifold?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/manifold-systems/manifold?style=flat-square&label=)
| [NoException](https://noexception.machinezoo.com) | Allows checked exceptions in functional interfaces and converts exceptions to Optional return. | - | - |
| [SneakyThrow](https://github.com/rainerhahnekamp/sneakythrow) | Ignores checked exceptions without bytecode manipulation. Can also be used inside Java 8 stream operations. | ![](https://img.shields.io/github/stars/rainerhahnekamp/sneakythrow?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/rainerhahnekamp/sneakythrow?style=flat-square&label=)
| [Tail](https://nrktkt.github.io/tail/) | Enable infinite recursion using tail call optimization. | - | - |

### Distributed Applications

_Libraries and frameworks for writing distributed and fault-tolerant applications._

|---|---|---|---|
| [Apache Geode](https://geode.apache.org) | In-memory data management system that provides reliable asynchronous event notifications and guaranteed message delivery. | - | - |
| [Apache Storm](https://storm.apache.org) | Realtime computation system. | - | - |
| [Apache ZooKeeper](https://zookeeper.apache.org) | Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems. | - | - |
| [Atomix](https://atomix.io) | Fault-tolerant distributed coordination framework. | - | - |
| [Axon](https://axoniq.io) | Framework for creating CQRS applications. | - | - |
| [Dropwizard Circuit Breaker](https://github.com/mtakaki/dropwizard-circuitbreaker) | Circuit breaker design pattern for Dropwizard. (GPL-2.0-only) | ![](https://img.shields.io/github/stars/mtakaki/dropwizard-circuitbreaker?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mtakaki/dropwizard-circuitbreaker?style=flat-square&label=)
| [Failsafe](https://github.com/jhalterman/failsafe) | Simple failure handling with retries and circuit breakers. | ![](https://img.shields.io/github/stars/jhalterman/failsafe?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jhalterman/failsafe?style=flat-square&label=)
| [Hazelcast](https://github.com/hazelcast/hazelcast) | Highly scalable in-memory datagrid with a free open-source version. | ![](https://img.shields.io/github/stars/hazelcast/hazelcast?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/hazelcast/hazelcast?style=flat-square&label=)
| [JGroups](http://www.jgroups.org) | Toolkit for reliable messaging and cluster creation. | - | - |
| [Quasar](http://docs.paralleluniverse.co/quasar/) | Lightweight threads and actors for the JVM. | - | - |
| [resilience4j](https://github.com/resilience4j/resilience4j) | Functional fault tolerance library. | ![](https://img.shields.io/github/stars/resilience4j/resilience4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/resilience4j/resilience4j?style=flat-square&label=)
| [OpenIG](https://github.com/OpenIdentityPlatform/OpenIG) | High-performance reverse proxy server with specialized session management and credential replay functionality. | ![](https://img.shields.io/github/stars/OpenIdentityPlatform/OpenIG?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OpenIdentityPlatform/OpenIG?style=flat-square&label=)
| [ScaleCube Services](https://github.com/scalecube/scalecube-services) | Embeddable Cluster-Membership library based on SWIM and gossip protocol. | ![](https://img.shields.io/github/stars/scalecube/scalecube-services?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/scalecube/scalecube-services?style=flat-square&label=)
| [Zuul](https://github.com/Netflix/zuul) | Gateway service that provides dynamic routing, monitoring, resiliency, security, and more. | ![](https://img.shields.io/github/stars/Netflix/zuul?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Netflix/zuul?style=flat-square&label=)

### Distributed Transactions

_Distributed transactions provide a mechanism for ensuring consistency of data updates in the presence of concurrent access and partial failures._

|---|---|---|---|
| [Atomikos](https://www.atomikos.com) | Provides transactions for REST, SOA and microservices with support for JTA and XA. | - | - |
| [Bitronix](https://github.com/bitronix/btm) | Simple but complete implementation of the JTA 1.1 API. | ![](https://img.shields.io/github/stars/bitronix/btm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bitronix/btm?style=flat-square&label=)
| [Narayana](https://narayana.io) | Provides support for traditional ACID and compensation transactions, also complies with JTA, JTS and other standards. (LGPL-2.1-only) | - | - |
| [Seata](https://github.com/seata/seata) | Delivers high performance and easy to use distributed transaction services under a microservices architecture. | ![](https://img.shields.io/github/stars/seata/seata?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/seata/seata?style=flat-square&label=)

### Distribution

_Tools that handle the distribution of applications in native formats._

|---|---|---|---|
| [Artipie](https://github.com/artipie/artipie) | Binary artifact management toolkit which hosts them on the file system or S3. | ![](https://img.shields.io/github/stars/artipie/artipie?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/artipie/artipie?style=flat-square&label=)
| [Capsule](https://github.com/puniverse/capsule) | Simple and powerful packaging and deployment. A fat JAR on steroids, or a "Docker for Java" that supports JVM-optimized containers. | ![](https://img.shields.io/github/stars/puniverse/capsule?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/puniverse/capsule?style=flat-square&label=)
| [Central Repository](https://search.maven.org) | Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven, and available in all other build tools. | - | - |
| [Getdown](https://github.com/threerings/getdown) | System for deploying Java applications to end-user computers and keeping them up to date. Developed as an alternative to Java Web Start. | ![](https://img.shields.io/github/stars/threerings/getdown?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/threerings/getdown?style=flat-square&label=)
| [IzPack](http://izpack.org) | Setup authoring tool for cross-platform deployments. | - | - |
| [JavaPackager](https://github.com/fvarrui/JavaPackager) | Maven and Gradle plugin which provides an easy way to package Java applications in native Windows, macOS or GNU/Linux executables, and generate installers for them. | ![](https://img.shields.io/github/stars/fvarrui/JavaPackager?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/fvarrui/JavaPackager?style=flat-square&label=)
| [jDeploy](https://www.jdeploy.com) | Deploy desktop apps as native Mac, Windows or Linux bundles. | - | - |
| [jlink.online](https://github.com/AdoptOpenJDK/jlink.online) | Builds optimized runtimes over HTTP. | ![](https://img.shields.io/github/stars/AdoptOpenJDK/jlink.online?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/AdoptOpenJDK/jlink.online?style=flat-square&label=)
| [packr](https://github.com/libgdx/packr) | Packs JARs, assets and the JVM for native distribution on Windows, Linux and macOS. | ![](https://img.shields.io/github/stars/libgdx/packr?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/libgdx/packr?style=flat-square&label=)
| [really-executable-jars-maven-plugin](https://github.com/brianm/really-executable-jars-maven-plugin) | Maven plugin for making self-executing JARs. | ![](https://img.shields.io/github/stars/brianm/really-executable-jars-maven-plugin?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/brianm/really-executable-jars-maven-plugin?style=flat-square&label=)

### Document Processing

_Libraries that assist with processing office document formats._

|---|---|---|---|
| [Apache POI](https://poi.apache.org) | Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT). | - | - |
| [documents4j](https://documents4j.com/#/) | API for document format conversion using third-party converters such as MS Word. | - | - |
| [docx4j](https://www.docx4java.org/trac/docx4j) | Create and manipulate Microsoft Open XML files. | - | - |
| [fastexcel](https://github.com/dhatim/fastexcel) | High performance library to read and write large Excel (XLSX) worksheets. | ![](https://img.shields.io/github/stars/dhatim/fastexcel?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dhatim/fastexcel?style=flat-square&label=)
| [zerocell](https://github.com/creditdatamw/zerocell) | Annotation-based API for reading data from Excel sheets into POJOs with focus on reduced overhead. | ![](https://img.shields.io/github/stars/creditdatamw/zerocell?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/creditdatamw/zerocell?style=flat-square&label=)

### Financial

_Libraries related to the financial domain._

|---|---|---|---|
| [Cassandre](https://github.com/cassandre-tech/cassandre-trading-bot) | Trading bot framework. | ![](https://img.shields.io/github/stars/cassandre-tech/cassandre-trading-bot?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cassandre-tech/cassandre-trading-bot?style=flat-square&label=)
| [Parity](https://github.com/paritytrading/parity) | Platform for trading venues. | ![](https://img.shields.io/github/stars/paritytrading/parity?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/paritytrading/parity?style=flat-square&label=)
| [Philadelphia](https://github.com/paritytrading/philadelphia) | Low-latency financial information exchange. | ![](https://img.shields.io/github/stars/paritytrading/philadelphia?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/paritytrading/philadelphia?style=flat-square&label=)
| [Square](https://github.com/square/connect-java-sdk) | Integration with the Square API. | ![](https://img.shields.io/github/stars/square/connect-java-sdk?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/square/connect-java-sdk?style=flat-square&label=)
| [Stripe](https://github.com/stripe/stripe-java) | Integration with the Stripe API. | ![](https://img.shields.io/github/stars/stripe/stripe-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/stripe/stripe-java?style=flat-square&label=)
| [ta4j](https://github.com/ta4j/ta4j) | Library for technical analysis. | ![](https://img.shields.io/github/stars/ta4j/ta4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ta4j/ta4j?style=flat-square&label=)

### Formal Verification

_Formal-methods tools: proof assistants, model checking, symbolic execution, etc._

|---|---|---|---|
| [CATG](https://github.com/ksen007/janala2) | Concolic unit testing engine. Automatically generates unit tests using formal methods. | ![](https://img.shields.io/github/stars/ksen007/janala2?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ksen007/janala2?style=flat-square&label=)
| [Checker Framework](https://checkerframework.org) | Pluggable type systems. Includes nullness types, physical units, immutability types and more. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Daikon](https://plse.cs.washington.edu/daikon/) | Detects likely program invariants and generates JML specs based on those invariants. | - | - |
| [Java Path Finder (JPF)](https://github.com/javapathfinder/jpf-core) | JVM formal verification tool containing a model checker and more. Created by NASA. | ![](https://img.shields.io/github/stars/javapathfinder/jpf-core?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/javapathfinder/jpf-core?style=flat-square&label=)
| [JMLOK 2.0](https://massoni.computacao.ufcg.edu.br/home/jmlok) | Detects inconsistencies between code and JML specification through feedback-directed random tests generation, and suggests a likely cause for each nonconformance detected. (GPL-3.0-only) | - | - |
| [KeY](https://www.key-project.org) | Formal software development tool that aims to integrate design, implementation, formal specification, and formal verification of object-oriented software as seamlessly as possible. Uses JML for specification and symbolic execution for verification. (GPL-2.0-or-later) | - | - |
| [OpenJML](http://www.openjml.org) | Translates JML specifications into SMT-LIB format and passes the proof problems implied by the program to backend solvers. (GPL-2.0-only) | - | - |

### Functional Programming

_Libraries that facilitate functional programming._

|---|---|---|---|
| [Cyclops](https://github.com/aol/cyclops) | Monad and stream utilities, comprehensions, pattern matching, functional extensions for all JDK collections, future streams, trampolines and much more. | ![](https://img.shields.io/github/stars/aol/cyclops?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/aol/cyclops?style=flat-square&label=)
| [derive4j](https://github.com/derive4j/derive4j) | Java 8 annotation processor and framework for deriving algebraic data types constructors, pattern-matching and morphisms. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/derive4j/derive4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/derive4j/derive4j?style=flat-square&label=)
| [Fugue](https://bitbucket.org/atlassian/fugue) | Functional extensions to Guava. | - | - |
| [Functional Java](http://www.functionaljava.org) | Implements numerous basic and advanced programming abstractions that assist composition-oriented development. | - | - |
| [jOOλ](https://github.com/jOOQ/jOOL) | Extension to Java 8 that aims to fix gaps in lambda by providing numerous missing types and a rich set of sequential Stream API additions. | ![](https://img.shields.io/github/stars/jOOQ/jOOL?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jOOQ/jOOL?style=flat-square&label=)
| [Packrat](https://github.com/jhspetersson/packrat) | Gatherers library for Java Stream API. Gatherers can enhance streams with custom intermediate operations. | ![](https://img.shields.io/github/stars/jhspetersson/packrat?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jhspetersson/packrat?style=flat-square&label=)
| [protonpack](https://github.com/poetix/protonpack) | Collection of stream utilities. | ![](https://img.shields.io/github/stars/poetix/protonpack?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/poetix/protonpack?style=flat-square&label=)
| [StreamEx](https://github.com/amaembo/streamex) | Enhances Java 8 Streams. | ![](https://img.shields.io/github/stars/amaembo/streamex?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/amaembo/streamex?style=flat-square&label=)
| [Vavr](https://www.vavr.io) | Functional component library that provides persistent data types and functional control structures. | - | - |

### Game Development

_Frameworks that support the development of games._

|---|---|---|---|
| [FXGL](https://almasb.github.io/FXGL/) | JavaFX Game Development Framework. | - | - |
| [JBox2D](http://www.jbox2d.org/) | Port of the renowned C++ 2D physics engine. | - | - |
| [jMonkeyEngine](https://jmonkeyengine.org) | Game engine for modern 3D development. | - | - |
| [libGDX](https://libgdx.com) | All-round cross-platform, high-level framework. | - | - |
| [Litiengine](https://litiengine.com/) | AWT-based, lightweight 2D game engine. | - | - |
| [LWJGL](https://www.lwjgl.org) | Robust framework that abstracts libraries like OpenGL/CL/AL. | - | - |
| [Mini2Dx](https://mini2dx.org) | Beginner-friendly, master-ready framework for rapidly prototyping and building 2D games. | - | - |
| [Void2D](https://github.com/xzripper/Void2D) | High-level 2D game engine with built-in physics based on Swing. | ![](https://img.shields.io/github/stars/xzripper/Void2D?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/xzripper/Void2D?style=flat-square&label=)
| [vulkan4j](https://github.com/chuigda/vulkan4j) | Vulkan, OpenGL ES2 and GLFW Memory Allocator bindings. | ![](https://img.shields.io/github/stars/chuigda/vulkan4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/chuigda/vulkan4j?style=flat-square&label=)

### Geospatial

_Libraries for working with geospatial data and algorithms._

|---|---|---|---|
| [Apache SIS](https://sis.apache.org) | Library for developing geospatial applications. | - | - |
| [Geo](https://github.com/davidmoten/geo) | GeoHash utilities in Java. | ![](https://img.shields.io/github/stars/davidmoten/geo?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/davidmoten/geo?style=flat-square&label=)
| [GeoTools](https://geotools.org) | Library that provides tools for geospatial data. (LGPL-2.1-only) | - | - |
| [GraphHopper](https://github.com/graphhopper/graphhopper) | Road-routing engine. Used as a Java library or standalone web service. | ![](https://img.shields.io/github/stars/graphhopper/graphhopper?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/graphhopper/graphhopper?style=flat-square&label=)
| [H2GIS](http://www.h2gis.org) | Spatial extension of the H2 database. (LGPL-3.0-only) | - | - |
| [Jgeohash](https://astrapi69.github.io/jgeohash/) | Library for using the GeoHash algorithm. | - | - |
| [Mapsforge](https://github.com/mapsforge/mapsforge) | Map rendering based on OpenStreetMap data. (LGPL-3.0-only) | ![](https://img.shields.io/github/stars/mapsforge/mapsforge?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mapsforge/mapsforge?style=flat-square&label=)
| [Spatial4j](https://github.com/locationtech/spatial4j) | General-purpose spatial/geospatial library. | ![](https://img.shields.io/github/stars/locationtech/spatial4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/locationtech/spatial4j?style=flat-square&label=)

### GUI

_Libraries to create modern graphical user interfaces._

|---|---|---|---|
| [JavaFX](https://wiki.openjdk.java.net/display/OpenJFX/Main) | Successor of Swing. | - | - |
| [Scene Builder](https://gluonhq.com/products/scene-builder/) | Visual layout tool for JavaFX applications. | - | - |
| [SnapKit](https://github.com/reportmill/SnapKit) | Modern Java UI library for both desktop and web. | ![](https://img.shields.io/github/stars/reportmill/SnapKit?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/reportmill/SnapKit?style=flat-square&label=)
| [SWT](https://www.eclipse.org/swt/) | Graphical widget toolkit. | - | - |

### High Performance

_Everything about high-performance computation, from collections to specific libraries._

|---|---|---|---|
| [Agrona](https://github.com/real-logic/Agrona) | Data structures and utility methods that are common in high-performance applications. | ![](https://img.shields.io/github/stars/real-logic/Agrona?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/real-logic/Agrona?style=flat-square&label=)
| [Disruptor](https://lmax-exchange.github.io/disruptor/) | Inter-thread messaging library. | - | - |
| [Eclipse Collections](https://github.com/eclipse/eclipse-collections) | Collections framework inspired by Smalltalk. | ![](https://img.shields.io/github/stars/eclipse/eclipse-collections?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/eclipse/eclipse-collections?style=flat-square&label=)
| [fastutil](http://fastutil.di.unimi.it) | Fast and compact type-specific collections. | - | - |
| [HPPC](https://labs.carrotsearch.com/hppc.html) | Primitive collections. | - | - |
| [JCTools](https://github.com/JCTools/JCTools) | Concurrency tools currently missing from the JDK. | ![](https://img.shields.io/github/stars/JCTools/JCTools?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/JCTools/JCTools?style=flat-square&label=)
| [Koloboke](https://github.com/leventov/Koloboke) | Carefully designed extension of the Java Collections Framework with primitive specializations and more. | ![](https://img.shields.io/github/stars/leventov/Koloboke?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/leventov/Koloboke?style=flat-square&label=)

### HTTP Clients

_Libraries that assist with creating HTTP requests and/or binding responses._

|---|---|---|---|
| [Apache HttpComponents](https://hc.apache.org/) | Toolset of low-level Java components focused on HTTP and associated protocols. | - | - |
| [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) | Asynchronous HTTP and WebSocket client library. | ![](https://img.shields.io/github/stars/AsyncHttpClient/async-http-client?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/AsyncHttpClient/async-http-client?style=flat-square&label=)
| [Avaje Http Client](https://avaje.io/http-client) | Wrapper on JDK 11's HttpClient that adds Feign-like interface among other enhancements. | - | - |
| [Feign](https://github.com/OpenFeign/feign) | HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket. | ![](https://img.shields.io/github/stars/OpenFeign/feign?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OpenFeign/feign?style=flat-square&label=)
| [Google HTTP Client](https://github.com/googleapis/google-http-java-client) | Pluggable HTTP transport abstraction with support for java.net.HttpURLConnection, Apache HTTP Client, Android, Google App Engine, XML, Gson, Jackson and Protobuf. | ![](https://img.shields.io/github/stars/googleapis/google-http-java-client?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/googleapis/google-http-java-client?style=flat-square&label=)
| [methanol](https://github.com/mizosoft/methanol) | HTTP client extensions library. | ![](https://img.shields.io/github/stars/mizosoft/methanol?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mizosoft/methanol?style=flat-square&label=)
| [Retrofit](https://square.github.io/retrofit/) | Typesafe REST client. | - | - |
| [Ribbon](https://github.com/Netflix/ribbon) | Client-side IPC library that is battle-tested in the cloud. | ![](https://img.shields.io/github/stars/Netflix/ribbon?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Netflix/ribbon?style=flat-square&label=)
| [Riptide](https://github.com/zalando/riptide) | Client-side response routing for Spring's RestTemplate. | ![](https://img.shields.io/github/stars/zalando/riptide?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/riptide?style=flat-square&label=)
| [unirest-java](https://github.com/Kong/unirest-java) | Simplified, lightweight HTTP client library. | ![](https://img.shields.io/github/stars/Kong/unirest-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Kong/unirest-java?style=flat-square&label=)

### Hypermedia Types

_Libraries that handle serialization to hypermedia types._

|---|---|---|---|
| [hate](https://github.com/blackdoor/hate) | Builds hypermedia-friendly objects according to HAL specification. | ![](https://img.shields.io/github/stars/blackdoor/hate?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/blackdoor/hate?style=flat-square&label=)
| [JSON-LD](https://github.com/jsonld-java/jsonld-java) | JSON-LD implementation. | ![](https://img.shields.io/github/stars/jsonld-java/jsonld-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jsonld-java/jsonld-java?style=flat-square&label=)
| [Siren4J](https://github.com/eserating-chwy/siren4j) | Library for the Siren specification. | ![](https://img.shields.io/github/stars/eserating-chwy/siren4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/eserating-chwy/siren4j?style=flat-square&label=)
| [Spring HATEOAS](https://github.com/spring-projects/spring-hateoas) | Standalone and Spring support for building hypermedia-based APIs using HAL, HAL FORMS, Collection+JSON, ALPS and UBER. | ![](https://img.shields.io/github/stars/spring-projects/spring-hateoas?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/spring-projects/spring-hateoas?style=flat-square&label=)

### IDE

_Integrated development environments that try to simplify several aspects of development._

|---|---|---|---|
| [Eclipse](https://www.eclipse.org) | Established open-source project with support for lots of plugins and languages. | - | - |
| [jGRASP](https://www.jgrasp.org) | Created to provide software visualizations that work in conjunction with the debugger such as Control Structure Diagrams, UML class diagrams and Object Viewer. | - | - |
| [NetBeans](https://netbeans.apache.org) | Provides integration for several Java SE and EE features, from database access to HTML5. | - | - |
| [SnapCode](https://reportmill.com/SnapCode/) | Modern IDE for Java running in the browser, focused on education. | - | - |
| [Visual Studio Code](https://code.visualstudio.com/docs/languages/java) | Provides Java support for lightweight projects with a simple, modern workflow by using extensions from the internal marketplace. | - | - |

### Imagery

_Libraries that assist with the creation, evaluation or manipulation of graphical images._

|---|---|---|---|
| [Barcode-Lib4J](https://github.com/vws-java/Barcode-Lib4J) | Generates QR Code, DataMatrix, and other 1D/2D barcodes as vector (PDF, EPS, SVG) and raster (PNG, BMP, JPG) images with DPI awareness, high precision, and CMYK color model support. | ![](https://img.shields.io/github/stars/vws-java/Barcode-Lib4J?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vws-java/Barcode-Lib4J?style=flat-square&label=)
| [Imgscalr](https://github.com/rkalla/imgscalr) | Simple, efficient and hardware-accelerated image-scaling library implemented in pure Java 2D. | ![](https://img.shields.io/github/stars/rkalla/imgscalr?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/rkalla/imgscalr?style=flat-square&label=)
| [Tess4J](https://github.com/nguyenq/tess4j) | JNA wrapper for Tesseract OCR API. | ![](https://img.shields.io/github/stars/nguyenq/tess4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/nguyenq/tess4j?style=flat-square&label=)
| [Thumbnailator](https://github.com/coobird/thumbnailator) | High-quality thumbnail generation library. | ![](https://img.shields.io/github/stars/coobird/thumbnailator?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/coobird/thumbnailator?style=flat-square&label=)
| [TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) | Collection of plugins that extend the number of supported image file formats. | ![](https://img.shields.io/github/stars/haraldk/TwelveMonkeys?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/haraldk/TwelveMonkeys?style=flat-square&label=)
| [ZXing](https://github.com/zxing/zxing) | Multi-format 1D/2D barcode image processing library. | ![](https://img.shields.io/github/stars/zxing/zxing?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zxing/zxing?style=flat-square&label=)
| [image-comparison](https://github.com/romankh3/image-comparison) | Library that compares 2 images with the same sizes and shows the differences visually by drawing rectangles. Some parts of the image can be excluded from the comparison. | ![](https://img.shields.io/github/stars/romankh3/image-comparison?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/romankh3/image-comparison?style=flat-square&label=)
| [vips-ffm](https://github.com/lopcode/vips-ffm) | Comprehensive bindings for libvips, using Java's "Foreign Function & Memory" API. | ![](https://img.shields.io/github/stars/lopcode/vips-ffm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lopcode/vips-ffm?style=flat-square&label=)
| [scrimage](https://sksamuel.github.io/scrimage) | Immutable, functional, and performant JVM library for manipulation of images. | - | - |

### Introspection

_Libraries that help make the Java introspection and reflection API easier and faster to use._

|---|---|---|---|
| [ClassGraph](https://github.com/classgraph/classgraph) | ClassGraph (formerly FastClasspathScanner) is an uber-fast, ultra-lightweight, parallelized classpath scanner and module scanner for Java, Scala, Kotlin and other JVM languages. | ![](https://img.shields.io/github/stars/classgraph/classgraph?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/classgraph/classgraph?style=flat-square&label=)
| [jOOR](https://github.com/jOOQ/jOOR) | jOOR stands for jOOR Object Oriented Reflection. It is a simple wrapper for the java.lang.reflect package. | ![](https://img.shields.io/github/stars/jOOQ/jOOR?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jOOQ/jOOR?style=flat-square&label=)
| [Mirror](http://projetos.vidageek.net/mirror/mirror/) | Mirror was created to bring light to a simple problem, usually named ReflectionUtil, which is on almost all projects that rely on reflection to do advanced tasks. | - | - |
| [Objenesis](http://objenesis.org) | Allows dynamic instantiation without default constructor, e.g. constructors which have required arguments, side effects or throw exceptions. | - | - |
| [ReflectASM](https://github.com/EsotericSoftware/reflectasm) | ReflectASM is a very small Java library that provides high performance reflection by using code generation. | ![](https://img.shields.io/github/stars/EsotericSoftware/reflectasm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/EsotericSoftware/reflectasm?style=flat-square&label=)
| [Reflections](https://github.com/ronmamo/reflections) | Reflections scans your classpath, indexes the metadata, allows you to query it on runtime and may save and collect that information for many modules within your project. | ![](https://img.shields.io/github/stars/ronmamo/reflections?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ronmamo/reflections?style=flat-square&label=)

### Job Scheduling

_Libraries for scheduling background jobs._

|---|---|---|---|
| [JobRunr](https://github.com/jobrunr/jobrunr) | Job scheduling library which utilizes lambdas for fire-and-forget, delayed and recurring jobs. Guarantees execution by single scheduler instance using optimistic locking. Has features for persistence, minimal dependencies and is embeddable. | ![](https://img.shields.io/github/stars/jobrunr/jobrunr?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jobrunr/jobrunr?style=flat-square&label=)
| [Quartz](https://github.com/quartz-scheduler/quartz) | Feature-rich, open source job scheduling library that can be integrated within virtually any Java application. | ![](https://img.shields.io/github/stars/quartz-scheduler/quartz?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/quartz-scheduler/quartz?style=flat-square&label=)
| [Sundial](https://github.com/knowm/Sundial) | Lightweight framework to simply define jobs, define triggers and start the scheduler. | ![](https://img.shields.io/github/stars/knowm/Sundial?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/knowm/Sundial?style=flat-square&label=)
| [Wisp](https://github.com/Coreoz/Wisp) | Simple library with minimal footprint and straightforward API. | ![](https://img.shields.io/github/stars/Coreoz/Wisp?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Coreoz/Wisp?style=flat-square&label=)
| [db-scheduler](https://github.com/kagkarlsson/db-scheduler) | Persistent and cluster-friendly scheduler. | ![](https://img.shields.io/github/stars/kagkarlsson/db-scheduler?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/kagkarlsson/db-scheduler?style=flat-square&label=)
| [easy-batch](https://github.com/j-easy/easy-batch) | Set up batch jobs with simple processing pipelines. Records are read in sequence from a data source, processed in pipeline and written in batches to a data sink. | ![](https://img.shields.io/github/stars/j-easy/easy-batch?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/j-easy/easy-batch?style=flat-square&label=)
| [shedlock](https://github.com/lukas-krecan/ShedLock) | Makes sure that your scheduled tasks are executed at most once at the same time. If a task is being executed on one node, it acquires a lock which prevents execution of the same task from another node or thread. | ![](https://img.shields.io/github/stars/lukas-krecan/ShedLock?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lukas-krecan/ShedLock?style=flat-square&label=)

### JSON

_Libraries for serializing and deserializing JSON to and from Java objects._

|---|---|---|---|
| [Avaje Jsonb](https://avaje.io/jsonb/) | Reflection-free Json binding via source code generation with Jackson-like annotations. | - | - |
| [DSL-JSON](https://github.com/ngs-doo/dsl-json) | JSON library with advanced compile time databinding. | ![](https://img.shields.io/github/stars/ngs-doo/dsl-json?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ngs-doo/dsl-json?style=flat-square&label=)
| [Genson](http://genson.io) | Powerful and easy-to-use Java-to-JSON conversion library. | - | - |
| [Gson](https://github.com/google/gson) | Serializes objects to JSON and vice versa. Good performance with on-the-fly usage. | ![](https://img.shields.io/github/stars/google/gson?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/gson?style=flat-square&label=)
| [HikariJSON](https://github.com/brettwooldridge/HikariJSON) | High-performance JSON parser, 2x faster than Jackson. | ![](https://img.shields.io/github/stars/brettwooldridge/HikariJSON?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/brettwooldridge/HikariJSON?style=flat-square&label=)
| [jackson-modules-java8](https://github.com/FasterXML/jackson-modules-java8) | Set of Jackson modules for Java 8 datatypes and features. | ![](https://img.shields.io/github/stars/FasterXML/jackson-modules-java8?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/FasterXML/jackson-modules-java8?style=flat-square&label=)
| [Jackson-datatype-money](https://github.com/zalando/jackson-datatype-money) | Open-source Jackson module to support JSON serialization and deserialization of JavaMoney data types. | ![](https://img.shields.io/github/stars/zalando/jackson-datatype-money?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/jackson-datatype-money?style=flat-square&label=)
| [Jackson](https://github.com/FasterXML/jackson) | Similar to GSON, but offers performance gains if you need to instantiate the library more often. | ![](https://img.shields.io/github/stars/FasterXML/jackson?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/FasterXML/jackson?style=flat-square&label=)
| [JSON-io](https://github.com/jdereg/json-io) | Convert Java to JSON. Convert JSON to Java. Pretty print JSON. Java JSON serializer. | ![](https://img.shields.io/github/stars/jdereg/json-io?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jdereg/json-io?style=flat-square&label=)
| [jsoniter](http://jsoniter.com) | Fast and flexible library with iterator and lazy parsing API. | - | - |
| [LoganSquare](https://github.com/bluelinelabs/LoganSquare) | JSON parsing and serializing library based on Jackson's streaming API. Outperforms GSON & Jackson's library. | ![](https://img.shields.io/github/stars/bluelinelabs/LoganSquare?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bluelinelabs/LoganSquare?style=flat-square&label=)
| [Moshi](https://github.com/square/moshi) | Modern JSON library, less opinionated and uses built-in types like List and Map. | ![](https://img.shields.io/github/stars/square/moshi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/square/moshi?style=flat-square&label=)
| [Yasson](https://github.com/eclipse-ee4j/yasson) | Binding layer between classes and JSON documents similar to JAXB. | ![](https://img.shields.io/github/stars/eclipse-ee4j/yasson?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/eclipse-ee4j/yasson?style=flat-square&label=)
| [fastjson](https://github.com/alibaba/fastjson) | Very fast processor with no additional dependencies and full data binding. | ![](https://img.shields.io/github/stars/alibaba/fastjson?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/alibaba/fastjson?style=flat-square&label=)
| [Jolt](https://github.com/bazaarvoice/jolt) | JSON to JSON transformation tool. | ![](https://img.shields.io/github/stars/bazaarvoice/jolt?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bazaarvoice/jolt?style=flat-square&label=)
| [JsonPath](https://github.com/json-path/JsonPath) | Extract data from JSON using XPATH-like syntax. | ![](https://img.shields.io/github/stars/json-path/JsonPath?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/json-path/JsonPath?style=flat-square&label=)
| [JsonSurfer](https://github.com/jsurfer/JsonSurfer) | Streaming JsonPath processor dedicated to processing big and complicated JSON data. | ![](https://img.shields.io/github/stars/jsurfer/JsonSurfer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jsurfer/JsonSurfer?style=flat-square&label=)

### JVM and JDK

_Current implementations of the JVM/JDK._

|---|---|---|---|
| [Which JDK](https://whichjdk.com/) | Overview of common JVMs with pros and cons. | - | - |
| [Adopt Open JDK](https://adoptopenjdk.net) | Community-driven OpenJDK builds, including both HotSpot and OpenJ9. | - | - |
| [Corretto](https://aws.amazon.com/corretto/) | No-cost, multiplatform, production-ready distribution of OpenJDK by Amazon. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Dragonwell8](https://github.com/alibaba/dragonwell8) | Downstream version of OpenJDK optimized for online e-commerce, financial, logistics applications. | ![](https://img.shields.io/github/stars/alibaba/dragonwell8?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/alibaba/dragonwell8?style=flat-square&label=)
| [Graal](https://github.com/oracle/graal) | Polyglot embeddable JVM. (GPL-2.0-only WITH Classpath-exception-2.0) | ![](https://img.shields.io/github/stars/oracle/graal?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/oracle/graal?style=flat-square&label=)
| [Liberica JDK](https://bell-sw.com) | Built from OpenJDK, thoroughly tested and passed the JCK. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [OpenJ9](https://github.com/eclipse/openj9) | High performance, enterprise-calibre, flexibly licensed, openly-governed cross-platform JVM extending and augmenting the runtime technology components from the Eclipse OMR and OpenJDK project. | ![](https://img.shields.io/github/stars/eclipse/openj9?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/eclipse/openj9?style=flat-square&label=)
| [Open JDK](https://openjdk.java.net) | Open JDK community home. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [ParparVM](https://github.com/codenameone/CodenameOne/tree/master/vm) | VM with non-blocking, concurrent GC for iOS. (GPL-2.0-only WITH Classpath-exception-2.0) | ![](https://img.shields.io/github/stars/codenameone/CodenameOne/tree/master/vm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/codenameone/CodenameOne/tree/master/vm?style=flat-square&label=)
| [RedHat Open JDK](https://developers.redhat.com/products/openjdk/overview) | RedHat's OpenJDK distribution. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [SAP Machine](https://sap.github.io/SapMachine/) | SAP's no-cost, rigorously tested and JCK-verified OpenJDK friendly fork. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Zulu](https://www.azul.com/products/zulu-community/) | OpenJDK builds for Windows, Linux, and macOS. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [Microsoft JDK](https://github.com/microsoft/openjdk) | Microsoft Build of OpenJDK, Free, Open Source, Freshly Brewed! | ![](https://img.shields.io/github/stars/microsoft/openjdk?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/microsoft/openjdk?style=flat-square&label=)

### Logging

_Libraries that log the behavior of an application._

|---|---|---|---|
| [Apache Log4j 2](https://logging.apache.org/log4j/) | Complete rewrite with a powerful plugin and configuration architecture. | - | - |
| [Echopraxia](https://github.com/tersesystems/echopraxia) | API designed around structured logging, rich context, and conditional logging. There are Logback and Log4J2 implementations, but Echopraxia's API is completely dependency-free, meaning it can be implemented with any logging API. | ![](https://img.shields.io/github/stars/tersesystems/echopraxia?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/tersesystems/echopraxia?style=flat-square&label=)
| [Graylog](https://www.graylog.org) | Open-source aggregator suited for extended role and permission management. (GPL-3.0-only) | - | - |
| [Kibana](https://www.elastic.co/kibana) | Analyzes and visualizes log files. Some features require payment. | - | - |
| [Logback](http://logback.qos.ch) | Robust logging library with interesting configuration options via Groovy. | - | - |
| [Logbook](https://github.com/zalando/logbook) | Extensible, open-source library for HTTP request and response logging. | ![](https://img.shields.io/github/stars/zalando/logbook?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/logbook?style=flat-square&label=)
| [Logstash](https://www.elastic.co/logstash) | Tool for managing log files. | - | - |
| [p6spy](https://github.com/p6spy/p6spy) | Enables logging for all JDBC transactions without changes to the code. | ![](https://img.shields.io/github/stars/p6spy/p6spy?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/p6spy/p6spy?style=flat-square&label=)
| [SLF4J](http://www.slf4j.org) | Abstraction layer/simple logging facade. | - | - |
| [tinylog](https://tinylog.org/v2/) | Lightweight logging framework with static logger class. | - | - |
| [OpenTracing Toolbox](https://github.com/zalando/opentracing-toolbox) | Collection of libraries that build on top of OpenTracing and provide extensions and plugins to existing instrumentations. | ![](https://img.shields.io/github/stars/zalando/opentracing-toolbox?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/opentracing-toolbox?style=flat-square&label=)
| [Flogger](https://google.github.io/flogger/) | Flogger is a fluent logging API for Java. It supports a wide variety of features, and has many benefits over existing logging APIs. | - | - |

### Machine Learning

_Tools that provide specific statistical algorithms for learning from data._

|---|---|---|---|
| [Apache Flink](https://flink.apache.org) | Fast, reliable, large-scale data processing engine. | - | - |
| [Apache Mahout](https://mahout.apache.org) | Scalable algorithms focused on collaborative filtering, clustering and classification. | - | - |
| [DatumBox](http://www.datumbox.com) | Provides several algorithms and pre-trained models for natural language processing. | - | - |
| [Deeplearning4j](https://deeplearning4j.org) | Distributed and multi-threaded deep learning library. | - | - |
| [DJL](https://djl.ai) | High-level and engine-agnostic framework for deep learning. | - | - |
| [Intelligent java](https://github.com/Barqawiz/IntelliJava) | Seamlessly integrate with remote deep learning and language models programmatically. | ![](https://img.shields.io/github/stars/Barqawiz/IntelliJava?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Barqawiz/IntelliJava?style=flat-square&label=)
| [JSAT](https://github.com/EdwardRaff/JSAT) | Algorithms for pre-processing, classification, regression, and clustering with support for multi-threaded execution. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/EdwardRaff/JSAT?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/EdwardRaff/JSAT?style=flat-square&label=)
| [m2cgen](https://github.com/BayesWitnesses/m2cgen) | CLI tool to transpile models into native code. | ![](https://img.shields.io/github/stars/BayesWitnesses/m2cgen?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/BayesWitnesses/m2cgen?style=flat-square&label=)
| [Neureka](https://github.com/Gleethos/neureka) | A lightweight, platform independent, OpenCL accelerated nd-array/tensor library. | ![](https://img.shields.io/github/stars/Gleethos/neureka?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Gleethos/neureka?style=flat-square&label=)
| [oj! Algorithms](https://www.ojalgo.org/) | High-performance mathematics, linear algebra and optimisation needed for data science, machine learning and scientific computing. | - | - |
| [Oryx 2](https://github.com/OryxProject/oryx) | Framework for building real-time, large-scale machine learning applications. Includes end-to-end applications for collaborative filtering, classification, regression, and clustering. | ![](https://img.shields.io/github/stars/OryxProject/oryx?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OryxProject/oryx?style=flat-square&label=)
| [Siddhi](https://github.com/siddhi-io/siddhi) | Cloud native streaming and complex event processing engine. | ![](https://img.shields.io/github/stars/siddhi-io/siddhi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/siddhi-io/siddhi?style=flat-square&label=)
| [Smile](https://github.com/haifengl/smile) | Statistical Machine Intelligence and Learning Engine provides a set of machine learning algorithms and a visualization library. | ![](https://img.shields.io/github/stars/haifengl/smile?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/haifengl/smile?style=flat-square&label=)
| [Tribuo](https://tribuo.org/) | Provides tools for classification, regression, clustering, model development and interfaces with other libraries such as scikit-learn, pytorch and TensorFlow. | - | - |
| [Weka](https://www.cs.waikato.ac.nz/ml/weka/) | Collection of algorithms for data mining tasks ranging from pre-processing to visualization. (GPL-3.0-only) | - | - |

### Messaging

_Tools that help send messages between clients to ensure protocol independency._

|---|---|---|---|
| [Aeron](https://github.com/real-logic/Aeron) | Efficient, reliable, unicast and multicast message transport. | ![](https://img.shields.io/github/stars/real-logic/Aeron?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/real-logic/Aeron?style=flat-square&label=)
| [Apache ActiveMQ](https://activemq.apache.org) | Message broker that implements JMS and converts synchronous to asynchronous communication. | - | - |
| [Apache Camel](https://camel.apache.org) | Glues together different transport APIs via Enterprise Integration Patterns. | - | - |
| [Apache Kafka](https://kafka.apache.org) | High-throughput distributed messaging system. | - | - |
| [Apache Pulsar](https://pulsar.apache.org) | Distributed pub/sub-messaging system. | - | - |
| [Apache RocketMQ](https://rocketmq.apache.org) | Fast, reliable, and scalable distributed messaging platform. | - | - |
| [Apache Qpid](https://qpid.apache.org) | Apache Qpid makes messaging tools that speak AMQP and support many languages and platforms. | - | - |
| [AutoMQ](https://github.com/AutoMQ/automq-for-kafka) | AutoMQ is a cloud-native, serverless reinvented Kafka that is easily scalable, manage-less and cost-effective. | ![](https://img.shields.io/github/stars/AutoMQ/automq-for-kafka?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/AutoMQ/automq-for-kafka?style=flat-square&label=)
| [Deezpatch](https://github.com/joel-jeremy/deezpatch) | Simple, lightweight, and performant dispatch library for decoupling messages (requests and events) and message handlers. | ![](https://img.shields.io/github/stars/joel-jeremy/deezpatch?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/joel-jeremy/deezpatch?style=flat-square&label=)
| [EventBus](https://github.com/greenrobot/EventBus) | Simple publish/subscribe event bus. | ![](https://img.shields.io/github/stars/greenrobot/EventBus?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/greenrobot/EventBus?style=flat-square&label=)
| [Hermes](http://hermes.allegro.tech) | Fast and reliable message broker built on top of Kafka. | - | - |
| [JeroMQ](https://github.com/zeromq/jeromq) | Implementation of ZeroMQ. | ![](https://img.shields.io/github/stars/zeromq/jeromq?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zeromq/jeromq?style=flat-square&label=)
| [Nakadi](https://github.com/zalando/nakadi) | Provides a RESTful API on top of Kafka. | ![](https://img.shields.io/github/stars/zalando/nakadi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/nakadi?style=flat-square&label=)
| [RabbitMQ Java client](https://github.com/rabbitmq/rabbitmq-java-client) | RabbitMQ client. | ![](https://img.shields.io/github/stars/rabbitmq/rabbitmq-java-client?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/rabbitmq/rabbitmq-java-client?style=flat-square&label=)
| [Smack](https://github.com/igniterealtime/Smack) | Cross-platform XMPP client library. | ![](https://img.shields.io/github/stars/igniterealtime/Smack?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/igniterealtime/Smack?style=flat-square&label=)
| [NATS client](https://github.com/nats-io/nats.java) | NATS client. | ![](https://img.shields.io/github/stars/nats-io/nats.java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/nats-io/nats.java?style=flat-square&label=)

### Microservice

_Tools for creating and managing microservices._

|---|---|---|---|
| [ActiveRPC](https://rpc.activej.io) | Lightweight and fast library for complex high-load distributed applications and Memcached-like solutions. | - | - |
| [Armeria](https://github.com/line/armeria) | Asynchronous RPC/REST client/server library built on top of Java 8, Netty, HTTP/2, Thrift and gRPC. | ![](https://img.shields.io/github/stars/line/armeria?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/line/armeria?style=flat-square&label=)
| [consul-api](https://github.com/Ecwid/consul-api) | Client for the Consul API: a distributed, highly available and datacenter-aware registry/discovery service. | ![](https://img.shields.io/github/stars/Ecwid/consul-api?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Ecwid/consul-api?style=flat-square&label=)
| [Eureka](https://github.com/Netflix/eureka) | REST-based service registry for resilient load balancing and failover. | ![](https://img.shields.io/github/stars/Netflix/eureka?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Netflix/eureka?style=flat-square&label=)
| [Helidon](https://helidon.io) | Two-style approach for writing microservices: Functional-reactive and as an implementation of MicroProfile. | - | - |
| [JDA](https://github.com/DV8FromTheWorld/JDA) | Wrapping of the Discord REST API and its WebSocket events. | ![](https://img.shields.io/github/stars/DV8FromTheWorld/JDA?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/DV8FromTheWorld/JDA?style=flat-square&label=)
| [KeenType](https://github.com/DaveJarvis/KeenType) | Modernized version of a Java-based implementation of the New Typesetting System, which was heavily based on Donald E. Knuth's original TeX. | ![](https://img.shields.io/github/stars/DaveJarvis/KeenType?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/DaveJarvis/KeenType?style=flat-square&label=)
| [kubernetes-client](https://github.com/fabric8io/kubernetes-client) | Client provides access to the full Kubernetes & OpenShift REST APIs via a fluent DSL. | ![](https://img.shields.io/github/stars/fabric8io/kubernetes-client?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/fabric8io/kubernetes-client?style=flat-square&label=)
| [Micronaut](https://micronaut.io) | Modern full-stack framework with focus on modularity, minimal memory footprint and startup time. | - | - |
| [Nacos](https://nacos.io) | Dynamic service discovery, configuration and service management platform for building cloud native applications. | - | - |
| [OpenAI-Java](https://github.com/TheoKanning/openai-java) | Java libraries for using OpenAI's GPT-3 API. | ![](https://img.shields.io/github/stars/TheoKanning/openai-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/TheoKanning/openai-java?style=flat-square&label=)
| [Quarkus](https://quarkus.io) | Kubernetes stack tailored for the HotSpot and Graal VM. | - | - |
| [Sentinel](https://github.com/alibaba/Sentinel) | Flow control component enabling reliability, resilience and monitoring for microservices. | ![](https://img.shields.io/github/stars/alibaba/Sentinel?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/alibaba/Sentinel?style=flat-square&label=)

### Miscellaneous

_Everything else._

|---|---|---|---|
| [CQEngine](https://github.com/npgall/cqengine) | Ultra-fast, SQL-like queries on Java collections. | ![](https://img.shields.io/github/stars/npgall/cqengine?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/npgall/cqengine?style=flat-square&label=)
| [Design Patterns](https://github.com/iluwatar/java-design-patterns) | Implementation and explanation of the most common design patterns. | ![](https://img.shields.io/github/stars/iluwatar/java-design-patterns?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/iluwatar/java-design-patterns?style=flat-square&label=)
| [FF4J](https://github.com/ff4j/ff4j) | Feature Flags for Java. | ![](https://img.shields.io/github/stars/ff4j/ff4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ff4j/ff4j?style=flat-square&label=)
| [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition) | No-nonsense implementation of FizzBuzz made by serious businessmen for serious business purposes. (No explicit license) | ![](https://img.shields.io/github/stars/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition?style=flat-square&label=)
| [IP2Location.io Java SDK](https://github.com/ip2location/ip2location-io-java) | Wrapper for the IP2Location.io Geolocation API and the IP2WHOIS domain WHOIS API. | ![](https://img.shields.io/github/stars/ip2location/ip2location-io-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ip2location/ip2location-io-java?style=flat-square&label=)
| [ISBN core](https://github.com/ladutsko/isbn-core) | A small library that contains a representation object of ISBN-10 and ISBN-13 and tools to parse, validate and format one. | ![](https://img.shields.io/github/stars/ladutsko/isbn-core?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ladutsko/isbn-core?style=flat-square&label=)
| [J2ObjC](https://github.com/google/j2objc) | Java-to-Objective-C translator for porting Android libraries to iOS. | ![](https://img.shields.io/github/stars/google/j2objc?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/j2objc?style=flat-square&label=)
| [JBake](https://jbake.org) | Static website generator. | - | - |
| [JBot](https://github.com/rampatra/jbot) | Framework for building chatbots. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/rampatra/jbot?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/rampatra/jbot?style=flat-square&label=)
| [JCuda](http://jcuda.org) | JCuda offers Java bindings for CUDA and CUDA-related libraries. | - | - |
| [JEmoji](https://github.com/felldo/JEmoji) | An auto-generated emoji library that provides type-safe direct access to emojis and alias support for Discord, Slack, GitHub and many more features. | ![](https://img.shields.io/github/stars/felldo/JEmoji?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/felldo/JEmoji?style=flat-square&label=)
| [Jimfs](https://github.com/google/jimfs) | In-memory file system. | ![](https://img.shields.io/github/stars/google/jimfs?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/jimfs?style=flat-square&label=)
| [Joda-Money](https://www.joda.org/joda-money/) | Basic currency and money classes and algorithms not provided by the JDK. | - | - |
| [jOOX](https://github.com/jooq/joox) | Simple wrapper for the org.w3c.dom package, to allow for fluent XML document creation and manipulation with an API inspired by jQuery. | ![](https://img.shields.io/github/stars/jooq/joox?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jooq/joox?style=flat-square&label=)
| [JPad](http://jpad.io) | Snippet runner. | - | - |
| [jsweet](https://github.com/cincheo/jsweet) | Source transpiler to TypeScript/JavaScript. | ![](https://img.shields.io/github/stars/cincheo/jsweet?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cincheo/jsweet?style=flat-square&label=)
| [Maven Wrapper](https://github.com/takari/maven-wrapper) | Analogue of Gradle Wrapper for Maven, allows building projects without installing maven. | ![](https://img.shields.io/github/stars/takari/maven-wrapper?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/takari/maven-wrapper?style=flat-square&label=)
| [Membrane Service Proxy](https://github.com/membrane/service-proxy) | Open-source, reverse-proxy framework. | ![](https://img.shields.io/github/stars/membrane/service-proxy?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/membrane/service-proxy?style=flat-square&label=)
| [MinimalFTP](https://github.com/Guichaguri/MinimalFTP) | Lightweight, small and customizable FTP server. | ![](https://img.shields.io/github/stars/Guichaguri/MinimalFTP?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Guichaguri/MinimalFTP?style=flat-square&label=)
| [LittleProxy](https://github.com/adamfisk/LittleProxy) | High performance HTTP proxy atop Netty's event-based networking library. | ![](https://img.shields.io/github/stars/adamfisk/LittleProxy?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/adamfisk/LittleProxy?style=flat-square&label=)
| [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) | Popular Java 8 guide. | ![](https://img.shields.io/github/stars/winterbe/java8-tutorial?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/winterbe/java8-tutorial?style=flat-square&label=)
| [Modernizer](https://github.com/gaul/modernizer-maven-plugin) | Detect uses of legacy Java APIs. | ![](https://img.shields.io/github/stars/gaul/modernizer-maven-plugin?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/gaul/modernizer-maven-plugin?style=flat-square&label=)
| [OctoLinker](https://github.com/OctoLinker/OctoLinker) | Browser extension which allows to navigate through code on GitHub more efficiently. | ![](https://img.shields.io/github/stars/OctoLinker/OctoLinker?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OctoLinker/OctoLinker?style=flat-square&label=)
| [OpenRefine](http://openrefine.org) | Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases. | - | - |
| [PipelinR](https://github.com/sizovs/pipelinr) | Small utility library for using handlers and commands with pipelines. | ![](https://img.shields.io/github/stars/sizovs/pipelinr?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/sizovs/pipelinr?style=flat-square&label=)
| [Polyglot for Maven](https://github.com/takari/polyglot-maven) | Extensions for Maven 3.3.1+ that allows writing the POM model in dialects other than XML. | ![](https://img.shields.io/github/stars/takari/polyglot-maven?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/takari/polyglot-maven?style=flat-square&label=)
| [RR4J](https://github.com/Kartikvk1996/RR4J) | RR4J is a tool that records java bytecode execution and later allows developers to replay locally. | ![](https://img.shields.io/github/stars/Kartikvk1996/RR4J?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Kartikvk1996/RR4J?style=flat-square&label=)
| [Simple Java Mail](https://github.com/bbottema/simple-java-mail) | Mailing with a clean and fluent API. | ![](https://img.shields.io/github/stars/bbottema/simple-java-mail?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bbottema/simple-java-mail?style=flat-square&label=)
| [Smooks](https://github.com/smooks/smooks) | Framework for fragment-based message processing. (Apache-2.0 OR LGPL-3.0-or-later) | ![](https://img.shields.io/github/stars/smooks/smooks?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/smooks/smooks?style=flat-square&label=)
| [Svix](https://github.com/svix/svix-webhooks/tree/main/java) | Library for the Svix API to send webhooks and verify signatures. | ![](https://img.shields.io/github/stars/svix/svix-webhooks/tree/main/java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/svix/svix-webhooks/tree/main/java?style=flat-square&label=)
| [Togglz](https://www.togglz.org) | Implementation of the Feature Toggles pattern. | - | - |
| [TypeTools](https://github.com/jhalterman/typetools) | Tools for resolving generic types. | ![](https://img.shields.io/github/stars/jhalterman/typetools?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jhalterman/typetools?style=flat-square&label=)
| [webcam-capture](https://github.com/sarxos/webcam-capture) | Library for using built-in and external webcams directly in Java. | ![](https://img.shields.io/github/stars/sarxos/webcam-capture?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/sarxos/webcam-capture?style=flat-square&label=)
| [XMLBeam](https://github.com/SvenEwald/xmlbeam) | Processes XML by using annotations or XPath within code. | ![](https://img.shields.io/github/stars/SvenEwald/xmlbeam?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/SvenEwald/xmlbeam?style=flat-square&label=)
| [yGuard](https://github.com/yWorks/yGuard) | Obfuscation via renaming and shrinking. | ![](https://img.shields.io/github/stars/yWorks/yGuard?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/yWorks/yGuard?style=flat-square&label=)
| [JBang](https://github.com/maxandersen/jbang/) | JBang makes it easy to use Java for scripting. It lets you use a single file for code and dependency management and allows you to run it directly. | ![](https://img.shields.io/github/stars/maxandersen/jbang/?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/maxandersen/jbang/?style=flat-square&label=)

### Mobile Development

_Tools for creating or managing mobile applications._

|---|---|---|---|
| [Codename One](https://www.codenameone.com) | Cross-platform solution for writing native mobile apps. (GPL-2.0-only WITH Classpath-exception-2.0) | - | - |
| [MobileUI](https://mobileui.dev) | Cross-platform framework for developing mobile apps with native UI in Java and Kotlin. | - | - |
| [Multi-OS Engine](https://multi-os-engine.org) | Open-source, cross-platform engine to develop native mobile (iOS, Android, etc.) apps. | - | - |

### Monitoring

_Tools that observe/monitor applications in production by providing telemetry._

|---|---|---|---|
| [Apitally](https://github.com/apitally/apitally-java) | Simple, privacy-focused API monitoring, analytics and request logging for Spring Boot apps. | ![](https://img.shields.io/github/stars/apitally/apitally-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/apitally/apitally-java?style=flat-square&label=)
| [Automon](https://github.com/stevensouza/automon) | Combines the power of AOP with monitoring and/or logging tools. | ![](https://img.shields.io/github/stars/stevensouza/automon?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/stevensouza/automon?style=flat-square&label=)
| [Dropwizard Metrics](https://github.com/dropwizard/metrics) | Expose metrics via JMX or HTTP and send them to a database. | ![](https://img.shields.io/github/stars/dropwizard/metrics?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dropwizard/metrics?style=flat-square&label=)
| [Failsafe Actuator](https://github.com/zalando/failsafe-actuator) | Out of the box monitoring of Failsafe Circuit Breaker in Spring-Boot environment. | ![](https://img.shields.io/github/stars/zalando/failsafe-actuator?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zalando/failsafe-actuator?style=flat-square&label=)
| [Glowroot](https://glowroot.org) | Open-source Java APM. | - | - |
| [HertzBeat](https://github.com/dromara/hertzbeat) | Real-time monitoring system with custom-monitor and agentless. | ![](https://img.shields.io/github/stars/dromara/hertzbeat?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dromara/hertzbeat?style=flat-square&label=)
| [hippo4j](https://github.com/opengoofy/hippo4j/blob/develop/README-EN.md) | Dynamic and observable thread pool framework. | ![](https://img.shields.io/github/stars/opengoofy/hippo4j/blob/develop/README-EN.md?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/opengoofy/hippo4j/blob/develop/README-EN.md?style=flat-square&label=)
| [inspectIT](https://www.inspectit.rocks) | Captures detailed run-time information via hooks that can be changed on the fly. It supports tracing over multiple systems via the OpenTracing API and can correlate the data with end user monitoring. | - | - |
| [Jaeger client](https://github.com/jaegertracing/jaeger-client-java) | Jaeger client. | ![](https://img.shields.io/github/stars/jaegertracing/jaeger-client-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jaegertracing/jaeger-client-java?style=flat-square&label=)
| [JavaMelody](https://github.com/javamelody/javamelody) | Performance monitoring and profiling. | ![](https://img.shields.io/github/stars/javamelody/javamelody?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/javamelody/javamelody?style=flat-square&label=)
| [jmxtrans](https://github.com/jmxtrans/jmxtrans) | Connect to multiple JVMs and query them for their attributes via JMX. Its query language is based on JSON, which allows non-Java programmers to access the JVM attributes. Supports different output writes, including Graphite, Ganglia, and StatsD. | ![](https://img.shields.io/github/stars/jmxtrans/jmxtrans?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jmxtrans/jmxtrans?style=flat-square&label=)
| [Jolokia](https://jolokia.org) | JMX over REST. | - | - |
| [Micrometer](https://github.com/micrometer-metrics/micrometer) | Vendor-neutral metrics/observability facade for the most popular metrics/observability libraries. | ![](https://img.shields.io/github/stars/micrometer-metrics/micrometer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/micrometer-metrics/micrometer?style=flat-square&label=)
| [Micrometer Tracing](https://github.com/micrometer-metrics/tracing) | Vendor-neutral distributed tracing facade for the most popular tracer libraries. | ![](https://img.shields.io/github/stars/micrometer-metrics/tracing?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/micrometer-metrics/tracing?style=flat-square&label=)
| [nudge4j](https://github.com/lorenzoongithub/nudge4j) | Remote developer console from the browser for Java 8 via bytecode injection. | ![](https://img.shields.io/github/stars/lorenzoongithub/nudge4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lorenzoongithub/nudge4j?style=flat-square&label=)
| [OpenTelemetry](https://github.com/open-telemetry/opentelemetry-java) | Instrument, generate, collect, and export telemetry data to help you analyze your software’s performance and behavior. | ![](https://img.shields.io/github/stars/open-telemetry/opentelemetry-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/open-telemetry/opentelemetry-java?style=flat-square&label=)
| [Pinpoint](https://github.com/naver/pinpoint) | Open-source APM tool. | ![](https://img.shields.io/github/stars/naver/pinpoint?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/naver/pinpoint?style=flat-square&label=)
| [Prometheus](https://github.com/prometheus/client_java) | Provides a multi-dimensional data model, DSL, autonomous server nodes and much more. | ![](https://img.shields.io/github/stars/prometheus/client_java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/prometheus/client_java?style=flat-square&label=)
| [Stagemonitor](https://github.com/stagemonitor/stagemonitor) | Open-source performance monitoring and transaction tracing for JVM apps. | ![](https://img.shields.io/github/stars/stagemonitor/stagemonitor?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/stagemonitor/stagemonitor?style=flat-square&label=)
| [Sysmon](https://github.com/palantir/Sysmon) | Lightweight platform monitoring tool for Java VMs. | ![](https://img.shields.io/github/stars/palantir/Sysmon?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/palantir/Sysmon?style=flat-square&label=)
| [zipkin](https://zipkin.io) | Distributed tracing system which gathers timing data needed to troubleshoot latency problems in microservice architectures. | - | - |

### Native

_For working with platform-specific native libraries._

|---|---|---|---|
| [Aparapi](https://github.com/Syncleus/aparapi) | Converts bytecode to OpenCL which allows execution on GPUs. | ![](https://img.shields.io/github/stars/Syncleus/aparapi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Syncleus/aparapi?style=flat-square&label=)
| [JavaCPP](https://github.com/bytedeco/javacpp) | Provides efficient and easy access to native C++. | ![](https://img.shields.io/github/stars/bytedeco/javacpp?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bytedeco/javacpp?style=flat-square&label=)
| [JNA](https://github.com/java-native-access/jna) | Work with native libraries without writing JNI. Also provides interfaces to common system libraries. | ![](https://img.shields.io/github/stars/java-native-access/jna?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/java-native-access/jna?style=flat-square&label=)
| [JNR](https://github.com/jnr/jnr-ffi) | Work with native libraries without writing JNI. Also provides interfaces to common system libraries. Same goals as JNA, but faster, and serves as the basis for the upcoming [Project Panama](http://openjdk.java.net/projects/panama). | ![](https://img.shields.io/github/stars/jnr/jnr-ffi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jnr/jnr-ffi?style=flat-square&label=)
| [native-lib-loader](https://github.com/scijava/native-lib-loader) | Native library loader for extracting and loading native libraries from Java. | ![](https://img.shields.io/github/stars/scijava/native-lib-loader?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/scijava/native-lib-loader?style=flat-square&label=)

### Natural Language Processing

_Libraries that specialize in processing text._

|---|---|---|---|
| [CogCompNLP](https://github.com/CogComp/cogcomp-nlp) | Provides common annotators for plain text input. (Research and Academic Use License) | ![](https://img.shields.io/github/stars/CogComp/cogcomp-nlp?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/CogComp/cogcomp-nlp?style=flat-square&label=)
| [CoreNLP](https://nlp.stanford.edu/software/corenlp.shtml) | Provides a set of fundamental tools for tasks like tagging, named entity recognition, and sentiment analysis. (GPL-3.0-or-later) | - | - |
| [DKPro](https://dkpro.github.io) | Collection of reusable NLP tools for linguistic pre-processing, machine learning, lexical resources, etc. | - | - |
| [Hypherator](https://github.com/ejossev/hypherator-java) | Java hyphenation library with iterator-like interface. Can be used out-of-the box - dictionaries for multiple languages are bundled in. | ![](https://img.shields.io/github/stars/ejossev/hypherator-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ejossev/hypherator-java?style=flat-square&label=)
| [LingPipe](http://alias-i.com/lingpipe/) | Toolkit for tasks ranging from POS tagging to sentiment analysis. | - | - |

### Networking

_Libraries for building network servers._

|---|---|---|---|
| [Commons-networking](https://github.com/CiscoSE/commons-networking) | Client for server-sent events (SSE). | ![](https://img.shields.io/github/stars/CiscoSE/commons-networking?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/CiscoSE/commons-networking?style=flat-square&label=)
| [Comsat](https://github.com/puniverse/comsat) | Integrates standard Java web-related APIs with Quasar fibers and actors. | ![](https://img.shields.io/github/stars/puniverse/comsat?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/puniverse/comsat?style=flat-square&label=)
| [Dubbo](https://github.com/apache/dubbo) | High-performance RPC framework. | ![](https://img.shields.io/github/stars/apache/dubbo?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/apache/dubbo?style=flat-square&label=)
| [Grizzly](https://javaee.github.io/grizzly/) | NIO framework. Used as a network layer in Glassfish. | - | - |
| [gRPC](https://github.com/grpc/grpc-java) | RPC framework based on protobuf and HTTP/2. | ![](https://img.shields.io/github/stars/grpc/grpc-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/grpc/grpc-java?style=flat-square&label=)
| [KryoNet](https://github.com/EsotericSoftware/kryonet) | Provides a clean and simple API for efficient TCP and UDP client/server network communication using NIO and Kryo. | ![](https://img.shields.io/github/stars/EsotericSoftware/kryonet?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/EsotericSoftware/kryonet?style=flat-square&label=)
| [MINA](https://mina.apache.org) | Abstract, event-driven async I/O API for network operations over TCP/IP and UDP/IP via Java NIO. | - | - |
| [Netty](https://netty.io) | Framework for building high-performance network applications. | - | - |
| [Drift](https://github.com/airlift/drift) | Easy-to-use, annotation-based library for creating Thrift clients and serializable types. | ![](https://img.shields.io/github/stars/airlift/drift?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/airlift/drift?style=flat-square&label=)
| [ServiceTalk](https://github.com/apple/servicetalk) | Framework built on Netty with APIs tailored to specific protocols and support for multiple programming paradigms. | ![](https://img.shields.io/github/stars/apple/servicetalk?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/apple/servicetalk?style=flat-square&label=)
| [sshj](https://github.com/hierynomus/sshj) | Programmatically use SSH, SCP or SFTP. | ![](https://img.shields.io/github/stars/hierynomus/sshj?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/hierynomus/sshj?style=flat-square&label=)
| [TLS Channel](https://github.com/marianobarrios/tls-channel) | Implements a ByteChannel interface over SSLEngine, enabling easy-to-use (socket-like) TLS. | ![](https://img.shields.io/github/stars/marianobarrios/tls-channel?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/marianobarrios/tls-channel?style=flat-square&label=)
| [Undertow](http://undertow.io) | Web server providing both blocking and non-blocking APIs based on NIO. Used as a network layer in WildFly. (LGPL-2.1-only) | - | - |
| [urnlib](https://github.com/slub/urnlib) | Represent, parse and encode URNs, as in RFC 2141. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/slub/urnlib?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/slub/urnlib?style=flat-square&label=)
| [Fluency](https://github.com/komamitsu/fluency) | High throughput data ingestion logger to Fluentd and Fluent Bit. | ![](https://img.shields.io/github/stars/komamitsu/fluency?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/komamitsu/fluency?style=flat-square&label=)

### ORM

_APIs that handle the persistence of objects._

|---|---|---|---|
| [Apache Cayenne](https://cayenne.apache.org) | Provides a clean, static API for data access. Also includes a GUI Modeler for working with database mappings, and DB reverse engineering and generation. | - | - |
| [Doma](https://github.com/domaframework/doma) | Database access framework that verifies and generates source code at compile time using annotation processing as well as native SQL templates called two-way SQL. | ![](https://img.shields.io/github/stars/domaframework/doma?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/domaframework/doma?style=flat-square&label=)
| [Ebean](https://ebean.io) | Provides simple and fast data access. | - | - |
| [EclipseLink](https://www.eclipse.org/eclipselink/) | Supports a number of persistence standards: JPA, JAXB, JCA and SDO. | - | - |
| [Hibernate](http://hibernate.org/orm/) | Robust and widely used, with an active community. (LGPL-2.1-only) | - | - |
| [MyBatis](https://github.com/mybatis/mybatis-3) | Couples objects with stored procedures or SQL statements. | ![](https://img.shields.io/github/stars/mybatis/mybatis-3?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mybatis/mybatis-3?style=flat-square&label=)
| [MyBatis-Plus](https://github.com/baomidou/mybatis-plus) | A powerful enhanced toolkit of MyBatis for simplifying development. | ![](https://img.shields.io/github/stars/baomidou/mybatis-plus?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/baomidou/mybatis-plus?style=flat-square&label=)
| [ObjectiveSql](https://github.com/braisdom/ObjectiveSql) | ActiveRecord ORM for rapid development and convention over configuration. | ![](https://img.shields.io/github/stars/braisdom/ObjectiveSql?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/braisdom/ObjectiveSql?style=flat-square&label=)
| [Permazen](https://github.com/permazen/permazen) | Language-natural persistence layer. | ![](https://img.shields.io/github/stars/permazen/permazen?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/permazen/permazen?style=flat-square&label=)
| [SimpleFlatMapper](https://github.com/arnaudroger/SimpleFlatMapper) | Simple database and CSV mapper. | ![](https://img.shields.io/github/stars/arnaudroger/SimpleFlatMapper?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/arnaudroger/SimpleFlatMapper?style=flat-square&label=)

### PaaS

_Java platform as a service._

### Pathfinding

_Algorithms and libraries for finding routes in graphs and spatial environments._

|---|---|---|---|
| [Pathetic](https://github.com/bsommerfeld/pathetic) | A highly configurable 3D A* pathfinding library that uses specific optimizations for high performance. | ![](https://img.shields.io/github/stars/bsommerfeld/pathetic?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/bsommerfeld/pathetic?style=flat-square&label=)

### PDF

_Tools to help with PDF files._

|---|---|---|---|
| [Apache FOP](https://xmlgraphics.apache.org/fop/) | Creates PDFs from XSL-FO. | - | - |
| [Apache PDFBox](https://pdfbox.apache.org) | Toolbox for creating and manipulating PDFs. | - | - |
| [Dynamic Jasper](https://intive-fdv.github.io/DynamicJasper/) | Abstraction layer to JasperReports. (LGPL-3.0-only) | - | - |
| [DynamicReports](https://github.com/dynamicreports/dynamicreports) | Simplifies JasperReports. (LGPL-3.0-only) | ![](https://img.shields.io/github/stars/dynamicreports/dynamicreports?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dynamicreports/dynamicreports?style=flat-square&label=)
| [Eclipse BIRT](https://www.eclipse.org/birt) | Report engine for creating PDF and other formats (DOCX, XLSX, HTML, etc) using Eclipse-based visual editor. | - | - |
| [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) | XML/XHTML and CSS 2.1 renderer. (LGPL-2.1-or-later) | ![](https://img.shields.io/github/stars/flyingsaucerproject/flyingsaucer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/flyingsaucerproject/flyingsaucer?style=flat-square&label=)
| [JasperReports](https://community.jaspersoft.com/project/jasperreports-library) | Complex reporting engine. (LGPL-3.0-only) | - | - |
| [Open HTML to PDF](https://github.com/danfickle/openhtmltopdf) | Properly supports modern PDF standards based on flyingsaucer and Apache PDFBox. | ![](https://img.shields.io/github/stars/danfickle/openhtmltopdf?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/danfickle/openhtmltopdf?style=flat-square&label=)
| [OpenPDF](https://github.com/LibrePDF/OpenPDF) | Open-source iText fork. (LGPL-3.0-only & MPL-2.0) | ![](https://img.shields.io/github/stars/LibrePDF/OpenPDF?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/LibrePDF/OpenPDF?style=flat-square&label=)
| [Tabula](https://github.com/tabulapdf/tabula-java) | Extracts tables from PDF files. | ![](https://img.shields.io/github/stars/tabulapdf/tabula-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/tabulapdf/tabula-java?style=flat-square&label=)

### Performance analysis

_Tools for performance analysis, profiling and benchmarking._

|---|---|---|---|
| [honest-profiler](https://github.com/jvm-profiling-tools/honest-profiler) | Low-overhead, bias-free sampling profiler. | ![](https://img.shields.io/github/stars/jvm-profiling-tools/honest-profiler?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jvm-profiling-tools/honest-profiler?style=flat-square&label=)
| [jHiccup](https://github.com/giltene/jHiccup) | Logs and records platform JVM stalls. | ![](https://img.shields.io/github/stars/giltene/jHiccup?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/giltene/jHiccup?style=flat-square&label=)
| [JITWatch](https://github.com/AdoptOpenJDK/jitwatch) | Analyze the JIT compiler optimisations made by the HotSpot JVM. | ![](https://img.shields.io/github/stars/AdoptOpenJDK/jitwatch?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/AdoptOpenJDK/jitwatch?style=flat-square&label=)
| [JMH](http://openjdk.java.net/projects/code-tools/jmh/) | Harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM. (GPL-2.0 only WITH Classpath-exception-2.0) | - | - |
| [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) | Utilities for latency measurement and reporting. | ![](https://img.shields.io/github/stars/LatencyUtils/LatencyUtils?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/LatencyUtils/LatencyUtils?style=flat-square&label=)

### Platform

_Frameworks that are suites of multiple libraries encompassing several categories._

#### Apache Commons
#### Other
|---|---|---|---|
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
| [CUBA Platform](https://www.cuba-platform.com/) | High-level framework for developing enterprise applications with a rich web interface, based on Spring, EclipseLink and Vaadin. | - | - |
| [Light-4J](https://github.com/networknt/light-4j/) | Fast, lightweight and productive microservices framework with built-in [security](https://github.com/networknt/light-oauth2/). | ![](https://img.shields.io/github/stars/networknt/light-4j/?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/networknt/light-4j/?style=flat-square&label=)
| [Orienteer](https://github.com/OrienteerBAP/Orienteer/) | Open-source business application platform for rapid configuration/development of CRM, ERP, LMS and other applications. | ![](https://img.shields.io/github/stars/OrienteerBAP/Orienteer/?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OrienteerBAP/Orienteer/?style=flat-square&label=)
| [Spring](https://spring.io/projects/) | Provides many packages for dependency injection, aspect-oriented programming, security, etc. | - | - |

### Processes

_Libraries that help the management of operating system processes._

|---|---|---|---|
| [ch.vorburger.exec](https://github.com/vorburger/ch.vorburger.exec) | Convenient API around Apache Commons Exec. | ![](https://img.shields.io/github/stars/vorburger/ch.vorburger.exec?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vorburger/ch.vorburger.exec?style=flat-square&label=)
| [zt-exec](https://github.com/zeroturnaround/zt-exec) | Provides a unified API to Apache Commons Exec and ProcessBuilder. | ![](https://img.shields.io/github/stars/zeroturnaround/zt-exec?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zeroturnaround/zt-exec?style=flat-square&label=)
| [zt-process-killer](https://github.com/zeroturnaround/zt-process-killer) | Stops processes started from Java or the system processes via PID. | ![](https://img.shields.io/github/stars/zeroturnaround/zt-process-killer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zeroturnaround/zt-process-killer?style=flat-square&label=)

### Reactive libraries

_Libraries for developing reactive applications._

|---|---|---|---|
| [Akka](https://akka.io) | Toolkit and runtime for building concurrent, distributed, fault-tolerant and event-driven applications. | - | - |
| [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) | Provides a standard for asynchronous stream processing with non-blocking backpressure. | ![](https://img.shields.io/github/stars/reactive-streams/reactive-streams-jvm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/reactive-streams/reactive-streams-jvm?style=flat-square&label=)
| [Reactor](https://github.com/reactor/reactor) | A framework for building non-blocking applications on the JVM, providing support for reactive programming. | ![](https://img.shields.io/github/stars/reactor/reactor?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/reactor/reactor?style=flat-square&label=)
| [RxJava](https://github.com/ReactiveX/RxJava) | Allows for composing asynchronous and event-based programs using observable sequences. | ![](https://img.shields.io/github/stars/ReactiveX/RxJava?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ReactiveX/RxJava?style=flat-square&label=)
| [vert.x](https://vertx.io) | Polyglot event-driven application framework. | - | - |

### REST Frameworks

_Frameworks specifically for creating RESTful services._

|---|---|---|---|
| [Dropwizard](https://github.com/dropwizard/dropwizard) | Opinionated framework for setting up modern web applications with Jetty, Jackson, Jersey and Metrics. | ![](https://img.shields.io/github/stars/dropwizard/dropwizard?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dropwizard/dropwizard?style=flat-square&label=)
| [Elide](https://elide.io) | Opinionated framework for JSON- or GraphQL-APIs based on a JPA data model. | - | - |
| [Jersey](https://jersey.github.io) | JAX-RS reference implementation. | - | - |
| [Microserver](https://github.com/aol/micro-server) | Convenient, extensible microservices plugin system for Spring & Spring Boot. With more than 30 plugins and growing, it supports both micro-monolith and pure microservices styles. | ![](https://img.shields.io/github/stars/aol/micro-server?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/aol/micro-server?style=flat-square&label=)
| [Rapidoid](https://www.rapidoid.org) | Simple, secure and extremely fast framework consisting of an embedded HTTP server, GUI components and dependency injection. | - | - |
| [rest.li](https://github.com/linkedin/rest.li) | Framework for building robust, scalable RESTful architectures using typesafe bindings and asynchronous, non-blocking IO with an end-to-end developer workflow that promotes clean practices, uniform interface design and consistent data modeling. | ![](https://img.shields.io/github/stars/linkedin/rest.li?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/linkedin/rest.li?style=flat-square&label=)
| [RESTEasy](https://resteasy.github.io) | Fully certified and portable implementation of the JAX-RS specification. | - | - |
| [RestExpress](https://github.com/RestExpress/RestExpress) | Thin wrapper on the JBoss Netty HTTP stack that provides scaling and performance. | ![](https://img.shields.io/github/stars/RestExpress/RestExpress?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/RestExpress/RestExpress?style=flat-square&label=)
| [Restlet Framework](https://github.com/restlet/restlet-framework-java) | Pioneering framework with powerful routing and filtering capabilities, and a unified client and server API. | ![](https://img.shields.io/github/stars/restlet/restlet-framework-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/restlet/restlet-framework-java?style=flat-square&label=)
| [Spark](http://sparkjava.com) | Sinatra inspired framework. | - | - |
| [Crnk](http://www.crnk.io) | Implementation of the JSON API specification to build resource-oriented REST endpoints with sorting, filtering, paging, linking, object graphs, type-safety, bulk updates, integrations and more. | - | - |
| [springdoc-openapi](https://github.com/springdoc/springdoc-openapi) | Automates the generation of API documentation using Spring Boot projects. | ![](https://img.shields.io/github/stars/springdoc/springdoc-openapi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/springdoc/springdoc-openapi?style=flat-square&label=)
| [Swagger](https://swagger.io) | Standard, language-agnostic interface to REST APIs. | - | - |

### Science

_Libraries for scientific computing, analysis and visualization._

|---|---|---|---|
| [BioJava](https://biojava.org/) | Facilitates processing biological data by providing algorithms, file format parsers, sequencing and 3D visualization commonly used in bioinformatics. | - | - |
| [Chart-FX](https://github.com/GSI-CS-CO/chart-fx) | Scientific charting library with focus on performance optimised real-time data visualisation at 25 Hz update rates for large data sets. | ![](https://img.shields.io/github/stars/GSI-CS-CO/chart-fx?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/GSI-CS-CO/chart-fx?style=flat-square&label=)
| [DataMelt](https://datamelt.org/) | Environment for scientific computation, data analysis and data visualization. (GPL-3.0-or-later) | - | - |
| [Erdos](https://github.com/Erdos-Graph-Framework/Erdos) | Modular, light and easy graph framework for theoretic algorithms. | ![](https://img.shields.io/github/stars/Erdos-Graph-Framework/Erdos?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Erdos-Graph-Framework/Erdos?style=flat-square&label=)
| [GraphStream](http://graphstream-project.org) | Library for modeling and analyzing dynamic graphs. | - | - |
| [JFreeChart](http://www.jfree.org/jfreechart/) | 2D chart library for Swing, JavaFX and server-side applications. (LGPL-2.1-only) | - | - |
| [JGraphT](https://github.com/jgrapht/jgrapht) | Graph library that provides mathematical graph-theory objects and algorithms. | ![](https://img.shields.io/github/stars/jgrapht/jgrapht?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jgrapht/jgrapht?style=flat-square&label=)
| [JGraphX](https://github.com/jgraph/jgraphx) | Library for visualizing (mainly Swing) and interacting with node-edge graphs. | ![](https://img.shields.io/github/stars/jgraph/jgraphx?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jgraph/jgraphx?style=flat-square&label=)
| [LogicNG](https://github.com/logic-ng/LogicNG) | Library for creating, manipulating and solving Boolean and Pseudo-Boolean formulas. | ![](https://img.shields.io/github/stars/logic-ng/LogicNG?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/logic-ng/LogicNG?style=flat-square&label=)
| [Mines Java Toolkit](https://github.com/MinesJTK/jtk) | Library for geophysical scientific computation, visualization and digital signal analysis. | ![](https://img.shields.io/github/stars/MinesJTK/jtk?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/MinesJTK/jtk?style=flat-square&label=)
| [Morpheus](https://github.com/zavtech/morpheus-core) | Provides a versatile two-dimensional memory-efficient tabular datastructure (dataframe). | ![](https://img.shields.io/github/stars/zavtech/morpheus-core?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/zavtech/morpheus-core?style=flat-square&label=)
| [Orekit](https://www.orekit.org/) | Low-level space flight dynamics library providing basic elements (orbits, dates, attitude, frames...) and various algorithms (conversions, propagations, pointing...). | - | - |
| [Orson-Charts](https://github.com/jfree/orson-charts) | Generates a wide variety of 3D charts that can be displayed with Swing and JavaFX or exported to PDF, SVG, PNG and JPEG. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/jfree/orson-charts?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jfree/orson-charts?style=flat-square&label=)
| [Tablesaw](https://github.com/jtablesaw/tablesaw) | Includes a data-frame, an embedded column store, and hundreds of methods to transform, summarize, or filter data. | ![](https://img.shields.io/github/stars/jtablesaw/tablesaw?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jtablesaw/tablesaw?style=flat-square&label=)
| [XChart](https://github.com/knowm/XChart) | Light-weight library for plotting data. Many customizable chart types are available. | ![](https://img.shields.io/github/stars/knowm/XChart?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/knowm/XChart?style=flat-square&label=)

### Search

_Engines that index documents for search and analysis._

|---|---|---|---|
| [Apache Lucene](https://lucene.apache.org) | High-performance, full-featured, cross-platform, text search engine library. | - | - |
| [Apache Solr](https://lucene.apache.org/solr/) | Enterprise search engine optimized for high-volume traffic. | - | - |
| [Elasticsearch](https://www.elastic.co) | Distributed, multitenant-capable, full-text search engine with a RESTful web interface and schema-free JSON documents. | - | - |
| [Indexer4j](https://github.com/haeungun/indexer4j) | Simple and light full text indexing and searching library. | ![](https://img.shields.io/github/stars/haeungun/indexer4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/haeungun/indexer4j?style=flat-square&label=)

### Security

_Libraries that handle security, authentication, authorization or session management._

|---|---|---|---|
| [Apache Shiro](https://shiro.apache.org) | Performs authentication, authorization, cryptography and session management. | - | - |
| [Ayza](https://github.com/Hakky54/ayza) | High-level SSL configuration builder for configuring HTTP clients and servers with SSL/TLS. | ![](https://img.shields.io/github/stars/Hakky54/ayza?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Hakky54/ayza?style=flat-square&label=)
| [Bouncy Castle](https://www.bouncycastle.org/java.html) | All-purpose cryptographic library and JCA provider offering a wide range of functions, from basic helpers to PGP/SMIME operations. | - | - |
| [DependencyCheck](https://github.com/jeremylong/DependencyCheck) | Detects publicly disclosed vulnerabilities contained within a project's dependencies. | ![](https://img.shields.io/github/stars/jeremylong/DependencyCheck?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jeremylong/DependencyCheck?style=flat-square&label=)
| [Cryptomator](https://cryptomator.org) | Multiplatform, transparent, client-side encryption of files in the cloud. (GPL-3.0-only) | - | - |
| [Hdiv](https://github.com/hdiv/hdiv) | Runtime application that repels application security risks included in the OWASP Top 10. | ![](https://img.shields.io/github/stars/hdiv/hdiv?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/hdiv/hdiv?style=flat-square&label=)
| [jjwt](https://github.com/jwtk/jjwt) | JSON web token for Java and Android. | ![](https://img.shields.io/github/stars/jwtk/jjwt?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jwtk/jjwt?style=flat-square&label=)
| [jwt-java](https://github.com/BastiaanJansen/jwt-java) | Easily create and parse JSON Web Tokens and create customized JWT validators using a fluent API. | ![](https://img.shields.io/github/stars/BastiaanJansen/jwt-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/BastiaanJansen/jwt-java?style=flat-square&label=)
| [Jwks RSA](https://github.com/auth0/jwks-rsa-java) | JSON Web Key Set parser. | ![](https://img.shields.io/github/stars/auth0/jwks-rsa-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/auth0/jwks-rsa-java?style=flat-square&label=)
| [Kalium](https://github.com/abstractj/kalium) | Binding for the Networking and Cryptography (NaCl) library. | ![](https://img.shields.io/github/stars/abstractj/kalium?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/abstractj/kalium?style=flat-square&label=)
| [Keycloak](https://www.keycloak.org) | Integrated SSO and IDM for browser apps and RESTful web services. | - | - |
| [Keywhiz](https://github.com/square/keywhiz) | System for distributing and managing secrets. | ![](https://img.shields.io/github/stars/square/keywhiz?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/square/keywhiz?style=flat-square&label=)
| [Nbvcxz](https://github.com/GoSimpleLLC/nbvcxz) | Advanced password strength estimation. | ![](https://img.shields.io/github/stars/GoSimpleLLC/nbvcxz?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/GoSimpleLLC/nbvcxz?style=flat-square&label=)
| [OACC](http://oaccframework.org) | Provides permission-based authorization services. | - | - |
| [OpenAM](https://github.com/OpenIdentityPlatform/OpenAM) | Access management solution that includes authentication, SSO, authorization, federation, entitlements and web services security. | ![](https://img.shields.io/github/stars/OpenIdentityPlatform/OpenAM?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/OpenIdentityPlatform/OpenAM?style=flat-square&label=)
| [OTP-Java](https://github.com/BastiaanJansen/OTP-Java) | One-time password generator library according to RFC 4226 (HOTP) and RFC 6238 (TOTP). | ![](https://img.shields.io/github/stars/BastiaanJansen/OTP-Java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/BastiaanJansen/OTP-Java?style=flat-square&label=)
| [pac4j](https://github.com/pac4j/pac4j) | Security engine. | ![](https://img.shields.io/github/stars/pac4j/pac4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/pac4j/pac4j?style=flat-square&label=)
| [Passay](http://www.passay.org/) | Enforce password policy by validating candidate passwords against a configurable rule set. | - | - |
| [Password4j](https://github.com/Password4j/password4j) | User-friendly cryptographic library that supports Argon2, Bcrypt, Scrypt, PBKDF2 and various other cryptographic hash functions. | ![](https://img.shields.io/github/stars/Password4j/password4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Password4j/password4j?style=flat-square&label=)
| [SecurityBuilder](https://github.com/tersesystems/securitybuilder) | Fluent Builder API for JCA and JSSE classes and especially X.509 certificates. | ![](https://img.shields.io/github/stars/tersesystems/securitybuilder?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/tersesystems/securitybuilder?style=flat-square&label=)
| [Themis](https://github.com/cossacklabs/themis) | Multi-platform high-level cryptographic library provides easy-to-use encryption for protecting sensitive data: secure messaging with forward secrecy, secure data storage (AES256GCM). | ![](https://img.shields.io/github/stars/cossacklabs/themis?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cossacklabs/themis?style=flat-square&label=)
| [Tink](https://github.com/google/tink) | Provides a simple and misuse-proof API for common cryptographic tasks. | ![](https://img.shields.io/github/stars/google/tink?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/tink?style=flat-square&label=)
| [Topaz](https://www.topaz.sh) | Fine-grained authorization for applications with support for RBAC, ABAC, and ReBAC. | - | - |

### Serialization

_Libraries that handle serialization with high efficiency._

|---|---|---|---|
| [FlatBuffers](https://github.com/google/flatbuffers) | Memory-efficient serialization library that can access serialized data without unpacking and parsing it. | ![](https://img.shields.io/github/stars/google/flatbuffers?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/flatbuffers?style=flat-square&label=)
| [FST](https://github.com/RuedigerMoeller/fast-serialization) | JDK-compatible, high-performance object graph serialization. | ![](https://img.shields.io/github/stars/RuedigerMoeller/fast-serialization?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/RuedigerMoeller/fast-serialization?style=flat-square&label=)
| [Fury](https://github.com/alipay/fury) | Blazing fast object graph serialization framework powered by JIT and zero-copy. | ![](https://img.shields.io/github/stars/alipay/fury?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/alipay/fury?style=flat-square&label=)
| [Kryo](https://github.com/EsotericSoftware/kryo) | Fast and efficient object graph serialization framework. | ![](https://img.shields.io/github/stars/EsotericSoftware/kryo?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/EsotericSoftware/kryo?style=flat-square&label=)
| [MessagePack](https://github.com/msgpack/msgpack-java) | Efficient binary serialization format. | ![](https://img.shields.io/github/stars/msgpack/msgpack-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/msgpack/msgpack-java?style=flat-square&label=)
| [PHP Serializer](https://github.com/marcospassos/java-php-serializer) | Serializing objects in the PHP serialization format. | ![](https://img.shields.io/github/stars/marcospassos/java-php-serializer?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/marcospassos/java-php-serializer?style=flat-square&label=)

### Server

_Servers specifically used to deploy applications._

|---|---|---|---|
| [Apache Tomcat](https://tomcat.apache.org) | Robust, all-round server for Servlet and JSP. | - | - |
| [Apache TomEE](https://tomee.apache.org) | Tomcat plus Java EE. | - | - |
| [Jetty](https://www.eclipse.org/jetty/) | Provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. | - | - |
| [nanohttpd](https://github.com/NanoHttpd/nanohttpd) | Tiny, easily embeddable HTTP server. | ![](https://img.shields.io/github/stars/NanoHttpd/nanohttpd?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/NanoHttpd/nanohttpd?style=flat-square&label=)
| [WildFly](https://www.wildfly.org) | Formerly known as JBoss and developed by Red Hat with extensive Java EE support. (LGPL-2.1-only) | - | - |

### Template Engine

_Tools that substitute expressions in a template._

|---|---|---|---|
| [Freemarker](https://freemarker.apache.org) | Library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data. | - | - |
| [Handlebars.java](https://jknack.github.io/handlebars.java/) | Logicless and semantic Mustache templates. | - | - |
| [Jade4J](https://github.com/neuland/jade4j) | Implementation of Pug (formerly known as Jade). | ![](https://img.shields.io/github/stars/neuland/jade4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/neuland/jade4j?style=flat-square&label=)
| [Jamal](https://github.com/verhas/jamal) | Extendable template engine embedded into Maven/JavaDoc, supporting multiple extensions with support for snippet handling. | ![](https://img.shields.io/github/stars/verhas/jamal?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/verhas/jamal?style=flat-square&label=)
| [jstachio](https://github.com/jstachio/jstachio) | Typesafe Mustache templating engine. | ![](https://img.shields.io/github/stars/jstachio/jstachio?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jstachio/jstachio?style=flat-square&label=)
| [jte](https://github.com/casid/jte) | Compiles to classes, and uses an easy syntax, several features to make development easier and provides fast execution and a small footprint. | ![](https://img.shields.io/github/stars/casid/jte?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/casid/jte?style=flat-square&label=)
| [Jtwig](https://github.com/jtwig/jtwig) | Modular, configurable and fully tested template engine. | ![](https://img.shields.io/github/stars/jtwig/jtwig?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jtwig/jtwig?style=flat-square&label=)
| [Pebble](https://pebbletemplates.io) | Twig-inspired, separates itself with inheritance features and its easy-to-read syntax, autoescaping for security and i18n. | - | - |
| [Rocker](https://github.com/fizzed/rocker) | Optimized, memory efficient and speedy template engine producing statically typed, plain objects. | ![](https://img.shields.io/github/stars/fizzed/rocker?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/fizzed/rocker?style=flat-square&label=)
| [StringTemplate](https://github.com/antlr/stringtemplate4) | Template engine for generating source code, web pages, emails, or any other formatted text output. | ![](https://img.shields.io/github/stars/antlr/stringtemplate4?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/antlr/stringtemplate4?style=flat-square&label=)
| [Thymeleaf](https://www.thymeleaf.org) | Aims to be a substitute for JSP and works for XML files. | - | - |

### Testing

_Tools that test from model to the view._

#### Asynchronous
_Tools that simplify testing asynchronous services._

#### BDD
_Testing for the software development process that emerged from TDD and was heavily influenced by DDD and OOAD._

#### Fixtures
_Everything related to the creation and handling of random data._

#### Frameworks
_Provide environments to run tests for a specific use case._

#### Matchers
_Libraries that provide custom matchers._

#### Miscellaneous
_Other stuff related to testing._

#### Mocking
_Tools which mock collaborators to help testing single, isolated units._

|---|---|---|---|
| [Awaitility](https://github.com/awaitility/awaitility) | DSL for synchronizing asynchronous operations. | ![](https://img.shields.io/github/stars/awaitility/awaitility?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/awaitility/awaitility?style=flat-square&label=)
| [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) | Toolkit for testing multi-threaded and asynchronous applications. | ![](https://img.shields.io/github/stars/jhalterman/concurrentunit?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jhalterman/concurrentunit?style=flat-square&label=)
| [GreenMail](https://greenmail-mail-test.github.io/greenmail/) | In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL. (GPL-2.0-only) | - | - |
| [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) | Native bindings for Hoverfly, a proxy which allows you to simulate HTTP services. | ![](https://img.shields.io/github/stars/SpectoLabs/hoverfly-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/SpectoLabs/hoverfly-java?style=flat-square&label=)
| [Karate](https://github.com/intuit/karate) | DSL that combines API test-automation, mocks and performance-testing making testing REST/HTTP services easy. | ![](https://img.shields.io/github/stars/intuit/karate?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/intuit/karate?style=flat-square&label=)
| [REST Assured](https://github.com/rest-assured/rest-assured) | DSL for easy testing of REST/HTTP services. | ![](https://img.shields.io/github/stars/rest-assured/rest-assured?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/rest-assured/rest-assured?style=flat-square&label=)
| [WebTau](https://github.com/testingisdocumenting/webtau) | Test across REST-API, Graph QL, Browser, Database, CLI and Business Logic with consistent set of matchers and concepts. | ![](https://img.shields.io/github/stars/testingisdocumenting/webtau?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/testingisdocumenting/webtau?style=flat-square&label=)
| [Cucumber](https://github.com/cucumber/cucumber-jvm) | Provides a way to describe features in a plain language which customers can understand. | ![](https://img.shields.io/github/stars/cucumber/cucumber-jvm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cucumber/cucumber-jvm?style=flat-square&label=)
| [Cukes-REST](https://github.com/ctco/cukes) | Collection of Gherkin steps for REST-service testing using Cucumber. | ![](https://img.shields.io/github/stars/ctco/cukes?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/ctco/cukes?style=flat-square&label=)
| [J8Spec](https://github.com/j8spec/j8spec) | Follows a Jasmine-like syntax. | ![](https://img.shields.io/github/stars/j8spec/j8spec?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/j8spec/j8spec?style=flat-square&label=)
| [JBehave](https://jbehave.org) | Extensively configurable framework that describes stories. | - | - |
| [JGiven](http://jgiven.org) | Provides a fluent API which allows for simpler composition. | - | - |
| [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) | Aims to provide a fluent API to write tests in long and descriptive sentences that read like plain English. | ![](https://img.shields.io/github/stars/RichardWarburton/lambda-behave?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/RichardWarburton/lambda-behave?style=flat-square&label=)
| [Serenity BDD](https://github.com/serenity-bdd/serenity-core) | Automated acceptance testing and reporting library that works with Cucumber, JBehave and JUnit. | ![](https://img.shields.io/github/stars/serenity-bdd/serenity-core?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/serenity-bdd/serenity-core?style=flat-square&label=)
| [AutoParams](https://github.com/AutoParams/AutoParams) | Supports generating test data or combining scenarios for parameterized tests. | ![](https://img.shields.io/github/stars/AutoParams/AutoParams?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/AutoParams/AutoParams?style=flat-square&label=)
| [Beanmother](https://github.com/keepcosmos/beanmother) | Sets up beans from YAML fixtures. | ![](https://img.shields.io/github/stars/keepcosmos/beanmother?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/keepcosmos/beanmother?style=flat-square&label=)
| [Datafaker](https://github.com/datafaker-net/datafaker) | Modern fake data generator forked from Java Faker. | ![](https://img.shields.io/github/stars/datafaker-net/datafaker?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/datafaker-net/datafaker?style=flat-square&label=)
| [Fixture Factory](https://github.com/six2six/fixture-factory) | Generates fake objects from a template. | ![](https://img.shields.io/github/stars/six2six/fixture-factory?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/six2six/fixture-factory?style=flat-square&label=)
| [jFairy](https://github.com/Devskiller/jfairy) | Fake data generator. | ![](https://img.shields.io/github/stars/Devskiller/jfairy?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Devskiller/jfairy?style=flat-square&label=)
| [Instancio](https://github.com/instancio/instancio) | Automates data setup in unit tests by generating fully-populated, reproducible objects. Includes JUnit 5 extension. | ![](https://img.shields.io/github/stars/instancio/instancio?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/instancio/instancio?style=flat-square&label=)
| [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) | JUnit test runner and plugins for running JUnit tests with pseudo-randomness. | ![](https://img.shields.io/github/stars/randomizedtesting/randomizedtesting?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/randomizedtesting/randomizedtesting?style=flat-square&label=)
| [Java Faker](https://github.com/DiUS/java-faker) | Port of Ruby's fake data generator. | ![](https://img.shields.io/github/stars/DiUS/java-faker?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/DiUS/java-faker?style=flat-square&label=)
| [Mockneat](https://github.com/nomemory/mockneat) | Another fake data generator. | ![](https://img.shields.io/github/stars/nomemory/mockneat?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/nomemory/mockneat?style=flat-square&label=)
| [JMock](https://github.com/xcancloud/JMock) | JMock is a high-performance data generation and simulation component library implemented in Java. | ![](https://img.shields.io/github/stars/xcancloud/JMock?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/xcancloud/JMock?style=flat-square&label=)
| [Apache JMeter](http://jmeter.apache.org) | Functional testing and performance measurements. | - | - |
| [JMeter DSL.java](https://abstracta.github.io/jmeter-java-dsl/) | Load tests with JMeter as simple as a JUnit test. | - | - |
| [Arquillian](http://arquillian.org) | Integration and functional testing platform for Java EE containers. | - | - |
| [cdi-test](https://github.com/guhilling/cdi-test) | JUnit extension for easy and efficient testing of CDI components. | ![](https://img.shields.io/github/stars/guhilling/cdi-test?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/guhilling/cdi-test?style=flat-square&label=)
| [Citrus](https://citrusframework.org) | Integration testing framework that focuses on both client- and server-side messaging. | - | - |
| [Gatling](https://gatling.io) | Load testing tool designed for ease of use, maintainability and high performance. | - | - |
| [JUnit](https://junit.org/junit5/) | Common testing framework. | - | - |
| [jqwik](https://jqwik.net) | Engine for property-based testing built on JUnit 5. | - | - |
| [Pact JVM](https://github.com/DiUS/pact-jvm) | Consumer-driven contract testing. | ![](https://img.shields.io/github/stars/DiUS/pact-jvm?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/DiUS/pact-jvm?style=flat-square&label=)
| [PIT](http://pitest.org) | Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test suites. | - | - |
| [weld-testing](https://github.com/weld/weld-testing) | Set of test framework extensions (JUnit 4, JUnit 5, Spock) to enhance the testing of CDI components via Weld. Supports Weld 5. | ![](https://img.shields.io/github/stars/weld/weld-testing?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/weld/weld-testing?style=flat-square&label=)
| [AssertJ](https://joel-costigliola.github.io/assertj/) | Fluent assertions that improve readability. | - | - |
| [Hamcrest](http://hamcrest.org/JavaHamcrest/) | Matchers that can be combined to create flexible expressions of intent. | - | - |
| [JSONAssert](http://jsonassert.skyscreamer.org) | Simplifies testing JSON strings. | - | - |
| [JsonUnit](https://github.com/lukas-krecan/JsonUnit) | Library that simplifies JSON comparison in tests. | ![](https://img.shields.io/github/stars/lukas-krecan/JsonUnit?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lukas-krecan/JsonUnit?style=flat-square&label=)
| [Truth](https://truth.dev) | Google's fluent assertion and proposition framework. | - | - |
| [XMLUnit](https://github.com/xmlunit/xmlunit) | Simplifies testing for XML output. | ![](https://img.shields.io/github/stars/xmlunit/xmlunit?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/xmlunit/xmlunit?style=flat-square&label=)
| [ConsoleCaptor](https://github.com/Hakky54/console-captor) | Captures console output for unit testing purposes. | ![](https://img.shields.io/github/stars/Hakky54/console-captor?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Hakky54/console-captor?style=flat-square&label=)
| [junit-dataprovider](https://github.com/TNG/junit-dataprovider) | TestNG-like data provider/runner for JUnit. | ![](https://img.shields.io/github/stars/TNG/junit-dataprovider?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/TNG/junit-dataprovider?style=flat-square&label=)
| [junit-pioneer](https://junit-pioneer.org/) | JUnit 5 extension pack, pushing the frontiers on Jupiter. | - | - |
| [LogCaptor](https://github.com/Hakky54/log-captor) | Captures log entries for unit testing purposes. | ![](https://img.shields.io/github/stars/Hakky54/log-captor?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/Hakky54/log-captor?style=flat-square&label=)
| [log-capture](https://github.com/dm-drogeriemarkt/log-capture) | Captures log entries and provides assertions for unit and integration testing. | ![](https://img.shields.io/github/stars/dm-drogeriemarkt/log-capture?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dm-drogeriemarkt/log-capture?style=flat-square&label=)
| [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) | Reports whether instances of a given class are immutable. | ![](https://img.shields.io/github/stars/MutabilityDetector/MutabilityDetector?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/MutabilityDetector/MutabilityDetector?style=flat-square&label=)
| [pojo-tester](https://www.pojo.pl) | Automatically performs tests on basic POJO methods. (LGPL-3.0-only) | - | - |
| [raml-tester](https://github.com/nidi3/raml-tester) | Tests if a request/response matches a given RAML definition. | ![](https://img.shields.io/github/stars/nidi3/raml-tester?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/nidi3/raml-tester?style=flat-square&label=)
| [Selfie](https://github.com/diffplug/selfie) | Snapshot testing (inline and on disk). | ![](https://img.shields.io/github/stars/diffplug/selfie?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/diffplug/selfie?style=flat-square&label=)
| [Stebz](https://github.com/stebz/stebz) | Multi-approach framework for test steps managing. | ![](https://img.shields.io/github/stars/stebz/stebz?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/stebz/stebz?style=flat-square&label=)
| [Testcontainers](https://github.com/testcontainers/testcontainers-java) | Provides throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container. | ![](https://img.shields.io/github/stars/testcontainers/testcontainers-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/testcontainers/testcontainers-java?style=flat-square&label=)
| [JMockit](http://jmockit.github.io) | Integration testing, API mocking and faking, and code coverage. | - | - |
| [Mockito](https://github.com/mockito/mockito) | Mocking framework that lets you write tests with a clean and simple API. | ![](https://img.shields.io/github/stars/mockito/mockito?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/mockito/mockito?style=flat-square&label=)
| [MockServer](https://www.mock-server.com) | Allows mocking of systems integrated with HTTPS. | - | - |
| [Moco](https://github.com/dreamhead/moco) | Concise web services for stubs and mocks. | ![](https://img.shields.io/github/stars/dreamhead/moco?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/dreamhead/moco?style=flat-square&label=)
| [PowerMock](https://github.com/powermock/powermock) | Mocks static methods, constructors, final classes and methods, private methods, and removal of static initializers. | ![](https://img.shields.io/github/stars/powermock/powermock?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/powermock/powermock?style=flat-square&label=)
| [WireMock](http://wiremock.org) | Stubs and mocks web services. | - | - |
| [EasyMock](https://github.com/easymock/easymock) | EasyMock is a Java library that provides an easy way to use Mock Objects in unit testing. | ![](https://img.shields.io/github/stars/easymock/easymock?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/easymock/easymock?style=flat-square&label=)

### Utility

_Libraries which provide general utility functions._

|---|---|---|---|
| [Arthas](https://github.com/alibaba/arthas) | Allows to troubleshoot production issues for applications without modifying code or restarting servers. | ![](https://img.shields.io/github/stars/alibaba/arthas?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/alibaba/arthas?style=flat-square&label=)
| [bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) | Rate limiting library based on token-bucket algorithm. | ![](https://img.shields.io/github/stars/vladimir-bukhtoyarov/bucket4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vladimir-bukhtoyarov/bucket4j?style=flat-square&label=)
| [cactoos](https://github.com/yegor256/cactoos) | Collection of object-oriented primitives. | ![](https://img.shields.io/github/stars/yegor256/cactoos?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/yegor256/cactoos?style=flat-square&label=)
| [Chocotea](https://github.com/cleopatra27/chocotea) | Generates postman collection, environment and integration tests from java code. | ![](https://img.shields.io/github/stars/cleopatra27/chocotea?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/cleopatra27/chocotea?style=flat-square&label=)
| [CRaSH](http://www.crashub.org) | Provides a shell into a JVM that's running CRaSH. Used by Spring Boot and others. (LGPL-2.1-or-later) | - | - |
| [Dex](https://github.com/PatMartin/Dex) | Java/JavaFX tool capable of powerful ETL and data visualization. | ![](https://img.shields.io/github/stars/PatMartin/Dex?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/PatMartin/Dex?style=flat-square&label=)
| [dregex](https://github.com/marianobarrios/dregex) | Regex engine that uses deterministic finite automata. Supports some Perl-style features, yet retains linear matching time with set operations. | ![](https://img.shields.io/github/stars/marianobarrios/dregex?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/marianobarrios/dregex?style=flat-square&label=)
| [Embulk](https://github.com/embulk/embulk) | Bulk data loader that helps data transfer between various databases, storages, file formats, and cloud services. | ![](https://img.shields.io/github/stars/embulk/embulk?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/embulk/embulk?style=flat-square&label=)
| [fswatch](https://github.com/vorburger/ch.vorburger.fswatch) | Micro library to watch for directory file system changes, simplifying java.nio.file.WatchService. | ![](https://img.shields.io/github/stars/vorburger/ch.vorburger.fswatch?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/vorburger/ch.vorburger.fswatch?style=flat-square&label=)
| [Gephi](https://github.com/gephi/gephi) | Cross-platform for visualizing and manipulating large graph networks. (GPL-3.0-only) | ![](https://img.shields.io/github/stars/gephi/gephi?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/gephi/gephi?style=flat-square&label=)
| [Guava](https://github.com/google/guava) | Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and more. | ![](https://img.shields.io/github/stars/google/guava?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/google/guava?style=flat-square&label=)
| [JADE](https://jade.tilab.com) | Framework and environment for building and debugging multi-agent systems. (LGPL-2.0-only) | - | - |
| [Javadoc Publisher](https://github.com/MathieuSoysal/Javadoc-publisher.yml) | Generate Javadoc from your maven/gradle project and deploy it automatically on GitHub Page. | ![](https://img.shields.io/github/stars/MathieuSoysal/Javadoc-publisher.yml?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/MathieuSoysal/Javadoc-publisher.yml?style=flat-square&label=)
| [Java Diff Utils](https://java-diff-utils.github.io/java-diff-utils/) | Utilities for text or data comparison and patching. | - | - |
| [JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) | Library that helps with constructing difficult regular expressions. | ![](https://img.shields.io/github/stars/VerbalExpressions/JavaVerbalExpressions?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/VerbalExpressions/JavaVerbalExpressions?style=flat-square&label=)
| [JGit](https://www.eclipse.org/jgit/) | Lightweight, pure Java library implementing the Git version control system. | - | - |
| [JKScope](https://github.com/evpl/jkscope) | Java scope functions inspired by Kotlin. | ![](https://img.shields.io/github/stars/evpl/jkscope?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/evpl/jkscope?style=flat-square&label=)
| [minio-java](https://github.com/minio/minio-java) | Provides simple APIs to access any Amazon S3-compatible object storage server. | ![](https://img.shields.io/github/stars/minio/minio-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/minio/minio-java?style=flat-square&label=)
| [Protégé](https://protege.stanford.edu) | Provides an ontology editor and a framework to build knowledge-based systems. | - | - |
| [Semver4j](https://github.com/semver4j/semver4j) | Lightweight library that helps you handling semantic versioning with different modes. | ![](https://img.shields.io/github/stars/semver4j/semver4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/semver4j/semver4j?style=flat-square&label=)
| [Underscore-java](https://github.com/javadev/underscore-java) | Port of Underscore.js functions. | ![](https://img.shields.io/github/stars/javadev/underscore-java?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/javadev/underscore-java?style=flat-square&label=)

### Version Managers

_Utilities that help create the development shell environment and switch between different Java versions._

|---|---|---|---|
| [jabba](https://github.com/shyiko/jabba) | Java Version Manager inspired by nvm. Supports macOS, Linux and Windows. | ![](https://img.shields.io/github/stars/shyiko/jabba?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/shyiko/jabba?style=flat-square&label=)
| [jenv](https://github.com/jenv/jenv) | Java Version Manager inspired by rbenv. Can configure globally or per project. Tested on Debian and macOS. | ![](https://img.shields.io/github/stars/jenv/jenv?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/jenv/jenv?style=flat-square&label=)
| [SDKMan](https://github.com/sdkman/sdkman-cli) | Java Version Manager inspired by RVM and rbenv. Supports UNIX-based platforms and Windows. | ![](https://img.shields.io/github/stars/sdkman/sdkman-cli?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/sdkman/sdkman-cli?style=flat-square&label=)

### Web Crawling

_Libraries that analyze the content of websites._

|---|---|---|---|
| [Apache Nutch](https://nutch.apache.org) | Highly extensible, highly scalable web crawler for production environments. | - | - |
| [Crawler4j](https://github.com/yasserg/crawler4j) | Simple and lightweight web crawler. | ![](https://img.shields.io/github/stars/yasserg/crawler4j?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/yasserg/crawler4j?style=flat-square&label=)
| [jsoup](https://jsoup.org) | Scrapes, parses, manipulates and cleans HTML. | - | - |
| [StormCrawler](http://stormcrawler.net) | SDK for building low-latency and scalable web crawlers. | - | - |
| [webmagic](https://github.com/code4craft/webmagic) | Scalable crawler with downloading, url management, content extraction and persistent. | ![](https://img.shields.io/github/stars/code4craft/webmagic?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/code4craft/webmagic?style=flat-square&label=)

### Web Frameworks

_Frameworks that handle the communication between the layers of a web application._

|---|---|---|---|
| [ActiveJ](https://activej.io) | Lightweight asynchronous framework built from the ground up for developing high-performance web applications. | - | - |
| [Apache Tapestry](https://tapestry.apache.org) | Component-oriented framework for creating dynamic, robust, highly scalable web applications. | - | - |
| [Apache Wicket](https://wicket.apache.org) | Component-based web application framework similar to Tapestry, with a stateful GUI. | - | - |
| [Blade](https://github.com/lets-blade/blade) | Lightweight, modular framework that aims to be elegant and simple. | ![](https://img.shields.io/github/stars/lets-blade/blade?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/lets-blade/blade?style=flat-square&label=)
| [Bootique](https://bootique.io) | Minimally opinionated framework for runnable apps. | - | - |
| [Firefly](http://www.fireflysource.com) | Asynchronous framework for rapid development of high-performance web application. | - | - |
| [Javalin](https://javalin.io/) | Microframework for web applications. | - | - |
| [Jooby](http://www.jooby.org) | Scalable, fast and modular micro-framework that offers multiple programming models. | - | - |
| [Ninja](http://www.ninjaframework.org) | Full-stack web framework. | - | - |
| [Pippo](http://www.pippo.ro) | Small, highly modularized, Sinatra-like framework. | - | - |
| [Play](https://www.playframework.com) | Built on Akka, it provides predictable and minimal resource consumption (CPU, memory, threads) for highly-scalable applications in Java and Scala. | - | - |
| [PrimeFaces](https://www.primefaces.org) | JSF framework with both free and commercial/support versions and frontend components. | - | - |
| [Ratpack](https://ratpack.io) | Set of libraries that facilitate fast, efficient, evolvable and well-tested HTTP applications. | - | - |
| [Takes](https://github.com/yegor256/takes) | Opinionated web framework which is built around the concepts of True Object-Oriented Programming and immutability. | ![](https://img.shields.io/github/stars/yegor256/takes?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/yegor256/takes?style=flat-square&label=)
| [Vaadin](https://vaadin.com) | Used for building complex, interactive applications with Java alone, enhanceable with TypeScript and React components | - | - |
| [WebForms Core](https://github.com/webforms-core) | A technology for managing HTML tags from the server. | - | - |

### Workflow Orchestration Engines

|---|---|---|---|
| [Cadence](https://cadenceworkflow.io) | Stateful code platform from Uber. | - | - |
| [flowable](https://github.com/flowable/flowable-engine) | Compact and efficient workflow and business process management platform. | ![](https://img.shields.io/github/stars/flowable/flowable-engine?style=flat-square&label=) | ![](https://img.shields.io/github/last-commit/flowable/flowable-engine?style=flat-square&label=)
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

[c]: https://cdn.rawgit.com/akullpp/23246ca832bda82bb505230bf3538e2a/raw/d9bcdb769bf025292f9c6bc1290f01f1fcd1f864/commercial.svg
