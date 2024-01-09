# Mars Rover Technical Challenge

## Requirements
- Java JDK 8 +

## Getting Started

To run the app, follow these steps:

1. Clone repository to your local machine.
    ```
   https://github.com/tjlerias/mars-rover-coding-challenge.git
    ```
2. Open the project using your preferred IDE.
3. Open terminal to the project's root directory and run `mvn clean install`.

You have the option to execute the Main class for an interactive program, where you can input the instructions.

Alternatively, you can run the provided tests to ensure that the logic functions as expected.

## Testing

JUnit and AssertJ is used to validate the test cases for the given problem. You can find the tests in `RoverServiceTest` class

1. To run tests:
   ```
   mvn test
   ```
   
## The Problem

A robotic rover is to be landed by NASA on a plateau on Mars.

This plateau, which is curiously rectangular, must be navigated by the rover so that their on board
cameras can get a complete view of the surrounding terrain to sent back to Earth.

A rover's position is represented by a combination of an x and y co-ordinate and a letter representing
one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and
'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its
current spot.

'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

The rover should initially be placed at 0, 0, N.

**Input:**

A single line of input is a series of instructions telling the rover how to explore the plateau.

**Output:**

The output for each rover should be its final co-ordinates and heading.

**Test Input:**

LMLMLMLMLM

**Expected Output:**

0, 1, W
