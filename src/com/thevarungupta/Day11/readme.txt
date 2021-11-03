# Maven 
 - Maven is a powerful project management tool that is based on POM (project object model
 - It is used for project build, dependency and documentation
 - It simplifies the build process like ANT, but it is too much advance than ANT


Apache Maven helps to manage
- builds
- documentation
- reporting
- SCM
- release
- distribution


# What is built tool
A build tool takes case of everything for building a process, 
- generates source code
- generate documentation from source code
- compiles source code
- packges compiled code into JAR or ZIP file
- install the packaged code in local repository, server repository or central repository



# Maven Repository
It refer to the directories of packaged JAR files that contain metadata. the metadata refers to the POM
file relavent to each other project. this metadata is what allow maven to download dependencies

Theer are three type of repositories
1. local repository - your PC
2. Remote repository - any server
3. Central repository - internet


local repository - your PC
Local repo refers to the machine of the developer where all the project material is saved. This repo contains
all the dependency jars


Remote repository - any server
The remore repo refers to the repositiry present on a web server which is used when maven needs to
download dependecies. this repo worls same as the central repo. whenever anything is needed from remote repo
it is first downloaded to the local repo and then it is used

central repository - internet
it refer to the maven community that comes into action when there is a need of dependencies and those dependencies
cannot be found in local repo. Maven downloads the dependecnies from here in the local repo whenever needed


# Basic concepts of Maven

> POM (Project Object Model)
- It refer to the XML file that have all the information regarding project and configuration details
- It has the description of the project detail regarding the versioning and configuration management of the project
- The xml file is in the project home directory.
Maven searches for POM in the current dirctory when any task id to be executed



> Dependencies and Repository
- dependencies refer to the java libraries that are needed for the project
- repository refer to the directories of packaged JAR file
- if the dependencies are not present in you local repository, then maven downloads them from the central repo
and stores them in the local repo

> build life cycle, phases and goals
- build life cycle consist of a sequence of build phases and each build phase consists of a sequence of goals
- each goal is responsable for a particular task
- when a phase is run all the goals related to that phase and its plugin are also compiled


> Build profiles
- it refer to the set of configuration values that are required to build a project using different configuration
- different build profiles are added to the POM file when enabling different builds
- A build profile helps in customizing build for different enviornments

> Build plugin
- Maven plugin refers to the group of goals. these goals may or may not be of the same phase
- the plugind are used to perform specific goals
- maven has its own standard plugins that can be used. if wanted we can also implement our own in java


# Maven Architecture

Maven----> POM.xml ---------> maven repositoy

1. read POM.xml file
2. Download dependencies defines in pom.xml into local repo from central repo
3. create and generate a report according to the requirement and execute life cycle, phases, goal, plugin etc



# Maven build life cycle
- maven life cycle is a collection of steps that are to be followed to build a project
- there are thre build-in build life cycle
1. default - handles project deployment
2. clean - handles project cleaning
3. site - handles the creation of project site documentation



Build life cycle has different phase or stages



compile -> test-compile -> test -> package -> integration-test -> verify -> install -> deploy



Advantages of maven
- Apache maven helps manage all the processes such as building, documentation, raling and distribution in project management
- the tool simplifies the process of project building
- the task of download jav file and other dependencies is done automatically


Download
1. download from https://maven.apache.org/download.cgi
2. enviornmant variable
    M2_HOME = <bin>


What is Maven?
Maven is a popular open source build tool developed by apache group to build, publish and deploy several project at once
it is written in java and is used to build projects written in c#, ruby, scala etc

What does maven help with?
- The tools simplifies the process of project bulding, it increses the performace of the project and build process
- the task of downloading jar files and other dependencies is done automatically
- maven provides easy access to all the required information

What is the difference between ANt and Maven?

Ant
1. Ant has no formal coneventios so information is to be provided in build.xml file
2. Ant is procedural
3. Ant has no life cycle
4. the script are not reusable
5. Ant is specially a build tool

Maven
1. Maven has conventions sp information is not to be provided in pom.xml
2. maven is declarative
3. maven has a lifecycle
4. maven is mainly used as a project management tool
5. maven plugines are reusable


What is POM?
Project Object Model (POM) referes to the xml file with all the information regarding the project and 
configuration details

What all is included in the POM?
POM contains the following configurations
- dependencies
- developer and contributors
- plugin
- plugin configuration
- resources

What are the minum required elements for POM?
The minimum required elements for POM are
- project root
- modelVersion - should be 4.0.0
- groupId - project group id
- articatId - artifact (project) id
- version - version of the arifact


What is meant by the term build tool?
- generating source code
- generating documentation from source code
- compiling of source code
- packaging of the compiled code into JAR files
- installing the packaged code in local repo, server or central repo


What are the steps to install Maven on window?
To instll maven on window
1. download maven and then extract it
2. in the enviornment variable as JAVA_HOME and MAVEN_HOME
3. Then add anvironment path in maven variable
4. lastly verify maven installation by checking it version 
    > mvn --version


What are the steps to install Maven on Ubuntu?
1. first step is to install Java
2. the download meven
3. configure environment variables JAVA_HOME, M3_HOME, MAVEN_HOME and PATH
4. lastly verify maven installation by checking it version 
    > mvn --version

What id the command to install JAR file in the local repository
mvn install is used to install JAR files in the local repo
To install the JAR manually into the local Maven Repo 
mvn install: install-file-Dfile=<path to file>


What is clean, default and site in Maven?
there are three built-in build life cycles
1. clean - the clean lifecycle looks after project cleaning
2. default - the default lifecycle handlesthe project management
3. site - the ste lifecycle refere to the creation of the project site documentation


What is Maven Repository
It refer to the directories of packaged JAR files that contain metadata. the metadata refers to the POM
file relavent to each other project. this metadata is what allow maven to download dependencies

Theer are three type of repositories
1. local repository - your PC
2. Remote repository - any server
3. Central repository - internet


What are the different conventions used while naming a project in Mavan?
The full name of a project in Maven includes
<GroupId>.<artifactId>:<version>

Which command is used to build a maven site?
> mvn site cmmand is used to build maven sire
the resulting site by default is      target/site/...


What is a maven artifacts?
Maven artifacts refers to a file usually a JAR that gets deployed to a Maven repository
The tool creates one or more articats, such as a compiled JAR and source JAR
Evert artifacts has its groupId and artifacts ID and version string. these three together identify the articats

GroupId + ArtifactId + version string = Artifact

com.revature.helloWorld.1.0.0

What are th phases of clean life cycle?
the phases of a clean life cycle includes
- pre-clean
- clean
- post-clean


What are the phases of a site life cycle?
the phases of a site life cycle includes
- pre-site
- site
- post-site
- site-deploy

What is means by maven plugin?
Maven plugins are the important features of Maven used to resue the comman build logic acroos several project
the plugins are needed to carry out task like compiling code, testing them, creating jar files and 
documentaion of the project

What are maven plugins used?
compiling code, 
unit testing of code, 
creating jar / war files 
project report
documentaion of the project


What are the type of plugins?
there are 2 type
1. build plugins
these plugins are executed during the build and are configured in <build/> element of the pom.xml
2. reporting plugin
these plugin are executed during the stage generation and are configured in the <reporting/> element of the pom.xml


What is the d/w convention and configuration in maven?
Convention
- convention is when the developers are not required to create the build process
- the users do not have a specify the configuration in detail and once the project is created it will automatically create a structure


Configuration
- configuration is when developers are suppose to create the build process manually
- they must specify every configuration in detail


Why maven uses convention over configuration
- Maven uses convention instead of configuration so the developers just must create a maven project
the rest of the structure is automatically created
- there are many convention present in mavan for setting up a project, building the artifacts, releasing ode and running unit tests.



What is the mavane order of inheritance?
- settings
- cli parameter
- parent POM
- project POM


What is a snapshot in mavan?
snapshot refer to the versin available in the maven remote repo. it signals the lastest development copy
maven check for a new version of snapshot in the remote repo for every new build


What all type pf project are avaiable in maven?
there are thousan of java project provided as templates by maven
for example: Spring project, spring MVC, Spring boot etc

What is maven archetype?
Maven archetype refers to a maven plugin that is entitles to create a project structure as per its template
these archetype are jusy project templates that are generated by maven when any new proejct is created





