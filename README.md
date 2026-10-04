# Student Grade Calculator

A beginner-friendly Java console application that calculates a student's total marks, average, grade, and pass/fail result for six subjects.

## Features

- Accepts the student's name
- Accepts marks for six subjects
- Validates marks between 0 and 100
- Calculates total marks
- Calculates average marks
- Assigns a grade from A to F
- Displays PASS or FAIL

## Technologies Used

- Java
- Visual Studio Code

## How It Works

1. The program asks the user to enter the student's name.
2. The user enters marks for six subjects.
3. The program checks whether all marks are between 0 and 100.
4. If the marks are valid, the program calculates the total.
5. The program calculates the average.
6. A grade is assigned based on the average.
7. The program displays the final PASS or FAIL result.

## Grade System

| Average | Grade |
|---|---|
| 90 and above | A |
| 80–89 | B |
| 70–79 | C |
| 60–69 | D |
| Below 60 | F |

## Example

### Input

Enter student name: Name
Enter mark for Subject 1: 80
Enter mark for Subject 2: 70
Enter mark for Subject 3: 90
Enter mark for Subject 4: 60
Enter mark for Subject 5: 85
Enter mark for Subject 6: 95

### Output

Total: 480
Average: 80.0
Grade: B
Result: PASS

## Validation

The program accepts marks only between 0 and 100.

If an invalid mark is entered:

Invalid marks. Marks must be between 0 and 100.

## How to Run

Compile the program:

javac StudentGradeCalculator.java

Run the program:

java StudentGradeCalculator

## Project Status

Completed and tested as a beginner Java console project.