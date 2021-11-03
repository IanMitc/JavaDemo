# JUnit

# What is testing?
Testing is the process of checking the functionality of an application to ensure it runs as per requirement.
Unit testing is one of most commonly used tyoes of testing


# Type of Testing
1. Unit testing
2. Integration Testing
3. End to End Testing


# Manual Testing vs Automated Testing

Manul Testing
1. Time-consuming and tedious, these test cases are executed by human resources and hence very slow
2. Huge investment in human resources, as test cases need to be executed manually, more testers are require in manual testing
3. Less reliable, manual testing is less reliable as it has to account for human error
4. Non-programming can be done to spohisticated tests to fetch hidden information
5. need to perform every time

Automated Testing
1. Fast - automation runs test cases significantly faster than human resources
2. Less investment in hum resourcse, test cases are executed using automation tools, so fewer number of testers are required
3. more relaible, automation tests are precise and reliable
4. Testers can program sophisticated tests to bring out hidden information
5. you can write test cases once and can be execute them multiple times


# Unit Testing?
Unit testing means testing the smallest unit of the application
it plays a cruical role in test-driven development
Unit testing is all about testing methods individually and in the isolation

> Junit is one of the most popular testing framework for unit testing 

# Feature of Junit
1. Junit is a open source testing framework, which is used for writing and running tests
2. provides annotation to identify test methods
3. provides assertion for testing expected result
4. provides test runner for running tests



# What is a unit test case?
A unit test case is part of code, ensuring that another part of the code (method) work as expected
To achieve the desire result quickly, a test framework is required
Junit is a perfect unit test framework for java programming language


Triple AAA Rule

A - Arrange

A - Act
 
A - Assert


# Annotation for Junit

@Test annotation is used to specified that method is the test method

@BeforeClass / @BeforeAll annotation specifies that method will invoke only once before starting all the test

@Before / @BeforeEach annotation specifies that method wil be invoked before each test

@After / @AfterEach annotation specifies that method will be invoked after each test

@AfterClass / @AfterAll annotation specifies that the method will be invoked the only one after finishing all the test


# Assert class

assertEquals()
assertTrue()
assertFalse()
assertNull()
assertNoNull()


# TDD - Test driven development
Testing is an essential part of software development. by including tests with you code, you can ensuere you code is bug free
they can givw you the peace of mind to develop quickly and ctahc bigs before they are released

Test-Driven development is one way of ensuring to include a test with any new code. when following this process, 
you write the tests for the things you are adding before you write the code to implement it.

TDD ?
it is a software develpment process
you can apply TDD wherever you practise software development
you may have also headed it describe as Red-Green Refactor
it is a process in which you write the test that specifies the code you are to write before you tart writing any of the code


# Test-Driven Development process
> Add a test
> Run all tests and see if the new one failed
> write some code
> run the test and refactor code
> repeat


# Benefit
> Faster development time
> Automatic up to date documntation
> more maintainable code
> greater confifence in you ode
> highest test coverage



















