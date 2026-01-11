# Awesome Java [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of awesome Java frameworks, libraries and software.

## Contents

- [Awesome Java ](#awesome-java-)
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

_Frameworks and libraries for implementing and verifying design patterns and architecture._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ArchUnit](https://github.com/TNG/ArchUnit) | Unit test architecture rules with a fluent Java API; catches violations at build time. | 3.6k | 3d | Apache-2.0 |
| [jMolecules](https://github.com/xmolecules/jmolecules) | Express DDD, hexagonal, and layered architecture concepts directly in code with type-safe annotations. | 1.5k | 1mo | Apache-2.0 |

### Artificial Intelligence

_Frameworks for integrating LLMs and AI capabilities._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [LangChain4j](https://github.com/langchain4j/langchain4j) | Unified API for 15+ LLM providers with RAG, function calling, and AI services out of the box. | 10.3k | 18h | Apache-2.0 |
| [MCP Java SDK](https://github.com/modelcontextprotocol/java-sdk) | Model Context Protocol implementation enabling standardized AI model interactions with sync/async support. | 3.1k | 1d | MIT |
| [simple-openai](https://github.com/sashirestela/simple-openai) | Lightweight, zero-dependency OpenAI API client with streaming support. | 368 | 3mo | MIT |
| [Spring AI](https://spring.io/projects/spring-ai) | Spring-native AI framework with portable APIs across AI providers and vector stores. | - | - | - |

### Bean Mapping

_Frameworks that ease bean mapping._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [dOOv](https://github.com/doov-io/doov) | Fluent, typesafe DSL for domain validation and mapping with code generation. | - | - | - |
| [JMapper](https://github.com/jmapper-framework/jmapper-core) | Bytecode-powered mapper achieving near-native performance; supports annotations, API, or XML config. | 242 | 2y | Apache-2.0 |
| [MapStruct](https://github.com/mapstruct/mapstruct) | Compile-time code generator producing type-safe, reflection-free mappers with zero runtime overhead. | 7.6k | 9d | - |
| [ModelMapper](https://github.com/modelmapper/modelmapper) | Convention-based mapper that auto-matches properties, reducing boilerplate. | 2.3k | 2mo | Apache-2.0 |
| [Orika](https://github.com/orika-mapper/orika) | Bytecode-generated mappers with automatic type conversion and deep copying. | 1.3k | 1y | Apache-2.0 |
| [reMap](https://github.com/remondis-it/remap) | Lambda-based mapping with compile-time safety; no annotations required. | 126 | 2mo | Apache-2.0 |
| [Selma](https://github.com/xebia-france/selma) | Annotation processor generating optimized mappers at compile time. | - | - | - |

### Build

_Tools that handle the build cycle and dependencies of an application._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Maven](https://maven.apache.org) | Industry-standard declarative build tool with convention-over-configuration and vast plugin ecosystem. | - | - | - |
| [Bazel](https://bazel.build) | Google's build system with aggressive caching, remote execution, and reproducible builds at scale. | - | - | - |
| [Buck2](https://github.com/facebook/buck2) | Meta's fast build system with fine-grained parallelism and remote execution support. | 4.2k | 7h | Apache-2.0 |
| [Gradle](https://gradle.org) | Flexible build automation with incremental builds, build caching, and Kotlin/Groovy DSL. | - | - | - |

### Bytecode Manipulation

_Libraries to manipulate bytecode programmatically._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ASM](https://asm.ow2.io) | Low-level, high-performance bytecode manipulation; the foundation for most other tools. | - | - | - |
| [Byte Buddy](https://bytebuddy.net) | Fluent API for runtime code generation without needing bytecode knowledge. | - | - | - |
| [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) | All-in-one reverse engineering suite for JAR and APK files. | 15.4k | 3d | GPL-3.0 |
| [Byteman](https://byteman.jboss.org) | Rule-based runtime bytecode injection for testing and fault injection. | - | - | - |
| [cglib](https://github.com/cglib/cglib) | High-level bytecode generation for proxies and interceptors. | 4.9k | 1y | Apache-2.0 |
| [Javassist](https://github.com/jboss-javassist/javassist) | Edit bytecode using Java source syntax, no low-level knowledge required. | 4.2k | 1y | - |
| [Maker](https://github.com/cojen/maker) | Lightweight, low-level bytecode generation with minimal dependencies. | 65 | 1d | Apache-2.0 |
| [Mixin](https://github.com/SpongePowered/Mixin) | Runtime class transformation using annotated Java code; popular in Minecraft modding. | 1.7k | 1y | MIT |
| [Perses](https://github.com/nicolasmanic/perses) | Chaos engineering via bytecode-level fault injection. | - | - | - |
| [Recaf](https://www.coley.software/Recaf/) | Modern bytecode editor IDE with decompilation, search, and hex editing. | - | - | - |

### Caching

_Libraries that provide caching facilities._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [cache2k](https://cache2k.org) | In-memory cache with sub-microsecond access times and advanced expiry policies. | - | - | - |
| [Caffeine](https://github.com/ben-manes/caffeine) | Near-optimal hit rates via Window TinyLFU algorithm; Java's fastest cache. | 17.4k | 1d | Apache-2.0 |
| [Ehcache](http://www.ehcache.org) | Mature, JCache-compliant cache with tiered storage (heap/off-heap/disk). | - | - | - |
| [Infinispan](https://infinispan.org) | Distributed, clustered cache with transactions and query support. | - | - | - |

### CLI

_Libraries for everything related to the CLI._

#### Argument Parsing

_Libraries to assist with parsing command line arguments._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Airline](https://rvesse.github.io/airline/) | Git-style CLI parser with annotation-based commands and subcommands. | - | - | - |
| [JCommander](http://jcommander.org) | Annotation-driven parser with custom type converters and validation. | - | - | - |
| [jbock](https://github.com/jbock-java/jbock) | Compile-time CLI parser with zero reflection and zero dependencies. | 89 | 4d | MIT |
| [JLine](https://github.com/jline/jline3) | Rich terminal handling with tab-completion, history, and syntax highlighting. | 1.7k | 4d | - |
| [picocli](https://picocli.info) | Zero-dependency CLI framework with ANSI colors, autocompletion, and GraalVM native support. | - | - | - |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Airline](https://rvesse.github.io/airline/) | Git-style CLI parser with annotation-based commands and subcommands. | - | - | - |
| [JCommander](http://jcommander.org) | Annotation-driven parser with custom type converters and validation. | - | - | - |
| [jbock](https://github.com/jbock-java/jbock) | Compile-time CLI parser with zero reflection and zero dependencies. | 89 | 4d | MIT |
| [JLine](https://github.com/jline/jline3) | Rich terminal handling with tab-completion, history, and syntax highlighting. | 1.7k | 4d | - |
| [picocli](https://picocli.info) | Zero-dependency CLI framework with ANSI colors, autocompletion, and GraalVM native support. | - | - | - |

#### Text-Based User Interfaces

_Libraries that provide TUI frameworks or building blocks._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Jansi](https://github.com/fusesource/jansi) | Cross-platform ANSI escape code support for colored console output. | 1.2k | 8mo | Apache-2.0 |
| [Jexer](https://gitlab.com/AutumnMeowMeow/jexer) | Full-featured TUI with windows, menus, and sixel graphics; Turbo Vision-style. | - | - | - |
| [Text-IO](https://github.com/beryx/text-io) | Simple API for interactive console applications with input validation. | 351 | 2y | Apache-2.0 |
| [Lanterna](https://github.com/mabe02/lanterna) | Curses-like TUI with cross-platform terminal abstraction. | 2.5k | 5mo | LGPL-3.0 |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Jansi](https://github.com/fusesource/jansi) | Cross-platform ANSI escape code support for colored console output. | 1.2k | 8mo | Apache-2.0 |
| [Jexer](https://gitlab.com/AutumnMeowMeow/jexer) | Full-featured TUI with windows, menus, and sixel graphics; Turbo Vision-style. | - | - | - |
| [Text-IO](https://github.com/beryx/text-io) | Simple API for interactive console applications with input validation. | 351 | 2y | Apache-2.0 |
| [Lanterna](https://github.com/mabe02/lanterna) | Curses-like TUI with cross-platform terminal abstraction. | 2.5k | 5mo | LGPL-3.0 |

### Cloud

_Libraries to integrate cloud platform services._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AWS SDK for Java](https://github.com/aws/aws-sdk-java) | Official SDK covering 200+ AWS services with async support and pagination. | 4.2k | 4d | Apache-2.0 |
| [Google Cloud Client Libraries](https://github.com/googleapis/google-cloud-java) | Idiomatic Java clients for GCP services with automatic retries and streaming. | 2.0k | 8h | Apache-2.0 |

### Code Analysis

_Tools that provide metrics and quality measurements._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Checkstyle](https://github.com/checkstyle/checkstyle) | Enforces coding standards with 150+ configurable checks. | 8.8k | now | LGPL-2.1 |
| [Error Prone](https://github.com/google/error-prone) | Google's compiler plugin catching bugs at compile time with auto-fixes. | 7.1k | 1d | Apache-2.0 |
| [Error Prone Support](https://github.com/PicnicSupermarket/error-prone-support) | 100+ additional Error Prone checks and Refaster refactoring templates. | 232 | 9h | MIT |
| [Infer](https://github.com/facebook/infer) | Meta's static analyzer detecting null dereferences, resource leaks, and concurrency issues. | 15.5k | 4h | MIT |
| [jQAssistant](https://jqassistant.org) | Query codebase structure with Cypher on a Neo4j graph. | - | - | - |
| [NullAway](https://github.com/uber/NullAway) | Fast null-safety checker with minimal annotation overhead; Uber-proven. | 4.0k | 15h | MIT |
| [PMD](https://github.com/pmd/pmd) | Extensible static analyzer detecting code smells and copy-paste issues. | 5.3k | 3d | - |
| [p3c](https://github.com/alibaba/p3c) | Alibaba's Java coding guidelines as PMD rules and IDE plugins. | 30.8k | 1y | Apache-2.0 |
| [RefactorFirst](https://github.com/jimbethancourt/RefactorFirst) | Prioritizes refactoring targets by God Class and coupling metrics. | - | - | - |
| [SonarJava](https://github.com/SonarSource/sonar-java) | 600+ rules for SonarQube with security hotspot detection. | 1.2k | 1d | - |
| [Spoon](https://github.com/INRIA/spoon) | Full Java AST API for analysis, transformation, and code generation. | 1.9k | 5h | - |
| [Spotbugs](https://github.com/spotbugs/spotbugs) | FindBugs successor; bytecode analysis for 400+ bug patterns. | 3.8k | 9h | LGPL-2.1 |

### Code Coverage

_Frameworks and tools for collecting code coverage metrics._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Clover](https://www.atlassian.com/software/clover) | Source-level instrumentation with detailed per-test coverage and historical trends. | - | - | - |
| [Cobertura](https://cobertura.github.io/cobertura/) | Bytecode instrumentation with branch coverage and complexity metrics. | - | - | - |
| [JaCoCo](https://www.eclemma.org/jacoco/) | Lightweight agent with line/branch/instruction coverage and IDE/CI integration. | - | - | - |

### Code Generators

_Tools that generate patterns to reduce verbosity and boilerplate._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ADT4J](https://github.com/sviperll/adt4j) | Generates algebraic data types (sealed hierarchies) with pattern matching. | 147 | 7y | BSD-3-Clause |
| [Auto](https://github.com/google/auto) | Google's annotation processors for AutoValue, AutoFactory, and AutoService. | 10.5k | 2d | Apache-2.0 |
| [Avaje Http Server](https://avaje.io/http/) | Compile-time HTTP server generation for Javalin/Helidon; no reflection. | - | - | - |
| [Bootify](https://bootify.io) | Browser-based Spring Boot scaffolding with JPA entities and REST APIs. | - | - | - |
| [EasyEntityToDTO](https://github.com/Marcel091004/EasyEntityToDTO) | Annotation processor generating DTOs and mappers automatically. | 6 | 7mo | MIT |
| [FreeBuilder](https://github.com/inferred/FreeBuilder) | Generates Builder pattern with validation and partial builds. | 833 | 1y | Apache-2.0 |
| [Geci](https://github.com/verhas/javageci) | Test-time code generator that updates source files in-place. | 135 | 3y | Apache-2.0 |
| [Immutables](https://immutables.github.io) | Generates immutable value objects with builders, JSON support, and interning. | - | - | - |
| [JavaPoet](https://github.com/square/javapoet) | Fluent API for generating `.java` source files programmatically. | 10.9k | 1y | Apache-2.0 |
| [JHipster](https://github.com/jhipster/generator-jhipster) | Full-stack app generator for Spring Boot + Angular/React/Vue. | 22.3k | 1h | Apache-2.0 |
| [Joda-Beans](https://www.joda.org/joda-beans/) | Adds queryable, serializable properties to POJOs via code generation. | - | - | - |
| [JPA Buddy](https://www.jpa-buddy.com) | IntelliJ plugin for visual JPA entity design with Liquibase/Flyway diff generation. | - | - | - |
| [JSpecify Package-Info Generator](https://github.com/bcaillard/jspecify-packageinfo-generator) | Maven plugin auto-generating `package-info.java` with nullness annotations. | 1 | 1mo | Apache-2.0 |
| [Lombok](https://projectlombok.org) | Eliminates boilerplate with annotations for getters, builders, and more. | - | - | - |
| [Record-Builder](https://github.com/Randgalt/record-builder) | Generates builders and withers for Java records. | 900 | 1mo | Apache-2.0 |
| [Telosys](https://www.telosys.org/) | Template-driven code generator for any language via CLI or Eclipse. | - | - | - |

### Compiler-compiler

_Frameworks for creating parsers, interpreters, or compilers._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ANTLR](https://www.antlr.org) | Powerful LL(\*) parser generator with IDE support and multiple target languages. | - | - | - |
| [JavaCC](https://javacc.github.io/javacc/) | LL(k) parser generator with lookahead, lexical states, and tree building. | - | - | - |
| [JFlex](https://jflex.de) | Fast lexer generator with full Unicode support and JLex compatibility. | - | - | - |

### Computer Vision

_Libraries for image and video analysis._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [BoofCV](https://boofcv.org) | Real-time computer vision with 3D reconstruction, fiducial detection, and feature tracking. | - | - | - |
| [ImageJ](https://imagej.net/ImageJ) | Extensible image analysis platform with 500+ plugins for scientific imaging. | - | - | - |
| [JavaCV](https://github.com/bytedeco/javacv) | Java bindings for OpenCV, FFmpeg, TensorFlow, and more via JavaCPP. | 8.3k | 13d | - |

### Configuration

_Libraries that provide external configuration._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [avaje config](https://avaje.io/config/) | Lightweight config with YAML/properties, file watching, and dynamic reload. | - | - | - |
| [centraldogma](https://github.com/line/centraldogma) | Git-backed, versioned configuration service with change notifications. | 654 | 2d | Apache-2.0 |
| [config](https://github.com/lightbend/config) | HOCON/JSON/properties with substitutions, includes, and environment overrides. | 6.3k | 4mo | - |
| [Configurate](https://github.com/SpongePowered/Configurate) | Multi-format config (YAML, JSON, HOCON, XML) with type-safe object mapping. | 449 | 21h | Apache-2.0 |
| [Curator Framework](https://curator.apache.org/) | Simplified ZooKeeper client with recipes for locks, leaders, and caches. | - | - | - |
| [dotenv](https://github.com/shyiko/dotenv) | Twelve-factor app config from `.env` files with environment overrides. | 50 | 7y | - |
| [Externalized Properties](https://github.com/joel-jeremy/externalized-properties) | Interface-based config with pluggable sources and automatic type conversion. | 32 | 29d | Apache-2.0 |
| [Gestalt](https://github.com/gestalt-config/gestalt) | Multi-source config merging with type-safe binding and validation. | 94 | 14h | Apache-2.0 |
| [ini4j](http://ini4j.sourceforge.net) | Windows INI file parser with section and multi-value support. | - | - | - |
| [KAConf](https://github.com/mariomac/kaconf) | Annotation-based config injection for Java and Kotlin. | 61 | 3y | Apache-2.0 |
| [microconfig](https://microconfig.io) | Microservice config management with inheritance and environment profiles. | - | - | - |
| [owner](https://github.com/lviggiano/owner) | Type-safe properties via interfaces with automatic conversion. | - | - | - |

### Constraint Satisfaction Problem Solver

_Libraries for optimization and satisfiability problems._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Choco](https://choco-solver.org) | Powerful CP solver with global constraints and search strategies. | - | - | - |
| [JaCoP](https://github.com/radsz/jacop) | Constraint solver with MiniZinc/FlatZinc support for modeling. | 231 | 2y | - |
| [OptaPlanner](https://www.optaplanner.org) | AI constraint solver for planning problems like scheduling and routing. | - | - | - |
| [Timefold](https://timefold.ai/docs) | OptaPlanner fork with Spring/Quarkus integration and production-ready quickstarts. | - | - | - |

### CSV

_Libraries for reading and writing CSV data._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [FastCSV](https://github.com/osiegmar/FastCSV) | Ultra-fast, zero-dependency, RFC 4180-compliant CSV parser. | 657 | 21d | MIT |
| [jackson-dataformat-csv](https://github.com/FasterXML/jackson-dataformat-csv) | CSV via Jackson's streaming API with schema support. | 194 | 8y | - |
| [opencsv](http://opencsv.sourceforge.net) | Simple parser with bean binding and custom separators. | - | - | - |
| [Super CSV](https://super-csv.github.io/super-csv/) | Cell processors for validation, conversion, and constraint checking. | - | - | - |
| [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) | Fastest parser with CSV/TSV/fixed-width support and streaming. | 931 | 1y | - |

### Data Structures

_Efficient and specialized data structures._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Avro](https://avro.apache.org) | Schema-evolution-friendly serialization with compact binary format. | - | - | - |
| [Apache Orc](https://orc.apache.org) | Columnar storage with predicate pushdown and ACID support for Hive. | - | - | - |
| [Apache Parquet](https://parquet.apache.org) | Columnar format with efficient compression and encoding for analytics. | - | - | - |
| [Apache Thrift](https://thrift.apache.org) | Cross-language RPC framework with compact binary protocol. | - | - | - |
| [Big Queue](https://github.com/bulldog2011/bigqueue) | Memory-mapped persistent queue handling 100M+ items. | 568 | 3y | Apache-2.0 |
| [HyperMinHash-java](https://github.com/LiveRamp/HyperMinHash-java) | Probabilistic set operations in O(log log n) space. | N/A | N/A | - |
| [Persistent Collection](https://github.com/hrldcpr/pcollections) | Immutable collections with efficient structural sharing. | 784 | 5mo | - |
| [Protobuf](https://github.com/protocolbuffers/protobuf) | Google's language-neutral, schema-driven binary serialization. | 70.3k | 42m | - |
| [RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) | Compressed bitmaps faster than traditional implementations by orders of magnitude. | 3.8k | 25d | Apache-2.0 |
| [SBE](https://github.com/real-logic/simple-binary-encoding) | Zero-copy, zero-allocation messaging for ultra-low latency. | - | - | - |
| [Tape](https://github.com/square/tape) | Crash-safe, file-based FIFO queue for Android and Java. | 2.5k | 2y | Apache-2.0 |
| [Wire](https://github.com/square/wire) | Lightweight Protocol Buffers with Kotlin and Java codegen. | 4.4k | 2d | Apache-2.0 |

### Database

_Everything that simplifies database interactions._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Calcite](https://calcite.apache.org) | SQL parser, optimizer, and query federation framework for building databases. | - | - | - |
| [Apache Drill](https://drill.apache.org) | Schema-free SQL for JSON, Parquet, and NoSQL with distributed execution. | - | - | - |
| [Apache Phoenix](https://phoenix.apache.org) | SQL skin over HBase with secondary indexes and transactions. | - | - | - |
| [ArangoDB](https://github.com/arangodb/arangodb-java-driver) | Multi-model (document/graph/key-value) database driver with async support. | 205 | 1d | Apache-2.0 |
| [Chronicle Map](https://github.com/OpenHFT/Chronicle-Map) | Off-heap, persisted ConcurrentMap with microsecond latency. | 2.9k | 1d | Apache-2.0 |
| [Debezium](https://debezium.io/) | CDC platform streaming database changes to Kafka in real-time. | - | - | - |
| [druid](https://druid.apache.org) | Real-time OLAP database with sub-second queries at scale. | - | - | - |
| [eXist](https://github.com/eXist-db/exist) | Native XML database with XQuery and full-text search. | 457 | 1d | LGPL-2.1 |
| [FlexyPool](https://github.com/vladmihalcea/flexy-pool) | Connection pool monitoring with auto-scaling and failover. | 1.2k | 1mo | Apache-2.0 |
| [Flyway](https://flywaydb.org) | Version-controlled SQL migrations with rollback support. | - | - | - |
| [H2](https://h2database.com) | Embeddable SQL database with in-memory mode; great for testing. | - | - | - |
| [HikariCP](https://github.com/brettwooldridge/HikariCP) | Fastest JDBC connection pool with minimal overhead. | 20.9k | 2mo | Apache-2.0 |
| [HSQLDB](https://hsqldb.org/) | Pure Java SQL database with in-memory and file-based modes. | - | - | - |
| [JDBI](http://jdbi.org) | Fluent, annotation-free SQL API built on JDBC. | - | - | - |
| [Jedis](https://github.com/xetorthio/jedis) | Battle-tested Redis client with connection pooling and pipelining. | - | - | - |
| [Jest](https://github.com/searchbox-io/Jest) | Elasticsearch REST client with async support and bulk operations. | 2.1k | 2y | Apache-2.0 |
| [jetcd](https://github.com/justinsb/jetcd) | Official etcd v3 client with watch and lease support. | 140 | 2y | Apache-2.0 |
| [Jinq](https://github.com/my2iu/Jinq) | LINQ-style queries via lambda symbolic execution on JPA/jOOQ. | 663 | 7mo | - |
| [jOOQ](https://www.jooq.org) | Typesafe SQL DSL generated from your schema; catches errors at compile time. | - | - | - |
| [Leaf](https://github.com/Meituan-Dianping/Leaf) | Meituan's distributed ID generator with segment and snowflake modes. | 6.7k | 2y | Apache-2.0 |
| [Lettuce](https://lettuce.io/) | Reactive, non-blocking Redis client with cluster and Sentinel support. | - | - | - |
| [Liquibase](http://www.liquibase.org) | Database-agnostic migrations with rollback and diff capabilities. | - | - | - |
| [MapDB](http://www.mapdb.org) | Concurrent maps/sets backed by disk or off-heap memory with transactions. | - | - | - |
| [MariaDB4j](https://github.com/vorburger/MariaDB4j) | Embedded MariaDB for integration testing; no install required. | 15 | 7d | Apache-2.0 |
| [Modality](https://github.com/arkanovicz/modality) | Lightweight ORM with schema introspection and code generation. | 15 | 1mo | Apache-2.0 |
| [OpenDJ](https://github.com/OpenIdentityPlatform/OpenDJ) | High-performance LDAPv3 directory service with replication. | 422 | 1mo | - |
| [Querydsl](http://www.querydsl.com) | Unified typesafe queries for JPA, SQL, MongoDB, and more. | - | - | - |
| [QueryStream](https://github.com/querystream/querystream) | Stream API for building JPA Criteria queries fluently. | 20 | 8mo | Apache-2.0 |
| [QuestDB](https://github.com/questdb/questdb) | Time-series database with millions of inserts/sec and SQL support. | 16.5k | 8m | Apache-2.0 |
| [Realm](https://github.com/realm/realm-java) | Mobile-first database with live objects and offline-first sync. | 11.5k | 3mo | Apache-2.0 |
| [Redisson](https://github.com/redisson/redisson) | Redis-backed distributed collections, locks, and services. | 24.2k | 5d | Apache-2.0 |
| [requery](https://github.com/requery/requery) | Modern ORM with compile-time query validation and RxJava support. | 3.1k | 3y | Apache-2.0 |
| [Speedment](https://github.com/speedment/speedment) | Stream-based database queries generated from schema. | 2.1k | 2y | Apache-2.0 |
| [Spring Data JPA MongoDB Expressions](https://github.com/mhewedy/spring-data-jpa-mongodb-expressions) | MongoDB-style queries for relational databases via Spring Data. | 101 | 21d | Apache-2.0 |
| [Trino](https://trino.io) | Federated SQL engine querying data lakes and databases at petabyte scale. | - | - | - |
| [Vibur DBCP](https://www.vibur.org) | JDBC pool with statement caching and slow query logging. | - | - | - |
| [Xodus](https://github.com/JetBrains/xodus) | JetBrains' embedded transactional database; powers YouTrack. | 1.3k | 1mo | Apache-2.0 |
| [CosId](https://github.com/Ahoo-Wang/CosId) | High-performance distributed ID generator with multiple algorithms. | 599 | 7h | Apache-2.0 |
| [Apache ShardingSphere](https://github.com/apache/shardingsphere) | Database middleware for sharding, encryption, and distributed transactions. | 20.6k | 1h | Apache-2.0 |

### Date and Time

_Libraries for handling date and time._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [iCal4j](https://github.com/ical4j/ical4j) | RFC 5545 iCalendar parser with recurrence rule support. | 821 | 11d | BSD-3-Clause |
| [Jollyday](https://github.com/svendiedrichsen/jollyday) | Holiday calculations for 70+ countries with regional variations. | 192 | 1y | - |
| [ThreeTen-Extra](https://github.com/ThreeTen/threeten-extra) | Extra date/time types: Interval, YearQuarter, and more for java.time. | 420 | 4mo | BSD-3-Clause |
| [Time4J](https://github.com/MenoData/Time4J) | Comprehensive date/time with calendars, i18n, and formatting. | 470 | 1y | LGPL-2.1 |

### Decentralization

_Libraries for blockchain and decentralized applications._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [java-tron](https://github.com/tronprotocol/java-tron) | Full node implementation of the TRON blockchain protocol. | 4.0k | 11d | LGPL-3.0 |

### Dependency Injection

_Libraries for Inversion of Control and dependency injection._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache DeltaSpike](https://deltaspike.apache.org) | Portable CDI extensions for configuration, security, and data. | - | - | - |
| [Avaje Inject](https://avaje.io/inject/) | Compile-time DI with no reflection; optimized for microservices. | - | - | - |
| [Dagger](https://dagger.dev/) | Google's compile-time DI with zero reflection overhead. | - | - | - |
| [Feather](https://github.com/zsoltherpai/feather) | Ultra-lightweight JSR-330 DI in ~16KB. | 362 | 7y | - |
| [Governator](https://github.com/Netflix/governator) | Netflix's Guice extensions with lifecycle management and warmup. | 826 | 24d | Apache-2.0 |
| [Guice](https://github.com/google/guice) | Google's lightweight DI with runtime binding and AOP support. | 12.7k | 1mo | Apache-2.0 |
| [HK2](https://eclipse-ee4j.github.io/glassfish-hk2/) | JSR-330 DI with dynamic service discovery; powers Jersey/GlassFish. | - | - | - |
| [JayWire](https://github.com/vanillasource/jaywire) | Minimal DI with no annotations required. | 60 | 2y | - |

### Development

_Tools that augment the development process._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AspectJ](https://www.eclipse.org/aspectj/) | Full-featured AOP with compile-time and load-time weaving. | - | - | - |
| [DCEVM](https://dcevm.github.io) | HotSwap on steroids: redefine classes, add methods/fields at runtime. | - | - | - |
| [Faux Pas](https://github.com/zalando/faux-pas) | Checked exception handling in lambdas and streams elegantly. | 140 | 6mo | MIT |
| [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) | Hot reload classes, Spring beans, and resources without restart. | 2.5k | 22d | GPL-2.0 |
| [JavaParser](https://github.com/javaparser/javaparser) | Parse, analyze, transform, and generate Java source code. | 6.0k | 16h | - |
| [JavaSymbolSolver](https://github.com/javaparser/javasymbolsolver) | Resolve symbols and types in JavaParser ASTs. | 296 | 7y | Apache-2.0 |
| [Manifold](https://github.com/manifold-systems/manifold) | Compiler plugins for JSON types, extension methods, and string templates. | 2.7k | 9d | Apache-2.0 |
| [NoException](https://noexception.machinezoo.com) | Functional exception handling with sneaky throws and Optional conversion. | - | - | - |
| [SneakyThrow](https://github.com/rainerhahnekamp/sneakythrow) | Throw checked exceptions from lambdas without wrapping. | 79 | 6y | MIT |
| [Tail](https://nrktkt.github.io/tail/) | Tail call optimization via trampolining for stack-safe recursion. | - | - | - |

### Distributed Applications

_Libraries and frameworks for distributed and fault-tolerant systems._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Geode](https://geode.apache.org) | In-memory data grid with continuous queries and WAN replication. | - | - | - |
| [Apache Storm](https://storm.apache.org) | Real-time stream processing with guaranteed processing and fault tolerance. | - | - | - |
| [Apache ZooKeeper](https://zookeeper.apache.org) | Distributed coordination for config, locks, and leader election. | - | - | - |
| [Atomix](https://atomix.io) | Raft-based distributed primitives: maps, locks, leader election. | - | - | - |
| [Axon](https://axoniq.io) | CQRS/Event Sourcing framework with saga and event store support. | - | - | - |
| [Dropwizard Circuit Breaker](https://github.com/mtakaki/dropwizard-circuitbreaker) | Annotation-based circuit breakers for Dropwizard. | 45 | 6mo | GPL-2.0 |
| [Failsafe](https://github.com/jhalterman/failsafe) | Lightweight fault tolerance with retries, circuit breakers, and fallbacks. | - | - | - |
| [Hazelcast](https://github.com/hazelcast/hazelcast) | In-memory data grid with distributed maps, queues, and compute. | 6.6k | 2d | - |
| [JGroups](http://www.jgroups.org) | Reliable multicast and cluster membership toolkit. | - | - | - |
| [Quasar](http://docs.paralleluniverse.co/quasar/) | Fibers (lightweight threads) and actors for the JVM. | - | - | - |
| [resilience4j](https://github.com/resilience4j/resilience4j) | Functional fault tolerance: circuit breakers, rate limiters, bulkheads. | 10.5k | 8d | Apache-2.0 |
| [OpenIG](https://github.com/OpenIdentityPlatform/OpenIG) | Identity gateway with SSO, credential replay, and request filtering. | 86 | 25d | - |
| [ScaleCube Services](https://github.com/scalecube/scalecube-services) | Reactive microservices with SWIM gossip and service discovery. | 636 | 2d | Apache-2.0 |
| [Zuul](https://github.com/Netflix/zuul) | Netflix's edge gateway for routing, filtering, and load balancing. | 14.0k | 19h | Apache-2.0 |

### Distributed Transactions

_Ensuring data consistency across distributed systems._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Atomikos](https://www.atomikos.com) | JTA/XA transaction manager for microservices and REST. | - | - | - |
| [Bitronix](https://github.com/bitronix/btm) | Embeddable JTA 1.1 transaction manager with connection pooling. | - | - | - |
| [Narayana](https://narayana.io) | Red Hat's JTA/JTS transaction manager with saga support. | - | - | - |
| [Seata](https://github.com/seata/seata) | Alibaba's distributed transaction solution with AT/TCC/SAGA modes. | - | - | - |

### Distribution

_Tools for distributing applications in native formats._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Artipie](https://github.com/artipie/artipie) | Self-hosted artifact repository supporting Maven, Docker, npm on S3/filesystem. | 649 | 3mo | MIT |
| [Boxfuse](https://boxfuse.com) | Immutable AWS deployments with minimal VM images. | - | - | - |
| [Capsule](https://github.com/puniverse/capsule) | Single-file deployment with embedded JVM and dependency resolution. | 1.2k | 3y | EPL-1.0 |
| [Central Repository](https://search.maven.org) | Maven Central: the default artifact repository for the Java ecosystem. | - | - | - |
| [Cloudsmith](https://cloudsmith.io) | Cloud artifact hosting with Maven/Gradle support and free tier. | - | - | - |
| [Getdown](https://github.com/threerings/getdown) | Java Web Start replacement with auto-updates and delta patching. | 525 | 1y | - |
| [IzPack](http://izpack.org) | Cross-platform installer builder with XML configuration. | - | - | - |
| [JavaPackager](https://github.com/fvarrui/JavaPackager) | Maven/Gradle plugin creating native executables and installers. | - | - | - |
| [jDeploy](https://www.jdeploy.com) | Deploy Java desktop apps via npm with native bundles. | - | - | - |
| [jlink.online](https://github.com/AdoptOpenJDK/jlink.online) | HTTP API for custom JRE generation via jlink. | 50 | 1y | Apache-2.0 |
| [Nexus](https://www.sonatype.com) | Repository manager with proxying, caching, and security scanning. | - | - | - |
| [packr](https://github.com/libgdx/packr) | Bundle JRE with your app for native Windows/Mac/Linux distribution. | 2.6k | 1y | Apache-2.0 |
| [really-executable-jars-maven-plugin](https://github.com/brianm/really-executable-jars-maven-plugin) | Creates JARs executable via `./app.jar` on Unix. | 133 | 2y | Apache-2.0 |

### Document Processing

_Libraries for processing office document formats._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache POI](https://poi.apache.org) | Full Office document support: Excel, Word, PowerPoint (OLE2 & OOXML). | - | - | - |
| [documents4j](https://documents4j.com/#/) | Document conversion API using MS Office or LibreOffice backends. | - | - | - |
| [docx4j](https://www.docx4java.org/trac/docx4j) | JAXB-based DOCX/PPTX/XLSX manipulation with mail merge. | - | - | - |
| [fastexcel](https://github.com/dhatim/fastexcel) | Streaming Excel read/write handling millions of rows with low memory. | 855 | 4d | - |
| [zerocell](https://github.com/creditdatamw/zerocell) | Annotation-driven Excel to POJO mapping with minimal overhead. | 81 | 1y | Apache-2.0 |

### Financial

_Libraries for the financial domain._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Cassandre](https://github.com/cassandre-tech/cassandre-trading-bot) | Trading bot framework with exchange integration and backtesting. | 650 | 10mo | GPL-3.0 |
| [Parity](https://github.com/paritytrading/parity) | Open-source stock exchange with matching engine and market data. | 501 | 3y | Apache-2.0 |
| [Philadelphia](https://github.com/paritytrading/philadelphia) | Low-latency FIX protocol implementation. | 339 | 14d | Apache-2.0 |
| [Square](https://github.com/square/connect-java-sdk) | Official Square payments API client. | 40 | 4y | Apache-2.0 |
| [Stripe](https://github.com/stripe/stripe-java) | Official Stripe API client for payments and subscriptions. | 944 | 2d | MIT |
| [ta4j](https://github.com/ta4j/ta4j) | Technical analysis library with 130+ indicators and backtesting. | 2.3k | 2d | - |

### Formal Verification

_Proof assistants, model checking, and symbolic execution tools._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [CATG](https://github.com/ksen007/janala2) | Concolic testing: auto-generates tests via symbolic execution. | N/A | N/A | - |
| [Checker Framework](https://checkerframework.org) | Pluggable type systems for nullness, tainting, and more. | - | - | - |
| [Daikon](https://plse.cs.washington.edu/daikon/) | Dynamic invariant detection; infers likely specifications from runs. | - | - | - |
| [Java Path Finder (JPF)](https://github.com/javapathfinder/jpf-core) | NASA's model checker for finding concurrency bugs and deadlocks. | 593 | 25d | - |
| [JMLOK 2.0](https://massoni.computacao.ufcg.edu.br/home/jmlok) | Detects JML specification violations via random testing. | - | - | - |
| [KeY](https://www.key-project.org) | Deductive verification using JML and symbolic execution. | - | - | - |
| [OpenJML](http://www.openjml.org) | JML verification via SMT solvers (Z3, CVC4). | - | - | - |

### Functional Programming

_Libraries that facilitate functional programming._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Cyclops](https://github.com/aol/cyclops) | Monads, pattern matching, and persistent collections for functional Java. | 1.3k | 2y | Apache-2.0 |
| [derive4j](https://github.com/derive4j/derive4j) | Algebraic data types with pattern matching via annotation processing. | 577 | 3y | - |
| [Fugue](https://bitbucket.org/atlassian/fugue) | Atlassian's functional extensions: Option, Either, and more. | - | - | - |
| [Functional Java](http://www.functionaljava.org) | Immutable collections, monads, and functional data structures. | - | - | - |
| [jOOλ](https://github.com/jOOQ/jOOL) | Tuples, Seq, and unchecked functional interfaces for streams. | 2.1k | 1y | Apache-2.0 |
| [Packrat](https://github.com/jhspetersson/packrat) | Custom Gatherers for Java Stream intermediate operations. | 24 | 6d | Apache-2.0 |
| [protonpack](https://github.com/poetix/protonpack) | Stream utilities: zip, unfold, takeWhile, and windowing. | 485 | 1y | MIT |
| [StreamEx](https://github.com/amaembo/streamex) | Enhanced streams with parallel support and additional collectors. | 2.3k | 4mo | Apache-2.0 |
| [Vavr](https://www.vavr.io) | Scala-inspired FP: immutable collections, Try, Either, pattern matching. | - | - | - |

### Game Development

_Frameworks for game development._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [FXGL](https://almasb.github.io/FXGL/) | JavaFX game engine with ECS, physics, and UI out of the box. | - | - | - |
| [JBox2D](http://www.jbox2d.org/) | Box2D physics engine port for 2D rigid body simulation. | - | - | - |
| [jMonkeyEngine](https://jmonkeyengine.org) | Full-featured 3D engine with PBR, physics, and networking. | - | - | - |
| [libGDX](https://libgdx.com) | Cross-platform 2D/3D framework deploying to desktop, Android, iOS, web. | - | - | - |
| [Litiengine](https://litiengine.com/) | Pure Java 2D engine with no native dependencies. | - | - | - |
| [LWJGL](https://www.lwjgl.org) | Low-level bindings to OpenGL, Vulkan, OpenAL, and more. | - | - | - |
| [Mini2Dx](https://mini2dx.org) | Beginner-friendly 2D framework with tiled map and UI support. | - | - | - |
| [Void2D](https://github.com/xzripper/Void2D) | Swing-based 2D engine with physics for simple games. | N/A | N/A | - |
| [vulkan4j](https://github.com/chuigda/vulkan4j) | Vulkan and OpenGL ES2 bindings via Panama FFM. | - | - | - |

### Geospatial

_Libraries for geospatial data and algorithms._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache SIS](https://sis.apache.org) | OGC/ISO standards-based geospatial metadata and referencing. | - | - | - |
| [ArcGIS Maps SDK for Java](https://github.com/Esri/arcgis-maps-sdk-java-samples/) | Esri's JavaFX SDK for mapping and spatial analysis. | N/A | N/A | - |
| [Geo](https://github.com/davidmoten/geo) | GeoHash encoding/decoding with spatial indexing. | 431 | 3d | Apache-2.0 |
| [GeoTools](https://geotools.org) | Comprehensive GIS toolkit for OGC standards. | - | - | - |
| [GraphHopper](https://github.com/graphhopper/graphhopper) | Fast routing engine with turn costs and isochrones. | 6.2k | 1d | Apache-2.0 |
| [H2GIS](http://www.h2gis.org) | Spatial SQL extension for H2 with OGC compliance. | - | - | - |
| [Jgeohash](https://astrapi69.github.io/jgeohash/) | GeoHash algorithm with neighbor calculation and bounding boxes. | - | - | - |
| [Mapsforge](https://github.com/mapsforge/mapsforge) | Offline map rendering from OpenStreetMap vector data. | 1.3k | 4d | LGPL-3.0 |
| [Spatial4j](https://github.com/locationtech/spatial4j) | Geospatial shapes and distance calculations for search engines. | 954 | 7mo | - |

### GUI

_Libraries for modern graphical user interfaces._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [JavaFX](https://wiki.openjdk.java.net/display/OpenJFX/Main) | Rich client platform with CSS styling, FXML, and hardware acceleration. | - | - | - |
| [Scene Builder](https://gluonhq.com/products/scene-builder/) | Drag-and-drop FXML UI designer for JavaFX. | - | - | - |
| [SnapKit](https://github.com/reportmill/SnapKit) | Cross-platform UI (desktop/web) with declarative layout. | 310 | 13h | - |
| [SWT](https://www.eclipse.org/swt/) | Eclipse's native widget toolkit for OS-native look and feel. | - | - | - |

### High Performance

_High-performance collections and computation libraries._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Agrona](https://github.com/real-logic/Agrona) | Off-heap buffers, ring buffers, and lock-free data structures. | - | - | - |
| [Disruptor](https://lmax-exchange.github.io/disruptor/) | Lock-free ring buffer achieving 25M+ msgs/sec between threads. | - | - | - |
| [Eclipse Collections](https://github.com/eclipse/eclipse-collections) | Memory-efficient collections with primitives and immutables. | - | - | - |
| [fastutil](http://fastutil.di.unimi.it) | Primitive collections 2-3x faster than java.util. | - | - | - |
| [HPPC](https://labs.carrotsearch.com/hppc.html) | High-performance primitive collections with minimal memory. | - | - | - |
| [JCTools](https://github.com/JCTools/JCTools) | Non-blocking queues: SPSC, MPSC, MPMC for concurrent apps. | 3.8k | 1y | Apache-2.0 |
| [Koloboke](https://github.com/leventov/Koloboke) | Fastest hash maps/sets with primitive specialization. | 1.0k | 8y | - |

### HTTP Clients

_Libraries for creating HTTP requests and binding responses._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache HttpComponents](https://hc.apache.org/) | Full-featured HTTP client with connection pooling and async support. | - | - | - |
| [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) | Non-blocking HTTP/WebSocket client on Netty. | 6.4k | 10d | - |
| [Avaje Http Client](https://avaje.io/http-client) | JDK HttpClient wrapper with declarative interfaces and JSON binding. | - | - | - |
| [Feign](https://github.com/OpenFeign/feign) | Declarative REST client via annotated interfaces. | 9.8k | 2d | Apache-2.0 |
| [Google HTTP Client](https://github.com/googleapis/google-http-java-client) | Pluggable transport with JSON parsing and OAuth support. | 1.4k | 21d | Apache-2.0 |
| [methanol](https://github.com/mizosoft/methanol) | JDK HttpClient extensions: caching, compression, multipart. | 286 | 19d | MIT |
| [Retrofit](https://square.github.io/retrofit/) | Type-safe REST client with pluggable converters and call adapters. | - | - | - |
| [Ribbon](https://github.com/Netflix/ribbon) | Netflix's client-side load balancer with retry policies. | 4.6k | 24d | Apache-2.0 |
| [Riptide](https://github.com/zalando/riptide) | Response routing DSL for RestTemplate with problem+json support. | 329 | 19h | MIT |
| [unirest-java](https://github.com/Kong/unirest-java) | Fluent HTTP client with JSON, async, and file upload support. | 2.7k | 1mo | MIT |

### Hypermedia Types

_Libraries for hypermedia API serialization._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [hate](https://github.com/blackdoor/hate) | HAL+JSON builder with link templating support. | 25 | 2y | MIT |
| [JSON-LD](https://github.com/jsonld-java/jsonld-java) | W3C JSON-LD processor with expansion, compaction, and framing. | 386 | 2y | BSD-3-Clause |
| [Siren4J](https://github.com/eserating-chwy/siren4j) | Siren hypermedia builder with actions and embedded entities. | 28 | 1y | MIT |
| [Spring HATEOAS](https://github.com/spring-projects/spring-hateoas) | Multi-format hypermedia (HAL, HAL-FORMS, Collection+JSON) for Spring. | 1.1k | 25d | Apache-2.0 |

### IDE

_Integrated development environments._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Eclipse](https://www.eclipse.org) | Extensible IDE with vast plugin ecosystem and multi-language support. | - | - | - |
| [IntelliJ IDEA](https://www.jetbrains.com/idea/) | Smart IDE with deep refactoring, inspections, and framework support. | - | - | - |
| [jGRASP](https://www.jgrasp.org) | Educational IDE with control structure and UML visualizations. | - | - | - |
| [NetBeans](https://netbeans.apache.org) | Apache IDE with Java SE/EE, Maven, and Git integration. | - | - | - |
| [SnapCode](https://reportmill.com/SnapCode/) | Browser-based Java IDE for learning with live preview. | - | - | - |
| [Visual Studio Code](https://code.visualstudio.com/docs/languages/java) | Lightweight editor with Java extensions for debugging and Maven. | - | - | - |

### Imagery

_Libraries for image creation, evaluation, and manipulation._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Barcode-Lib4J](https://github.com/vws-java/Barcode-Lib4J) | Vector/raster barcode generation with CMYK and high-DPI support. | 9 | 17d | Apache-2.0 |
| [Imgscalr](https://github.com/rkalla/imgscalr) | Hardware-accelerated image scaling with quality presets. | 1.2k | 2y | Apache-2.0 |
| [Tess4J](https://github.com/nguyenq/tess4j) | Tesseract OCR wrapper for text extraction from images. | 1.7k | 13d | Apache-2.0 |
| [Thumbnailator](https://github.com/coobird/thumbnailator) | Fluent API for high-quality thumbnail generation. | 5.4k | 1d | MIT |
| [TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) | ImageIO plugins for TIFF, PSD, WebP, and more formats. | 2.1k | 3d | BSD-3-Clause |
| [ZXing](https://github.com/zxing/zxing) | Multi-format barcode scanning and generation library. | 33.8k | 1mo | Apache-2.0 |
| [image-comparison](https://github.com/romankh3/image-comparison) | Visual diff tool highlighting image differences with rectangles. | 385 | 7mo | Apache-2.0 |
| [vips-ffm](https://github.com/lopcode/vips-ffm) | Blazing-fast libvips bindings via Panama FFM. | 98 | 10d | Apache-2.0 |
| [scrimage](https://sksamuel.github.io/scrimage) | Immutable image operations: resize, crop, filters, and formats. | - | - | - |

### Introspection

_Libraries for easier and faster reflection._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ClassGraph](https://github.com/classgraph/classgraph) | Ultra-fast classpath scanner with parallel processing and module support. | 3.0k | 3mo | MIT |
| [jOOR](https://github.com/jOOQ/jOOR) | Fluent reflection API simplifying method invocation and field access. | 2.8k | 1y | Apache-2.0 |
| [Mirror](http://projetos.vidageek.net/mirror/mirror/) | Simplified reflection for common tasks with a clean API. | - | - | - |
| [Objenesis](http://objenesis.org) | Instantiate objects bypassing constructors; used by serializers. | - | - | - |
| [ReflectASM](https://github.com/EsotericSoftware/reflectasm) | Code-generated reflection achieving near-native performance. | 1.5k | 7mo | BSD-3-Clause |
| [Reflections](https://github.com/ronmamo/reflections) | Runtime metadata scanning for annotations, subtypes, and resources. | 4.8k | 1y | WTFPL |

### Job Scheduling

_Libraries for scheduling background jobs._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [JobRunr](https://github.com/jobrunr/jobrunr) | Distributed job scheduler with lambda-based jobs and dashboard. | 2.8k | 1d | - |
| [Quartz](https://github.com/quartz-scheduler/quartz) | Enterprise scheduler with cron expressions and clustering support. | 6.7k | 3d | Apache-2.0 |
| [Sundial](https://github.com/knowm/Sundial) | Lightweight Quartz wrapper with simplified configuration. | 276 | 1y | Apache-2.0 |
| [Wisp](https://github.com/Coreoz/Wisp) | Minimal scheduler (~10KB) with cron and fixed-delay scheduling. | 141 | 7mo | Apache-2.0 |
| [db-scheduler](https://github.com/kagkarlsson/db-scheduler) | Persistent scheduler with cluster coordination via database locks. | 1.5k | 3d | Apache-2.0 |
| [easy-batch](https://github.com/j-easy/easy-batch) | Batch processing with readers, processors, and writers pipeline. | 629 | 2y | MIT |
| [shedlock](https://github.com/lukas-krecan/ShedLock) | Distributed lock ensuring single execution across cluster nodes. | 4.1k | 16h | Apache-2.0 |

### JSON

_Libraries for JSON serialization and deserialization._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Avaje Jsonb](https://avaje.io/jsonb/) | Compile-time JSON binding with no reflection; Jackson-compatible annotations. | - | - | - |
| [DSL-JSON](https://github.com/ngs-doo/dsl-json) | Fastest JSON library via compile-time generated readers/writers. | 1.1k | 1y | BSD-3-Clause |
| [Genson](http://genson.io) | Feature-rich JSON with streaming, polymorphism, and JAX-RS support. | - | - | - |
| [Gson](https://github.com/google/gson) | Google's simple JSON library with no-config serialization. | 24.3k | 8d | Apache-2.0 |
| [HikariJSON](https://github.com/brettwooldridge/HikariJSON) | Ultra-fast JSON parser; 2x faster than Jackson. | 465 | 2y | Apache-2.0 |
| [jackson-modules-java8](https://github.com/FasterXML/jackson-modules-java8) | Jackson support for Optional, JSR-310 dates, and parameter names. | 417 | 10d | Apache-2.0 |
| [Jackson-datatype-money](https://github.com/zalando/jackson-datatype-money) | Jackson serializer/deserializer for JavaMoney types. | 264 | 6mo | MIT |
| [Jackson](https://github.com/FasterXML/jackson) | Industry-standard JSON with streaming, data-binding, and modules. | 9.6k | 8d | - |
| [JSON-io](https://github.com/jdereg/json-io) | Deep object graph serialization with cycle handling. | 343 | 4d | Apache-2.0 |
| [jsoniter](http://jsoniter.com) | Iterator-style API for streaming and lazy JSON parsing. | - | - | - |
| [LoganSquare](https://github.com/bluelinelabs/LoganSquare) | Compile-time JSON for Android; faster than Gson and Jackson. | 3.2k | 4y | Apache-2.0 |
| [Moshi](https://github.com/square/moshi) | Square's modern JSON with Kotlin support and adapters. | 10.1k | 5d | Apache-2.0 |
| [Yasson](https://github.com/eclipse-ee4j/yasson) | Jakarta JSON Binding (JSON-B) reference implementation. | 215 | 6mo | - |
| [fastjson](https://github.com/alibaba/fastjson) | Alibaba's high-performance JSON with JSONPath support. | 25.7k | 1y | Apache-2.0 |
| [Jolt](https://github.com/bazaarvoice/jolt) | JSON-to-JSON transformation via shift, default, and sort specs. | 1.7k | 6mo | Apache-2.0 |
| [JsonPath](https://github.com/json-path/JsonPath) | XPath-like queries for extracting JSON data. | 9.4k | 2mo | Apache-2.0 |
| [JsonSurfer](https://github.com/jsurfer/JsonSurfer) | Streaming JsonPath for processing large JSON without loading all. | - | - | - |

### JVM and JDK

_JVM and JDK implementations._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Which JDK](https://whichjdk.com/) | Decision guide for choosing a JDK distribution. | - | - | - |
| [Adopt Open JDK](https://adoptopenjdk.net) | Community OpenJDK with HotSpot and OpenJ9 variants. | - | - | - |
| [Corretto](https://aws.amazon.com/corretto/) | Amazon's LTS OpenJDK with AWS optimizations. | - | - | - |
| [Dragonwell8](https://github.com/alibaba/dragonwell8) | Alibaba's OpenJDK optimized for long-running services. | - | - | - |
| [Graal](https://github.com/oracle/graal) | Polyglot VM with native image compilation (GraalVM). | 21.4k | 12h | - |
| [Liberica JDK](https://bell-sw.com) | JCK-certified OpenJDK with JavaFX bundled option. | - | - | - |
| [OpenJ9](https://github.com/eclipse/openj9) | Eclipse JVM with low memory footprint and fast startup. | - | - | - |
| [Open JDK](https://openjdk.java.net) | Reference implementation and development home. | - | - | - |
| [ParparVM](https://github.com/codenameone/CodenameOne/tree/master/vm) | Non-blocking GC VM for iOS mobile development. | N/A | N/A | - |
| [RedHat Open JDK](https://developers.redhat.com/products/openjdk/overview) | Red Hat's enterprise-supported OpenJDK. | - | - | - |
| [SAP Machine](https://sap.github.io/SapMachine/) | SAP's JCK-verified OpenJDK for enterprise. | - | - | - |
| [Zulu](https://www.azul.com/products/zulu-community/) | Azul's TCK-certified OpenJDK with commercial support option. | - | - | - |
| [Microsoft JDK](https://github.com/microsoft/openjdk) | Microsoft's OpenJDK build with Azure optimizations. | 340 | 2mo | MIT |

### Logging

_Libraries for application logging._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Log4j 2](https://logging.apache.org/log4j/) | Async logging with lazy evaluation and plugin architecture. | - | - | - |
| [Echopraxia](https://github.com/tersesystems/echopraxia) | Structured logging API with conditions and JSON context. | 58 | 10mo | - |
| [Graylog](https://www.graylog.org) | Centralized log management with search and dashboards. | - | - | - |
| [Kibana](https://www.elastic.co/kibana) | Elasticsearch visualization for log analysis and monitoring. | - | - | - |
| [Logback](http://logback.qos.ch) | SLF4J native implementation with Groovy config and filters. | - | - | - |
| [Logbook](https://github.com/zalando/logbook) | HTTP request/response logging with filtering and correlation. | 2.0k | 17h | MIT |
| [Logstash](https://www.elastic.co/logstash) | Log pipeline for parsing, transforming, and forwarding. | - | - | - |
| [p6spy](https://github.com/p6spy/p6spy) | JDBC proxy logging all SQL with timing; no code changes. | 2.2k | 3y | Apache-2.0 |
| [SLF4J](http://www.slf4j.org) | Universal logging facade; bind to any implementation. | - | - | - |
| [tinylog](https://tinylog.org/v2/) | Minimalist logger with static API and 100KB footprint. | - | - | - |
| [OpenTracing Toolbox](https://github.com/zalando/opentracing-toolbox) | OpenTracing extensions for Spring and Servlet tracing. | 180 | 6mo | MIT |
| [Flogger](https://google.github.io/flogger/) | Google's fluent logging API with lazy argument evaluation. | - | - | - |

### Machine Learning

_Tools for machine learning and statistical algorithms._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Flink](https://flink.apache.org) | Stream/batch processing with exactly-once semantics and ML pipelines. | - | - | - |
| [Apache Mahout](https://mahout.apache.org) | Distributed ML for clustering, classification, and recommendations. | - | - | - |
| [DatumBox](http://www.datumbox.com) | Pre-trained NLP models for sentiment, topic, and spam detection. | - | - | - |
| [Deeplearning4j](https://deeplearning4j.org) | Distributed deep learning with Spark and GPU support. | - | - | - |
| [DJL](https://djl.ai) | Deep learning abstraction for PyTorch, TensorFlow, and MXNet. | - | - | - |
| [H2O](https://www.h2o.ai) | AutoML platform with in-memory distributed training. | - | - | - |
| [Intelligent java](https://github.com/Barqawiz/IntelliJava) | Unified API for OpenAI, Cohere, and other AI services. | - | - | - |
| [JSAT](https://github.com/EdwardRaff/JSAT) | Pure Java ML library with 100+ algorithms. | 800 | 3y | GPL-3.0 |
| [m2cgen](https://github.com/BayesWitnesses/m2cgen) | Export trained models to Java/C/Python code. | 2.9k | 1y | MIT |
| [Neureka](https://github.com/Gleethos/neureka) | OpenCL-accelerated tensor library for neural networks. | 86 | 1y | MIT |
| [oj! Algorithms](https://www.ojalgo.org/) | High-performance linear algebra and optimization solvers. | - | - | - |
| [Oryx 2](https://github.com/OryxProject/oryx) | Real-time ML on Spark with serving layer and model updates. | 1.8k | 4y | Apache-2.0 |
| [Siddhi](https://github.com/siddhi-io/siddhi) | Complex event processing for streaming analytics. | 1.6k | 5mo | Apache-2.0 |
| [Smile](https://github.com/haifengl/smile) | Comprehensive ML library with Scala API and visualization. | 6.3k | 1d | - |
| [Tribuo](https://tribuo.org/) | Oracle's ML library with reproducibility and ONNX export. | - | - | - |
| [Weka](https://www.cs.waikato.ac.nz/ml/weka/) | GUI-based ML toolkit with 100+ algorithms. | - | - | - |

### Messaging

_Message brokers and communication libraries._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Aeron](https://github.com/real-logic/Aeron) | Ultra-low-latency messaging with UDP multicast and IPC. | - | - | - |
| [Apache ActiveMQ](https://activemq.apache.org) | JMS broker with persistence, clustering, and REST API. | - | - | - |
| [Apache Camel](https://camel.apache.org) | 300+ connectors with Enterprise Integration Patterns routing. | - | - | - |
| [Apache Kafka](https://kafka.apache.org) | Distributed event streaming with exactly-once semantics. | - | - | - |
| [Apache Pulsar](https://pulsar.apache.org) | Multi-tenant messaging with tiered storage and geo-replication. | - | - | - |
| [Apache RocketMQ](https://rocketmq.apache.org) | Alibaba's distributed messaging with transactions and scheduling. | - | - | - |
| [Apache Qpid](https://qpid.apache.org) | AMQP 1.0 broker and client libraries. | - | - | - |
| [AutoMQ](https://github.com/AutoMQ/automq-for-kafka) | Cloud-native Kafka with S3 storage and auto-scaling. | - | - | - |
| [Deezpatch](https://github.com/joel-jeremy/deezpatch) | In-process message dispatcher with compile-time handler resolution. | 64 | 1mo | Apache-2.0 |
| [EventBus](https://github.com/greenrobot/EventBus) | Android-optimized publish/subscribe event bus. | 24.8k | 1y | Apache-2.0 |
| [Hermes](http://hermes.allegro.tech) | Kafka REST proxy with schema validation and rate limiting. | - | - | - |
| [JeroMQ](https://github.com/zeromq/jeromq) | Pure Java ZeroMQ with pub/sub, push/pull patterns. | 2.4k | 1mo | MPL-2.0 |
| [Nakadi](https://github.com/zalando/nakadi) | Event bus REST API with schema registry on Kafka. | 968 | 1y | MIT |
| [RabbitMQ Java client](https://github.com/rabbitmq/rabbitmq-java-client) | Official AMQP client with connection recovery. | 1.3k | 1d | - |
| [Smack](https://github.com/igniterealtime/Smack) | XMPP client for IM, presence, and extensions. | 2.4k | 1mo | Apache-2.0 |
| [NATS client](https://github.com/nats-io/nats.java) | Lightweight messaging client for NATS with JetStream. | 640 | 1d | Apache-2.0 |

### Microservice

_Tools for building and managing microservices._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ActiveRPC](https://rpc.activej.io) | Zero-allocation RPC with 15M+ requests/sec throughput. | - | - | - |
| [Armeria](https://github.com/line/armeria) | Async microservice framework with gRPC, Thrift, and REST on Netty. | 5.1k | 1d | Apache-2.0 |
| [consul-api](https://github.com/Ecwid/consul-api) | Consul client for service discovery, health checks, and KV store. | 423 | 2y | Apache-2.0 |
| [Eureka](https://github.com/Netflix/eureka) | Netflix's service registry with self-preservation and replication. | 12.7k | 23d | Apache-2.0 |
| [Helidon](https://helidon.io) | Oracle's microservice framework: SE (functional) or MP (MicroProfile). | - | - | - |
| [JDA](https://github.com/DV8FromTheWorld/JDA) | Discord API wrapper with event handling and slash commands. | - | - | - |
| [KeenType](https://github.com/DaveJarvis/KeenType) | Modern TeX implementation for document typesetting. | N/A | N/A | - |
| [kubernetes-client](https://github.com/fabric8io/kubernetes-client) | Fluent Kubernetes/OpenShift API client with CRD support. | 3.6k | 21h | Apache-2.0 |
| [Micronaut](https://micronaut.io) | Compile-time DI framework with instant startup and low memory. | - | - | - |
| [Nacos](https://nacos.io) | Alibaba's service discovery and config management platform. | - | - | - |
| [OpenAI-Java](https://github.com/TheoKanning/openai-java) | OpenAI API client for GPT, DALL-E, and Whisper. | 4.8k | 1y | MIT |
| [Quarkus](https://quarkus.io) | Supersonic Java with native compilation and live reload. | - | - | - |
| [Sentinel](https://github.com/alibaba/Sentinel) | Flow control, circuit breaking, and real-time monitoring. | 23.0k | 8d | Apache-2.0 |

### Miscellaneous

_Everything else._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [CQEngine](https://github.com/npgall/cqengine) | In-memory indexed collections with SQL-like queries in microseconds. | 1.8k | 2y | Apache-2.0 |
| [Design Patterns](https://github.com/iluwatar/java-design-patterns) | 100+ design patterns with Java examples and explanations. | 93.6k | 2mo | - |
| [FF4J](https://github.com/ff4j/ff4j) | Feature flags with web console, audit, and Spring integration. | 1.4k | 20d | Apache-2.0 |
| [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition) | Satirical over-engineered FizzBuzz demonstrating pattern overuse. | 23.1k | 1y | - |
| [IP2Location.io Java SDK](https://github.com/ip2location/ip2location-io-java) | IP geolocation and WHOIS lookup API client. | 7 | 10d | MIT |
| [ISBN core](https://github.com/ladutsko/isbn-core) | ISBN-10/13 parsing, validation, and formatting. | 3 | 14d | MIT |
| [J2ObjC](https://github.com/google/j2objc) | Google's Java to Objective-C transpiler for iOS code sharing. | 6.0k | 1d | Apache-2.0 |
| [JBake](https://jbake.org) | Static site generator with Freemarker, Groovy, and Markdown. | - | - | - |
| [JBot](https://github.com/rampatra/jbot) | Slack and Facebook Messenger bot framework. | 1.2k | 3mo | GPL-3.0 |
| [JCuda](http://jcuda.org) | Java bindings for CUDA GPU computing. | - | - | - |
| [JEmoji](https://github.com/felldo/JEmoji) | Type-safe emoji library with Discord/Slack alias support. | 102 | 4d | Apache-2.0 |
| [Jimfs](https://github.com/google/jimfs) | In-memory file system for testing with full NIO.2 support. | 2.5k | 8d | Apache-2.0 |
| [Joda-Money](https://www.joda.org/joda-money/) | Money and currency handling with BigDecimal precision. | - | - | - |
| [jOOX](https://github.com/jooq/joox) | jQuery-style fluent API for XML DOM manipulation. | 505 | 1y | Apache-2.0 |
| [JPad](http://jpad.io) | Code snippet runner with instant results. | - | - | - |
| [jsweet](https://github.com/cincheo/jsweet) | Java to TypeScript/JavaScript transpiler. | 1.5k | 2y | - |
| [Maven Wrapper](https://github.com/takari/maven-wrapper) | Ensure consistent Maven version without local installation. | 1.6k | 4y | Apache-2.0 |
| [Membrane Service Proxy](https://github.com/membrane/service-proxy) | API gateway with OAuth2, rate limiting, and transformation. | - | - | - |
| [MinimalFTP](https://github.com/Guichaguri/MinimalFTP) | Embeddable FTP server in ~50KB. | 186 | 6mo | Apache-2.0 |
| [LittleProxy](https://github.com/adamfisk/LittleProxy) | Netty-based HTTP proxy with MITM support. | 2.1k | 1y | Apache-2.0 |
| [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) | Comprehensive Java 8 tutorial with streams and lambdas. | 16.8k | 2y | MIT |
| [Modernizer](https://github.com/gaul/modernizer-maven-plugin) | Detect legacy API usage (Guava → Java 8, etc.). | 383 | 8d | Apache-2.0 |
| [OctoLinker](https://github.com/OctoLinker/OctoLinker) | GitHub browser extension linking imports to source files. | 5.3k | 2y | MIT |
| [OpenRefine](http://openrefine.org) | Data cleaning and transformation tool with reconciliation. | - | - | - |
| [PipelinR](https://github.com/sizovs/pipelinr) | Mediator pattern for command/query handlers. | 476 | 4mo | MIT |
| [Polyglot for Maven](https://github.com/takari/polyglot-maven) | Write POMs in Groovy, Kotlin, Scala, or YAML. | 915 | 1mo | EPL-1.0 |
| [RR4J](https://github.com/Kartikvk1996/RR4J) | Record and replay Java execution for debugging. | 25 | 3y | GPL-3.0 |
| [Simple Java Mail](https://github.com/bbottema/simple-java-mail) | Fluent email API with SMTP, attachments, and embedding. | 1.3k | 7mo | Apache-2.0 |
| [Smooks](https://github.com/smooks/smooks) | Event-driven data transformation and routing framework. | 415 | 1mo | - |
| [Svix](https://github.com/svix/svix-webhooks/tree/main/java) | Webhook delivery platform with retries and signature verification. | N/A | N/A | - |
| [Togglz](https://www.togglz.org) | Feature toggles with admin console and Spring Boot starter. | - | - | - |
| [TypeTools](https://github.com/jhalterman/typetools) | Runtime generic type resolution for type-safe APIs. | 628 | 2y | Apache-2.0 |
| [webcam-capture](https://github.com/sarxos/webcam-capture) | Cross-platform webcam access with motion detection. | 2.3k | 2mo | MIT |
| [XMLBeam](https://github.com/SvenEwald/xmlbeam) | XPath-based XML projection onto Java interfaces. | 76 | 5mo | Apache-2.0 |
| [yGuard](https://github.com/yWorks/yGuard) | Bytecode obfuscator with name mangling and shrinking. | 449 | 6mo | MIT |
| [JBang](https://github.com/maxandersen/jbang/) | Run Java as scripts with inline dependency declarations. | N/A | N/A | - |

### Mobile Development

_Tools for mobile application development._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Codename One](https://www.codenameone.com) | Write once, deploy native iOS/Android/web from Java. | - | - | - |
| [MobileUI](https://mobileui.dev) | Native mobile UI from Java/Kotlin with platform widgets. | - | - | - |
| [Multi-OS Engine](https://multi-os-engine.org) | Shared Java codebase with native iOS/Android UI bindings. | - | - | - |

### Monitoring

_Tools for observability and telemetry._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apitally](https://github.com/apitally/apitally-java) | Privacy-focused API analytics with request logging. | 5 | 13h | MIT |
| [Automon](https://github.com/stevensouza/automon) | AOP-based monitoring integration with JAMon/Metrics. | 573 | 1y | Apache-2.0 |
| [Datadog](https://github.com/DataDog/dd-trace-java) | APM agent with distributed tracing and profiling. | 684 | 3h | Apache-2.0 |
| [Dropwizard Metrics](https://github.com/dropwizard/metrics) | Application metrics with JMX, Graphite, and Prometheus export. | 7.9k | 13d | Apache-2.0 |
| [Failsafe Actuator](https://github.com/zalando/failsafe-actuator) | Spring Boot Actuator endpoints for Failsafe circuit breakers. | 54 | 3y | MIT |
| [Glowroot](https://glowroot.org) | Lightweight APM with transaction tracing and historical analysis. | - | - | - |
| [HertzBeat](https://github.com/dromara/hertzbeat) | Agentless monitoring for servers, databases, and APIs. | - | - | - |
| [hippo4j](https://github.com/opengoofy/hippo4j/blob/develop/README-EN.md) | Dynamic thread pool tuning with web console. | N/A | N/A | - |
| [inspectIT](https://www.inspectit.rocks) | Bytecode-level APM with OpenTracing and EUM correlation. | - | - | - |
| [Instrumental](https://instrumentalapp.com) | Real-time metrics with alerting and dashboards. | - | - | - |
| [Jaeger client](https://github.com/jaegertracing/jaeger-client-java) | Distributed tracing client for Jaeger backend. | 490 | 3y | - |
| [JavaMelody](https://github.com/javamelody/javamelody) | Embedded monitoring with charts, SQL analysis, and profiling. | 3.0k | 11d | Apache-2.0 |
| [jmxtrans](https://github.com/jmxtrans/jmxtrans) | JMX metric collection to Graphite, InfluxDB, or Ganglia. | 1.7k | 3y | MIT |
| [Jolokia](https://jolokia.org) | JMX over HTTP/JSON for remote monitoring. | - | - | - |
| [Micrometer](https://github.com/micrometer-metrics/micrometer) | Metrics facade for Prometheus, Datadog, CloudWatch, etc. | 4.8k | 13h | Apache-2.0 |
| [Micrometer Tracing](https://github.com/micrometer-metrics/tracing) | Tracing facade for Zipkin, Wavefront, and OTLP. | 288 | 21h | Apache-2.0 |
| [nudge4j](https://github.com/lorenzoongithub/nudge4j) | Browser REPL for live JVM inspection. | 164 | 5y | MIT |
| [OpenTelemetry](https://github.com/open-telemetry/opentelemetry-java) | CNCF standard for traces, metrics, and logs. | 2.3k | 9h | Apache-2.0 |
| [Pinpoint](https://github.com/naver/pinpoint) | Large-scale APM with call tree visualization. | - | - | - |
| [Prometheus](https://github.com/prometheus/client_java) | Official Prometheus client with gauges, counters, and histograms. | 2.3k | 10h | Apache-2.0 |
| [Sentry](https://github.com/getsentry/sentry-java) | Error tracking with stack traces and performance monitoring. | 1.3k | 1d | MIT |
| [SPM](https://github.com/sematext/sematext-agent-java) | Transaction tracing and JVM metrics. | 24 | 2d | Apache-2.0 |
| [Stagemonitor](https://github.com/stagemonitor/stagemonitor) | Elasticsearch-integrated APM with Kibana dashboards. | 1.7k | 2y | Apache-2.0 |
| [Sysmon](https://github.com/palantir/Sysmon) | JVM resource monitoring (CPU, memory, GC). | 156 | 9y | Apache-2.0 |
| [zipkin](https://zipkin.io) | Distributed tracing system for latency analysis. | - | - | - |

### Native

_For working with platform-specific native libraries._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Aparapi](https://github.com/Syncleus/aparapi) | Execute Java on GPUs via automatic OpenCL conversion. | 482 | 3y | Apache-2.0 |
| [JavaCPP](https://github.com/bytedeco/javacpp) | Native C/C++ binding generator with presets for OpenCV, FFmpeg. | 4.7k | 1mo | - |
| [JNA](https://github.com/java-native-access/jna) | Dynamic native access without JNI boilerplate. | 8.9k | 9d | - |
| [JNR](https://github.com/jnr/jnr-ffi) | Faster JNA alternative; foundation for Project Panama. | 1.3k | 2mo | - |
| [native-lib-loader](https://github.com/scijava/native-lib-loader) | Extract and load bundled native libraries from JARs. | 215 | 1y | - |

### Natural Language Processing

_Libraries for text processing and analysis._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [CogCompNLP](https://github.com/CogComp/cogcomp-nlp) | NLP pipeline with coreference, SRL, and relation extraction. | 480 | 2y | - |
| [CoreNLP](https://nlp.stanford.edu/software/corenlp.shtml) | Stanford's NLP toolkit: NER, parsing, sentiment, and coreference. | - | - | - |
| [DKPro](https://dkpro.github.io) | UIMA-based NLP components for tokenization, POS, and parsing. | - | - | - |
| [Hypherator](https://github.com/ejossev/hypherator-java) | Text hyphenation with bundled dictionaries for 30+ languages. | 3 | 6mo | MIT |
| [LingPipe](http://alias-i.com/lingpipe/) | Entity extraction, clustering, and classification toolkit. | - | - | - |

### Networking

_Libraries for network applications._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Commons-networking](https://github.com/CiscoSE/commons-networking) | Server-Sent Events (SSE) client implementation. | 20 | 3y | Apache-2.0 |
| [Comsat](https://github.com/puniverse/comsat) | Fiber-aware web APIs (Servlet, JAX-RS) with Quasar. | 595 | 8y | - |
| [Dubbo](https://github.com/apache/dubbo) | Alibaba's RPC framework with service discovery and load balancing. | 41.7k | 1d | Apache-2.0 |
| [Grizzly](https://javaee.github.io/grizzly/) | NIO framework powering GlassFish with HTTP/2. | - | - | - |
| [gRPC-java](https://github.com/grpc/grpc-java) | Google's HTTP/2 RPC with streaming and deadlines. | 11.9k | 21h | Apache-2.0 |
| [KryoNet](https://github.com/EsotericSoftware/kryonet) | Fast TCP/UDP networking with Kryo serialization. | 1.8k | 4y | BSD-3-Clause |
| [MINA](https://mina.apache.org) | Event-driven async network framework from Apache. | - | - | - |
| [Netty](https://netty.io) | Industry-standard async networking with epoll/kqueue support. | - | - | - |
| [Drift](https://github.com/airlift/drift) | Annotation-based Thrift client/server generation. | 248 | 4mo | Apache-2.0 |
| [ServiceTalk](https://github.com/apple/servicetalk) | Apple's reactive networking with HTTP/1.1, HTTP/2, and gRPC. | 1.0k | 10h | Apache-2.0 |
| [sshj](https://github.com/hierynomus/sshj) | SSH2 client for SFTP, SCP, and remote execution. | 2.6k | 8mo | Apache-2.0 |
| [TLS Channel](https://github.com/marianobarrios/tls-channel) | Blocking/non-blocking TLS via simple ByteChannel API. | 207 | 3d | MIT |
| [Undertow](http://undertow.io) | High-performance web server with HTTP/2 and WebSocket. | - | - | - |
| [urnlib](https://github.com/slub/urnlib) | URN parsing and validation per RFC 2141/8141. | 34 | 11d | GPL-3.0 |
| [Fluency](https://github.com/komamitsu/fluency) | Async, buffered logger to Fluentd with failover. | 163 | 5d | Apache-2.0 |

### ORM

_Object-relational mapping frameworks._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Cayenne](https://cayenne.apache.org) | Modeler-based ORM with lazy loading and caching. | - | - | - |
| [Doma](https://github.com/domaframework/doma) | Compile-time SQL validation with two-way SQL templates. | 494 | 3d | Apache-2.0 |
| [Ebean](https://ebean.io) | Simple ORM with query beans, JSON, and soft-delete support. | - | - | - |
| [EclipseLink](https://www.eclipse.org/eclipselink/) | JPA reference implementation with MOXy and multi-tenancy. | - | - | - |
| [Hibernate](http://hibernate.org/orm/) | Feature-rich JPA implementation with caching and search. | - | - | - |
| [MyBatis](https://github.com/mybatis/mybatis-3) | SQL mapping framework with XML or annotation config. | 20.3k | 12h | Apache-2.0 |
| [MyBatis-Plus](https://github.com/baomidou/mybatis-plus) | MyBatis enhancements: CRUD, pagination, code generation. | 17.3k | 3d | Apache-2.0 |
| [ObjectiveSql](https://github.com/braisdom/ObjectiveSql) | ActiveRecord-style ORM with method chaining queries. | 1.3k | 1y | Apache-2.0 |
| [Permazen](https://github.com/permazen/permazen) | Schema-independent persistence with change tracking. | 422 | 3mo | Apache-2.0 |
| [SimpleFlatMapper](https://github.com/arnaudroger/SimpleFlatMapper) | Zero-allocation result set to POJO mapping. | 454 | 3mo | MIT |

### PaaS

_Java platform as a service._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AWS Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk/) | Managed Tomcat/Jetty deployment with auto-scaling. | - | - | - |
| [AWS Lambda](https://aws.amazon.com/lambda/) | Serverless Java with SnapStart for cold starts. | - | - | - |
| [Google Cloud](https://cloud.google.com) | App Engine, Cloud Run, and GKE for Java workloads. | - | - | - |
| [Heroku](https://www.heroku.com) | Git-push deployment with buildpacks and add-ons. | - | - | - |
| [Microsoft Azure](https://azure.microsoft.com/en-us/) | App Service and Functions with Spring integration. | - | - | - |
| [OpenShift](https://www.openshift.com) | Enterprise Kubernetes with Java S2I builds. | - | - | - |

### Pathfinding

_Algorithms for finding routes in graphs and spatial environments._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Pathetic](https://github.com/bsommerfeld/pathetic) | High-performance 3D A\* pathfinding with configurable heuristics. | 236 | 1d | MIT |

### PDF

_Tools for PDF generation and manipulation._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache FOP](https://xmlgraphics.apache.org/fop/) | XSL-FO to PDF with SVG and image support. | - | - | - |
| [Apache PDFBox](https://pdfbox.apache.org) | Create, modify, extract, and sign PDFs. | - | - | - |
| [Dynamic Jasper](https://intive-fdv.github.io/DynamicJasper/) | Programmatic JasperReports without XML. | - | - | - |
| [DynamicReports](https://github.com/dynamicreports/dynamicreports) | Fluent API for JasperReports with charts. | 240 | 24d | LGPL-3.0 |
| [Eclipse BIRT](https://www.eclipse.org/birt) | Visual report designer with PDF, Excel, and HTML output. | - | - | - |
| [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) | XHTML/CSS to PDF renderer. | 2.2k | 1d | - |
| [iText](https://itextpdf.com/en) | Full-featured PDF library with forms and digital signatures. | - | - | - |
| [JasperReports](https://community.jaspersoft.com/project/jasperreports-library) | Enterprise reporting with charts, barcodes, and subreports. | - | - | - |
| [Open HTML to PDF](https://github.com/danfickle/openhtmltopdf) | HTML5/CSS3 to PDF/A with accessibility support. | 2.1k | 1y | - |
| [OpenPDF](https://github.com/LibrePDF/OpenPDF) | LGPL iText fork with active maintenance. | 4.1k | 2mo | - |
| [Tabula](https://github.com/tabulapdf/tabula-java) | Extract tabular data from PDFs into CSV/JSON. | 2.0k | 9mo | MIT |

### Performance analysis

_Tools for profiling, benchmarking, and performance analysis._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [fastThread](https://fastthread.io) | Online thread dump analyzer with deadlock detection. | - | - | - |
| [GCeasy](https://gceasy.io) | GC log analyzer with tuning recommendations. | - | - | - |
| [honest-profiler](https://github.com/jvm-profiling-tools/honest-profiler) | AsyncGetCallTrace-based profiler avoiding safepoint bias. | 1.3k | 2y | MIT |
| [jHiccup](https://github.com/giltene/jHiccup) | Measure JVM pauses and OS scheduling hiccups. | 696 | 1y | - |
| [JITWatch](https://github.com/AdoptOpenJDK/jitwatch) | Visualize HotSpot JIT compilations and inlining decisions. | 3.3k | 13d | - |
| [JMH](http://openjdk.java.net/projects/code-tools/jmh/) | OpenJDK's microbenchmark harness with warmup and statistics. | - | - | - |
| [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) | HDR histogram-based latency recording with pause correction. | 465 | 1y | - |

### Platform

_Frameworks that are suites of multiple libraries encompassing several categories._

#### Apache Commons

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [BCEL](http://commons.apache.org/proper/commons-bcel/) | Byte Code Engineering Library - analyze, create, and manipulate Java class files. | - | - | - |
| [BeanUtils](http://commons.apache.org/proper/commons-beanutils/) | Easy-to-use wrappers around the Java reflection and introspection APIs. | - | - | - |
| [BeanUtils2](http://commons.apache.org/sandbox/commons-beanutils2/) | Redesign of Commons BeanUtils. | - | - | - |
| [BSF](http://commons.apache.org/proper/commons-bsf/) | Bean Scripting Framework - interface to scripting languages, including JSR-223. | - | - | - |
| [Chain](http://commons.apache.org/proper/commons-chain/) | Chain of Responsibility pattern implementation. | - | - | - |
| [ClassScan](http://commons.apache.org/sandbox/commons-classscan/) | Find Class interfaces, methods, fields, and annotations without loading. | - | - | - |
| [CLI](http://commons.apache.org/proper/commons-cli/) | Command-line arguments parser. | - | - | - |
| [CLI2](http://commons.apache.org/sandbox/commons-cli2/) | Redesign of Commons CLI. | - | - | - |
| [Codec](http://commons.apache.org/proper/commons-codec/) | General encoding/decoding algorithms, e.g. phonetic, base64 or URL. | - | - | - |
| [Collections](http://commons.apache.org/proper/commons-collections/) | Extends or augments the Java Collections Framework. | - | - | - |
| [Compress](http://commons.apache.org/proper/commons-compress/) | Defines an API for working with tar, zip and bzip2 files. | - | - | - |
| [Configuration](http://commons.apache.org/proper/commons-configuration/) | Reading of configuration/preferences files in various formats. | - | - | - |
| [Convert](http://commons.apache.org/sandbox/commons-convert/) | Commons-Convert aims to provide a single library dedicated to the task of converting an object of one type to another. | - | - | - |
| [CSV](http://commons.apache.org/proper/commons-csv/) | Component for reading and writing comma separated value files. | - | - | - |
| [Daemon](http://commons.apache.org/proper/commons-daemon/) | Alternative invocation mechanism for unix-daemon-like java code. | - | - | - |
| [DBCP](http://commons.apache.org/proper/commons-dbcp/) | Database connection pooling services. | - | - | - |
| [DbUtils](http://commons.apache.org/proper/commons-dbutils/) | JDBC helper library. | - | - | - |
| [Digester](http://commons.apache.org/proper/commons-digester/) | XML-to-Java-object mapping utility. | - | - | - |
| [Email](http://commons.apache.org/proper/commons-email/) | Library for sending e-mail from Java. | - | - | - |
| [Exec](http://commons.apache.org/proper/commons-exec/) | API for dealing with external process execution and environment management in Java. | - | - | - |
| [FileUpload](http://commons.apache.org/proper/commons-fileupload/) | File upload capability for your servlets and web applications. | - | - | - |
| [Finder](http://commons.apache.org/sandbox/commons-finder/) | Java library inspired by the UNIX find command. | - | - | - |
| [Flatfile](http://commons.apache.org/sandbox/commons-flatfile/) | Java library for working with flat data structures. | - | - | - |
| [Functor](http://commons.apache.org/proper/commons-functor/) | Function that can be manipulated as an object, or an object representing a single, generic function. | - | - | - |
| [Graph](http://commons.apache.org/sandbox/commons-graph/) | General purpose graph APIs and algorithms. | - | - | - |
| [I18n](http://commons.apache.org/sandbox/commons-i18n/) | Adds the feature of localized message bundles that consist of one or many localized texts that belong together. | - | - | - |
| [Id](http://commons.apache.org/sandbox/commons-id/) | Id is a component used to generate identifiers. | - | - | - |
| [Imaging](http://commons.apache.org/proper/commons-imaging/) | Image library. | - | - | - |
| [IO](http://commons.apache.org/proper/commons-io/) | Collection of I/O utilities. | - | - | - |
| [Javaflow](http://commons.apache.org/sandbox/commons-javaflow/) | Continuation implementation to capture the state of the application. | - | - | - |
| [JCI](http://commons.apache.org/proper/commons-jci/) | Java Compiler Interface. | - | - | - |
| [JCS](http://commons.apache.org/proper/commons-jcs/) | Java Caching System. | - | - | - |
| [Jelly](http://commons.apache.org/proper/commons-jelly/) | XML based scripting and processing engine. | - | - | - |
| [Jexl](http://commons.apache.org/proper/commons-jexl/) | Expression language which extends the Expression Language of the JSTL. | - | - | - |
| [JNet](http://commons.apache.org/sandbox/commons-jnet/) | JNet allows to use dynamically register url stream handlers through the java.net API. | - | - | - |
| [JXPath](http://commons.apache.org/proper/commons-jxpath/) | Utilities for manipulating Java Beans using the XPath syntax. | - | - | - |
| [Lang](http://commons.apache.org/proper/commons-lang/) | Provides extra functionality for classes in java.lang. | - | - | - |
| [Logging](https://commons.apache.org/proper/commons-logging/) | Wrapper around a variety of logging API implementations. | - | - | - |
| [Math](http://commons.apache.org/proper/commons-math/) | Lightweight, self-contained mathematics and statistics components. | - | - | - |
| [Monitoring](http://commons.apache.org/sandbox/commons-monitoring/) | Monitoring aims to provide a simple but extensible monitoring solution for Java applications. | - | - | - |
| [Nabla](http://commons.apache.org/sandbox/commons-nabla/) | Nabla provides automatic differentiation classes that can generate derivative of any function implemented in the Java language. | - | - | - |
| [Net](http://commons.apache.org/proper/commons-net/) | Collection of network utilities and protocol implementations. | - | - | - |
| [OGNL](http://commons.apache.org/proper/commons-ognl/) | Object-graph navigation language. | - | - | - |
| [OpenPGP](http://commons.apache.org/sandbox/commons-openpgp/) | Interface to signing and verifying data using OpenPGP. | - | - | - |
| [Performance](http://commons.apache.org/sandbox/commons-performance/) | Small framework for microbenchmark clients, with implementations for Commons DBCP and Pool. | - | - | - |
| [Pipeline](http://commons.apache.org/sandbox/commons-pipeline/) | Provides a set of pipeline utilities designed around work queues that run in parallel to sequentially process data objects. | - | - | - |
| [Pool](http://commons.apache.org/proper/commons-pool/) | Generic object pooling component. | - | - | - |
| [Proxy](http://commons.apache.org/proper/commons-proxy/) | Library for creating dynamic proxies. | - | - | - |
| [RDF](https://commons.apache.org/proper/commons-rdf/) | Common implementation of RDF 1.1 that could be implemented by systems on the JVM. | - | - | - |
| [RNG](https://commons.apache.org/proper/commons-rng/) | Commons Rng provides implementations of pseudo-random numbers generators. | - | - | - |
| [SCXML](http://commons.apache.org/proper/commons-scxml/) | Implementation of the State Chart XML specification aimed at creating and maintaining a Java SCXML engine. | - | - | - |
| [Validator](http://commons.apache.org/proper/commons-validator/) | Framework to define validators and validation rules in an xml file. | - | - | - |
| [VFS](http://commons.apache.org/proper/commons-vfs/) | Virtual File System component for treating files, FTP, SMB, ZIP and such like as a single logical file system. | - | - | - |
| [Weaver](http://commons.apache.org/proper/commons-weaver/) | Provides an easy way to enhance (weave) compiled bytecode. | - | - | - |

#### Other

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [CUBA Platform](https://www.cuba-platform.com/) | High-level framework for developing enterprise applications with a rich web interface, based on Spring, EclipseLink and Vaadin. | - | - | - |
| [Light-4J](https://github.com/networknt/light-4j/) | Fast, lightweight and productive microservices framework with built-in [security](https://github.com/networknt/light-oauth2/). | N/A | N/A | - |
| [Orienteer](https://github.com/OrienteerBAP/Orienteer/) | Open-source business application platform for rapid configuration/development of CRM, ERP, LMS and other applications. | N/A | N/A | - |
| [Spring](https://spring.io/projects/) | Provides many packages for dependency injection, aspect-oriented programming, security, etc. | - | - | - |

### Processes

_Libraries that help the management of operating system processes._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ch.vorburger.exec](https://github.com/vorburger/ch.vorburger.exec) | Convenient API around Apache Commons Exec. | 38 | 1d | Apache-2.0 |
| [zt-exec](https://github.com/zeroturnaround/zt-exec) | Provides a unified API to Apache Commons Exec and ProcessBuilder. | 910 | 6mo | Apache-2.0 |
| [zt-process-killer](https://github.com/zeroturnaround/zt-process-killer) | Stops processes started from Java or the system processes via PID. | 136 | 2y | Apache-2.0 |

### Reactive libraries

_Libraries for developing reactive applications._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Akka](https://akka.io) | Toolkit and runtime for building concurrent, distributed, fault-tolerant and event-driven applications. | - | - | - |
| [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) | Provides a standard for asynchronous stream processing with non-blocking backpressure. | 4.9k | 1y | MIT-0 |
| [Reactor](https://github.com/reactor/reactor) | A framework for building non-blocking applications on the JVM, providing support for reactive programming. | 3.7k | 1mo | Apache-2.0 |
| [RxJava](https://github.com/ReactiveX/RxJava) | Allows for composing asynchronous and event-based programs using observable sequences. | 48.5k | 12d | Apache-2.0 |
| [vert.x](https://vertx.io) | Polyglot event-driven application framework. | - | - | - |

### REST Frameworks

_Frameworks for building RESTful services._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Dropwizard](https://github.com/dropwizard/dropwizard) | Production-ready REST with Jetty, Jersey, and Metrics. | 8.6k | 19h | Apache-2.0 |
| [Elide](https://elide.io) | JSON API/GraphQL from JPA models with security. | - | - | - |
| [Jersey](https://jersey.github.io) | JAX-RS reference implementation with DI support. | - | - | - |
| [Microserver](https://github.com/aol/micro-server) | Spring Boot microservices with 30+ plugins. | 934 | 2y | Apache-2.0 |
| [Rapidoid](https://www.rapidoid.org) | Ultra-fast HTTP server with embedded DI. | - | - | - |
| [rest.li](https://github.com/linkedin/rest.li) | LinkedIn's REST framework with typed schemas. | 2.5k | 1d | - |
| [RESTEasy](https://resteasy.github.io) | Red Hat's JAX-RS implementation with async. | - | - | - |
| [RestExpress](https://github.com/RestExpress/RestExpress) | Netty-based REST for high throughput. | 940 | 1y | Apache-2.0 |
| [Restlet Framework](https://github.com/restlet/restlet-framework-java) | Unified REST client/server with content negotiation. | 661 | 1mo | - |
| [Spark](http://sparkjava.com) | Minimalist Sinatra-style REST in Java. | - | - | - |
| [Crnk](http://www.crnk.io) | JSON API implementation with filtering and paging. | - | - | - |
| [springdoc-openapi](https://github.com/springdoc/springdoc-openapi) | OpenAPI 3 docs from Spring Boot annotations. | 3.7k | 8d | Apache-2.0 |
| [Swagger](https://swagger.io) | API design, documentation, and code generation. | - | - | - |
| [openapi-generator](https://github.com/OpenAPITools/openapi-generator) | Generate clients/servers from OpenAPI specs. | 25.6k | 14h | Apache-2.0 |

### Science

_Libraries for scientific computing, analysis, and visualization._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [BioJava](https://biojava.org/) | Bioinformatics library for sequences, structures, and alignments. | - | - | - |
| [Chart-FX](https://github.com/GSI-CS-CO/chart-fx) | Real-time scientific charting at 25Hz with millions of points. | - | - | - |
| [DataMelt](https://datamelt.org/) | Scientific computing environment with Python/Jython. | - | - | - |
| [Erdos](https://github.com/Erdos-Graph-Framework/Erdos) | Graph theory algorithms for research. | 127 | 2y | MIT |
| [GraphStream](http://graphstream-project.org) | Dynamic graph modeling with visualization. | - | - | - |
| [JFreeChart](http://www.jfree.org/jfreechart/) | Comprehensive 2D charting for Swing/JavaFX. | - | - | - |
| [JGraphT](https://github.com/jgrapht/jgrapht) | Graph algorithms: shortest path, flow, matching. | 2.7k | 15h | EPL-2.0 |
| [JGraphX](https://github.com/jgraph/jgraphx) | Interactive graph visualization (powers draw.io). | 687 | 5y | - |
| [LogicNG](https://github.com/logic-ng/LogicNG) | Boolean formula manipulation and SAT solving. | 149 | 5mo | Apache-2.0 |
| [Mines Java Toolkit](https://github.com/MinesJTK/jtk) | Geophysics: seismic processing and visualization. | 82 | 4y | Apache-2.0 |
| [Morpheus](https://github.com/zavtech/morpheus-core) | DataFrame library for tabular data analysis. | 242 | 2y | Apache-2.0 |
| [Orekit](https://www.orekit.org/) | Space flight dynamics: orbit propagation and attitude. | - | - | - |
| [Orson-Charts](https://github.com/jfree/orson-charts) | Interactive 3D charts with PDF/SVG export. | 120 | 7mo | GPL-3.0 |
| [Tablesaw](https://github.com/jtablesaw/tablesaw) | In-memory DataFrame with filtering and aggregation. | 3.7k | 6mo | Apache-2.0 |
| [XChart](https://github.com/knowm/XChart) | Simple charting with minimal dependencies. | 1.6k | 2mo | Apache-2.0 |

### Search

_Engines for indexing and searching documents._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Lucene](https://lucene.apache.org) | Foundation of most Java search; fast inverted indexes. | - | - | - |
| [Apache Solr](https://lucene.apache.org/solr/) | Enterprise search with faceting and clustering. | - | - | - |
| [Elasticsearch](https://www.elastic.co) | Distributed search and analytics with REST API. | - | - | - |
| [Indexer4j](https://github.com/haeungun/indexer4j) | Lightweight in-memory full-text search. | 56 | 6y | Apache-2.0 |

### Security

_Libraries for authentication, authorization, and cryptography._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Shiro](https://shiro.apache.org) | Framework-agnostic security with auth, crypto, and sessions. | - | - | - |
| [Ayza](https://github.com/Hakky54/ayza) | Fluent SSL/TLS configuration for HTTP clients and servers. | 565 | 8d | Apache-2.0 |
| [Bouncy Castle](https://www.bouncycastle.org/java.html) | Comprehensive crypto library with FIPS-certified provider. | - | - | - |
| [DependencyCheck](https://github.com/jeremylong/DependencyCheck) | OWASP tool detecting vulnerable dependencies via NVD. | 40 | 3mo | Apache-2.0 |
| [Cryptomator](https://cryptomator.org) | Client-side encryption for cloud storage with WebDAV. | - | - | - |
| [Hdiv](https://github.com/hdiv/hdiv) | Runtime protection against OWASP Top 10 attacks. | 219 | 1y | - |
| [jjwt](https://github.com/jwtk/jjwt) | JWT creation and verification with JWS/JWE support. | 11.0k | 2mo | Apache-2.0 |
| [jwt-java](https://github.com/BastiaanJansen/jwt-java) | Fluent JWT API with custom claim validation. | 14 | 5mo | MIT |
| [Jwks RSA](https://github.com/auth0/jwks-rsa-java) | JWKS endpoint client with key caching. | 204 | 1mo | MIT |
| [Kalium](https://github.com/abstractj/kalium) | NaCl/libsodium bindings for modern crypto primitives. | 218 | 2y | Apache-2.0 |
| [Keycloak](https://www.keycloak.org) | Open-source IAM with OIDC, SAML, and social login. | - | - | - |
| [Keywhiz](https://github.com/square/keywhiz) | Square's secret management with ACLs and audit logs. | 2.6k | 2y | Apache-2.0 |
| [Nbvcxz](https://github.com/GoSimpleLLC/nbvcxz) | Password strength estimator using pattern matching. | 308 | 4mo | MIT |
| [OACC](http://oaccframework.org) | Fine-grained permission-based access control framework. | - | - | - |
| [OpenAM](https://github.com/OpenIdentityPlatform/OpenAM) | Enterprise access management with SSO and federation. | 860 | 9d | - |
| [OTP-Java](https://github.com/BastiaanJansen/OTP-Java) | TOTP/HOTP one-time password generation per RFC specs. | 231 | 1y | MIT |
| [pac4j](https://github.com/pac4j/pac4j) | Multi-protocol security engine for OAuth, SAML, CAS. | 2.5k | 6h | Apache-2.0 |
| [Passay](http://www.passay.org/) | Password policy enforcement with configurable rules. | - | - | - |
| [Password4j](https://github.com/Password4j/password4j) | Password hashing with Argon2, BCrypt, SCrypt, and PBKDF2. | 399 | 4mo | Apache-2.0 |
| [SecurityBuilder](https://github.com/tersesystems/securitybuilder) | Fluent builders for X.509, keystores, and TLS contexts. | 47 | 4y | Apache-2.0 |
| [Themis](https://github.com/cossacklabs/themis) | High-level crypto for secure messaging and storage. | 1.9k | 19h | Apache-2.0 |
| [Tink](https://github.com/google/tink) | Google's misuse-resistant crypto API with key management. | - | - | - |
| [Topaz](https://www.topaz.sh) | Authorization service with RBAC, ABAC, and relationship-based AC. | - | - | - |

### Serialization

_High-efficiency serialization libraries._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [FlatBuffers](https://github.com/google/flatbuffers) | Zero-copy access to serialized data without parsing. | 25.4k | 19d | Apache-2.0 |
| [FST](https://github.com/RuedigerMoeller/fast-serialization) | 10x faster than JDK serialization with drop-in replacement. | 1.6k | 2y | Apache-2.0 |
| [Fury](https://github.com/alipay/fury) | JIT-accelerated serialization with cross-language support. | - | - | - |
| [Kryo](https://github.com/EsotericSoftware/kryo) | Fast, compact object graph serialization for games and caching. | 6.5k | 19d | BSD-3-Clause |
| [MessagePack](https://github.com/msgpack/msgpack-java) | Compact binary format smaller than JSON. | 1.5k | 4d | Apache-2.0 |
| [PHP Serializer](https://github.com/marcospassos/java-php-serializer) | Serialize Java objects to PHP format for interop. | 19 | 7y | MIT |

### Server

_Application servers for deployment._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Tomcat](https://tomcat.apache.org) | Reference Servlet container with virtual hosts and clustering. | - | - | - |
| [Apache TomEE](https://tomee.apache.org) | Tomcat with Jakarta EE (CDI, JPA, JAX-RS) baked in. | - | - | - |
| [Jetty](https://www.eclipse.org/jetty/) | Lightweight, embeddable server with HTTP/2 and WebSocket. | - | - | - |
| [nanohttpd](https://github.com/NanoHttpd/nanohttpd) | Tiny embeddable HTTP server in one Java file. | 7.2k | 2y | BSD-3-Clause |
| [WildFly](https://www.wildfly.org) | Full Jakarta EE server with modular architecture. | - | - | - |

### Template Engine

_Tools for text generation from templates._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Freemarker](https://freemarker.apache.org) | Powerful templating with macros, includes, and auto-escaping. | - | - | - |
| [Handlebars.java](https://jknack.github.io/handlebars.java/) | Logic-less Mustache templates with helpers. | - | - | - |
| [Jade4J](https://github.com/neuland/jade4j) | Pug/Jade template engine for concise HTML. | 706 | 3y | MIT |
| [Jamal](https://github.com/verhas/jamal) | Macro processor for Maven/Javadoc with Groovy and JShell. | 65 | 8mo | Apache-2.0 |
| [jstachio](https://github.com/jstachio/jstachio) | Compile-time Mustache with type-safe binding. | 315 | 9mo | BSD-3-Clause |
| [jte](https://github.com/casid/jte) | Fast, compiled templates with IntelliJ plugin support. | 1.1k | 4d | Apache-2.0 |
| [Jtwig](https://github.com/jtwig/jtwig) | Twig-inspired engine with inheritance and macros. | 300 | 7y | - |
| [Pebble](https://pebbletemplates.io) | Twig-like templates with inheritance, i18n, and autoescaping. | - | - | - |
| [Rocker](https://github.com/fizzed/rocker) | Type-safe templates compiling to optimized Java code. | 781 | 2mo | - |
| [StringTemplate](https://github.com/antlr/stringtemplate4) | ANTLR's template engine for code generation. | 1.0k | 8mo | - |
| [Thymeleaf](https://www.thymeleaf.org) | Natural templates that work as HTML prototypes. | - | - | - |

### Testing

_Tools for testing from model to view._

#### Asynchronous

_Tools for testing asynchronous services._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Awaitility](https://github.com/awaitility/awaitility) | Fluent DSL for polling until async conditions are met. | 4.0k | 10mo | Apache-2.0 |
| [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) | Test multi-threaded code with assertions from any thread. | 427 | 1y | Apache-2.0 |
| [GreenMail](https://greenmail-mail-test.github.io/greenmail/) | Embedded SMTP/POP3/IMAP server for email testing. | - | - | - |
| [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) | HTTP service virtualization with record/playback. | 174 | 21d | Apache-2.0 |
| [Karate](https://github.com/intuit/karate) | BDD API testing with mocks, perf tests, and JSON/XML assertions. | - | - | - |
| [REST Assured](https://github.com/rest-assured/rest-assured) | Fluent API for testing REST services with JSON/XML validation. | 7.1k | 22d | Apache-2.0 |
| [WebTau](https://github.com/testingisdocumenting/webtau) | Unified testing: REST, GraphQL, browser, CLI, and database. | 379 | 10d | Apache-2.0 |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Awaitility](https://github.com/awaitility/awaitility) | Fluent DSL for polling until async conditions are met. | 4.0k | 10mo | Apache-2.0 |
| [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) | Test multi-threaded code with assertions from any thread. | 427 | 1y | Apache-2.0 |
| [GreenMail](https://greenmail-mail-test.github.io/greenmail/) | Embedded SMTP/POP3/IMAP server for email testing. | - | - | - |
| [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) | HTTP service virtualization with record/playback. | 174 | 21d | Apache-2.0 |
| [Karate](https://github.com/intuit/karate) | BDD API testing with mocks, perf tests, and JSON/XML assertions. | - | - | - |
| [REST Assured](https://github.com/rest-assured/rest-assured) | Fluent API for testing REST services with JSON/XML validation. | 7.1k | 22d | Apache-2.0 |
| [WebTau](https://github.com/testingisdocumenting/webtau) | Unified testing: REST, GraphQL, browser, CLI, and database. | 379 | 10d | Apache-2.0 |

#### BDD

_Behavior-driven development testing frameworks._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Cucumber](https://github.com/cucumber/cucumber-jvm) | Gherkin specs with step definitions in Java. | 2.8k | 3d | MIT |
| [Cukes-REST](https://github.com/ctco/cukes) | Cucumber steps for REST API testing. | 110 | 7mo | Apache-2.0 |
| [J8Spec](https://github.com/j8spec/j8spec) | Jasmine/RSpec-style specs with lambda syntax. | 48 | 3y | MIT |
| [JBehave](https://jbehave.org) | Story-driven BDD with narrative format. | - | - | - |
| [JGiven](http://jgiven.org) | Fluent BDD with readable HTML reports. | - | - | - |
| [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) | Expressive specs using lambdas and natural language. | 253 | 3y | MIT |
| [Serenity BDD](https://github.com/serenity-bdd/serenity-core) | Living documentation with Cucumber/JUnit integration. | 744 | 2d | - |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Cucumber](https://github.com/cucumber/cucumber-jvm) | Gherkin specs with step definitions in Java. | 2.8k | 3d | MIT |
| [Cukes-REST](https://github.com/ctco/cukes) | Cucumber steps for REST API testing. | 110 | 7mo | Apache-2.0 |
| [J8Spec](https://github.com/j8spec/j8spec) | Jasmine/RSpec-style specs with lambda syntax. | 48 | 3y | MIT |
| [JBehave](https://jbehave.org) | Story-driven BDD with narrative format. | - | - | - |
| [JGiven](http://jgiven.org) | Fluent BDD with readable HTML reports. | - | - | - |
| [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) | Expressive specs using lambdas and natural language. | 253 | 3y | MIT |
| [Serenity BDD](https://github.com/serenity-bdd/serenity-core) | Living documentation with Cucumber/JUnit integration. | 744 | 2d | - |

#### Fixtures

_Test data generation and fixtures._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AutoParams](https://github.com/AutoParams/AutoParams) | JUnit 5 extension for automatic test parameter generation. | 368 | 3mo | MIT |
| [Beanmother](https://github.com/keepcosmos/beanmother) | YAML-based fixture factory for test objects. | 121 | 3y | Apache-2.0 |
| [Datafaker](https://github.com/datafaker-net/datafaker) | Modern faker with 200+ data providers and locales. | 1.7k | 30m | Apache-2.0 |
| [Fixture Factory](https://github.com/six2six/fixture-factory) | Template-based test object builder. | 446 | 2y | Apache-2.0 |
| [jFairy](https://github.com/Devskiller/jfairy) | Realistic fake data (names, addresses, companies). | - | - | - |
| [Instancio](https://github.com/instancio/instancio) | Generate fully-populated objects with reproducible seeds. | 1.1k | 3h | Apache-2.0 |
| [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) | Repeatable randomized tests with seed control. | 180 | 10mo | Apache-2.0 |
| [Java Faker](https://github.com/DiUS/java-faker) | Ruby Faker port with extensive data types. | 4.9k | 1y | - |
| [Mockneat](https://github.com/nomemory/mockneat) | Fluent fake data API with constrained generators. | 536 | 2y | Apache-2.0 |
| [JMock](https://github.com/xcancloud/JMock) | High-performance mock data generation library. | 422 | 2mo | Apache-2.0 |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AutoParams](https://github.com/AutoParams/AutoParams) | JUnit 5 extension for automatic test parameter generation. | 368 | 3mo | MIT |
| [Beanmother](https://github.com/keepcosmos/beanmother) | YAML-based fixture factory for test objects. | 121 | 3y | Apache-2.0 |
| [Datafaker](https://github.com/datafaker-net/datafaker) | Modern faker with 200+ data providers and locales. | 1.7k | 30m | Apache-2.0 |
| [Fixture Factory](https://github.com/six2six/fixture-factory) | Template-based test object builder. | 446 | 2y | Apache-2.0 |
| [jFairy](https://github.com/Devskiller/jfairy) | Realistic fake data (names, addresses, companies). | - | - | - |
| [Instancio](https://github.com/instancio/instancio) | Generate fully-populated objects with reproducible seeds. | 1.1k | 3h | Apache-2.0 |
| [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) | Repeatable randomized tests with seed control. | 180 | 10mo | Apache-2.0 |
| [Java Faker](https://github.com/DiUS/java-faker) | Ruby Faker port with extensive data types. | 4.9k | 1y | - |
| [Mockneat](https://github.com/nomemory/mockneat) | Fluent fake data API with constrained generators. | 536 | 2y | Apache-2.0 |
| [JMock](https://github.com/xcancloud/JMock) | High-performance mock data generation library. | 422 | 2mo | Apache-2.0 |

#### Frameworks

_Test execution environments and frameworks._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache JMeter](http://jmeter.apache.org) | Load testing with GUI and distributed execution. | - | - | - |
| [JMeter DSL.java](https://abstracta.github.io/jmeter-java-dsl/) | Programmatic JMeter tests with fluent Java API. | - | - | - |
| [Arquillian](http://arquillian.org) | Integration testing with container lifecycle management. | - | - | - |
| [cdi-test](https://github.com/guhilling/cdi-test) | Lightweight CDI testing without full container. | 27 | 3d | Apache-2.0 |
| [Citrus](https://citrusframework.org) | Integration testing for HTTP, JMS, SOAP, and Kafka. | - | - | - |
| [Gatling](https://gatling.io) | Scala-based load testing with detailed HTML reports. | - | - | - |
| [JUnit](https://junit.org/junit5/) | The standard Java testing framework with extensions. | - | - | - |
| [jqwik](https://jqwik.net) | Property-based testing with shrinking on JUnit 5. | - | - | - |
| [Pact JVM](https://github.com/DiUS/pact-jvm) | Contract testing for microservices compatibility. | - | - | - |
| [PIT](http://pitest.org) | Mutation testing measuring test suite quality. | - | - | - |
| [weld-testing](https://github.com/weld/weld-testing) | CDI test extensions for JUnit 4/5 and Spock. | 112 | 5d | Apache-2.0 |
| [selenium](https://github.com/SeleniumHQ/selenium) | Browser automation for web application testing. | 33.9k | 8h | Apache-2.0 |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache JMeter](http://jmeter.apache.org) | Load testing with GUI and distributed execution. | - | - | - |
| [JMeter DSL.java](https://abstracta.github.io/jmeter-java-dsl/) | Programmatic JMeter tests with fluent Java API. | - | - | - |
| [Arquillian](http://arquillian.org) | Integration testing with container lifecycle management. | - | - | - |
| [cdi-test](https://github.com/guhilling/cdi-test) | Lightweight CDI testing without full container. | 27 | 3d | Apache-2.0 |
| [Citrus](https://citrusframework.org) | Integration testing for HTTP, JMS, SOAP, and Kafka. | - | - | - |
| [Gatling](https://gatling.io) | Scala-based load testing with detailed HTML reports. | - | - | - |
| [JUnit](https://junit.org/junit5/) | The standard Java testing framework with extensions. | - | - | - |
| [jqwik](https://jqwik.net) | Property-based testing with shrinking on JUnit 5. | - | - | - |
| [Pact JVM](https://github.com/DiUS/pact-jvm) | Contract testing for microservices compatibility. | - | - | - |
| [PIT](http://pitest.org) | Mutation testing measuring test suite quality. | - | - | - |
| [weld-testing](https://github.com/weld/weld-testing) | CDI test extensions for JUnit 4/5 and Spock. | 112 | 5d | Apache-2.0 |
| [selenium](https://github.com/SeleniumHQ/selenium) | Browser automation for web application testing. | 33.9k | 8h | Apache-2.0 |

#### Matchers

_Custom assertion and matcher libraries._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AssertJ](https://joel-costigliola.github.io/assertj/) | Fluent assertions with IDE auto-completion. | - | - | - |
| [Hamcrest](http://hamcrest.org/JavaHamcrest/) | Composable matchers for expressive assertions. | - | - | - |
| [JSONAssert](http://jsonassert.skyscreamer.org) | JSON comparison with strict/lenient modes. | - | - | - |
| [JsonUnit](https://github.com/lukas-krecan/JsonUnit) | JSON assertions with path ignoring and regex. | 975 | 1d | Apache-2.0 |
| [Truth](https://truth.dev) | Google's extensible assertion framework. | - | - | - |
| [XMLUnit](https://github.com/xmlunit/xmlunit) | XML comparison with diff and XPath assertions. | 314 | 2mo | Apache-2.0 |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [AssertJ](https://joel-costigliola.github.io/assertj/) | Fluent assertions with IDE auto-completion. | - | - | - |
| [Hamcrest](http://hamcrest.org/JavaHamcrest/) | Composable matchers for expressive assertions. | - | - | - |
| [JSONAssert](http://jsonassert.skyscreamer.org) | JSON comparison with strict/lenient modes. | - | - | - |
| [JsonUnit](https://github.com/lukas-krecan/JsonUnit) | JSON assertions with path ignoring and regex. | 975 | 1d | Apache-2.0 |
| [Truth](https://truth.dev) | Google's extensible assertion framework. | - | - | - |
| [XMLUnit](https://github.com/xmlunit/xmlunit) | XML comparison with diff and XPath assertions. | 314 | 2mo | Apache-2.0 |

#### Testing Miscellaneous

_Other testing utilities._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ConsoleCaptor](https://github.com/Hakky54/console-captor) | Capture stdout/stderr for assertion. | 33 | 18d | Apache-2.0 |
| [junit-dataprovider](https://github.com/TNG/junit-dataprovider) | TestNG-style parameterized tests for JUnit. | 249 | 3d | Apache-2.0 |
| [junit-pioneer](https://junit-pioneer.org/) | JUnit 5 extensions: environment variables, temp dirs, etc. | - | - | - |
| [LogCaptor](https://github.com/Hakky54/log-captor) | Capture and assert log messages in tests. | 421 | 18d | Apache-2.0 |
| [log-capture](https://github.com/dm-drogeriemarkt/log-capture) | AssertJ-style log assertions with MDC support. | 15 | 1mo | MIT |
| [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) | Verify class immutability at test time. | 241 | 3mo | Apache-2.0 |
| [pojo-tester](https://www.pojo.pl) | Auto-test equals, hashCode, toString, getters/setters. | - | - | - |
| [raml-tester](https://github.com/nidi3/raml-tester) | Validate API requests/responses against RAML specs. | 73 | 6y | Apache-2.0 |
| [Selfie](https://github.com/diffplug/selfie) | Snapshot testing with inline or file-based snapshots. | 88 | 14h | Apache-2.0 |
| [Stebz](https://github.com/stebz/stebz) | Step-based test organization framework. | 17 | 3d | MIT |
| [Testcontainers](https://github.com/testcontainers/testcontainers-java) | Disposable Docker containers for DBs, browsers, and services. | 8.6k | 8d | MIT |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ConsoleCaptor](https://github.com/Hakky54/console-captor) | Capture stdout/stderr for assertion. | 33 | 18d | Apache-2.0 |
| [junit-dataprovider](https://github.com/TNG/junit-dataprovider) | TestNG-style parameterized tests for JUnit. | 249 | 3d | Apache-2.0 |
| [junit-pioneer](https://junit-pioneer.org/) | JUnit 5 extensions: environment variables, temp dirs, etc. | - | - | - |
| [LogCaptor](https://github.com/Hakky54/log-captor) | Capture and assert log messages in tests. | 421 | 18d | Apache-2.0 |
| [log-capture](https://github.com/dm-drogeriemarkt/log-capture) | AssertJ-style log assertions with MDC support. | 15 | 1mo | MIT |
| [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) | Verify class immutability at test time. | 241 | 3mo | Apache-2.0 |
| [pojo-tester](https://www.pojo.pl) | Auto-test equals, hashCode, toString, getters/setters. | - | - | - |
| [raml-tester](https://github.com/nidi3/raml-tester) | Validate API requests/responses against RAML specs. | 73 | 6y | Apache-2.0 |
| [Selfie](https://github.com/diffplug/selfie) | Snapshot testing with inline or file-based snapshots. | 88 | 14h | Apache-2.0 |
| [Stebz](https://github.com/stebz/stebz) | Step-based test organization framework. | 17 | 3d | MIT |
| [Testcontainers](https://github.com/testcontainers/testcontainers-java) | Disposable Docker containers for DBs, browsers, and services. | 8.6k | 8d | MIT |

#### Mocking

_Mock frameworks for isolated unit testing._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [JMockit](http://jmockit.github.io) | Full mocking with expectations, verifications, and coverage. | - | - | - |
| [Mockito](https://github.com/mockito/mockito) | Clean, readable mocking with spy and argument capture. | 15.4k | 4d | MIT |
| [MockServer](https://www.mock-server.com) | HTTP/HTTPS mock server with expectation matching. | - | - | - |
| [Moco](https://github.com/dreamhead/moco) | Standalone mock server with simple JSON config. | 4.4k | 1y | MIT |
| [PowerMock](https://github.com/powermock/powermock) | Mock statics, constructors, and final classes. | 4.2k | 2y | Apache-2.0 |
| [WireMock](http://wiremock.org) | HTTP service simulator with record/playback and fault injection. | - | - | - |
| [EasyMock](https://github.com/easymock/easymock) | Record/replay mocking with nice/strict modes. | 831 | 4d | - |

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [JMockit](http://jmockit.github.io) | Full mocking with expectations, verifications, and coverage. | - | - | - |
| [Mockito](https://github.com/mockito/mockito) | Clean, readable mocking with spy and argument capture. | 15.4k | 4d | MIT |
| [MockServer](https://www.mock-server.com) | HTTP/HTTPS mock server with expectation matching. | - | - | - |
| [Moco](https://github.com/dreamhead/moco) | Standalone mock server with simple JSON config. | 4.4k | 1y | MIT |
| [PowerMock](https://github.com/powermock/powermock) | Mock statics, constructors, and final classes. | 4.2k | 2y | Apache-2.0 |
| [WireMock](http://wiremock.org) | HTTP service simulator with record/playback and fault injection. | - | - | - |
| [EasyMock](https://github.com/easymock/easymock) | Record/replay mocking with nice/strict modes. | 831 | 4d | - |

### Utility

_General utility libraries._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Arthas](https://github.com/alibaba/arthas) | Production diagnostics: class decompile, trace, and profiling live. | 37.0k | 26m | Apache-2.0 |
| [bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) | Token bucket rate limiter with distributed support. | - | - | - |
| [cactoos](https://github.com/yegor256/cactoos) | Object-oriented primitives avoiding nulls and statics. | 763 | 1d | MIT |
| [Chocotea](https://github.com/cleopatra27/chocotea) | Generate Postman collections from annotated Java code. | 48 | 2y | Apache-2.0 |
| [CRaSH](http://www.crashub.org) | SSH shell into running JVMs for inspection. | - | - | - |
| [Dex](https://github.com/PatMartin/Dex) | Data visualization and ETL with JavaFX. | 1.3k | 6y | Apache-2.0 |
| [dregex](https://github.com/marianobarrios/dregex) | DFA-based regex with set operations and linear time. | 48 | 3d | BSD-2-Clause |
| [Embulk](https://github.com/embulk/embulk) | Bulk data loader for DBs, S3, and file formats. | 1.8k | 1mo | Apache-2.0 |
| [fswatch](https://github.com/vorburger/ch.vorburger.fswatch) | Simplified file system watching wrapper. | 31 | 7d | Apache-2.0 |
| [Gephi](https://github.com/gephi/gephi) | Network graph visualization and analysis tool. | 6.3k | 13h | GPL-3.0 |
| [Guava](https://github.com/google/guava) | Google's core libraries: collections, caching, I/O, and more. | 51.4k | 11h | Apache-2.0 |
| [JADE](https://jade.tilab.com) | Multi-agent system framework with FIPA compliance. | - | - | - |
| [Javadoc Publisher](https://github.com/MathieuSoysal/Javadoc-publisher.yml) | GitHub Action for auto-publishing Javadoc. | 55 | 1mo | Apache-2.0 |
| [Java Diff Utils](https://java-diff-utils.github.io/java-diff-utils/) | Unified diff, patch, and merge utilities. | - | - | - |
| [JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) | Readable regex builder with fluent API. | 2.6k | 9d | MIT |
| [JGit](https://www.eclipse.org/jgit/) | Pure Java Git implementation used by Eclipse. | - | - | - |
| [JKScope](https://github.com/evpl/jkscope) | Kotlin-style scope functions (let, also, run) for Java. | 21 | 11mo | Apache-2.0 |
| [minio-java](https://github.com/minio/minio-java) | S3-compatible object storage client. | 1.3k | 25d | Apache-2.0 |
| [Protégé](https://protege.stanford.edu) | Ontology editor for OWL and knowledge graphs. | - | - | - |
| [Semver4j](https://github.com/semver4j/semver4j) | Semantic versioning parsing and comparison. | 106 | 1d | MIT |
| [Underscore-java](https://github.com/javadev/underscore-java) | Functional utilities: map, filter, reduce, and more. | 547 | 1mo | MIT |

### Version Managers

_Tools for managing multiple Java versions._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [jabba](https://github.com/shyiko/jabba) | Cross-platform JDK manager with remote install support. | 3.3k | 1y | - |
| [jenv](https://github.com/jenv/jenv) | Project-level Java version switching via shell. | 6.5k | 16d | MIT |
| [SDKMan](https://github.com/sdkman/sdkman-cli) | Manage JDKs and tools (Maven, Gradle) with one CLI. | 6.6k | 2d | Apache-2.0 |

### Web Crawling

_Libraries for web scraping and crawling._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Apache Nutch](https://nutch.apache.org) | Hadoop-based crawler with Solr/Elasticsearch integration. | - | - | - |
| [Crawler4j](https://github.com/yasserg/crawler4j) | Multi-threaded crawler with depth and politeness control. | 4.6k | 4y | Apache-2.0 |
| [jsoup](https://jsoup.org) | HTML parsing with CSS selectors and DOM manipulation. | - | - | - |
| [StormCrawler](http://stormcrawler.net) | Real-time crawler on Apache Storm for scale. | - | - | - |
| [webmagic](https://github.com/code4craft/webmagic) | Modular crawler with XPath/CSS extraction and pipelines. | 11.7k | 20d | Apache-2.0 |

### Web Frameworks

_Frameworks for building web applications._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [ActiveJ](https://activej.io) | Async-first framework with 1M+ req/sec on single core. | - | - | - |
| [Apache Tapestry](https://tapestry.apache.org) | Component-based framework with live reload. | - | - | - |
| [Apache Wicket](https://wicket.apache.org) | Stateful component model with type-safe Java. | - | - | - |
| [Blade](https://github.com/lets-blade/blade) | Lightweight MVC framework with Netty backend. | 5.9k | 25d | Apache-2.0 |
| [Bootique](https://bootique.io) | Modular app framework with config and metrics. | - | - | - |
| [Firefly](http://www.fireflysource.com) | Async framework with HTTP/2 and WebSocket. | - | - | - |
| [Javalin](https://javalin.io/) | Simple REST API framework on Jetty. | - | - | - |
| [Jooby](http://www.jooby.org) | Modular framework with Netty, Jetty, or Undertow. | - | - | - |
| [Ninja](http://www.ninjaframework.org) | Full-stack with ORM, templates, and testing. | - | - | - |
| [Pippo](http://www.pippo.ro) | Micro-framework with routing, templates, and i18n. | - | - | - |
| [Play](https://www.playframework.com) | Reactive framework with hot reload for Scala/Java. | - | - | - |
| [PrimeFaces](https://www.primefaces.org) | JSF components with 100+ UI widgets. | - | - | - |
| [Ratpack](https://ratpack.io) | Non-blocking HTTP with RxJava and Groovy DSL. | - | - | - |
| [Takes](https://github.com/yegor256/takes) | Truly OOP web framework without annotations. | 868 | 7h | MIT |
| [Vaadin](https://vaadin.com) | Build web UIs in Java with optional React components. | - | - | - |
| [WebForms Core](https://github.com/webforms-core) | Server-side HTML tag management. | - | - | - |

### Workflow Orchestration Engines

_Platforms for orchestrating workflows and business processes._

| Name | Description | Stars | Updated | License |
| :--- | :---------- | :---: | :-----: | :-----: |
| [Cadence](https://cadenceworkflow.io) | Uber's durable execution platform for long-running workflows. | - | - | - |
| [flowable](https://github.com/flowable/flowable-engine) | BPMN 2.0, CMMN, and DMN engine with REST API. | 9.0k | 1d | Apache-2.0 |
| [Temporal](https://temporal.io) | Durable execution with gRPC; Cadence successor with cloud offering. | - | - | - |

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
