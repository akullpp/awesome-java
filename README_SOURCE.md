# Awesome Java [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of noteworthy Java frameworks, libraries, tools and resources.

<!--
Edit this file, not README.md.
Project format: - [Name](URL) - A concise, neutral description ending with punctuation.
Resource format: - [Name](URL) with an optional " - Description ending with punctuation."
Use absolute HTTPS canonical links and submit one project or resource per pull request.
-->

## Projects

### Architecture

_Frameworks and libraries that help implementing and verifying design and architecture concepts._

- [ArchUnit](https://github.com/TNG/ArchUnit) - Test library for specifying and asserting architecture rules.
- [jMolecules](https://github.com/xmolecules/jmolecules) - Annotations and interfaces to express design and architecture concepts in code.
- [jQAssistant](https://github.com/jQAssistant/jqassistant) - Static code analysis with Neo4J-based query language.
- [Taikai](https://github.com/enofex/taikai) - ArchUnit extension with predefined architecture rules for common Java technologies.
- [WireDoctor](https://github.com/ddsha441981/wiredoctor) - Runtime diagnostic for Spring Boot apps that detects cyclic bean dependencies and slow beans, with CI regression gates.

### Artificial Intelligence

_Frameworks for building applications with AI, agents and knowledge-based systems._

- [Anahata ASI](https://github.com/anahata-os/anahata-asi) - Java agent container with local LLM adapters, stateful tool execution, context management and IDE integration.
- [AgentScope Java](https://github.com/agentscope-ai/agentscope-java) - Framework for building distributed, long-running AI agents with tool execution, persistence and multi-agent orchestration.
- [A2A Java SDK](https://github.com/a2aproject/a2a-java) - Official Java SDK for the Agent2Agent protocol.
- [Dokimos](https://github.com/dokimos-dev/dokimos) - Evaluation framework for LLM and AI-agent applications that scores responses, validates tool calls and execution traces, and catches quality regressions in CI.
- [Google Gen AI Java SDK](https://github.com/googleapis/java-genai) - Official Java SDK for integrating Google generative AI models.
- [JADE](https://jade.tilab.com) - Framework and environment for building and debugging multi-agent systems. (LGPL-2.0-only)
- [JamJet](https://github.com/jamjet-labs/jamjet) - Agent runtime with a Java SDK for building AI agents, supporting graph-based workflow orchestration, multi-agent coordination, and MCP/A2A protocols.
- [LangChain4j](https://github.com/langchain4j/langchain4j) - Simplifies integration of LLMs with unified APIs and a comprehensive toolbox.
- [liter-llm](https://github.com/xberg-io/liter-llm) - Provides a Java binding for a unified LLM API client across multiple providers.
- [MCP Java SDK](https://github.com/modelcontextprotocol/java-sdk) - Enables applications to interact with AI models and tools through a standardized interface (i.e. Model Context Protocol), supporting both synchronous and asynchronous communication patterns.
- [Protégé](https://github.com/protegeproject/protege) - Provides an ontology editor and a framework to build knowledge-based systems.
- [Regulus](https://github.com/neul-labs/regulus) - Google ADK plugin suite that adds runtime compliance profiles, audit envelopes and GRC adapters for regulated Java AI agents.
- [simple-openai](https://github.com/sashirestela/simple-openai) - Library to use the OpenAI API (and compatible ones) in the simplest possible way.
- [Spring AI](https://github.com/spring-projects/spring-ai) - Application framework for AI engineering for Spring.
- [Spring AI Alibaba](https://github.com/alibaba/spring-ai-alibaba) - Agentic AI framework built on Spring AI with model, tool, RAG and workflow integrations.

### Bean Mapping

_Frameworks that ease bean mapping._

- [Immuto](https://github.com/karunarathnad/immuto) - Annotation processor that generates type-safe mapper implementations for Java Records using canonical constructors, with zero runtime reflection.
- [MapStruct](https://github.com/mapstruct/mapstruct) - Code generator that simplifies mappings between different bean types, based on a convention-over-configuration approach.
- [ModelMapper](https://github.com/modelmapper/modelmapper) - Intelligent object mapping library that automatically maps objects to each other.
- [reMap](https://github.com/remondis-it/remap) - Lambda and method handle-based mapping which requires code and not annotations if objects have different names.

### Bot Development

_Libraries and frameworks for building chatbots and messaging-platform bots._

- [JBot](https://github.com/rampatra/jbot) - Framework for building chatbots.
- [JDA](https://github.com/discord-jda/JDA) - Wrapping of the Discord REST API and its WebSocket events.
- [Nyagram](https://github.com/kaleert/nyagram) - Reactive, type-safe framework for Telegram bots based on Spring Boot 3 and Java 21.
- [TelegramBots](https://github.com/rubenlagus/TelegramBots) - Java library for building bots with the Telegram Bot API.

### Build

_Tools that handle the build cycle and dependencies of an application._

- [Apache Maven](https://github.com/apache/maven) - Declarative build and dependency management that favors convention over configuration. It might be preferable to Apache Ant, which uses a rather procedural approach and can be difficult to maintain.
- [Bazel](https://github.com/bazelbuild/bazel) - Tool from Google that builds code quickly and reliably.
- [Buck2](https://github.com/facebook/buck2) - Encourages the creation of small, reusable modules consisting of code and resources.
- [Dependency Analysis Gradle Plugin](https://github.com/autonomousapps/dependency-analysis-gradle-plugin) - Analyzes JVM and Android builds and recommends dependency and plugin changes.
- [Docker Maven Plugin](https://github.com/fabric8io/docker-maven-plugin) - Builds and runs Docker images from Maven.
- [Eclipse JKube](https://github.com/eclipse-jkube/jkube) - Maven and Gradle plugins for building and deploying Java applications on Kubernetes.
- [Frontend Maven Plugin](https://github.com/eirslett/frontend-maven-plugin) - Installs and runs Node.js frontend tooling from Maven builds.
- [git-commit-id Maven Plugin](https://github.com/git-commit-id/git-commit-id-maven-plugin) - Exposes Git revision information to Maven builds and applications.
- [Gradle](https://github.com/gradle/gradle) - Incremental builds programmed via Groovy instead of declaring XML. Works well with Maven's dependency management.
- [Jib](https://github.com/GoogleContainerTools/jib) - Builds optimized container images for Java applications without a Docker daemon.
- [Javadoc Publisher](https://github.com/MathieuSoysal/Javadoc-publisher.yml) - Generate Javadoc from your maven/gradle project and deploy it automatically on GitHub Page.
- [jar-cart](https://github.com/Sudhanshu-Ambastha/jar-cart) - A modern, zero-configuration package manager and runner for the Java ecosystem written in Go, focusing on developer productivity and build speed.
- [Maven Wrapper](https://github.com/apache/maven-wrapper) - Analogue of Gradle Wrapper for Maven, allowing projects to build without a preinstalled Maven.
- [Polyglot for Maven](https://github.com/takari/polyglot-maven) - Extensions for Maven 3.3.1+ that allows writing the POM model in dialects other than XML.
- [ReleaseRun](https://github.com/Releaserun/releaserun-cli) - Dependency health checker for pom.xml and Gradle projects that scans for CVEs and outdated packages.
- [Shadow](https://github.com/GradleUp/shadow) - Gradle plugin for creating and transforming executable fat JARs.

### Bytecode Manipulation

_Libraries to manipulate bytecode programmatically._

- [ASM](https://asm.ow2.io) - All-purpose, low-level bytecode manipulation and analysis.
- [Byte Buddy](https://github.com/raphw/byte-buddy) - Further simplifies bytecode generation with a fluent API.
- [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) - Java 8 Jar & Android APK reverse engineering suite.
- [Byteman](https://github.com/bytemanproject/byteman) - Manipulate bytecode at runtime via DSL (rules); mainly for testing/troubleshooting. (LGPL-2.1-or-later)
- [Javassist](https://github.com/jboss-javassist/javassist) - Tries to simplify bytecode editing.
- [Maker](https://github.com/cojen/maker) - Provides low level bytecode generation.
- [Recaf](https://github.com/Col-E/Recaf) - JVM reverse engineering toolkit, essentially an IDE for Java bytecode.

### Caching

_Libraries that provide caching facilities._

- [cache2k](https://github.com/cache2k/cache2k) - In-memory high performance caching library.
- [Caffeine](https://github.com/ben-manes/caffeine) - High-performance, near-optimal caching library.
- [Ehcache](https://github.com/ehcache/ehcache3) - Distributed general-purpose cache.
- [Infinispan](https://github.com/infinispan/infinispan) - Highly concurrent key/value datastore used for caching.
- [JetCache](https://github.com/alibaba/jetcache) - Java cache framework with local and distributed caching, annotations and asynchronous APIs.

### CLI

_Libraries for everything related to the CLI._

#### Argument Parsing

_Libraries to assist with parsing command line arguments._

- [Airline](https://github.com/rvesse/airline) - Annotation-based framework for parsing Git-like command-line arguments.
- [JCommander](https://github.com/cbeust/jcommander) - Command-line argument-parsing framework with custom types and validation via implementing interfaces.
- [jbock](https://github.com/jbock-java/jbock) - Reflectionless command line parser.
- [JLine](https://github.com/jline/jline3) - Includes features from modern shells like completion or history.
- [picocli](https://github.com/remkop/picocli) - ANSI colors and styles in usage help with annotation-based POSIX/GNU/any syntax, subcommands, strong typing for both options and positional args.

#### Text-Based User Interfaces

_Libraries that provide TUI frameworks, or building blocks related functions._

- [AliveJTUI](https://github.com/yehorsyrin/alivejTUI) - Declarative, React-style TUI library for building terminal UIs as component trees with diff-based rendering, focus management, and themes.
- [Jansi](https://github.com/fusesource/jansi) - ANSI escape codes to format console output.
- [Jexer](https://gitlab.com/AutumnMeowMeow/jexer) - Advanced console (and Swing) text user interface (TUI) library, with mouse-draggable windows, built-in terminal window manager, and sixel image support. Looks like [Turbo Vision](https://en.wikipedia.org/wiki/Turbo_Vision).
- [Lanterna](https://github.com/mabe02/lanterna) - Easy console text-GUI library, similar to curses.

### Cloud

_Libraries to integrate or use cloud-specific features._

- [AWS SDK for Java 2.x](https://github.com/aws/aws-sdk-java-v2) - Official Java APIs for interacting with Amazon Web Services.
- [Google Cloud Client Libraries](https://github.com/googleapis/google-cloud-java) - Client libraries for accessing Google Cloud services from Java applications.
- [Java Operator SDK](https://github.com/operator-framework/java-operator-sdk) - SDK for implementing Kubernetes operators in Java.
- [kubernetes-client](https://github.com/fabric8io/kubernetes-client) - Client provides access to the full Kubernetes & OpenShift REST APIs via a fluent DSL.
- [Kubernetes Java Client](https://github.com/kubernetes-client/java) - Official Java client for the Kubernetes API.
- [minio-java](https://github.com/minio/minio-java) - Provides simple APIs to access any Amazon S3-compatible object storage server.

### Code Analysis

_Tools that provide metrics and quality measurements._

- [Checkstyle](https://github.com/checkstyle/checkstyle) - Static analysis of coding conventions and standards.
- [Error Prone](https://github.com/google/error-prone) - Catches common programming mistakes as compile-time errors.
- [Error Prone Support](https://github.com/PicnicSupermarket/error-prone-support) - Error Prone extensions: extra bug checkers and a large battery of Refaster templates.
- [Infer](https://github.com/facebook/infer) - Modern static analysis tool for verifying the correctness of code.
- [JSpecify](https://github.com/jspecify/jspecify) - Standardized nullness annotations designed to work uniformly across various Java IDEs, compilers, and static analysis tools.
- [Modernizer](https://github.com/gaul/modernizer-maven-plugin) - Detect uses of legacy Java APIs.
- [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) - Reports whether instances of a given class are immutable.
- [NullAway](https://github.com/uber/NullAway) - Eliminates NullPointerExceptions with low build-time overhead.
- [OpenRewrite](https://github.com/openrewrite/rewrite) - Automates large-scale source-code refactoring through reusable recipes.
- [OpenTaint](https://github.com/seqra/opentaint) - Interprocedural taint analyzer for Java and Spring applications with reusable security rules and dependency models.
- [PMD](https://github.com/pmd/pmd) - Source code analysis for finding bad coding practices.
- [RefactorFirst](https://github.com/jimbethancourt/RefactorFirst) - Identifies and prioritizes God Classes and Highly Coupled classes.
- [SonarJava](https://github.com/SonarSource/sonar-java) - Static analyzer for SonarQube & SonarLint. (LGPL-3.0-only)
- [Spoon](https://github.com/INRIA/spoon) - Library for analyzing and transforming Java source code.
- [Spotbugs](https://github.com/spotbugs/spotbugs) - Static analysis of bytecode to find potential bugs.
- [ToolsHref](https://github.com/toolshref-tools/toolshref-tools) - Online Java code analyzer and JSON-to-Mermaid visualization tool.

### Code Coverage

_Frameworks and tools that enable code coverage metrics collection for test suites._

- [OpenClover](https://github.com/openclover/clover) - Measures Java code coverage through source-code instrumentation, with build-tool and IDE integrations.
- [Delta Coverage](https://github.com/gw-kit/delta-coverage-plugin) - Computes code coverage of new and modified code based on a provided diff, supporting JaCoCo and IntelliJ coverage engines.
- [JaCoCo](https://github.com/jacoco/jacoco) - Framework that enables collection of code coverage metrics, using both offline and runtime bytecode instrumentation.

### Code Formatting

_Tools that format or restructure Java source code._

- [google-java-format](https://github.com/google/google-java-format) - Reformats Java source code to follow Google Java Style.
- [JHarmonizer](https://github.com/lemon-ant/JHarmonizer) - Safely reorders Java source code with configurable rules and Palantir Java Format.
- [Palantir Java Format](https://github.com/palantir/palantir-java-format) - Formatter based on google-java-format with wider lines and lambda-friendly output.
- [Spotless](https://github.com/diffplug/spotless) - A versatile code formatter for Gradle and Maven that enforces multiple styles (including Google and Palantir) across Java and other languages.

### Code Generators

_Tools that generate patterns for repetitive code in order to reduce verbosity and error-proneness._

- [Auto](https://github.com/google/auto) - Generates factory, service, and value classes.
- [Avaje HTTP](https://github.com/avaje/avaje-http) - Generates HTTP server adapters and declarative clients, with a lightweight JDK HTTP client.
- [Bootify](https://bootify.io) - Browser-based Spring Boot app generation with JPA model and REST API.
- [Chocotea](https://github.com/cleopatra27/chocotea) - Generates postman collection, environment and integration tests from java code.
- [CRUDGen](https://github.com/bariskokulu/CRUDGen) - Compile-time annotation processor generating CRUD layers, DTOs, JSON Patch, and custom HTTP endpoints for Spring Boot.
- [EasyEntityToDTO](https://github.com/Marcel091004/EasyEntityToDTO) - Annotation processor for automatic DTO and Mapper generation with zero boilerplate.
- [Geci](https://github.com/verhas/javageci) - Discovers files that need generated code, updates automatically and writes to the source with a convenient API.
- [Immutables](https://github.com/immutables/immutables) - Annotation processors to generate simple, safe and consistent value objects.
- [J2ObjC](https://github.com/google/j2objc) - Java-to-Objective-C translator for porting Android libraries to iOS.
- [JHipster](https://github.com/jhipster/generator-jhipster) - Yeoman source code generator for Spring Boot and AngularJS.
- [Joda-Beans](https://github.com/JodaOrg/joda-beans) - Small framework that adds queryable properties to Java, enhancing JavaBeans.
- [jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo) - Generates Java types from JSON Schema or example JSON.
- [JPA Buddy](https://www.jpa-buddy.com) - Plugin for IntelliJ IDEA. Provides visual tools for generating JPA entities, Spring Data JPA repositories, Liquibase changelogs and SQL scripts. Offers automatic Liquibase/Flyway script generation by comparing model to DB, and reverse engineering JPA entities from DB tables.
- [JSpecify Package-Info Generator](https://github.com/bcaillard/jspecify-packageinfo-generator) - Maven plugin that automatically generates package-info.java files with JSpecify annotations (@NullMarked and @NullUnmarked), helping you manage nullness boundaries in your Java projects without manual boilerplate.
- [Lombok](https://github.com/projectlombok/lombok) - Code generator that aims to reduce verbosity.
- [Record-Builder](https://github.com/Randgalt/record-builder) - Companion builder class, withers and templates for Java records.
- [Spring CRUD Generator](https://github.com/mzivkovicdev/spring-crud-generator) - Maven plugin for generating Spring Boot CRUD applications from YAML/JSON specifications.
- [Telosys](https://www.telosys.org/) - Java code-generation toolkit with a CLI and model-driven template engine. <!-- github: telosys-tools-bricks/telosys-cli, telosys-tools-bricks/telosys-tools-generator -->

### Compiler-compiler

_Frameworks that help to create parsers, interpreters or compilers._

- [ANTLR](https://github.com/antlr/antlr4) - Complex full-featured framework for top-down parsing.
- [JavaCC](https://github.com/javacc/javacc) - Parser generator that generates top-down parsers. Allows lexical state switching and permits extended BNF specifications.
- [JFlex](https://github.com/jflex-de/jflex) - Lexical analyzer generator.

### Computer Vision

_Libraries which seek to gain high level information from images and videos._

- [BoofCV](https://github.com/lessthanoptimal/BoofCV) - Library for image processing, camera calibration, tracking, SFM, MVS, 3D vision, QR Code and much more.
- [ImageJ](https://github.com/imagej/ImageJ) - Medical image processing application with an API.
- [JavaCV](https://github.com/bytedeco/javacv) - Java interface to OpenCV, FFmpeg, and much more.

### Configuration

_Libraries that provide external configuration._

- [avaje config](https://github.com/avaje/avaje-config) - Loads yaml and properties files, supports dynamic configuration, plugins, file-watching and config event listeners.
- [centraldogma](https://github.com/line/centraldogma) - Highly-available version-controlled service configuration repository based on Git, ZooKeeper and HTTP/2.
- [ClearConfig](https://github.com/japgolly/clear-config-java) - Type-safe, composable configuration library with a focus on runtime clarity.
- [config](https://github.com/lightbend/config) - Configuration library supporting Java properties, JSON or its human optimized superset HOCON.
- [Configurate](https://github.com/SpongePowered/Configurate) - Configuration library with support for various configuration formats and transformations.
- [dotenv](https://github.com/shyiko/dotenv) - Twelve-factor configuration library which uses environment-specific files.
- [Externalized Properties](https://github.com/joel-jeremy/externalized-properties) - Simple, lightweight, yet powerful configuration library which supports resolution of properties from external sources such as files, databases, git repositories, and any custom sources, plus an extensible post-processing/conversion mechanism.
- [Gestalt](https://github.com/gestalt-config/gestalt) - Gestalt offers a comprehensive solution to the challenges of configuration management. It allows you to source configuration data from multiple inputs, merge them intelligently, and present them in a structured, type-safe manner.
- [ini4j](https://ini4j.sourceforge.net) - Provides an API for handling Windows' INI files.
- [KAConf](https://github.com/mariomac/kaconf) - Annotation-based configuration system for Java and Kotlin.
- [microconfig](https://github.com/microconfig/microconfig) - Configuration system designed for microservices which helps to separate configuration from code. The configuration for different services can have common and specific parts and can be dynamically distributed.
- [NightConfig](https://github.com/TheElectronWill/night-config) - Configuration library supporting TOML, YAML, HOCON, JSON and in-memory formats.
- [owner](https://github.com/matteobaccan/owner) - Reduces boilerplate of properties.
- [sealed-env](https://github.com/davidalmeidac/sealed-env) - Encrypts environment files with a shared Node.js and Java/Spring Boot format plus optional TOTP unsealing.

### Constraint Satisfaction Problem Solver

_Libraries that help with implementing optimization and satisfiability problems._

- [Choco](https://github.com/chocoteam/choco-solver) - Off-the-shelf constraint satisfaction problem solver that uses constraint programming techniques.
- [JaCoP](https://github.com/radsz/jacop) - Includes an interface for the FlatZinc language, enabling it to execute MiniZinc models. (AGPL-3.0)
- [Timefold](https://github.com/TimefoldAI/timefold-solver) - Flexible solver with Spring/Quarkus support and quickstarts for the Vehicle Routing Problem, Maintenance Scheduling, Employee Shift Scheduling and much more.

### CSV

_Frameworks and libraries that simplify reading/writing CSV data._

- [FastCSV](https://github.com/osiegmar/FastCSV) - Performance-optimized, dependency-free and RFC 4180 compliant.
- [jackson-dataformat-csv](https://github.com/FasterXML/jackson-dataformats-text) - Jackson extension for reading and writing CSV.
- [opencsv](https://opencsv.sourceforge.net) - Simple CSV parser.

### Data Processing

_Tools for batch, stream, table and data-transformation workloads._

- [Apache Flink](https://github.com/apache/flink) - Fast, reliable, large-scale data processing engine.
- [Apache Storm](https://github.com/apache/storm) - Realtime computation system.
- [easy-batch](https://github.com/j-easy/easy-batch) - Set up batch jobs with simple processing pipelines. Records are read in sequence from a data source, processed in pipeline and written in batches to a data sink.
- [Embulk](https://github.com/embulk/embulk) - Bulk data loader that helps data transfer between various databases, storages, file formats, and cloud services.
- [OpenRefine](https://github.com/OpenRefine/OpenRefine) - Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases.
- [Scriptella ETL](https://github.com/scriptella/scriptella-etl) - Open-source Java-based ETL and script execution tool for transferring and transforming data between databases, files, and other sources.
- [Siddhi](https://github.com/siddhi-io/siddhi) - Cloud native streaming and complex event processing engine.
- [Smooks](https://github.com/smooks/smooks) - Framework for fragment-based message processing. (Apache-2.0 OR LGPL-3.0-or-later)
- [Tablesaw](https://github.com/jtablesaw/tablesaw) - Includes a data-frame, an embedded column store, and hundreds of methods to transform, summarize, or filter data.

### Data Structures

_Efficient and specific data structures._

- [CQEngine Next](https://github.com/MSaifAsif/cqengine-next) - Provides indexed, SQL-like queries over Java collections.
- [HashSmith](https://github.com/bluuewhale/hash-smith) - Hash map and set implementations using SwissTable-style SWAR/SIMD control-byte probing, optimized for memory efficiency.
- [Persistent Collection](https://github.com/hrldcpr/pcollections) - Persistent and immutable analogue of the Java Collections Framework.
- [RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) - Fast and efficient compressed bitmap.
- [Wormhole4j](https://github.com/komamitsu/wormhole4j) - High-performance sorted map with fast range scans and thread-safe concurrent access, based on the Wormhole index structure.

### Database

_Everything that simplifies interactions with the database._

- [Actual Schema Gradle Plugin](https://github.com/YRashid/actual-schema-gradle-plugin) - Generates PostgreSQL schema DDL from Liquibase migrations using Testcontainers.
- [Apache Calcite](https://github.com/apache/calcite) - Dynamic data management framework. It contains many of the pieces that comprise a typical database management system.
- [Apache Cassandra](https://github.com/apache/cassandra) - Distributed wide-column database with linear scalability and fault tolerance.
- [Apache Doris](https://github.com/apache/doris) - Distributed SQL database for real-time analytics.
- [Apache Drill](https://github.com/apache/drill) - Distributed, schema on-the-fly, ANSI SQL query engine for Big Data exploration.
- [Apache Phoenix](https://github.com/apache/phoenix) - High-performance relational database layer over HBase for low-latency applications.
- [ArcadeDB](https://github.com/ArcadeData/arcadedb) - Multi-model database supporting graphs, documents, key-value, time series, and vector embeddings with SQL, Cypher, Gremlin, MongoDB, and Redis API compatibility.
- [ArangoDB](https://github.com/arangodb/arangodb-java-driver) - ArangoDB Java driver.
- [Chronicle Map](https://github.com/OpenHFT/Chronicle-Map) - Efficient, in-memory (opt. persisted to disk), off-heap key-value store.
- [ClickHouse Java](https://github.com/ClickHouse/clickhouse-java) - Java clients and JDBC driver for ClickHouse.
- [Debezium](https://github.com/debezium/debezium) - Low latency data streaming platform for change data capture.
- [druid](https://github.com/apache/druid) - High-performance, column-oriented, distributed data store.
- [eXist](https://github.com/eXist-db/exist) - NoSQL document database and application platform.
- [FlexyPool](https://github.com/vladmihalcea/flexy-pool) - Brings metrics and failover strategies to the most common connection pooling solutions.
- [Flyway](https://github.com/flyway/flyway) - Simple database migration tool.
- [JQuick SQL](https://github.com/paohaijiao/jquick-sql) - Embeddable, lightweight distributed SQL engine featuring heterogeneous federated query support for unified data access across disparate systems.
- [H2](https://github.com/h2database/h2database) - Small SQL database notable for its in-memory functionality.
- [HikariCP](https://github.com/brettwooldridge/HikariCP) - High-performance JDBC connection pool.
- [HSQLDB](https://hsqldb.org/) - HyperSQL 100% Java database.
- [JanusGraph](https://github.com/JanusGraph/janusgraph) - Distributed graph database supporting pluggable storage and indexing backends.
- [JDBI](https://github.com/jdbi/jdbi) - Convenient abstraction of JDBC.
- [Jedis](https://github.com/redis/jedis) - Java client for Redis with synchronous, asynchronous and cluster APIs.
- [jetcd](https://github.com/etcd-io/jetcd) - Java client for etcd v3.
- [Jinq](https://github.com/my2iu/Jinq) - Typesafe database queries via symbolic execution of Java 8 Lambdas (on top of JPA or jOOQ).
- [jOOQ](https://github.com/jOOQ/jOOQ) - Generates typesafe code based on SQL schema.
- [Lettuce](https://github.com/redis/lettuce) - Lettuce is a scalable Redis client for building non-blocking Reactive applications.
- [Liquibase](https://github.com/liquibase/liquibase) - Database-independent library for tracking, managing and applying database schema changes.
- [MapDB](https://github.com/jankotek/mapdb) - Embedded database engine that provides concurrent collections backed on disk or in off-heap memory.
- [MariaDB4j](https://github.com/vorburger/MariaDB4j) - Launcher for MariaDB that requires no installation or external dependencies.
- [Modality](https://github.com/arkanovicz/modality) - Lightweight ORM with database reverse engineering features.
- [MongoDB Java Driver](https://github.com/mongodb/mongo-java-driver) - Official synchronous, asynchronous and reactive Java drivers for MongoDB.
- [ObjectBox](https://github.com/objectbox/objectbox-java) - Embedded object and vector database for Java and Android.
- [Open J Proxy](https://github.com/Open-J-Proxy/ojp) - Type 3 JDBC driver and Layer 7 proxy server for decoupling applications from relational database connection management.
- [OpenDJ](https://github.com/OpenIdentityPlatform/OpenDJ) - LDAPv3 compliant directory service, developed for the Java platform, providing a high performance, highly available, and secure store for the identities.
- [Querydsl](https://github.com/querydsl/querydsl) - Typesafe unified queries.
- [QueryStream](https://github.com/querystream/querystream) - Build JPA Criteria queries using a Stream-like API.
- [Presto](https://github.com/prestodb/presto) - Distributed SQL query engine for large data sources.
- [QuestDB](https://github.com/questdb/questdb) - High-performance SQL database for time series. Supports InfluxDB line protocol, PostgreSQL wire protocol, and REST.
- [Realm](https://github.com/realm/realm-java) - Mobile database to run directly inside phones, tablets or wearables.
- [Redisson](https://github.com/redisson/redisson) - Allows for distributed and scalable data structures on top of a Redis server.
- [requery](https://github.com/requery/requery) - Modern, lightweight but powerful object mapping and SQL generator. Easily map to or create databases, or perform queries and updates from any Java-using platform.
- [SchemaCrawler](https://github.com/schemacrawler/SchemaCrawler) - Discovers, documents and diagrams relational database schemas from Java, build tools and the command line.
- [Spring Data Dynamic Query](https://github.com/tdilber/spring-data-dynamic-query) - Unified dynamic query interface for Spring Data JPA, MongoDB, and Elasticsearch, enabling advanced JOIN(s), OR logic, scoped conditions, powerful projections and advanced features with zero boilerplate.
- [Spring Data JPA MongoDB Expressions](https://github.com/mhewedy/spring-data-jpa-mongodb-expressions) - Allows you to use MongoDB query language to query your relational database.
- [StarRocks](https://github.com/StarRocks/starrocks) - Distributed SQL query engine for real-time analytics and data lakehouses.
- [Trino](https://github.com/trinodb/trino) - Distributed SQL query engine for big data.
- [Vibur DBCP](https://github.com/vibur/vibur-dbcp) - JDBC connection pool library with advanced performance monitoring capabilities.
- [Xodus](https://github.com/JetBrains/xodus) - Highly concurrent transactional schema-less and ACID-compliant embedded database.
- [CosId](https://github.com/Ahoo-Wang/CosId) - Universal, flexible, high-performance distributed ID generator.
- [Apache ShardingSphere](https://github.com/apache/shardingsphere) - Distributed SQL transaction & query engine that allows for data sharding, scaling, encryption, and more on any database.

### Date and Time

_Libraries related to handling date and time._

- [iCal4j](https://github.com/ical4j/ical4j) - Parse and build iCalendar [RFC 5545](https://tools.ietf.org/html/rfc5545) data models.
- [Jollyday](https://github.com/focus-shift/jollyday) - Determines the holidays for a given year, country/name and eventually state/region.
- [ThreeTen-Extra](https://github.com/ThreeTen/threeten-extra) - Additional date-time classes that complement those in JDK 8.
- [Time4J](https://github.com/MenoData/Time4J) - Advanced date and time library.

### Decentralization

_Libraries that handle decentralization tasks._

- [java-tron](https://github.com/tronprotocol/java-tron) - Implementation of the Tron Protocol, whic utilizes blockchains to develop decentralized applications.
- [bitcoinj](https://github.com/bitcoinj/bitcoinj) - Library for working with the Bitcoin protocol and network.
- [web3j](https://github.com/LFDT-web3j/web3j) - Java and Android library for integrating with Ethereum-compatible blockchains.

### Decompilation

_Libraries for decompiling JVM bytecode._

- [CFR](https://github.com/leibnitz27/cfr) - Java decompiler focused on modern language features.
- [Fernflower](https://github.com/JetBrains/fernflower) - Java decompiler with broad JVM bytecode support.
- [jadx](https://github.com/skylot/jadx) - Dex-to-Java decompiler with command-line and graphical interfaces.
- [transformer-api](https://github.com/nbauma109/transformer-api) - Unified API that exposes multiple decompilers through one in-memory transformation interface.
- [Vineflower](https://github.com/Vineflower/vineflower) - Modern maintained fork of Fernflower.

### Dependency Injection

_Libraries that help to realize the [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control) paradigm._

- [Apache DeltaSpike](https://github.com/apache/deltaspike) - CDI extension framework.
- [Avaje Inject](https://github.com/avaje/avaje-inject) - Microservice-focused compile-time injection framework without reflection.
- [Dagger](https://github.com/google/dagger) - Compile-time injection framework without reflection.
- [Dimension-DI](https://github.com/akardapolov/dimension-di) - JSR-330 runtime dependency injection using the JDK Class-File API.
- [Governator](https://github.com/Netflix/governator) - Extensions and utilities that enhance Google Guice.
- [Guice](https://github.com/google/guice) - Lightweight and opinionated framework that completes Dagger.
- [HK2](https://github.com/eclipse-ee4j/glassfish-hk2) - Lightweight and dynamic dependency injection framework.

### Development

_Augmentation of the development process at a fundamental level._

- [AspectJ](https://github.com/eclipse-aspectj/aspectj) - Seamless aspect-oriented programming extension.
- [Faux Pas](https://github.com/zalando/faux-pas) - Library that simplifies error handling by circumventing the issue that none of the functional interfaces in the Java Runtime is allowed by default to throw checked exceptions.
- [Ghidra](https://github.com/NationalSecurityAgency/ghidra) - Extensible software reverse-engineering framework with Java APIs and scripting.
- [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Unlimited runtime class and resource redefinition.
- [Jctx](https://github.com/Shashwat-Gupta57/jctx) - Reads a Java project and generates a structured context file so AI tools can understand and help plan the codebase.
- [JGit](https://github.com/eclipse-jgit/jgit) - Lightweight, pure Java library implementing the Git version control system.
- [JavaParser](https://github.com/javaparser/javaparser) - Parse, modify and generate Java code.
- [Manifold](https://github.com/manifold-systems/manifold) - Re-energizes Java with powerful features like type-safe metaprogramming, structural typing and extension methods.
- [NoException](https://github.com/robertvazan/noexception) - Allows checked exceptions in functional interfaces and converts exceptions to Optional return.
- [RR4J](https://github.com/Kartikvk1996/RR4J) - RR4J is a tool that records java bytecode execution and later allows developers to replay locally.
- [SneakyThrow](https://github.com/rainerhahnekamp/sneakythrow) - Ignores checked exceptions without bytecode manipulation. Can also be used inside Java 8 stream operations.
- [Tail](https://github.com/nrktkt/tail) - Enable infinite recursion using tail call optimization.

### Distributed Applications

_Libraries and frameworks for writing distributed and fault-tolerant applications._

- [Apache Geode](https://github.com/apache/geode) - In-memory data management system that provides reliable asynchronous event notifications and guaranteed message delivery.
- [Apache ZooKeeper](https://github.com/apache/zookeeper) - Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems.
- [Axon](https://github.com/AxonIQ/AxonFramework) - Framework for creating CQRS applications.
- [Curator Framework](https://github.com/apache/curator) - High-level API for Apache ZooKeeper.
- [Dropwizard Circuit Breaker](https://github.com/mtakaki/dropwizard-circuitbreaker) - Circuit breaker design pattern for Dropwizard.
- [Failsafe](https://github.com/failsafe-lib/failsafe) - Simple failure handling with retries and circuit breakers.
- [Hazelcast](https://github.com/hazelcast/hazelcast) - Highly scalable in-memory datagrid with a free open-source version.
- [JGroups](https://github.com/belaban/JGroups) - Toolkit for reliable messaging and cluster creation.
- [resilience4j](https://github.com/resilience4j/resilience4j) - Functional fault tolerance library.
- [ScaleCube Services](https://github.com/scalecube/scalecube-services) - Embeddable Cluster-Membership library based on SWIM and gossip protocol.

### Distributed Transactions

_Distributed transactions provide a mechanism for ensuring consistency of data updates in the presence of concurrent access and partial failures._

- [Atomikos](https://github.com/atomikos/transactions-essentials) - Provides transactions for REST, SOA and microservices with support for JTA and XA.
- [Bitronix](https://github.com/bitronix/btm) - Simple but complete implementation of the JTA 1.1 API.
- [Narayana](https://github.com/jbosstm/narayana) - Provides support for traditional ACID and compensation transactions, also complies with JTA, JTS and other standards.
- [Seata](https://github.com/apache/incubator-seata) - Delivers high performance and easy to use distributed transaction services under a microservices architecture.

### Distribution

_Tools that handle the distribution of applications in native formats._

- [Artipie](https://github.com/artipie/artipie) - Binary artifact management toolkit which hosts them on the file system or S3.
- [Boxfuse](https://boxfuse.com) - Deployment of JVM applications to AWS using the principles of immutable infrastructure.
- [Central Repository](https://search.maven.org) - Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven, and available in all other build tools.
- [Cloudsmith](https://cloudsmith.io) - Fully managed package management SaaS with support for Maven/Gradle/SBT with a free tier.
- [Getdown](https://github.com/threerings/getdown) - System for deploying Java applications to end-user computers and keeping them up to date. Developed as an alternative to Java Web Start.
- [IzPack](https://github.com/izpack/izpack) - Setup authoring tool for cross-platform deployments.
- [JavaPackager](https://github.com/javapackager/JavaPackager) - Maven and Gradle plugin which provides an easy way to package Java applications in native Windows, macOS or GNU/Linux executables, and generate installers for them.
- [jDeploy](https://github.com/shannah/jdeploy) - Deploy desktop apps as native Mac, Windows or Linux bundles.
- [jlink.online](https://github.com/AdoptOpenJDK/jlink.online) - Builds optimized runtimes over HTTP.
- [Nuts](https://github.com/thevpc/nuts) - Installs and runs Java applications from Maven repositories, reusing descriptors and provisioning required JDKs.
- [Nexus](https://github.com/sonatype/nexus-public) - Binary management with proxy and caching capabilities.
- [packr](https://github.com/libgdx/packr) - Packs JARs, assets and the JVM for native distribution on Windows, Linux and macOS.
- [really-executable-jars-maven-plugin](https://github.com/brianm/really-executable-jars-maven-plugin) - Maven plugin for making self-executing JARs.

### Document Processing

_Libraries that assist with processing office document formats._

- [Apache Tika](https://github.com/apache/tika) - Detects and extracts text and metadata from a wide range of document formats.
- [commonmark-java](https://github.com/commonmark/commonmark-java) - Parses and renders CommonMark-compatible Markdown.
- [documents4j](https://github.com/documents4j/documents4j) - API for document format conversion using third-party converters such as MS Word.
- [docx4j](https://github.com/plutext/docx4j) - Create and manipulate Microsoft Open XML files.
- [html-to-markdown](https://github.com/xberg-io/html-to-markdown) - Converts HTML to CommonMark-compatible Markdown through a Java binding.
- [JQuick Excel](https://github.com/paohaijiao/jquick-excel) - Configures Excel import, export, validation, formulas and charts through a declarative XML DSL.
- [xberg](https://github.com/xberg-io/xberg) - Extracts text, tables and metadata from PDFs, Office documents, images and other formats through a Java binding.

### Feature Flags

_Libraries and SDKs for evaluating and managing feature flags._

- [FF4J](https://github.com/ff4j/ff4j) - Feature Flags for Java.
- [OpenFeature Java SDK](https://github.com/open-feature/java-sdk) - Vendor-neutral API for evaluating feature flags in Java applications.
- [Rollgate Java SDK](https://github.com/rollgate/sdks/tree/main/packages/sdk-java) - Java SDK for evaluating Rollgate feature flags with real-time configuration updates.
- [Togglz](https://github.com/togglz/togglz) - Implementation of the Feature Toggles pattern.
- [Unleash Java SDK](https://github.com/Unleash/unleash-java-sdk) - Java client SDK for the Unleash feature management platform.

### Financial

_Libraries related to the financial domain._

- [Cassandre](https://github.com/cassandre-tech/cassandre-trading-bot) - Trading bot framework.
- [Joda-Money](https://github.com/JodaOrg/joda-money) - Basic currency and money classes and algorithms not provided by the JDK.
- [OpenGamma Strata](https://github.com/OpenGamma/Strata) - Analytics and market risk library for financial products.
- [Philadelphia](https://github.com/paritytrading/philadelphia) - Low-latency financial information exchange.
- [Stripe](https://github.com/stripe/stripe-java) - Integration with the Stripe API.
- [ta4j](https://github.com/ta4j/ta4j) - Library for technical analysis.
- [XChange](https://github.com/knowm/XChange) - Consistent Java API for market data and trading across cryptocurrency exchanges.
- [Wickra](https://github.com/wickra-lib/wickra) - Technical-analysis library with 514 streaming O(1)-per-tick indicators on a native Rust core, on Maven Central as org.wickra:wickra; more indicators and incremental updates than the pure-Java ta4j.

### Flat File

_Frameworks and libraries for reading and writing fixed-length and delimited flat files._

- [BeanIO](https://github.com/beanio/beanio) - Maps flat files of fixed-length or delimited records to and from Java beans using XML or annotation configuration.
- [fixedformat4j](https://github.com/jeyben/fixedformat4j) - Annotation-driven mapping of fixed-width flat files to and from POJOs and Java records.
- [Flatpack](https://github.com/Appendium/flatpack) - Parses and writes delimited and fixed-length flat files with optional column-mapping definitions.

### Formal Verification

_Formal-methods tools: proof assistants, model checking, symbolic execution, etc._

- [Checker Framework](https://github.com/typetools/checker-framework) - Pluggable type systems. Includes nullness types, physical units, immutability types and more. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Daikon](https://github.com/codespecs/daikon) - Detects likely program invariants and generates JML specs based on those invariants.
- [Java Path Finder (JPF)](https://github.com/javapathfinder/jpf-core) - JVM formal verification tool containing a model checker and more. Created by NASA.
- [JMLOK 2.0](https://massoni.computacao.ufcg.edu.br/home/jmlok) - Detects inconsistencies between code and JML specification through feedback-directed random tests generation, and suggests a likely cause for each nonconformance detected. (GPL-3.0-only)
- [KeY](https://github.com/KeYProject/key) - Formal software development tool that aims to integrate design, implementation, formal specification, and formal verification of object-oriented software as seamlessly as possible. Uses JML for specification and symbolic execution for verification. (GPL-2.0-or-later)
- [OpenJML](https://github.com/OpenJML/OpenJML) - Translates JML specifications into SMT-LIB format and passes the proof problems implied by the program to backend solvers. (GPL-2.0-only)

### Functional Programming

_Libraries that facilitate functional programming._

- [Fugue](https://bitbucket.org/atlassian/fugue) - Functional extensions to Guava.
- [Functional Java](https://github.com/functionaljava/functionaljava) - Implements numerous basic and advanced programming abstractions that assist composition-oriented development.
- [jOOλ](https://github.com/jOOQ/jOOL) - Extension to Java 8 that aims to fix gaps in lambda by providing numerous missing types and a rich set of sequential Stream API additions.
- [Packrat](https://github.com/jhspetersson/packrat) - Gatherers library for Java Stream API. Gatherers can enhance streams with custom intermediate operations.
- [Parallel Collectors](https://github.com/pivovarit/parallel-collectors) - Stream API Collectors for parallel processing with custom thread pools, designed for I/O-heavy workloads.
- [protonpack](https://github.com/poetix/protonpack) - Collection of stream utilities.
- [StreamEx](https://github.com/amaembo/streamex) - Enhances Java 8 Streams.
- [Vavr](https://github.com/vavr-io/vavr) - Functional component library that provides persistent data types and functional control structures.

### Game Development

_Frameworks that support the development of games._

- [FXGL](https://github.com/AlmasB/FXGL) - JavaFX Game Development Framework.
- [input4j](https://github.com/gurkenlabs/input4j) - Lightweight, cross-platform library for gamepad and joystick input handling.
- [JBox2D](https://github.com/jbox2d/jbox2d) - Port of the renowned C++ 2D physics engine.
- [jMonkeyEngine](https://github.com/jMonkeyEngine/jmonkeyengine) - Game engine for modern 3D development.
- [libGDX](https://github.com/libgdx/libgdx) - All-round cross-platform, high-level framework.
- [Litiengine](https://github.com/gurkenlabs/litiengine) - AWT-based, lightweight 2D game engine.
- [LWJGL](https://github.com/LWJGL/lwjgl3) - Robust framework that abstracts libraries like OpenGL/CL/AL.
- [Pathetic](https://github.com/bsommerfeld/pathetic) - A highly configurable 3D A\* pathfinding library that uses specific optimizations for high performance.
- [vulkan4j](https://github.com/chuigda/vulkan4j) - Vulkan, OpenGL ES2 and GLFW Memory Allocator bindings.

### Geospatial

_Libraries for working with geospatial data and algorithms._

- [Apache SIS](https://github.com/apache/sis) - Library for developing geospatial applications.
- [ArcGIS Maps SDK for Java](https://github.com/Esri/arcgis-maps-sdk-java-samples/) - JavaFX library for adding mapping and GIS functionality to desktop apps.
- [Geo](https://github.com/davidmoten/geo) - GeoHash utilities in Java.
- [GeoTools](https://github.com/geotools/geotools) - Library that provides tools for geospatial data.
- [GraphHopper](https://github.com/graphhopper/graphhopper) - Road-routing engine. Used as a Java library or standalone web service.
- [H2GIS](https://github.com/orbisgis/h2gis) - Spatial extension of the H2 database.
- [IP2Location.io Java SDK](https://github.com/ip2location/ip2location-io-java) - Wrapper for the IP2Location.io Geolocation API and the IP2WHOIS domain WHOIS API.
- [JTS](https://github.com/locationtech/jts) - Geometry model and algorithms for manipulating vector geospatial data.
- [Jgeohash](https://github.com/astrapi69/jgeohash) - Library for using the GeoHash algorithm.
- [Mapsforge](https://github.com/mapsforge/mapsforge) - Map rendering based on OpenStreetMap data.
- [Open Location Code](https://github.com/google/open-location-code) - Encodes geographic coordinates as short, shareable Plus Codes.
- [Spatial4j](https://github.com/locationtech/spatial4j) - General-purpose spatial/geospatial library.

### GUI

_Libraries to create modern graphical user interfaces._

- [FlatLaf](https://github.com/JFormDesigner/FlatLaf) - Modern Swing Look and Feel with Darcula and IntelliJ themes.
- [ControlsFX](https://github.com/controlsfx/controlsfx) - UI controls and components that complement JavaFX.
- [JavaFX](https://github.com/openjdk/jfx) - Successor of Swing.
- [Scene Builder](https://github.com/gluonhq/scenebuilder) - Visual layout tool for JavaFX applications.
- [SnapKit](https://github.com/reportmill/SnapKit) - Modern Java UI library for both desktop and web.
- [Sierra](https://github.com/HTTP-RPC/Sierra) - Lightwieght declarative DSL for rapid development of Swing applications.
- [SWT](https://github.com/eclipse-platform/eclipse.platform.swt) - Graphical widget toolkit.

### High Performance

_Everything about high-performance computation, from collections to specific libraries._

- [Agrona](https://github.com/aeron-io/agrona) - Data structures and utility methods that are common in high-performance applications.
- [Disruptor](https://github.com/LMAX-Exchange/disruptor) - Inter-thread messaging library.
- [Eclipse Collections](https://github.com/eclipse-collections/eclipse-collections) - Collections framework inspired by Smalltalk.
- [fastutil](https://github.com/vigna/fastutil) - Fast and compact type-specific collections.
- [HPPC](https://github.com/carrotsearch/hppc) - Primitive collections.
- [Hollow](https://github.com/Netflix/hollow) - High-performance in-memory datasets distributed from a single producer to many consumers.
- [JCTools](https://github.com/JCTools/JCTools) - Concurrency tools currently missing from the JDK.
- [TransmittableThreadLocal](https://github.com/alibaba/transmittable-thread-local) - Propagates thread-local context across thread pools and asynchronous execution.

### HTTP Clients

_Libraries that assist with creating HTTP requests and/or binding responses._

- [Apache HttpComponents](https://hc.apache.org/) - Toolset of low-level Java components focused on HTTP and related protocols. <!-- github: apache/httpcomponents-client, apache/httpcomponents-core, apache/httpasyncclient -->
- [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) - Asynchronous HTTP and WebSocket client library.
- [Feign](https://github.com/OpenFeign/feign) - HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket.
- [Google HTTP Client](https://github.com/googleapis/google-http-java-client) - Pluggable HTTP transport abstraction with support for java.net.HttpURLConnection, Apache HTTP Client, Android, Google App Engine, XML, Gson, Jackson and Protobuf.
- [methanol](https://github.com/mizosoft/methanol) - HTTP client extensions library.
- [OkHttp](https://github.com/lysine-dev/okhttp) - HTTP client for the JVM, Android and GraalVM.
- [Retrofit](https://github.com/lysine-dev/retrofit) - Typesafe REST client.
- [Ribbon](https://github.com/Netflix/ribbon) - Client-side IPC library that is battle-tested in the cloud.
- [Riptide](https://github.com/zalando/riptide) - Client-side response routing for Spring's RestTemplate.
- [unirest-java](https://github.com/Kong/unirest-java) - Simplified, lightweight HTTP client library.
- [JQuickCurl](https://github.com/paohaijiao-jquick/jquick-curl) - Executes HTTP requests from cURL syntax through annotations, XML configuration and dynamic proxy clients.

### IDE

_Integrated development environments that try to simplify several aspects of development._

- [Eclipse Java IDE](https://www.eclipse.org) - Extensible Java IDE assembled from the Eclipse Platform, JDT and PDE. <!-- github: eclipse-platform/eclipse.platform, eclipse-platform/eclipse.platform.ui, eclipse-jdt/eclipse.jdt.core, eclipse-jdt/eclipse.jdt.ui, eclipse-jdt/eclipse.jdt.debug, eclipse-pde/eclipse.pde -->
- [Explyt](https://github.com/explyt/explyt) - AI coding agent for JetBrains IDEs that uses IDE indexes, refactorings, test runners, static analysis and debugging for Java and Kotlin projects.
- [IntelliJ IDEA](https://github.com/JetBrains/intellij-community) - Supports many JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector.
- [jGRASP](https://www.jgrasp.org) - Created to provide software visualizations that work in conjunction with the debugger such as Control Structure Diagrams, UML class diagrams and Object Viewer.
- [NetBeans](https://github.com/apache/netbeans) - Provides integration for several Java SE and EE features, from database access to HTML5.
- [SnapCode](https://github.com/reportmill/SnapCode) - Modern IDE for Java running in the browser, focused on education.
- [Visual Studio Code Java](https://code.visualstudio.com/docs/languages/java) - Extension suite providing Java language support, debugging, testing, Maven, Gradle and project management in Visual Studio Code. <!-- github: redhat-developer/vscode-java, microsoft/vscode-java-debug, microsoft/vscode-java-test, microsoft/vscode-maven, microsoft/vscode-java-dependency, microsoft/vscode-gradle -->

### Imagery

_Libraries that assist with the creation, evaluation or manipulation of graphical images._

- [Barcode-Lib4J](https://github.com/vws-java/Barcode-Lib4J) - Generates QR Code, DataMatrix, and other 1D/2D barcodes as vector (PDF, EPS, SVG) and raster (PNG, BMP, JPG) images with DPI awareness, high precision, and CMYK color model support.
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android focused on smooth scrolling.
- [Imgscalr](https://github.com/rkalla/imgscalr) - Simple, efficient and hardware-accelerated image-scaling library implemented in pure Java 2D.
- [Tess4J](https://github.com/nguyenq/tess4j) - JNA wrapper for Tesseract OCR API.
- [Thumbnailator](https://github.com/coobird/thumbnailator) - High-quality thumbnail generation library.
- [TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) - Collection of plugins that extend the number of supported image file formats.
- [ZXing](https://github.com/zxing/zxing) - Multi-format 1D/2D barcode image processing library.
- [image-comparison](https://github.com/romankh3/image-comparison) - Library that compares 2 images with the same sizes and shows the differences visually by drawing rectangles. Some parts of the image can be excluded from the comparison.
- [vips-ffm](https://github.com/lopcode/vips-ffm) - Comprehensive bindings for libvips, using Java's "Foreign Function & Memory" API.
- [webcam-capture](https://github.com/sarxos/webcam-capture) - Library for using built-in and external webcams directly in Java.
- [scrimage](https://github.com/sksamuel/scrimage) - Immutable, functional, and performant JVM library for manipulation of images.

### Introspection

_Libraries that help make the Java introspection and reflection API easier and faster to use._

- [ClassGraph](https://github.com/classgraph/classgraph) - ClassGraph (formerly FastClasspathScanner) is an uber-fast, ultra-lightweight, parallelized classpath scanner and module scanner for Java, Scala, Kotlin and other JVM languages.
- [jOOR](https://github.com/jOOQ/jOOR) - jOOR stands for jOOR Object Oriented Reflection. It is a simple wrapper for the java.lang.reflect package.
- [Objenesis](https://github.com/easymock/objenesis) - Allows dynamic instantiation without default constructor, e.g. constructors which have required arguments, side effects or throw exceptions.
- [ReflectASM](https://github.com/EsotericSoftware/reflectasm) - ReflectASM is a very small Java library that provides high performance reflection by using code generation.
- [TypeTools](https://github.com/jhalterman/typetools) - Tools for resolving generic types.

### Job Scheduling

_Libraries for scheduling background jobs._

- [JobRunr](https://github.com/jobrunr/jobrunr) - Job scheduling library which utilizes lambdas for fire-and-forget, delayed and recurring jobs. Guarantees execution by single scheduler instance using optimistic locking. Has features for persistence, minimal dependencies and is embeddable.
- [Quartz](https://github.com/quartz-scheduler/quartz) - Feature-rich, open source job scheduling library that can be integrated within virtually any Java application.
- [Sundial](https://github.com/knowm/Sundial) - Lightweight framework to simply define jobs, define triggers and start the scheduler.
- [Wisp](https://github.com/Coreoz/Wisp) - Simple library with minimal footprint and straightforward API.
- [db-scheduler](https://github.com/kagkarlsson/db-scheduler) - Persistent and cluster-friendly scheduler.
- [shedlock](https://github.com/lukas-krecan/ShedLock) - Makes sure that your scheduled tasks are executed at most once at the same time. If a task is being executed on one node, it acquires a lock which prevents execution of the same task from another node or thread.
- [XXL-JOB](https://github.com/xuxueli/xxl-job) - Distributed task scheduling platform with centralized administration and execution monitoring.

### JSON

_Libraries for serializing and deserializing JSON to and from Java objects._

- [Avaje Jsonb](https://github.com/avaje/avaje-jsonb) - Reflection-free Json binding via source code generation with Jackson-like annotations.
- [DSL-JSON](https://github.com/ngs-doo/dsl-json) - JSON library with advanced compile time databinding.
- [Fastjson2](https://github.com/alibaba/fastjson2) - High-performance JSON parser, serializer and object mapper.
- [Gson](https://github.com/google/gson) - Serializes objects to JSON and vice versa. Good performance with on-the-fly usage.
- [jackson-modules-java8](https://github.com/FasterXML/jackson-modules-java8) - Set of Jackson modules for Java 8 datatypes and features.
- [Jackson](https://github.com/FasterXML/jackson) - Similar to GSON, but offers performance gains if you need to instantiate the library more often.
- [JSON-io](https://github.com/jdereg/json-io) - Convert Java to JSON/TOON and back. Supports complex object graphs, cyclic references, and TOON format for 40-50% LLM token savings.
- [Moshi](https://github.com/square/moshi) - Modern JSON library, less opinionated and uses built-in types like List and Map.
- [Yasson](https://github.com/eclipse-ee4j/yasson) - Binding layer between classes and JSON documents similar to JAXB.
- [Jolt](https://github.com/bazaarvoice/jolt) - JSON to JSON transformation tool.
- [JsonPath](https://github.com/json-path/JsonPath) - Extract data from JSON using XPATH-like syntax.
- [JsonSurfer](https://github.com/jsurfer/JsonSurfer) - Streaming JsonPath processor dedicated to processing big and complicated JSON data.

### JVM and JDK

_Current implementations of the JVM/JDK._

- [Eclipse Temurin](https://github.com/adoptium/temurin-build) - OpenJDK distribution from the Eclipse Adoptium project.
- [Corretto](https://aws.amazon.com/corretto/) - No-cost, multiplatform, production-ready distribution of OpenJDK by Amazon. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Dragonwell8](https://github.com/alibaba/dragonwell8) - Downstream version of OpenJDK optimized for online e-commerce, financial, logistics applications.
- [Graal](https://github.com/oracle/graal) - Polyglot embeddable JVM. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Liberica JDK](https://bell-sw.com) - Built from OpenJDK, thoroughly tested and passed the JCK. (GPL-2.0-only WITH Classpath-exception-2.0)
- [OpenJ9](https://github.com/eclipse-openj9/openj9) - High performance, enterprise-calibre, flexibly licensed, openly-governed cross-platform JVM extending and augmenting the runtime technology components from the Eclipse OMR and OpenJDK project.
- [Open JDK](https://github.com/openjdk/jdk) - Open JDK community home.
- [RedHat Open JDK](https://developers.redhat.com/products/openjdk/overview) - RedHat's OpenJDK distribution. (GPL-2.0-only WITH Classpath-exception-2.0)
- [SAP Machine](https://github.com/SAP/SapMachine) - SAP's no-cost, rigorously tested and JCK-verified OpenJDK friendly fork.
- [Zulu](https://www.azul.com/products/zulu-community/) - OpenJDK builds for Windows, Linux, and macOS. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Microsoft JDK](https://github.com/microsoft/openjdk) - Microsoft Build of OpenJDK, Free, Open Source, Freshly Brewed!

### Logging

_Libraries that log the behavior of an application._

- [Apache Log4j 2](https://github.com/apache/logging-log4j2) - Complete rewrite with a powerful plugin and configuration architecture.
- [Echopraxia](https://github.com/tersesystems/echopraxia) - API designed around structured logging, rich context, and conditional logging. There are Logback and Log4J2 implementations, but Echopraxia's API is completely dependency-free, meaning it can be implemented with any logging API.
- [Graylog](https://github.com/Graylog2/graylog2-server) - Open-source aggregator suited for extended role and permission management. (GPL-3.0-only)
- [Kibana](https://github.com/elastic/kibana) - Analyzes and visualizes log files. Some features require payment.
- [Logback](https://github.com/qos-ch/logback) - Robust logging library with interesting configuration options via Groovy.
- [Logbook](https://github.com/zalando/logbook) - Extensible, open-source library for HTTP request and response logging.
- [Logstash](https://github.com/elastic/logstash) - Tool for managing log files.
- [SLF4J](https://github.com/qos-ch/slf4j) - Abstraction layer/simple logging facade.
- [tinylog](https://github.com/tinylog-org/tinylog) - Lightweight logging framework with static logger class.
- [Flogger](https://github.com/google/flogger) - Flogger is a fluent logging API for Java. It supports a wide variety of features, and has many benefits over existing logging APIs.

### Machine Learning

_Tools that provide specific statistical algorithms for learning from data._

- [Apache Mahout](https://github.com/apache/mahout) - Scalable algorithms focused on collaborative filtering, clustering and classification.
- [DatumBox](https://github.com/datumbox/datumbox-framework) - Provides several algorithms and pre-trained models for natural language processing.
- [Deeplearning4j](https://github.com/deeplearning4j/deeplearning4j) - Distributed and multi-threaded deep learning library.
- [DJL](https://github.com/deepjavalibrary/djl) - High-level and engine-agnostic framework for deep learning.
- [H2O](https://github.com/h2oai/h2o-3) - Analytics engine for statistics over big data.
- [Intelligent java](https://github.com/Barqawiz/IntelliJava) - Seamlessly integrate with remote deep learning and language models programmatically.
- [JSAT](https://github.com/EdwardRaff/JSAT) - Algorithms for pre-processing, classification, regression, and clustering with support for multi-threaded execution.
- [LIBSVM](https://github.com/cjlin1/libsvm) - Support vector machine library with Java bindings and command-line tools.
- [Neureka](https://github.com/Gleethos/neureka) - A lightweight, platform independent, OpenCL accelerated nd-array/tensor library.
- [oj! Algorithms](https://github.com/optimatika/ojAlgo) - High-performance mathematics, linear algebra and optimisation needed for data science, machine learning and scientific computing.
- [sklearn-java](https://github.com/kVeyra/sklearn-java) - Implements scikit-learn-style machine learning algorithms in pure Java.
- [Smile](https://github.com/haifengl/smile) - Statistical Machine Intelligence and Learning Engine provides a set of machine learning algorithms and a visualization library.
- [Tribuo](https://github.com/oracle/tribuo) - Provides tools for classification, regression, clustering, model development and interfaces with other libraries such as scikit-learn, pytorch and TensorFlow.
- [Weka](https://git.cms.waikato.ac.nz/weka/weka) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization.

### Messaging

_Tools that help send messages between clients to ensure protocol independency._

- [Aeron](https://github.com/aeron-io/aeron) - Efficient, reliable, unicast and multicast message transport.
- [Apache ActiveMQ](https://github.com/apache/activemq) - Message broker that implements JMS and converts synchronous to asynchronous communication.
- [Apache Camel](https://github.com/apache/camel) - Glues together different transport APIs via Enterprise Integration Patterns.
- [Apache Kafka](https://github.com/apache/kafka) - High-throughput distributed messaging system.
- [Apache Pulsar](https://github.com/apache/pulsar) - Distributed pub/sub-messaging system.
- [Apache RocketMQ](https://github.com/apache/rocketmq) - Fast, reliable, and scalable distributed messaging platform.
- [Apache Qpid for Java](https://qpid.apache.org) - Java messaging clients and brokers implementing AMQP. <!-- github: apache/qpid-jms, apache/qpid-broker-j, apache/qpid-proton-j, apache/qpid-protonj2 -->
- [AutoMQ](https://github.com/AutoMQ/automq) - AutoMQ is a cloud-native, serverless reinvented Kafka that is easily scalable, manage-less and cost-effective.
- [CloudEvents Java SDK](https://github.com/cloudevents/sdk-java) - Java SDK for creating, serializing and transporting CloudEvents.
- [Emissary](https://github.com/joel-jeremy/emissary) - Simple, lightweight, yet FAST messaging library for decoupling messages (requests and events) and message handlers.
- [Hermes](https://github.com/allegro/hermes) - Fast and reliable message broker built on top of Kafka.
- [HiveMQ MQTT Client](https://github.com/hivemq/hivemq-mqtt-client) - Reactive and blocking Java client for MQTT 3.1.1 and MQTT 5.
- [JeroMQ](https://github.com/zeromq/jeromq) - Implementation of ZeroMQ.
- [RabbitMQ Java client](https://github.com/rabbitmq/rabbitmq-java-client) - RabbitMQ client.
- [Pushy](https://github.com/jchambers/pushy) - Java library for sending Apple Push Notification service messages.
- [Simple Java Mail](https://github.com/bbottema/simple-java-mail) - Mailing with a clean and fluent API.
- [Smack](https://github.com/igniterealtime/Smack) - Cross-platform XMPP client library.
- [Svix](https://github.com/svix/svix-webhooks/tree/main/java) - Library for the Svix API to send webhooks and verify signatures.
- [NATS client](https://github.com/nats-io/nats.java) - NATS client.

### Microservice

_Tools for creating and managing microservices._

- [Armeria](https://github.com/line/armeria) - Asynchronous RPC/REST client/server library built on top of Java 8, Netty, HTTP/2, Thrift and gRPC.
- [Eureka](https://github.com/Netflix/eureka) - REST-based service registry for resilient load balancing and failover.
- [gRPC Spring](https://github.com/grpc-ecosystem/grpc-spring) - Spring Boot integration for building gRPC clients and servers.
- [Helidon](https://github.com/helidon-io/helidon) - Two-style approach for writing microservices: Functional-reactive and as an implementation of MicroProfile.
- [Micronaut](https://github.com/micronaut-projects/micronaut-core) - Modern full-stack framework with focus on modularity, minimal memory footprint and startup time.
- [Nacos](https://github.com/alibaba/nacos) - Dynamic service discovery, configuration and service management platform for building cloud native applications.
- [Quarkus](https://github.com/quarkusio/quarkus) - Kubernetes stack tailored for the HotSpot and Graal VM.
- [Sentinel](https://github.com/alibaba/Sentinel) - Flow control component enabling reliability, resilience and monitoring for microservices.

### Miscellaneous

_Everything else._

- [JBake](https://github.com/jbake-org/jbake) - Static website generator.
- [JObfuscator](https://www.pelock.com/products/jobfuscator) - Source code obfuscator.
- [yGuard](https://github.com/yWorks/yGuard) - Obfuscation via renaming and shrinking.

### Mobile Development

_Tools for creating or managing mobile applications._

- [Codename One](https://github.com/codenameone/CodenameOne) - Cross-platform Java framework for native mobile, desktop, web and watch apps. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Gluon Substrate](https://github.com/gluonhq/substrate) - Builds native JavaFX applications for desktop, mobile and embedded targets.
- [MobileUI](https://github.com/MobileUI/mobileui) - Cross-platform framework for developing mobile apps with native UI in Java and Kotlin.
- [Multi-OS Engine](https://github.com/multi-os-engine/multi-os-engine) - Open-source, cross-platform engine to develop native mobile (iOS, Android, etc.) apps.

### Monitoring

_Tools that observe/monitor applications in production by providing telemetry._

- [Apitally](https://github.com/apitally/apitally-java) - Simple, privacy-focused API monitoring, analytics and request logging for Spring Boot apps.
- [Arthas](https://github.com/alibaba/arthas) - Allows to troubleshoot production issues for applications without modifying code or restarting servers.
- [Automon](https://github.com/stevensouza/automon) - Combines the power of AOP with monitoring and/or logging tools.
- [BTrace](https://github.com/btraceio/btrace) - Dynamic tracing and diagnostics for running JVM applications without restarts.
- [Boot Usage Spring Boot Starter](https://github.com/dhruv-15-03/boot-usage) - Spring Boot Actuator extension providing application startup and runtime metrics including JVM uptime, memory usage, and CPU load.
- [Datadog](https://github.com/DataDog/dd-trace-java) - Modern monitoring & analytics.
- [Dropwizard Metrics](https://github.com/dropwizard/metrics) - Expose metrics via JMX or HTTP and send them to a database.
- [Glowroot](https://github.com/glowroot/glowroot) - Open-source Java APM.
- [HertzBeat](https://github.com/dromara/hertzbeat) - Real-time monitoring system with custom-monitor and agentless.
- [hippo4j](https://github.com/opengoofy/hippo4j/blob/develop/README-EN.md) - Dynamic and observable thread pool framework.
- [inspectIT Ocelot](https://github.com/inspectIT/inspectit-ocelot) - Java agent that collects application performance, tracing and behavioral data.
- [JavaMelody](https://github.com/javamelody/javamelody) - Performance monitoring and profiling.
- [Jolokia](https://github.com/jolokia/jolokia) - JMX over REST.
- [Micrometer](https://github.com/micrometer-metrics/micrometer) - Vendor-neutral metrics/observability facade for the most popular metrics/observability libraries.
- [Micrometer Tracing](https://github.com/micrometer-metrics/tracing) - Vendor-neutral distributed tracing facade for the most popular tracer libraries.
- [OpenTelemetry](https://github.com/open-telemetry/opentelemetry-java) - Instrument, generate, collect, and export telemetry data to help you analyze your software’s performance and behavior.
- [Pinpoint](https://github.com/naver/pinpoint) - Open-source APM tool.
- [Prometheus](https://github.com/prometheus/client_java) - Provides a multi-dimensional data model, DSL, autonomous server nodes and much more.
- [Sentry](https://github.com/getsentry/sentry-java) - Integration with [Sentry](https://github.com/getsentry/sentry), an application error tracking and performance analysis platform.
- [SPM](https://github.com/sematext/sematext-agent-java) - Performance monitor with distributing transaction tracing for JVM apps.
- [zipkin](https://github.com/openzipkin/zipkin) - Distributed tracing system which gathers timing data needed to troubleshoot latency problems in microservice architectures.

### Native

_For working with platform-specific native libraries._

- [Aparapi](https://git.cleverlibre.org/aparapi/aparapi) - Converts bytecode to OpenCL which allows execution on GPUs.
- [JavaCPP](https://github.com/bytedeco/javacpp) - Provides efficient and easy access to native C++.
- [JCuda](https://github.com/jcuda/jcuda) - JCuda offers Java bindings for CUDA and CUDA-related libraries.
- [JNA](https://github.com/java-native-access/jna) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries.
- [JNR](https://github.com/jnr/jnr-ffi) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries. Same goals as JNA, but faster, and serves as the basis for the upcoming [Project Panama](https://openjdk.java.net/projects/panama).
- [native-lib-loader](https://github.com/scijava/native-lib-loader) - Native library loader for extracting and loading native libraries from Java.

### Natural Language Processing

_Libraries that specialize in processing text._

- [Apache OpenNLP](https://github.com/apache/opennlp) - Toolkit for machine-learning-based natural language processing.
- [CoreNLP](https://github.com/stanfordnlp/CoreNLP) - Provides a set of fundamental tools for tasks like tagging, named entity recognition, and sentiment analysis.
- [DKPro](https://github.com/dkpro/dkpro-core) - Collection of reusable NLP tools for linguistic pre-processing, machine learning, lexical resources, etc.
- [Hypherator](https://github.com/ejossev/hypherator-java) - Java hyphenation library with iterator-like interface. Can be used out-of-the box - dictionaries for multiple languages are bundled in.
- [LingPipe](https://alias-i.com/lingpipe/) - Toolkit for tasks ranging from POS tagging to sentiment analysis.

### Networking

_Libraries for building network clients and servers._

- [AISmessages](https://github.com/tbsalling/aismessages) - Decodes NMEA-armoured AIS messages for maritime navigation and safety systems with ITU-R M.1371 support and no runtime dependencies. (CC-BY-NC-SA-4.0)
- [Commons-networking](https://github.com/CiscoSE/commons-networking) - Client for server-sent events (SSE).
- [Apache MINA sshd](https://github.com/apache/mina-sshd) - Java implementation of SSH clients, servers, SFTP and SCP.
- [Atmosphere](https://github.com/Atmosphere/atmosphere) - Real-time transport framework supporting WebSocket, SSE, gRPC and WebTransport.
- [dnsjava](https://github.com/dnsjava/dnsjava) - Java implementation of the DNS protocol.
- [Dubbo](https://github.com/apache/dubbo) - High-performance RPC framework.
- [Grizzly](https://github.com/eclipse-ee4j/grizzly) - NIO framework. Used as a network layer in Glassfish.
- [gRPC-java](https://github.com/grpc/grpc-java) - RPC framework based on protobuf and HTTP/2.
- [java-ngrok](https://github.com/alexdlaird/java-ngrok) - Java wrapper for ngrok; programmatic tunnels for ingress, webhooks, demos, and APIs.
- [Java-WebSocket](https://github.com/TooTallNate/Java-WebSocket) - Lightweight WebSocket client and server implementation.
- [MinimalFTP](https://github.com/Guichaguri/MinimalFTP) - Lightweight, small and customizable FTP server.
- [MINA](https://github.com/apache/mina) - Abstract, event-driven async I/O API for network operations over TCP/IP and UDP/IP via Java NIO.
- [Netty](https://github.com/netty/netty) - Framework for building high-performance network applications.
- [Drift](https://github.com/airlift/drift) - Easy-to-use, annotation-based library for creating Thrift clients and serializable types.
- [ServiceTalk](https://github.com/apple/servicetalk) - Framework built on Netty with APIs tailored to specific protocols and support for multiple programming paradigms.
- [sshj](https://github.com/hierynomus/sshj) - Programmatically use SSH, SCP or SFTP.
- [Socket.IO Client Java](https://github.com/socketio/socket.io-client-java) - Java client for Socket.IO servers.
- [TLS Channel](https://github.com/marianobarrios/tls-channel) - Implements a ByteChannel interface over SSLEngine, enabling easy-to-use (socket-like) TLS.
- [Undertow](https://github.com/undertow-io/undertow) - Web server providing both blocking and non-blocking APIs based on NIO. Used as a network layer in WildFly.
- [urnlib](https://github.com/slub/urnlib) - Represent, parse and encode URNs, as in RFC 2141.
- [Fluency](https://github.com/komamitsu/fluency) - High throughput data ingestion logger to Fluentd and Fluent Bit.

### ORM

_APIs that handle the persistence of objects._

- [Apache Cayenne](https://github.com/apache/cayenne) - Provides a clean, static API for data access. Also includes a GUI Modeler for working with database mappings, and DB reverse engineering and generation.
- [Doma](https://github.com/domaframework/doma) - Database access framework that verifies and generates source code at compile time using annotation processing as well as native SQL templates called two-way SQL.
- [Ebean](https://github.com/ebean-orm/ebean) - Provides simple and fast data access.
- [EclipseLink](https://github.com/eclipse-ee4j/eclipselink) - Supports a number of persistence standards: JPA, JAXB, JCA and SDO.
- [Ekbatan](https://github.com/ekbatan-io/ekbatan) - Modern Java persistence framework for event-driven systems, with an ergonomic outbox that commits state and events in one transaction.
- [Hibernate](https://github.com/hibernate/hibernate-orm) - Robust and widely used, with an active community.
- [MyBatis](https://github.com/mybatis/mybatis-3) - Couples objects with stored procedures or SQL statements.
- [mybatis-dynamic](https://github.com/myacelw/mybatis-dynamic) - Code-first dynamic ORM for MyBatis with runtime schema modification.
- [MyBatis-Plus](https://github.com/baomidou/mybatis-plus) - A powerful enhanced toolkit of MyBatis for simplifying development.
- [ObjectiveSql](https://github.com/braisdom/ObjectiveSql) - ActiveRecord ORM for rapid development and convention over configuration.
- [Permazen](https://github.com/permazen/permazen) - Language-natural persistence layer.
- [SimpleFlatMapper](https://github.com/arnaudroger/SimpleFlatMapper) - Simple database and CSV mapper.

### PaaS

_Java platform as a service._

- [AWS Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk/) - AWS-based, with support for Tomcat and Jetty.
- [AWS Lambda](https://aws.amazon.com/lambda/) - Serverless computation.
- [Google Cloud](https://cloud.google.com) - Google's cloud infrastructure.
- [Heroku](https://www.heroku.com) - Abstract computing environments.
- [Microsoft Azure](https://azure.microsoft.com/en-us/) - Microsoft's cloud infrastructure.
- [OpenShift](https://www.openshift.com) - Provides additionally an on-premise solution.

### PDF

_Tools to help with PDF files._

- [Apache FOP](https://github.com/apache/xmlgraphics-fop) - Creates PDFs from XSL-FO.
- [Apache PDFBox](https://github.com/apache/pdfbox) - Toolbox for creating and manipulating PDFs.
- [Nostrum Dynamic Jasper](https://github.com/nostrum-tech/NostrumDynamicJasper) - Provides dynamic report layouts on top of JasperReports.
- [DynamicReports](https://github.com/dynamicreports/dynamicreports) - Simplifies JasperReports.
- [Eclipse BIRT](https://github.com/eclipse-birt/birt) - Report engine for creating PDF and other formats (DOCX, XLSX, HTML, etc) using Eclipse-based visual editor.
- [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) - XML/XHTML and CSS 2.1 renderer. (LGPL-2.1-or-later)
- [GraphCompose](https://github.com/DemchaAV/GraphCompose) - Declarative engine for structured business PDFs with semantic layout, atomic pagination, theme tokens, and native vector charts.
- [iText](https://github.com/itext/itext-java) - Creates PDF files programmatically.
- [JasperReports](https://github.com/Jaspersoft/jasperreports) - Complex reporting engine.
- [jquick-pdf](https://github.com/paohaijiao/jquick-pdf) - Generates PDFs from HTML-like templates and ECharts-style charts using iText 7, without a browser dependency.
- [Open HTML to PDF](https://github.com/openhtmltopdf/openhtmltopdf) - Properly supports modern PDF standards based on flyingsaucer and Apache PDFBox.
- [OpenDataLoader PDF](https://github.com/opendataloader-project/opendataloader-pdf) - Parses PDFs into structured Markdown, JSON and HTML through a Java API and command line.
- [OpenPDF](https://github.com/LibrePDF/OpenPDF) - Open-source iText fork. (LGPL-3.0-only & MPL-2.0)
### Performance analysis

_Tools for performance analysis, profiling and benchmarking._

- [async-profiler](https://github.com/async-profiler/async-profiler) - Low-overhead sampling profiler for CPU, allocation and lock analysis on the JVM.
- [fastThread](https://fastthread.io) - Analyze and visualize thread dumps with a free cloud-based upload interface.
- [GCeasy](https://gceasy.io) - Tool to analyze and visualize GC logs. It provides a free cloud-based upload interface.
- [Heap Seance](https://github.com/SegfaultSorcerer/heap-seance) - Memory leak diagnostics that orchestrates jcmd, jmap, jstat, JFR, Eclipse MAT, and async-profiler into a structured investigation workflow with confidence-based verdicts.
- [jHiccup](https://github.com/giltene/jHiccup) - Logs and records platform JVM stalls.
- [JDK Mission Control](https://github.com/openjdk/jmc) - Profiling and diagnostics suite for JVM applications using Java Flight Recorder.
- [JITWatch](https://github.com/AdoptOpenJDK/jitwatch) - Analyze the JIT compiler optimisations made by the HotSpot JVM.
- [JMH](https://github.com/openjdk/jmh) - Harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM.
- [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) - Utilities for latency measurement and reporting.
- [JVM Hotpath](https://github.com/sfkamath/jvm-hotpath) - Java agent for line-level execution frequency analysis to identify algorithmic bottlenecks.
- [Argus](https://github.com/rlaope/Argus) - JVM diagnostics CLI for jcmd, JFR, async-profiler, heap analysis and machine-readable health verdicts.

### Platform

_Frameworks that are suites of multiple libraries encompassing several categories._

#### Apache Commons

- [BCEL](https://github.com/apache/commons-bcel) - Byte Code Engineering Library - analyze, create, and manipulate Java class files.
- [BeanUtils](https://github.com/apache/commons-beanutils) - Easy-to-use wrappers around the Java reflection and introspection APIs.
- [BSF](https://github.com/apache/commons-bsf) - Bean Scripting Framework - interface to scripting languages, including JSR-223.
- [ClassScan](https://commons.apache.org/sandbox/commons-classscan/) - Find Class interfaces, methods, fields, and annotations without loading.
- [CLI](https://github.com/apache/commons-cli) - Command-line arguments parser.
- [CLI2](https://commons.apache.org/sandbox/commons-cli2/) - Redesign of Commons CLI.
- [Codec](https://github.com/apache/commons-codec) - General encoding/decoding algorithms, e.g. phonetic, base64 or URL.
- [Collections](https://github.com/apache/commons-collections) - Extends or augments the Java Collections Framework.
- [Compress](https://github.com/apache/commons-compress) - Defines an API for working with tar, zip and bzip2 files.
- [Configuration](https://github.com/apache/commons-configuration) - Reading of configuration/preferences files in various formats.
- [Convert](https://commons.apache.org/sandbox/commons-convert/) - Commons-Convert aims to provide a single library dedicated to the task of converting an object of one type to another.
- [CSV](https://github.com/apache/commons-csv) - Component for reading and writing comma separated value files.
- [Daemon](https://github.com/apache/commons-daemon) - Alternative invocation mechanism for unix-daemon-like java code.
- [DBCP](https://github.com/apache/commons-dbcp) - Database connection pooling services.
- [DbUtils](https://github.com/apache/commons-dbutils) - JDBC helper library.
- [Digester](https://github.com/apache/commons-digester) - XML-to-Java-object mapping utility.
- [Email](https://github.com/apache/commons-email) - Library for sending e-mail from Java.
- [Exec](https://github.com/apache/commons-exec) - API for dealing with external process execution and environment management in Java.
- [FileUpload](https://github.com/apache/commons-fileupload) - File upload capability for your servlets and web applications.
- [Finder](https://commons.apache.org/sandbox/commons-finder/) - Java library inspired by the UNIX find command.
- [Flatfile](https://commons.apache.org/sandbox/commons-flatfile/) - Java library for working with flat data structures.
- [Graph](https://github.com/apache/commons-graph) - General purpose graph APIs and algorithms.
- [I18n](https://commons.apache.org/sandbox/commons-i18n/) - Adds the feature of localized message bundles that consist of one or many localized texts that belong together.
- [Id](https://commons.apache.org/sandbox/commons-id/) - Id is a component used to generate identifiers.
- [Imaging](https://github.com/apache/commons-imaging) - Image library.
- [IO](https://github.com/apache/commons-io) - Collection of I/O utilities.
- [Javaflow](https://commons.apache.org/sandbox/commons-javaflow/) - Continuation implementation to capture the state of the application.
- [JCI](https://github.com/apache/commons-jci) - Java Compiler Interface.
- [JCS](https://github.com/apache/commons-jcs) - Java Caching System.
- [Jelly](https://github.com/apache/commons-jelly) - XML based scripting and processing engine.
- [Jexl](https://github.com/apache/commons-jexl) - Expression language which extends the Expression Language of the JSTL.
- [JNet](https://commons.apache.org/sandbox/commons-jnet/) - JNet allows to use dynamically register url stream handlers through the java.net API.
- [JXPath](https://github.com/apache/commons-jxpath) - Utilities for manipulating Java Beans using the XPath syntax.
- [Lang](https://github.com/apache/commons-lang) - Provides extra functionality for classes in java.lang.
- [Logging](https://github.com/apache/commons-logging) - Wrapper around a variety of logging API implementations.
- [Math](https://github.com/apache/commons-math) - Lightweight, self-contained mathematics and statistics components.
- [Monitoring](https://commons.apache.org/sandbox/commons-monitoring/) - Monitoring aims to provide a simple but extensible monitoring solution for Java applications.
- [Nabla](https://commons.apache.org/sandbox/commons-nabla/) - Nabla provides automatic differentiation classes that can generate derivative of any function implemented in the Java language.
- [Net](https://github.com/apache/commons-net) - Collection of network utilities and protocol implementations.
- [OpenPGP](https://commons.apache.org/sandbox/commons-openpgp/) - Interface to signing and verifying data using OpenPGP.
- [Performance](https://commons.apache.org/sandbox/commons-performance/) - Small framework for microbenchmark clients, with implementations for Commons DBCP and Pool.
- [Pipeline](https://commons.apache.org/sandbox/commons-pipeline/) - Provides a set of pipeline utilities designed around work queues that run in parallel to sequentially process data objects.
- [Pool](https://github.com/apache/commons-pool) - Generic object pooling component.
- [RDF](https://github.com/apache/commons-rdf) - Common implementation of RDF 1.1 that could be implemented by systems on the JVM.
- [RNG](https://github.com/apache/commons-rng) - Commons Rng provides implementations of pseudo-random numbers generators.
- [SCXML](https://github.com/apache/commons-scxml) - Implementation of the State Chart XML specification aimed at creating and maintaining a Java SCXML engine.
- [Validator](https://github.com/apache/commons-validator) - Framework to define validators and validation rules in an xml file.
- [VFS](https://github.com/apache/commons-vfs) - Virtual File System component for treating files, FTP, SMB, ZIP and such like as a single logical file system.
- [Weaver](https://github.com/apache/commons-weaver) - Provides an easy way to enhance (weave) compiled bytecode.

#### Other

- [CUBA Platform](https://github.com/jmix-framework/jmix) - High-level framework for developing enterprise applications with a rich web interface, based on Spring, EclipseLink and Vaadin.
- [Light-4J](https://github.com/networknt/light-4j/) - Fast, lightweight and productive microservices framework with built-in security.
- [Spring Framework](https://github.com/spring-projects/spring-framework) - Comprehensive application framework for building Java applications.

### Processes

_Libraries that help the management of operating system processes._

- [ch.vorburger.exec](https://github.com/vorburger/ch.vorburger.exec) - Convenient API around Apache Commons Exec.
- [zt-exec](https://github.com/zeroturnaround/zt-exec) - Provides a unified API to Apache Commons Exec and ProcessBuilder.
- [zt-process-killer](https://github.com/zeroturnaround/zt-process-killer) - Stops processes started from Java or the system processes via PID.

### Proxy Servers

_Java proxy and gateway servers for routing and mediating traffic._

- [LittleProxy](https://github.com/LittleProxy/LittleProxy) - High performance HTTP proxy atop Netty's event-based networking library.
- [Membrane Service Proxy](https://github.com/membrane/api-gateway) - Open-source, reverse-proxy framework.
- [OpenIG](https://github.com/OpenIdentityPlatform/OpenIG) - High-performance reverse proxy server with specialized session management and credential replay functionality.
- [Spring Cloud Gateway](https://github.com/spring-cloud/spring-cloud-gateway) - API gateway built on Spring Framework and Spring Boot.
- [Zuul](https://github.com/Netflix/zuul) - Gateway service that provides dynamic routing, monitoring, resiliency, security, and more.

### Reactive libraries

_Libraries for developing reactive applications._

- [Akka](https://github.com/akka/akka) - Toolkit and runtime for building concurrent, distributed, fault-tolerant and event-driven applications.
- [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) - Provides a standard for asynchronous stream processing with non-blocking backpressure.
- [Reactor](https://github.com/reactor/reactor) - A framework for building non-blocking applications on the JVM, providing support for reactive programming.
- [RxJava](https://github.com/ReactiveX/RxJava) - Allows for composing asynchronous and event-based programs using observable sequences.
- [vert.x](https://github.com/eclipse-vertx/vert.x) - Polyglot event-driven application framework.

### Regular Expressions

_Libraries and engines for building and evaluating regular expressions._

- [dregex](https://github.com/marianobarrios/dregex) - Regular expression engine that uses deterministic finite automata. It supports some Perl-style features and yet retains linear matching time, and also offers set operations.
- [JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) - Library that helps with constructing difficult regular expressions.
- [RE2/J](https://github.com/google/re2j) - Java port of RE2 providing linear-time regular expression matching.
- [Sift](https://github.com/Mirkoddd/Sift) - Type-safe, AST-based Regex Builder focused on readability and ReDoS prevention.

### REST Frameworks

_Frameworks specifically for creating RESTful services._

- [Dropwizard](https://github.com/dropwizard/dropwizard) - Opinionated framework for setting up modern web applications with Jetty, Jackson, Jersey and Metrics.
- [Elide](https://github.com/yahoo/elide) - Opinionated framework for JSON- or GraphQL-APIs based on a JPA data model.
- [hate](https://github.com/blackdoor/hate) - Builds hypermedia-friendly objects according to HAL specification.
- [Jersey](https://github.com/eclipse-ee4j/jersey) - JAX-RS reference implementation.
- [OfficeFloor](https://github.com/officefloor/OfficeFloor) - Spring Boot add-on that adds explicit function orchestration to REST endpoints, with each endpoint's steps, branches and error flows in one YAML file whose directory path maps to the URL.
- [RESTEasy](https://github.com/resteasy/resteasy) - Fully certified and portable implementation of the JAX-RS specification.
- [RestExpress](https://github.com/RestExpress/RestExpress) - Thin wrapper on the JBoss Netty HTTP stack that provides scaling and performance.
- [Restlet Framework](https://github.com/restlet/restlet-framework-java) - Pioneering framework with powerful routing and filtering capabilities, and a unified client and server API.
- [Spark](https://github.com/sparkjavateam/spark) - Sinatra inspired framework.
- [springdoc-openapi](https://github.com/springdoc/springdoc-openapi) - Automates the generation of API documentation using Spring Boot projects.
- [Spring HATEOAS](https://github.com/spring-projects/spring-hateoas) - Standalone and Spring support for building hypermedia-based APIs using HAL, HAL FORMS, Collection+JSON, ALPS and UBER.
- [Swagger Java](https://swagger.io) - Java libraries for generating, parsing and serving OpenAPI definitions. <!-- github: swagger-api/swagger-core, swagger-api/swagger-parser, swagger-api/swagger-inflector -->
- [openapi-generator](https://github.com/OpenAPITools/openapi-generator) - Allows generation of API client libraries, SDKs, server stubs, documentation and configuration automatically given an OpenAPI Spec.

### Science

_Libraries for scientific computing, analysis and visualization._

- [BioJava](https://github.com/biojava/biojava) - Facilitates processing biological data by providing algorithms, file format parsers, sequencing and 3D visualization commonly used in bioinformatics.
- [Chart-FX](https://github.com/fair-acc/chart-fx) - Scientific charting library with focus on performance optimised real-time data visualisation at 25 Hz update rates for large data sets.
- [DataMelt](https://datamelt.org/) - Environment for scientific computation, data analysis and data visualization. (GPL-3.0-or-later)
- [Erdos](https://github.com/Erdos-Graph-Framework/Erdos) - Modular, light and easy graph framework for theoretic algorithms.
- [Gephi](https://github.com/gephi/gephi) - Cross-platform for visualizing and manipulating large graph networks.
- [JFreeChart](https://github.com/jfree/jfreechart) - 2D chart library for Swing, JavaFX and server-side applications.
- [JGraphT](https://github.com/jgrapht/jgrapht) - Graph library that provides mathematical graph-theory objects and algorithms.
- [jSciPy](https://github.com/hissain/jscipy) - jSciPy is a Java library designed for scientific computing, offering functionalities inspired by popular scientific computing libraries. It currently provides modules for signal processing, including Butterworth filters, peak finding algorithms, and an RK4 solver for ordinary differential equations.
- [LogicNG](https://github.com/logic-ng/LogicNG) - Library for creating, manipulating and solving Boolean and Pseudo-Boolean formulas.
- [Mines Java Toolkit](https://github.com/MinesJTK/jtk) - Library for geophysical scientific computation, visualization and digital signal analysis.
- [Orekit](https://github.com/CS-SI/Orekit) - A low level space flight dynamics library providing basic elements (orbits, dates, attitude, frames...) and various algorithms (conversions, propagations, pointing...) to handle them.
- [Orson-Charts](https://github.com/jfree/orson-charts) - Generates a wide variety of 3D charts that can be displayed with Swing and JavaFX or exported to PDF, SVG, PNG and JPEG.
- [XChart](https://github.com/knowm/XChart) - Light-weight library for plotting data. Many customizable chart types are available.

### Scripting

_Tools and runtimes for using Java or Java-like languages as scripts._

- [JBang](https://github.com/jbangdev/jbang) - JBang makes it easy to use Java for scripting. It lets you use a single file for code and dependency management and allows you to run it directly.
- [JPad](https://jpad.io) - Snippet runner.
- [JQuick Java](https://github.com/paohaijiao/jquick-java) - Java-like scripting language for dynamic rule engines with XML orchestration and Java interoperability.

### Search

_Engines that index documents for search and analysis._

- [Apache Lucene](https://github.com/apache/lucene) - High-performance, full-featured, cross-platform, text search engine library.
- [Apache Solr](https://github.com/apache/solr) - Enterprise search engine optimized for high-volume traffic.
- [Elasticsearch](https://github.com/elastic/elasticsearch) - Distributed, multitenant-capable, full-text search engine with a RESTful web interface and schema-free JSON documents.
- [Elasticsearch Java Client](https://github.com/elastic/elasticsearch-java) - Official typed Java client for Elasticsearch.
- [OpenSearch](https://github.com/opensearch-project/OpenSearch) - Distributed search and analytics engine derived from Elasticsearch.
- [Viglet Turing ES](https://github.com/openviglet/turing-ce) - Self-hosted enterprise search platform with faceted, semantic and hybrid search, RAG, AI agents and pluggable Solr, Elasticsearch or Lucene backends.

### Security

_Libraries that handle security, authentication, authorization or session management._

- [Apache Shiro](https://github.com/apache/shiro) - Performs authentication, authorization, cryptography and session management.
- [Ayza](https://github.com/Hakky54/ayza) - High-level SSL configuration builder for configuring HTTP clients and servers with SSL/TLS.
- [Bouncy Castle](https://github.com/bcgit/bc-java) - All-purpose cryptographic library and JCA provider offering a wide range of functions, from basic helpers to PGP/SMIME operations.
- [Certificate Ripper](https://github.com/Hakky54/certificate-ripper) - CLI tool and library for extracting and exporting server certificates from HTTPS endpoints.
- [Dependency-Track](https://github.com/DependencyTrack/dependency-track) - Software composition analysis platform for identifying supply-chain risk.
- [OWASP Dependency-Check](https://github.com/dependency-check/DependencyCheck) - Detects publicly disclosed vulnerabilities contained within a project's dependencies.
- [Cryptomator](https://github.com/cryptomator/cryptomator) - Multiplatform, transparent, client-side encryption of files in the cloud.
- [jjwt](https://github.com/jwtk/jjwt) - JSON web token for Java and Android.
- [jwt-java](https://github.com/BastiaanJansen/jwt-java) - Easily create and parse JSON Web Tokens and create customized JWT validators using a fluent API.
- [Jwks RSA](https://github.com/auth0/jwks-rsa-java) - JSON Web Key Set parser.
- [Jasypt Spring Boot](https://github.com/ulisesbocchio/jasypt-spring-boot) - Integrates encrypted properties with Spring Boot applications.
- [Keycloak](https://github.com/keycloak/keycloak) - Integrated SSO and IDM for browser apps and RESTful web services.
- [Nbvcxz](https://github.com/GoSimpleLLC/nbvcxz) - Advanced password strength estimation.
- [OpenAM](https://github.com/OpenIdentityPlatform/OpenAM) - Access management solution that includes authentication, SSO, authorization, federation, entitlements and web services security.
- [OTP-Java](https://github.com/BastiaanJansen/OTP-Java) - One-time password generator library according to RFC 4226 (HOTP) and RFC 6238 (TOTP).
- [pac4j](https://github.com/pac4j/pac4j) - Security engine.
- [Passay](https://github.com/vt-middleware/passay) - Enforce password policy by validating candidate passwords against a configurable rule set.
- [Password4j](https://github.com/Password4j/password4j) - User-friendly cryptographic library that supports Argon2, Bcrypt, Scrypt, PBKDF2 and various other cryptographic hash functions.
- [SecurityBuilder](https://github.com/tersesystems/securitybuilder) - Fluent Builder API for JCA and JSSE classes and especially X.509 certificates.
- [ScribeJava](https://github.com/scribejava/scribejava) - OAuth client library supporting OAuth 1.0a, OAuth 2.0 and numerous providers.
- [Spring Authorization Server](https://github.com/spring-projects/spring-authorization-server) - Implements OAuth 2.1 and OpenID Connect authorization server specifications for Spring.
- [Themis](https://github.com/cossacklabs/themis) - Multi-platform high-level cryptographic library provides easy-to-use encryption for protecting sensitive data: secure messaging with forward secrecy, secure data storage (AES256GCM); suits for building end-to-end encrypted applications.
- [Tink](https://github.com/tink-crypto/tink-java) - Provides a simple and misuse-proof API for common cryptographic tasks.
- [Topaz](https://github.com/aserto-dev/topaz) - Fine-grained authorization for applications with support for RBAC, ABAC, and ReBAC.
- [WebAuthn4J](https://github.com/webauthn4j/webauthn4j) - Server-side WebAuthn and passkey verification library.
- [MOSS](https://github.com/mosscomputing/moss-java) - Cryptographic signing for AI agents using ML-DSA-44 post-quantum signatures, creating audit trails for attribution and compliance.

### Serialization

_Libraries that handle serialization with high efficiency._

- [Apache Avro](https://github.com/apache/avro) - Data interchange format with dynamic typing, untagged data, and absence of manually assigned IDs.
- [Apache Fory](https://github.com/apache/fory) - High-performance object graph serialization framework with JIT and zero-copy support.
- [Apache Orc](https://github.com/apache/orc) - Fast and efficient columnar storage format for Hadoop-based workloads.
- [Apache Parquet](https://github.com/apache/parquet-java) - Columnar storage format based on assembly algorithms from Google's paper on Dremel.
- [Apache Thrift](https://github.com/apache/thrift) - Data interchange format that originated at Facebook.
- [FlatBuffers](https://github.com/google/flatbuffers) - Memory-efficient serialization library that can access serialized data without unpacking and parsing it.
- [Kryo](https://github.com/EsotericSoftware/kryo) - Fast and efficient object graph serialization framework.
- [MessagePack](https://github.com/msgpack/msgpack-java) - Efficient binary serialization format.
- [Protobuf](https://github.com/protocolbuffers/protobuf) - Google's data interchange format.
- [SBE](https://github.com/aeron-io/simple-binary-encoding) - Simple Binary Encoding, one of the fastest message formats around.
- [Wire](https://github.com/square/wire) - Clean, lightweight protocol buffers.
- [XMLBeam](https://github.com/SvenEwald/xmlbeam) - Processes XML by using annotations or XPath within code.

### Server

_Servers specifically used to deploy applications._

- [Apache Tomcat](https://github.com/apache/tomcat) - Robust, all-round server for Servlet and JSP.
- [Apache TomEE](https://github.com/apache/tomee) - Tomcat plus Java EE.
- [Jetty](https://github.com/jetty/jetty.project) - Provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations.
- [WildFly](https://github.com/wildfly/wildfly) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support.

### Spreadsheet

_Libraries for reading, writing and generating spreadsheet files._

- [Apache Fesod](https://github.com/apache/fesod) - Memory-efficient library for reading and writing large spreadsheet files.
- [Apache POI](https://github.com/apache/poi) - Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT).
- [fastexcel](https://github.com/dhatim/fastexcel) - High performance library to read and write large Excel (XLSX) worksheets.
- [jackson-dataformat-spreadsheet](https://github.com/scndry/jackson-dataformat-spreadsheet) - Jackson dataformat module for reading and writing Excel (XLSX/XLS) as POJOs via `ObjectMapper`.
- [Jxls](https://github.com/jxlsteam/jxls) - Generates Excel reports from spreadsheet templates.
- [Sheetz](https://github.com/chitralabs/sheetz) - Reads and writes Excel, CSV and ODS files with annotation mapping, streaming, styling and validation.
- [zerocell](https://github.com/creditdatamw/zerocell) - Annotation-based API for reading data from Excel sheets into POJOs with focus on reduced overhead.

### Template Engine

_Tools that substitute expressions in a template._

- [Freemarker](https://github.com/apache/freemarker) - Library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data.
- [Handlebars.java](https://github.com/jknack/handlebars.java) - Logicless and semantic Mustache templates.
- [Jamal](https://github.com/verhas/jamal) - Extendable template engine embedded into Maven/JavaDoc, supporting multiple extensions (Groovy, Ruby, JavaScript, JShell, PlantUml) with support for snippet handling.
- [jstachio](https://github.com/jstachio/jstachio) - Typesafe Mustache templating engine.
- [jte](https://github.com/casid/jte) - Compiles to classes, and uses an easy syntax, several features to make development easier and provides fast execution and a small footprint.
- [Pebble](https://github.com/PebbleTemplates/pebble) - Inspired by Twig and separates itself with its inheritance feature and its easy-to-read syntax. It ships with built-in autoescaping for security and it includes integrated support for internationalization.
- [Rocker](https://github.com/fizzed/rocker) - Optimized, memory efficient and speedy template engine producing statically typed, plain objects.
- [StringTemplate](https://github.com/antlr/stringtemplate4) - Template engine for generating source code, web pages, emails, or any other formatted text output.
- [Thymeleaf](https://github.com/thymeleaf/thymeleaf) - Aims to be a substitute for JSP and works for XML files.

### Testing

_Tools that test from model to the view._

#### BDD

_Testing for the software development process that emerged from TDD and was heavily influenced by DDD and OOAD._

- [Cucumber](https://github.com/cucumber/cucumber-jvm) - Provides a way to describe features in a plain language which customers can understand.
- [J8Spec](https://github.com/j8spec/j8spec) - Follows a Jasmine-like syntax.
- [JBehave](https://github.com/jbehave/jbehave-core) - Extensively configurable framework that describes stories.
- [JGiven](https://github.com/TNG/JGiven) - Provides a fluent API which allows for simpler composition.
- [Kensa](https://github.com/kensa-dev/kensa) - Code-first BDD framework for Java and Kotlin that generates interactive HTML reports and sequence diagrams from test code.
- [Serenity BDD](https://github.com/serenity-bdd/serenity-core) - Automated Acceptance testing and reporting library that works with Cucumber, JBehave and JUnit to make it easier to write high quality executable specifications.

#### Fixtures

_Everything related to the creation and handling of random data._

- [AutoParams](https://github.com/AutoParams/AutoParams) - Supports generating test data or combining scenarios for parameterized tests.
- [Datafaker](https://github.com/datafaker-net/datafaker) - Modern fake data generator forked from Java Faker.
- [jFairy](https://github.com/SkillPanel/jfairy) - Fake data generator.
- [Instancio](https://github.com/instancio/instancio) - Automates data setup in unit tests by generating fully-populated, reproducible objects. Includes JUnit 5 extension.
- [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) - JUnit test runner and plugins for running JUnit tests with pseudo-randomness.
- [JMock](https://github.com/xcancloud/JMock) - JMock is a high-performance data generation and simulation component library implemented in Java.

#### Frameworks

_Provide environments to run tests for a specific use case._

- [BitDive Java Agent](https://github.com/bitDive/java-producer) - Java agent that captures runtime traces, SQL queries and HTTP payloads for BitDive testing.
- [JUnit](https://github.com/junit-team/junit-framework) - Common testing framework.
- [jqwik](https://github.com/jqwik-team/jqwik) - Engine for property-based testing built on JUnit 5.
- [PIT](https://github.com/hcoles/pitest) - Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test suites.
- [Robolectric](https://github.com/robolectric/robolectric) - Runs Android tests on the JVM without an emulator or device.
- [selenium](https://github.com/SeleniumHQ/selenium) - Browser automation framework and ecosystem.
- [Selenium Boot](https://github.com/seleniumboot/selenium-boot) - Zero-boilerplate Selenium + TestNG framework with auto driver management, smart retry, self-healing locators, AI failure analysis, and a built-in HTML report.

#### Integration

_Tools for integration, service and contract testing._

- [Arquillian](https://github.com/arquillian/arquillian-core) - Integration and functional testing platform for Java EE containers.
- [cdi-test](https://github.com/guhilling/cdi-test) - JUnit extension for easy and efficient testing of CDI components.
- [Citrus](https://github.com/citrusframework/citrus) - Integration testing framework that focuses on both client- and server-side messaging.
- [GreenMail](https://github.com/greenmail-mail-test/greenmail) - In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL.
- [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) - Native bindings for Hoverfly, a proxy which allows you to simulate HTTP services.
- [Karate](https://github.com/karatelabs/karate) - DSL that combines API test-automation, mocks and performance-testing making testing REST/HTTP services easy.
- [kubetest4j](https://github.com/skodjob/kubetest4j) - Declarative, annotation-based testing library for Kubernetes and OpenShift with automatic resource lifecycle management, multi-cluster support, and integrated log collection.
- [Pact JVM](https://github.com/pact-foundation/pact-jvm) - Consumer-driven contract testing.
- [REST Assured](https://github.com/rest-assured/rest-assured) - DSL for easy testing of REST/HTTP services.
- [Testcontainers](https://github.com/testcontainers/testcontainers-java) - Provides throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container.
- [WebTau](https://github.com/testingisdocumenting/webtau) - Test across REST-API, Graph QL, Browser, Database, CLI and Business Logic with consistent set of matchers and concepts.
- [weld-testing](https://github.com/weld/weld-testing) - Set of test framework extensions (JUnit 4, JUnit 5, Spock) to enhance the testing of CDI components via Weld. Supports Weld 5.

#### Matchers

_Libraries that provide custom matchers._

- [AssertJ](https://github.com/assertj/assertj) - Fluent assertions that improve readability.
- [JsonUnit](https://github.com/lukas-krecan/JsonUnit) - Library that simplifies JSON comparison in tests.
- [Truth](https://github.com/google/truth) - Google's fluent assertion and proposition framework.
- [XMLUnit](https://github.com/xmlunit/xmlunit) - Simplifies testing for XML output.

#### Miscellaneous

_Other stuff related to testing._

- [Awaitility](https://github.com/awaitility/awaitility) - DSL for synchronizing asynchronous operations.
- [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) - Toolkit for testing multi-threaded and asynchronous applications.
- [ConsoleCaptor](https://github.com/Hakky54/console-captor) - Captures console output for unit testing purposes.
- [junit-dataprovider](https://github.com/TNG/junit-dataprovider) - TestNG-like data provider/runner for JUnit.
- [junit-pioneer](https://github.com/junit-pioneer/junit-pioneer) - JUnit 5 extension pack, pushing the frontiers on Jupiter.
- [LogCaptor](https://github.com/Hakky54/log-captor) - Captures log entries for unit testing purposes.
- [log-capture](https://github.com/dm-drogeriemarkt/log-capture) - Captures log entries and provides assertions for unit and integration testing.
- [Selfie](https://github.com/diffplug/selfie) - Snapshot testing (inline and on disk).
- [skipper-java](https://github.com/get-skipper/skipper-java) - Real-time test execution control via Google Spreadsheet, enabling instant toggle without code changes.
- [Stebz](https://github.com/stebz/stebz) - Multi-approach framework for test steps managing.
- [test-watch-maven-plugin](https://github.com/albilu/test-watch-maven-plugin) - Maven plugin providing Vitest-inspired watch mode for tests with smart selection and parallel execution.

#### Mocking

_Tools which mock collaborators to help testing single, isolated units._

- [JMockit](https://github.com/jmockit/jmockit1) - Integration testing, API mocking and faking, and code coverage.
- [Mockito](https://github.com/mockito/mockito) - Mocking framework that lets you write tests with a clean and simple API.
- [MockServer](https://github.com/mock-server/mockserver-monorepo) - Allows mocking of systems integrated with HTTPS.
- [Moco](https://github.com/dreamhead/moco) - Concise web services for stubs and mocks.
- [WireMock](https://github.com/wiremock/wiremock) - Stubs and mocks web services.
- [EasyMock](https://github.com/easymock/easymock) - EasyMock is a Java library that provides an easy way to use Mock Objects in unit testing.

#### Performance

_Tools for load and performance testing._

- [Apache JMeter](https://github.com/apache/jmeter) - Functional testing and performance measurements.
- [Gatling](https://github.com/gatling/gatling) - Load testing tool designed for ease of use, maintainability and high performance.
- [JMeter DSL.java](https://github.com/abstracta/jmeter-java-dsl) - Load tests with JMeter as simple as a JUnit test.

### Utility

_Libraries which provide general utility functions._

- [bucket4j](https://github.com/bucket4j/bucket4j) - Rate limiting library based on token-bucket algorithm.
- [cactoos](https://github.com/yegor256/cactoos) - Collection of object-oriented primitives.
- [fswatch](https://github.com/vorburger/ch.vorburger.fswatch) - Micro library to watch for directory file system changes, simplifying java.nio.file.WatchService.
- [Guava](https://github.com/google/guava) - Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and more.
- [ISBN core](https://github.com/ladutsko/isbn-core) - A small library that contains a representation object of ISBN-10 and ISBN-13 and tools to parse, validate and format one.
- [JEmoji](https://github.com/felldo/JEmoji) - An auto-generated emoji library that provides type-safe direct access to emojis and alias support for Discord, Slack, GitHub and many more features.
- [Java Diff Utils](https://github.com/java-diff-utils/java-diff-utils) - Utilities for text or data comparison and patching.
- [Java UUID Generator](https://github.com/cowtowncoder/java-uuid-generator) - Generates standard UUID versions including time-ordered UUIDv6 and UUIDv7.
- [java-util](https://github.com/jdereg/java-util) - Zero-dependency, high-performance utilities featuring Converter (universal type conversion), DeepEquals, CaseInsensitiveMap, TTLCache, CompactMap, MultiKeyMap, and object graph traversal.
- [Jimfs](https://github.com/google/jimfs) - In-memory file system.
- [JKScope](https://github.com/evpl/jkscope) - Java scope functions inspired by Kotlin.
- [java-refined](https://github.com/JunggiKim/java-refined) - Zero-dependency refinement types for Java 8+ with type-safe wrappers covering numerics, strings, and collections.
- [PipelinR](https://github.com/sizovs/pipelinr) - Small utility library for using handlers and commands with pipelines.
- [Semver4j](https://github.com/semver4j/semver4j) - Lightweight library that helps you handling semantic versioning with different modes.
- [spring-chain-of-responsibility](https://github.com/evmetatron/spring-chain-of-responsibility) - Autowires Spring Boot beans into a Chain of Responsibility via `@Order` and `@ChainNext`, no manual wiring.
- [Underscore-java](https://github.com/javadev/underscore-java) - Port of Underscore.js functions.
- [Zip4j](https://github.com/srikanth-lingala/zip4j) - Reads, writes, encrypts and streams ZIP files.

### Version Managers

_Utilities that help create the development shell environment and switch between different Java versions._

- [jabba](https://github.com/Jabba-Team/jabba) - Java Version Manager inspired by nvm. Supports macOS, Linux and Windows.
- [jenv](https://github.com/jenv/jenv) - Java Version Manager inspired by rbenv. Can configure globally or per project. Tested on Debian and macOS.
- [SDKMan](https://github.com/sdkman/sdkman-cli) - Java Version Manager inspired by RVM and rbenv. Supports UNIX-based platforms and Windows.

### Web Crawling

_Libraries that analyze the content of websites._

- [Apache Nutch](https://github.com/apache/nutch) - Highly extensible, highly scalable web crawler for production environments.
- [crawlberg](https://github.com/xberg-io/crawlberg) - Crawls and scrapes websites through a Java binding with Markdown conversion and optional browser rendering.
- [jsoup](https://github.com/jhy/jsoup) - Scrapes, parses, manipulates and cleans HTML.
- [StormCrawler](https://github.com/apache/stormcrawler) - SDK for building low-latency and scalable web crawlers.
- [webmagic](https://github.com/code4craft/webmagic) - Scalable crawler with downloading, url management, content extraction and persistent.

### Web Frameworks

_Frameworks that handle the communication between the layers of a web application._

- [ActiveJ](https://github.com/activej/activej) - Lightweight asynchronous framework built from the ground up for developing high-performance web applications.
- [Apache Tapestry](https://github.com/apache/tapestry-5) - Component-oriented framework for creating dynamic, robust, highly scalable web applications.
- [Apache Wicket](https://github.com/apache/wicket) - Component-based web application framework similar to Tapestry, with a stateful GUI.
- [Blade](https://github.com/lets-blade/blade) - Lightweight, modular framework that aims to be elegant and simple.
- [Bootique](https://github.com/bootique/bootique) - Minimally opinionated framework for runnable apps.
- [Javalin](https://github.com/javalin/javalin) - Microframework for web applications.
- [Jooby](https://github.com/jooby-project/jooby) - Scalable, fast and modular micro-framework that offers multiple programming models.
- [Ninja](https://github.com/ninjaframework/ninja) - Full-stack web framework.
- [Pippo](https://github.com/pippo-java/pippo) - Small, highly modularized, Sinatra-like framework.
- [Play](https://github.com/playframework/playframework) - Built on Akka, it provides predictable and minimal resource consumption (CPU, memory, threads) for highly-scalable applications in Java and Scala.
- [PrimeFaces](https://github.com/primefaces/primefaces) - JSF framework with both free and commercial/support versions and frontend components.
- [Ratpack](https://github.com/ratpack/ratpack) - Set of libraries that facilitate fast, efficient, evolvable and well-tested HTTP applications.
- [Spring Boot](https://github.com/spring-projects/spring-boot) - Framework for creating stand-alone, production-grade Spring applications.
- [Takes](https://github.com/yegor256/takes) - Opinionated web framework which is built around the concepts of True Object-Oriented Programming and immutability.
- [tinystruct](https://github.com/tinystruct/tinystruct) - Lightweight, pluggable framework for building Java applications with CLI, HTTP, and modular extension support.
- [Vaadin](https://vaadin.com) - Full-stack Java platform for building browser applications with server-side components. <!-- github: vaadin/platform, vaadin/flow, vaadin/flow-components, vaadin/spring -->
- [webforJ](https://github.com/webforj/webforj) - Full-stack platform that composes the UI in Java on the server using a library of web components.
- [WebForms Core](https://github.com/webforms-core) - A technology for managing HTML tags from the server.
- [Erupt](https://github.com/erupts/erupt) - Annotation-Driven Low-Code & JPA Visualization.

### Workflow Orchestration Engines

_Engines for orchestrating long-running workflows and business processes._

- [Cadence Java Client](https://github.com/cadence-workflow/cadence-java-client) - Java client and workflow framework for the Cadence orchestration service.
- [Activiti](https://github.com/Activiti/Activiti) - Embeddable BPMN workflow and business process engine.
- [Apache DolphinScheduler](https://github.com/apache/dolphinscheduler) - Distributed workflow orchestration platform with visual and API-driven scheduling.
- [Conductor](https://github.com/conductor-oss/conductor) - Event-driven workflow engine for distributed applications and AI agents.
- [flowable](https://github.com/flowable/flowable-engine) - Compact and efficient workflow and business process management platform.
- [Maestro](https://github.com/Netflix/maestro) - Workflow orchestration engine developed by Netflix.
- [Temporal Java SDK](https://github.com/temporalio/sdk-java) - Java SDK for writing durable workflows and activities on Temporal.

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

### Communities

_Active discussions._

- [foojay.io](https://foojay.io)
- [r/java](https://www.reddit.com/r/java/) - Subreddit for the Java community.
- [Stack Overflow](https://stackoverflow.com/questions/tagged/java) - Question/answer platform.

### Guides and References

_Guides, tutorials, examples and practical references for Java developers._

- [Design Patterns](https://github.com/iluwatar/java-design-patterns) - Implementation and explanation of the most common design patterns.
- [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition) - No-nonsense implementation of FizzBuzz made by serious businessmen for serious business purposes. (No explicit license)
- [Google Java Style](https://google.github.io/styleguide/javaguide.html)
- [Java Algorithms and Clients](https://algs4.cs.princeton.edu/code)
- [Java Concurrency Checklist](https://github.com/code-review-checklists/java-concurrency)
- [Java Developer Roadmap](https://github.com/s4kibs4mi/java-developer-roadmap)
- [Java Evolved](https://github.com/javaevolved/javaevolved.github.io) - Side-by-side comparisons of legacy and modern Java patterns.
- [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) - Popular Java 8 guide.
- [TheCodeForge Java Tutorials](https://thecodeforge.io/java/)
- [Which JDK](https://github.com/whichjdk/whichjdk.com) - Overview of common JVMs with pros and cons.

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
- [Inside Java](https://inside.java/podcast) - Official podcast.
- [Java Off Heap](https://www.javaoffheap.com)

### People

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
- [InfoQ](https://www.infoq.com)
- [java.libhunt.com](https://java.libhunt.com)
- [Java, SQL, and jOOQ](https://blog.jooq.org)
- [Java.net](https://community.oracle.com/community/java)
- [Javalobby](https://dzone.com/java-jdk-development-tutorials-tools-news)
- [JavaWorld](https://www.javaworld.com)
- [JAXenter](https://jaxenter.com)
- [RebelLabs](https://zeroturnaround.com/rebellabs)
- [TheServerSide.com](https://www.theserverside.com)
- [Vanilla Java](https://vanilla-java.github.io)
