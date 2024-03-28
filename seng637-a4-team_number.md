**SENG 637 - Dependability and Reliability of Software Systems**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |     |
|                |     |
|                |     |
|                |     |

# Introduction

# Analysis of 10 Mutants of the Range class 

# Report all the statistics and the mutation score for each test class

DataUtilities

## Before
  
![PitSUmmaryBeforeDataUtilities](https://github.com/seng637-Winter/seng637-a4-ShaunS3bastian/assets/132412518/09085e1d-5b6f-4f29-9728-9b14e0b642bb)

![PitMutationBeforeDataUtilities](https://github.com/seng637-Winter/seng637-a4-ShaunS3bastian/assets/132412518/21bb65d0-8e98-48d0-8bab-8fd3660fcf00)

![ConsoleBeforeDataUtilities](https://github.com/seng637-Winter/seng637-a4-ShaunS3bastian/assets/132412518/8ef75e2a-f5e8-4e25-8c13-d28ca5c36af3)

## After

![PitSUmmaryAfterDataUtilities](https://github.com/seng637-Winter/seng637-a4-ShaunS3bastian/assets/132412518/376327d1-7ec7-47b1-881c-54ba4456366a)

![PitMutationAfterDataUtilities](https://github.com/seng637-Winter/seng637-a4-ShaunS3bastian/assets/132412518/529ef34e-2689-4a93-a551-8a1287619acd)

![ConsoleAfterDataUtilities](https://github.com/seng637-Winter/seng637-a4-ShaunS3bastian/assets/132412518/aaac8408-6453-4d64-9d05-b14e1caddbe1)


# Analysis drawn on the effectiveness of each of the test classes

All the test classes rigorously test the methods in **DataUtilities.java** and leverage JMock for mock object creation and verifies the method’s behavior under diverse scenarios. Our testing process underwent several phases, starting with the identification and resolution of initial errors and failures. After removing errors and failures in the test suite through continuous iterations the tests were made robust and dependable through rigorous Pit Test executions to achieve the most mutation coverage. 

Remarkably, the test cases helped detect major redundancies in the source code and effectively helped increase the mutation coverage.We aimed to enhance the robustness of our test suite, striving for maximum mutation coverage. This iterative approach allowed us to systematically identify and address potential vulnerabilities and edge cases, thereby increasing the reliability and resilience of the methods.

For instance, let us consider both the **DataUtilitiesCalculateColumnTotal** and **DataUtilitiesCalculateColumnTotal2** test classes which handle different implementations of the `calculateColumnTotal` method. While one handles mutations specific to empty data sets and negative row counts, the other focuses on scenarios including empty values and various other data types. The use of mocked Values2D object is needed for both test classes to test the behavior of the method and error handling accurately against expectations.

Similar to that the **DataUtilitiesTest1** and **DataUtilitiesTest2** are used to test the `calculateRowTotal` method implementations, test cases like `calculateRowTotalForTwoValues` and `calculateRowTotalForSingleValue`, assess row totals for varying value counts, while others handle empty rows (`calculateRowTotalForEmptyRow`) or null input data (`calculateRowTotalForNullData`).

Next, the **DataUtilitiesCumulativePercentagesTest** class takes a systematic way to put into testing the `getCumulativePercentages` method within `DataUtilities`. Here the test cases are controlled using mocked KeyedValues objects which helps us check all the aspects of methods' functionality across different scenarios including varying numbers of values, different data types, and edge cases involving large, negative, and NaN values. 

The **DataUtilitiesClone**, **DataUtilitiesCreateNumberArray**, and **DataUtilitiesCreateNumberArray2D** test classes check the `clone`, `createNumberArray`, and `createNumberArray2D` methods respectively. Each test class checks for diverse cases such as handling null inputs and extreme values. Taking into account various real-life examples (calling upon null inputs and extreme values). By means of rigorous assertion evaluation and robust error handling the test classes ensure the methods are free from unexpected errors or failures.

The test cases were very effective and the mutation coverage achieve was ~90% (89%), which indicates that the methods tested the source code well for dependability and reliability. These tests classes were crucial in identifying redundant code and improving mutation coverage.

# A discussion on the effect of equivalent mutants on mutation score accuracy

In Effect Equivalent Mutants are harder to kill as there are no tests to distinguish them from existing mutants. Although, these syntactically equivalent bugs resemble real bugs, they do not change the behaviour of the application. Mutations of this sort arise when a modification to the code has no noticeable effect on the output or behaviour of the program. And for that reason, these kinds of mutations might cause tests to report the appearance of bugs that are in fact not bugs, which might inflate mutation scores.

Consider this small mutation in our sample test suite where a ‘return’ statement was replaced with a similar one that always feeds the same value back. The value returned by the program was already the same anyway, so even though this mutant modifies the code, it doesn’t affect what the program does. If the test were to pass, the developer would be misled into faith in the test suite. 

It is important to allow test cases to be evaluated that locate the same sort of mutants to mitigate its impact on the strength of the measures of mutation effectiveness. We can also make mutation testing more powerful by creating tests that are concerned with alterations in program behaviour rather than just code structure. Finally, we can reach some level of autonomy by keeping the test cases up-to-date via automated evolution based on the knowledge gleaned from mutation analysis, maybe facilitating the search for the ‘hills’ that attract the occupation of too many identical mutants.


# A discussion of what could have been done to improve the mutation score of the test suites

We could have used other tools and libraries to check what improvements to make so that we have an idea of what other mutations could arise in the code. Overall, the test suites had to be improved to increase mutation score and the redundancies in the source code had to be removed so the mutation score can be improved to ~90%. This can be further enhanced to more targetted test cases to improve it to 100%.

To make te­sts better at finding bugs and ensuring code­ works, mutation scores must improve. First, add code paths to `DataUtilitie­s` methods. This will cover more case­s. Second, look at survivors - mutations not caught. Find why and update tests for ove­rlooked cases. Third, diversify te­st inputs. Use different data type­s, boundary values, nulls, extreme­s, and errors. This tests thoroughly.

We can also make existing tests stronger by checking more parts of the code to find mistakes and look at different situations and details. ITests can also be improved to make them easier to read and manage and removing unnecessary tests to make the set up simpler. Doing this will improve the test results for DataUtilities methods. Keeping tests good needs changes and improvements over time, based on feedback and new needs.


# Why do we need mutation testing? Advantages and disadvantages of mutation testing

Mutation testing technique is one of the software most testing techniques that ensure the quality of tests and is executed by changes in the code, keep testing whether the test is capable of detecting those changes. It has the ability to make sure of test case effectiveness, determine deficiencies in test cases, and advanced code quality all for a better software system. Methods that use mutation testing in the testing strategy, along with other methods, give power to the testing, so testing becomes more confident and dependable software systems are achieved.

Advantages

- Evaluation of the Effectiveness of a Test Suite: Mutation testing is a way of testing numerically the suit precision in identifying errors that cannot be detected by means of other testing methods. This fixes it by detecting the parts of code that are covered by tests and the places where uncovered and incorrect assumptions need improvement.

- Weaknesses in Test Case Identification: True is this feature incorporated in a test suite that allows the tester to see the difference not just in a specific test case but also in the whole test suites. It leads to a robust test environment which can be used to detect any errors and also expose situations that might not be common in a user's daily experience.

- Identification of Redundant Test Cases: With it, stale tests are removed and instead the "test suite" will consist of tests that are important and locates bugs instead of unutilized tests.

- Code Quality Improvement: Developers express their skill level by creating testing mechanisms which become reusable and also assist in resolving issues. That increases performance and earns users’ trust in a system.

Drawbacks:

- Computational Overhead: Implementation of the testable mutation test likely to be so resource- and time- wise demanding that could impact productivity of programmers if applied to large codebases.

- False Positives and False Negatives: In this case, it is no less critical to distinguish the genuine problems from those who are the false positives given that it can be achieved if one carries out an analysis of the outcomes in question.

- Complexity of Operators for Mutations: This is applicable to workers because the hint of what is wrong out there, makes it crops up in their minds even if they have been told about them. By presenting wrong information as the part of the information which the workers already believe in it gets reinforced that way their cognitive machinery is automatically activated and this can make it possible that a chain of negative events will start as a result of misbeliefs.

# Explain your SELENUIM test case design process

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# How the team work/effort was divided and managed

# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the assignment itself
